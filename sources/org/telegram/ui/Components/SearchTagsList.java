package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Reaction;
import org.telegram.tgnet.TLRPC$TL_messages_savedReactionsTags;
import org.telegram.tgnet.TLRPC$TL_reactionCount;
import org.telegram.tgnet.TLRPC$TL_savedReactionTag;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialogDecor;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugView$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LaunchActivity;

public class SearchTagsList extends BlurredFrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static AlertDialog currentDialog;
    private ValueAnimator actionBarTagsAnimator;
    private float actionBarTagsT;
    private final Adapter adapter;
    private Paint backgroundPaint2;
    private long chosen;
    private final int currentAccount;
    private final BaseFragment fragment;
    private final ArrayList<Item> items;
    public final RecyclerListView listView;
    private final ArrayList<Item> oldItems;
    private LinearLayout premiumLayout;
    private final Theme.ResourcesProvider resourcesProvider;
    public boolean showWithCut;
    private boolean shownPremiumLayout;
    public float shownT;
    private long topicId;

    protected void onShownUpdate(boolean z) {
    }

    protected boolean setFilter(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        return true;
    }

    public static class Item {
        int count;
        String name;
        int nameHash;
        ReactionsLayoutInBubble.VisibleReaction reaction;

        private Item() {
        }

        public static Item get(ReactionsLayoutInBubble.VisibleReaction visibleReaction, int i, String str) {
            Item item = new Item();
            item.reaction = visibleReaction;
            item.count = i;
            item.name = str;
            item.nameHash = str == null ? -233 : str.hashCode();
            return item;
        }

        public long hash() {
            return this.reaction.hash;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.count == item.count && this.reaction.hash == item.reaction.hash && this.nameHash == item.nameHash;
        }
    }

    public void setChosen(ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z) {
        if (visibleReaction == null) {
            this.chosen = 0L;
            if (z) {
                setFilter(null);
            }
            this.adapter.notifyDataSetChanged();
            return;
        }
        for (int i = 0; i < this.items.size(); i++) {
            Item item = this.items.get(i);
            if (visibleReaction.hash == item.reaction.hash) {
                this.chosen = item.hash();
                if (z) {
                    setFilter(item.reaction);
                }
                this.adapter.notifyDataSetChanged();
                this.listView.scrollToPosition(i);
                return;
            }
        }
    }

    private void createPremiumLayout() {
        if (this.premiumLayout != null) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.premiumLayout = linearLayout;
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                SearchTagsList.this.lambda$createPremiumLayout$0(view);
            }
        });
        this.premiumLayout.setOrientation(0);
        ScaleStateListAnimator.apply(this.premiumLayout, 0.03f, 1.25f);
        TextView textView = new TextView(getContext()) {
            private final Path path = new Path();
            private final RectF bounds = new RectF();
            private final Paint paint = new Paint();

            @Override
            protected void dispatchDraw(Canvas canvas) {
                this.paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, SearchTagsList.this.resourcesProvider), 0.1f));
                this.bounds.set(0.0f, 0.0f, getWidth(), getHeight());
                ReactionsLayoutInBubble.fillTagPath(this.bounds, this.path);
                canvas.drawPath(this.path, this.paint);
                super.dispatchDraw(canvas);
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                int width = getWidth();
                int i5 = 0;
                for (int i6 = 0; i6 < SearchTagsList.this.getChildCount(); i6++) {
                    width = Math.min(width, SearchTagsList.this.getChildAt(i6).getLeft());
                    i5 = Math.max(i5, SearchTagsList.this.getChildAt(i6).getRight());
                }
                setPivotX((width + i5) / 2.0f);
            }
        };
        int i = Theme.key_windowBackgroundWhiteBlueText2;
        textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
        int i2 = Theme.key_chat_messageLinkIn;
        mutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(mutate);
        coloredImageSpan.setTranslateY(0.0f);
        coloredImageSpan.setTranslateX(0.0f);
        coloredImageSpan.setScale(0.94f, 0.94f);
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 17);
        spannableStringBuilder.append((CharSequence) spannableString);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
        textView.setText(spannableStringBuilder);
        textView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setTextColor(Theme.getColor(i, this.resourcesProvider));
        textView2.setTextSize(1, 12.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
        SpannableString spannableString2 = new SpannableString(">");
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(mutate2);
        coloredImageSpan2.setScale(0.76f, 0.76f);
        coloredImageSpan2.setTranslateX(-AndroidUtilities.dp(1.0f));
        coloredImageSpan2.setTranslateY(AndroidUtilities.dp(1.0f));
        spannableString2.setSpan(coloredImageSpan2, 0, spannableString2.length(), 17);
        spannableStringBuilder2.append((CharSequence) spannableString2);
        textView2.setText(spannableStringBuilder2);
        textView2.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
        this.premiumLayout.addView(textView, LayoutHelper.createLinear(-2, -1));
        this.premiumLayout.addView(textView2, LayoutHelper.createLinear(-2, -1));
        addView(this.premiumLayout, LayoutHelper.createFrame(-1, -2.0f, 23, 16.33f, 0.0f, 16.33f, 0.0f));
    }

    public void lambda$createPremiumLayout$0(View view) {
        new PremiumFeatureBottomSheet(this.fragment, 24, true).show();
    }

    public SearchTagsList(Context context, final BaseFragment baseFragment, SizeNotifierFrameLayout sizeNotifierFrameLayout, final int i, long j, final Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context, sizeNotifierFrameLayout);
        this.oldItems = new ArrayList<>();
        this.items = new ArrayList<>();
        this.showWithCut = true;
        this.showWithCut = z;
        this.currentAccount = i;
        this.fragment = baseFragment;
        this.resourcesProvider = resourcesProvider;
        this.topicId = j;
        ReactionsLayoutInBubble.initPaints(resourcesProvider);
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (SearchTagsList.this.premiumLayout == null || SearchTagsList.this.premiumLayout.getAlpha() <= 0.5f) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }

            @Override
            public Integer getSelectorColor(int i2) {
                return 0;
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        recyclerListView.setClipToPadding(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        recyclerListView.setLayoutManager(linearLayoutManager);
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        recyclerListView.setOverScrollMode(2);
        addView(recyclerListView, LayoutHelper.createFrame(-1, 48.0f));
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                SearchTagsList.this.lambda$new$2(i, baseFragment, view, i2);
            }
        });
        recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i2) {
                boolean lambda$new$4;
                lambda$new$4 = SearchTagsList.this.lambda$new$4(i, baseFragment, resourcesProvider, view, i2);
                return lambda$new$4;
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator(this) {
            @Override
            public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder) {
                return true;
            }

            @Override
            public boolean animateMove(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, int i2, int i3, int i4, int i5) {
                View view = viewHolder.itemView;
                if (view instanceof TagButton) {
                    ((TagButton) view).startAnimate();
                }
                int translationX = i2 + ((int) viewHolder.itemView.getTranslationX());
                int translationY = i3 + ((int) viewHolder.itemView.getTranslationY());
                resetAnimation(viewHolder);
                int i6 = i4 - translationX;
                int i7 = i5 - translationY;
                if (i6 == 0 && i7 == 0) {
                    dispatchMoveFinished(viewHolder);
                    return false;
                }
                if (i6 != 0) {
                    view.setTranslationX(-i6);
                }
                if (i7 != 0) {
                    view.setTranslationY(-i7);
                }
                this.mPendingMoves.add(new DefaultItemAnimator.MoveInfo(viewHolder, translationX, translationY, i4, i5));
                checkIsRunning();
                return true;
            }
        };
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(320L);
        recyclerListView.setItemAnimator(defaultItemAnimator);
        MediaDataController.getInstance(i).loadSavedReactions(false);
        updateTags(false);
    }

    public void lambda$new$2(int i, BaseFragment baseFragment, View view, int i2) {
        if (i2 < 0 || i2 >= this.items.size()) {
            return;
        }
        if (!UserConfig.getInstance(i).isPremium()) {
            new PremiumFeatureBottomSheet(baseFragment, 24, true).show();
            return;
        }
        long hash = this.items.get(i2).hash();
        if (setFilter(this.chosen == hash ? null : this.items.get(i2).reaction)) {
            int i3 = 0;
            while (i3 < this.listView.getChildCount()) {
                if (this.listView.getChildAt(i3) == view) {
                    if (i3 <= 1) {
                        this.listView.smoothScrollBy(-AndroidUtilities.dp(i3 == 0 ? 90.0f : 50.0f), 0);
                    } else if (i3 >= this.listView.getChildCount() - 2) {
                        RecyclerListView recyclerListView = this.listView;
                        recyclerListView.smoothScrollBy(AndroidUtilities.dp(i3 == recyclerListView.getChildCount() - 1 ? 80.0f : 50.0f), 0);
                    }
                }
                i3++;
            }
            this.listView.forAllChild(new Consumer() {
                @Override
                public final void accept(Object obj) {
                    SearchTagsList.lambda$new$1((View) obj);
                }
            });
            if (this.chosen == hash) {
                this.chosen = 0L;
            } else {
                this.chosen = hash;
                ((TagButton) view).setChosen(true, true);
            }
        }
    }

    public static void lambda$new$1(View view) {
        if (view instanceof TagButton) {
            ((TagButton) view).setChosen(false, true);
        }
    }

    public boolean lambda$new$4(final int i, BaseFragment baseFragment, final Theme.ResourcesProvider resourcesProvider, View view, int i2) {
        if (i2 < 0 || i2 >= this.items.size() || !UserConfig.getInstance(i).isPremium()) {
            return false;
        }
        if (!UserConfig.getInstance(i).isPremium()) {
            new PremiumFeatureBottomSheet(baseFragment, 24, true).show();
            return true;
        }
        ReactionsLayoutInBubble.ReactionButton reactionButton = ((TagButton) view).reactionButton;
        if (reactionButton != null) {
            reactionButton.startAnimation();
        }
        final Item item = this.items.get(i2);
        ItemOptions.makeOptions(baseFragment, view).setGravity(3).add(R.drawable.menu_tag_rename, LocaleController.getString(TextUtils.isEmpty(item.name) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag), new Runnable() {
            @Override
            public final void run() {
                SearchTagsList.this.lambda$new$3(i, item, resourcesProvider);
            }
        }).show();
        return true;
    }

    public void lambda$new$3(int i, Item item, Theme.ResourcesProvider resourcesProvider) {
        openRenameTagAlert(getContext(), i, item.reaction.toTLReaction(), resourcesProvider, false);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        LinearLayout linearLayout;
        if (view != this.listView || (linearLayout = this.premiumLayout) == null) {
            return super.drawChild(canvas, view, j);
        }
        if (linearLayout.getAlpha() >= 1.0f) {
            return false;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.premiumLayout.getAlpha()) * 255.0f), 31);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public static boolean onBackPressedRenameTagAlert() {
        AlertDialog alertDialog = currentDialog;
        if (alertDialog == null) {
            return false;
        }
        alertDialog.dismiss();
        currentDialog = null;
        return true;
    }

    public static void openRenameTagAlert(Context context, final int i, final TLRPC$Reaction tLRPC$Reaction, final Theme.ResourcesProvider resourcesProvider, boolean z) {
        Object builder;
        ?? r1;
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        Activity findActivity = AndroidUtilities.findActivity(context);
        final View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z2 = (lastFragment != null && (lastFragment.getFragmentView() instanceof SizeNotifierFrameLayout) && ((SizeNotifierFrameLayout) lastFragment.getFragmentView()).measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) && !z;
        final ?? r14 = new AlertDialog[1];
        if (z2) {
            builder = new AlertDialogDecor.Builder(context, resourcesProvider);
        } else {
            builder = new AlertDialog.Builder(context, resourcesProvider);
        }
        ?? r15 = builder;
        String savedTagName = MessagesController.getInstance(i).getSavedTagName(tLRPC$Reaction);
        r15.setTitle(new SpannableStringBuilder(ReactionsLayoutInBubble.VisibleReaction.fromTL(tLRPC$Reaction).toCharSequence(20)).append((CharSequence) "  ").append((CharSequence) LocaleController.getString(TextUtils.isEmpty(savedTagName) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag)));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            AnimatedTextView.AnimatedTextDrawable limit;
            AnimatedColor limitColor = new AnimatedColor(this);
            private int limitCount;

            {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
                this.limit = animatedTextDrawable;
                animatedTextDrawable.setAnimationProperties(0.2f, 0L, 160L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.limit.setTextSize(AndroidUtilities.dp(15.33f));
                this.limit.setCallback(this);
                this.limit.setGravity(5);
            }

            @Override
            protected boolean verifyDrawable(Drawable drawable) {
                return drawable == this.limit || super.verifyDrawable(drawable);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                super.onTextChanged(charSequence, i2, i3, i4);
                if (this.limit != null) {
                    this.limitCount = 12 - charSequence.length();
                    this.limit.cancelAnimation();
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
                    String str = "";
                    if (this.limitCount <= 4) {
                        str = "" + this.limitCount;
                    }
                    animatedTextDrawable.setText(str);
                }
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                this.limit.setTextColor(this.limitColor.set(Theme.getColor(this.limitCount < 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider)));
                this.limit.setBounds(getScrollX(), 0, getScrollX() + getWidth(), getHeight());
                this.limit.draw(canvas);
            }

            @Override
            public void onMeasure(int i2, int i3) {
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
            }
        };
        final View view = currentFocus;
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                if (i2 != 6) {
                    return false;
                }
                String obj = EditTextBoldCursor.this.getText().toString();
                if (obj.length() > 12) {
                    AndroidUtilities.shakeView(EditTextBoldCursor.this);
                    return true;
                }
                MessagesController.getInstance(i).renameSavedReactionTag(ReactionsLayoutInBubble.VisibleReaction.fromTL(tLRPC$Reaction), obj);
                AlertDialog[] alertDialogArr = r14;
                if (alertDialogArr[0] != null) {
                    alertDialogArr[0].dismiss();
                }
                if (r14[0] == SearchTagsList.currentDialog) {
                    AlertDialog unused = SearchTagsList.currentDialog = null;
                }
                View view2 = view;
                if (view2 != null) {
                    view2.requestFocus();
                }
                return true;
            }
        });
        MediaDataController.getInstance(i).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        editTextBoldCursor.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        editTextBoldCursor.setText(savedTagName);
        int i2 = Theme.key_dialogTextBlack;
        editTextBoldCursor.setTextColor(Theme.getColor(i2, resourcesProvider));
        editTextBoldCursor.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setInputType(16384);
        editTextBoldCursor.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 24.0f, 5.0f, 24.0f, 12.0f));
        linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 10.0f));
        r15.setView(linearLayout);
        r15.setWidth(AndroidUtilities.dp(292.0f));
        r15.setPositiveButton(LocaleController.getString(R.string.Save), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i3) {
                SearchTagsList.lambda$openRenameTagAlert$5(EditTextBoldCursor.this, i, tLRPC$Reaction, dialogInterface, i3);
            }
        });
        r15.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i3) {
                dialogInterface.dismiss();
            }
        });
        if (z2) {
            AlertDialog create = r15.create();
            currentDialog = create;
            r14[0] = create;
            create.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    SearchTagsList.lambda$openRenameTagAlert$7(currentFocus, dialogInterface);
                }
            });
            currentDialog.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    SearchTagsList.lambda$openRenameTagAlert$8(EditTextBoldCursor.this, dialogInterface);
                }
            });
            currentDialog.showDelayed(250L);
            r1 = 0;
        } else {
            r1 = 0;
            r14[0] = r15.create();
            r14[0].setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    AndroidUtilities.hideKeyboard(EditTextBoldCursor.this);
                }
            });
            r14[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    SearchTagsList.lambda$openRenameTagAlert$10(EditTextBoldCursor.this, dialogInterface);
                }
            });
            r14[0].show();
        }
        r14[r1].setDismissDialogByButtons(r1);
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
    }

    public static void lambda$openRenameTagAlert$5(EditTextBoldCursor editTextBoldCursor, int i, TLRPC$Reaction tLRPC$Reaction, DialogInterface dialogInterface, int i2) {
        String obj = editTextBoldCursor.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(editTextBoldCursor);
        } else {
            MessagesController.getInstance(i).renameSavedReactionTag(ReactionsLayoutInBubble.VisibleReaction.fromTL(tLRPC$Reaction), obj);
            dialogInterface.dismiss();
        }
    }

    public static void lambda$openRenameTagAlert$7(View view, DialogInterface dialogInterface) {
        currentDialog = null;
        view.requestFocus();
    }

    public static void lambda$openRenameTagAlert$8(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void lambda$openRenameTagAlert$10(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public boolean hasFilters() {
        return !this.items.isEmpty() || this.shownPremiumLayout;
    }

    public void clear() {
        this.listView.forAllChild(new Consumer() {
            @Override
            public final void accept(Object obj) {
                SearchTagsList.lambda$clear$11((View) obj);
            }
        });
        this.chosen = 0L;
    }

    public static void lambda$clear$11(View view) {
        if (view instanceof TagButton) {
            ((TagButton) view).setChosen(false, true);
        }
    }

    public void attach() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.emojiLoaded);
    }

    public void detach() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.savedReactionTagsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.topicId) {
                updateTags(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.listView, (com.google.android.exoplayer2.util.Consumer<View>) FloatingDebugView$$ExternalSyntheticLambda3.INSTANCE);
        }
    }

    public void updateTags(boolean z) {
        boolean z2;
        HashSet hashSet = new HashSet();
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        TLRPC$TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(this.topicId);
        if (savedReactionTags != null) {
            z2 = false;
            for (int i = 0; i < savedReactionTags.tags.size(); i++) {
                TLRPC$TL_savedReactionTag tLRPC$TL_savedReactionTag = savedReactionTags.tags.get(i);
                ReactionsLayoutInBubble.VisibleReaction fromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(tLRPC$TL_savedReactionTag.reaction);
                if (!hashSet.contains(Long.valueOf(fromTL.hash))) {
                    long j = this.topicId;
                    if (j == 0 || tLRPC$TL_savedReactionTag.count > 0) {
                        Item item = Item.get(fromTL, tLRPC$TL_savedReactionTag.count, j != 0 ? messagesController.getSavedTagName(tLRPC$TL_savedReactionTag.reaction) : tLRPC$TL_savedReactionTag.title);
                        if (item.hash() == this.chosen) {
                            z2 = true;
                        }
                        this.items.add(item);
                        hashSet.add(Long.valueOf(fromTL.hash));
                    }
                }
            }
        } else {
            z2 = false;
        }
        if (!z2 && this.chosen != 0) {
            this.chosen = 0L;
            setFilter(null);
        }
        if (z) {
            DiffUtil.calculateDiff(new DiffUtil.Callback() {
                @Override
                public int getOldListSize() {
                    return SearchTagsList.this.oldItems.size();
                }

                @Override
                public int getNewListSize() {
                    return SearchTagsList.this.items.size();
                }

                @Override
                public boolean areItemsTheSame(int i2, int i3) {
                    return ((Item) SearchTagsList.this.oldItems.get(i2)).hash() == ((Item) SearchTagsList.this.items.get(i3)).hash();
                }

                @Override
                public boolean areContentsTheSame(int i2, int i3) {
                    return ((Item) SearchTagsList.this.oldItems.get(i2)).equals(SearchTagsList.this.items.get(i3));
                }
            }).dispatchUpdatesTo(this.adapter);
        } else {
            this.adapter.notifyDataSetChanged();
        }
        boolean z3 = !UserConfig.getInstance(this.currentAccount).isPremium();
        this.shownPremiumLayout = z3;
        if (z3) {
            createPremiumLayout();
            if (z) {
                return;
            }
            this.premiumLayout.setVisibility(0);
            this.premiumLayout.setAlpha(0.0f);
            this.premiumLayout.animate().alpha(1.0f).start();
            return;
        }
        LinearLayout linearLayout = this.premiumLayout;
        if (linearLayout != null) {
            if (z) {
                linearLayout.animate().alpha(0.0f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        SearchTagsList.this.lambda$updateTags$12();
                    }
                }).start();
            } else {
                linearLayout.setAlpha(1.0f);
                this.premiumLayout.setVisibility(0);
            }
        }
    }

    public void lambda$updateTags$12() {
        this.premiumLayout.setVisibility(8);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.shownT < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setShown(float f) {
        this.shownT = f;
        this.listView.setPivotX(r0.getWidth() / 2.0f);
        this.listView.setPivotY(0.0f);
        this.listView.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f));
        this.listView.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f));
        if (this.showWithCut) {
            this.listView.setAlpha(f);
        } else {
            setAlpha(f);
        }
        invalidate();
    }

    public void show(final boolean z) {
        ValueAnimator valueAnimator = this.actionBarTagsAnimator;
        if (valueAnimator != null) {
            this.actionBarTagsAnimator = null;
            valueAnimator.cancel();
        }
        if (z) {
            setVisibility(0);
        }
        float[] fArr = new float[2];
        fArr[0] = this.actionBarTagsT;
        fArr[1] = z ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.actionBarTagsAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SearchTagsList.this.lambda$show$13(valueAnimator2);
            }
        });
        this.actionBarTagsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.actionBarTagsAnimator.setDuration(320L);
        this.actionBarTagsAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator != SearchTagsList.this.actionBarTagsAnimator) {
                    return;
                }
                SearchTagsList.this.actionBarTagsT = z ? 1.0f : 0.0f;
                SearchTagsList searchTagsList = SearchTagsList.this;
                searchTagsList.setShown(searchTagsList.actionBarTagsT);
                if (!z) {
                    SearchTagsList.this.setVisibility(8);
                }
                SearchTagsList.this.onShownUpdate(true);
            }
        });
        this.actionBarTagsAnimator.start();
    }

    public void lambda$show$13(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.actionBarTagsT = floatValue;
        setShown(floatValue);
        onShownUpdate(false);
    }

    public boolean shown() {
        return this.shownT > 0.5f;
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.shownT);
    }

    @Override
    public void setBackgroundColor(int i) {
        if (SharedConfig.chatBlurEnabled() && this.sizeNotifierFrameLayout != null) {
            super.setBackgroundColor(i);
            return;
        }
        Paint paint = new Paint(1);
        this.backgroundPaint2 = paint;
        paint.setColor(i);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.showWithCut) {
            canvas.clipRect(0, 0, getWidth(), getCurrentHeight());
        }
        if (this.backgroundPaint2 != null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getCurrentHeight(), this.backgroundPaint2);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public class Adapter extends RecyclerListView.SelectionAdapter {
        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public Adapter() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            SearchTagsList searchTagsList = SearchTagsList.this;
            return new RecyclerListView.Holder(new TagButton(searchTagsList.getContext()));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0 || i >= SearchTagsList.this.items.size()) {
                return;
            }
            Item item = (Item) SearchTagsList.this.items.get(i);
            ((TagButton) viewHolder.itemView).set(item);
            ((TagButton) viewHolder.itemView).setChosen(item.hash() == SearchTagsList.this.chosen, false);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            super.onViewAttachedToWindow(viewHolder);
            int adapterPosition = viewHolder.getAdapterPosition();
            if (adapterPosition < 0 || adapterPosition >= SearchTagsList.this.items.size()) {
                return;
            }
            ((TagButton) viewHolder.itemView).setChosen(((Item) SearchTagsList.this.items.get(adapterPosition)).hash() == SearchTagsList.this.chosen, false);
        }

        @Override
        public int getItemCount() {
            return SearchTagsList.this.items.size();
        }
    }

    public class TagButton extends View {
        private boolean attached;
        private boolean chosen;
        private ReactionsLayoutInBubble.VisibleReaction lastReaction;
        private final AnimatedFloat progress;
        public ReactionsLayoutInBubble.ReactionButton reactionButton;

        public TagButton(Context context) {
            super(context);
            this.progress = new AnimatedFloat(this, 0L, 260L, CubicBezierInterpolator.EASE_OUT_QUINT);
            ScaleStateListAnimator.apply(this);
        }

        public void set(Item item) {
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.lastReaction;
            boolean z = visibleReaction == null || !visibleReaction.equals(item.reaction);
            if (z) {
                TLRPC$TL_reactionCount tLRPC$TL_reactionCount = new TLRPC$TL_reactionCount();
                tLRPC$TL_reactionCount.reaction = item.reaction.toTLReaction();
                tLRPC$TL_reactionCount.count = item.count;
                ReactionsLayoutInBubble.ReactionButton reactionButton = new ReactionsLayoutInBubble.ReactionButton(null, SearchTagsList.this.currentAccount, this, tLRPC$TL_reactionCount, false, true, SearchTagsList.this.resourcesProvider) {
                    @Override
                    protected boolean drawTextWithCounter() {
                        return true;
                    }

                    @Override
                    protected int getCacheType() {
                        return 18;
                    }

                    @Override
                    protected void updateColors(float f) {
                        this.lastDrawnTextColor = ColorUtils.blendARGB(this.fromTextColor, Theme.getColor(TagButton.this.chosen ? Theme.key_chat_inReactionButtonTextSelected : Theme.key_actionBarActionModeReactionText, SearchTagsList.this.resourcesProvider), f);
                        int blendARGB = ColorUtils.blendARGB(this.fromBackgroundColor, Theme.getColor(TagButton.this.chosen ? Theme.key_chat_inReactionButtonBackground : Theme.key_actionBarActionModeReaction, SearchTagsList.this.resourcesProvider), f);
                        this.lastDrawnBackgroundColor = blendARGB;
                        this.lastDrawnTextColor = Theme.blendOver(blendARGB, this.lastDrawnTextColor);
                        this.lastDrawnTagDotColor = ColorUtils.blendARGB(this.fromTagDotColor, TagButton.this.chosen ? 1526726655 : Theme.getColor(Theme.key_actionBarActionModeReactionDot, SearchTagsList.this.resourcesProvider), f);
                    }

                    @Override
                    protected boolean drawTagDot() {
                        return !drawCounter();
                    }

                    @Override
                    protected boolean drawCounter() {
                        return this.count > 0 || this.hasName || this.counterDrawable.countChangeProgress != 1.0f;
                    }
                };
                this.reactionButton = reactionButton;
                reactionButton.counterDrawable.setSize(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                this.reactionButton.isTag = true;
            } else {
                this.reactionButton.count = item.count;
            }
            this.lastReaction = item.reaction;
            if (!z) {
                ReactionsLayoutInBubble.ReactionButton reactionButton2 = this.reactionButton;
                reactionButton2.animateFromWidth = reactionButton2.width;
            }
            this.reactionButton.width = AndroidUtilities.dp(44.33f);
            this.reactionButton.hasName = true ^ TextUtils.isEmpty(item.name);
            ReactionsLayoutInBubble.ReactionButton reactionButton3 = this.reactionButton;
            if (reactionButton3.hasName) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = reactionButton3.textDrawable;
                animatedTextDrawable.setText(Emoji.replaceEmoji(item.name, animatedTextDrawable.getPaint().getFontMetricsInt(), false), !z);
            } else {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = reactionButton3.textDrawable;
                if (animatedTextDrawable2 != null) {
                    animatedTextDrawable2.setText("", !z);
                }
            }
            this.reactionButton.countText = Integer.toString(item.count);
            this.reactionButton.counterDrawable.setCount(item.count, !z);
            ReactionsLayoutInBubble.ReactionButton reactionButton4 = this.reactionButton;
            if (reactionButton4.counterDrawable != null && (reactionButton4.count > 0 || reactionButton4.hasName)) {
                reactionButton4.width = (int) (reactionButton4.width + r1.getCurrentWidth() + AndroidUtilities.dp(this.reactionButton.hasName ? 4.0f : 0.0f) + this.reactionButton.textDrawable.getAnimateToWidth());
            }
            if (z) {
                ReactionsLayoutInBubble.ReactionButton reactionButton5 = this.reactionButton;
                reactionButton5.animateFromWidth = reactionButton5.width;
            }
            this.reactionButton.height = AndroidUtilities.dp(28.0f);
            ReactionsLayoutInBubble.ReactionButton reactionButton6 = this.reactionButton;
            reactionButton6.choosen = this.chosen;
            if (this.attached) {
                reactionButton6.attach();
            }
            if (z) {
                return;
            }
            requestLayout();
        }

        public void startAnimate() {
            ReactionsLayoutInBubble.ReactionButton reactionButton = this.reactionButton;
            if (reactionButton == null) {
                return;
            }
            reactionButton.fromTextColor = reactionButton.lastDrawnTextColor;
            reactionButton.fromBackgroundColor = reactionButton.lastDrawnBackgroundColor;
            reactionButton.fromTagDotColor = reactionButton.lastDrawnTagDotColor;
            this.progress.set(0.0f, true);
            invalidate();
        }

        public boolean setChosen(boolean z, boolean z2) {
            if (this.chosen == z) {
                return false;
            }
            this.chosen = z;
            ReactionsLayoutInBubble.ReactionButton reactionButton = this.reactionButton;
            if (reactionButton != null) {
                reactionButton.choosen = z;
                if (z2) {
                    reactionButton.fromTextColor = reactionButton.lastDrawnTextColor;
                    reactionButton.fromBackgroundColor = reactionButton.lastDrawnBackgroundColor;
                    reactionButton.fromTagDotColor = reactionButton.lastDrawnTagDotColor;
                    this.progress.set(0.0f, true);
                } else {
                    this.progress.set(1.0f, true);
                }
                invalidate();
            }
            return true;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int dp = AndroidUtilities.dp(8.67f);
            ReactionsLayoutInBubble.ReactionButton reactionButton = this.reactionButton;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp + (reactionButton != null ? reactionButton.width : AndroidUtilities.dp(44.33f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            this.reactionButton.draw(canvas, (getWidth() - this.reactionButton.width) / 2.0f, (getHeight() - this.reactionButton.height) / 2.0f, this.progress.set(1.0f), 1.0f, false);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.attached) {
                return;
            }
            ReactionsLayoutInBubble.ReactionButton reactionButton = this.reactionButton;
            if (reactionButton != null) {
                reactionButton.attach();
            }
            this.attached = true;
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.attached) {
                ReactionsLayoutInBubble.ReactionButton reactionButton = this.reactionButton;
                if (reactionButton != null) {
                    reactionButton.detach();
                }
                this.attached = false;
            }
        }
    }
}
