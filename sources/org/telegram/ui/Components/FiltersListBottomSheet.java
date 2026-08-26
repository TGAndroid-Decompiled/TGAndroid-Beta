package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.DialogsActivity;

public class FiltersListBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private ListAdapter adapter;
    private FiltersListBottomSheetDelegate delegate;
    private ArrayList<MessagesController.DialogFilter> dialogFilters;
    private final DialogsActivity fragment;
    private boolean ignoreLayout;
    private RecyclerListView listView;
    private int scrollOffsetY;
    private final ArrayList<Long> selectedDialogs;
    private View shadow;
    private AnimatorSet shadowAnimation;
    private TextView titleTextView;

    public interface FiltersListBottomSheetDelegate {
        void didSelectFilter(MessagesController.DialogFilter dialogFilter, boolean z);
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;

        public ListAdapter(Context context) {
            this.context = context;
        }

        public MessagesController.DialogFilter getItem(int i) {
            if (i < FiltersListBottomSheet.this.dialogFilters.size()) {
                return (MessagesController.DialogFilter) FiltersListBottomSheet.this.dialogFilters.get(i);
            }
            return null;
        }

        @Override
        public int getItemCount() {
            int size = FiltersListBottomSheet.this.dialogFilters.size();
            return size < 10 ? size + 1 : size;
        }

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            BottomSheet.BottomSheetCell bottomSheetCell = (BottomSheet.BottomSheetCell) viewHolder.itemView;
            if (i >= FiltersListBottomSheet.this.dialogFilters.size()) {
                bottomSheetCell.getImageView().setColorFilter((ColorFilter) null);
                Drawable drawable = this.context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = this.context.getResources().getDrawable(R.drawable.poll_add_plus);
                int color = Theme.getColor(null, Theme.key_switchTrackChecked, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_checkboxCheck, false), mode));
                CombinedDrawable combinedDrawable = new CombinedDrawable(drawable, drawable2);
                bottomSheetCell.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
                bottomSheetCell.setTextAndIcon(LocaleController.getString(R.string.CreateNewFilter), 0, combinedDrawable, false);
                return;
            }
            bottomSheetCell.getImageView().setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogIcon, false), PorterDuff.Mode.MULTIPLY));
            MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) FiltersListBottomSheet.this.dialogFilters.get(i);
            bottomSheetCell.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
            int i3 = dialogFilter.flags;
            if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == (MessagesController.DIALOG_FILTER_FLAG_CONTACTS | MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS)) {
                i2 = R.drawable.msg_openprofile;
            } else if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i3) != 0) {
                int i4 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                if ((i3 & i4) == i4) {
                    i2 = R.drawable.msg_markunread;
                } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_CHANNELS) {
                    i2 = R.drawable.msg_channel;
                } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_GROUPS) {
                    i2 = R.drawable.msg_groups;
                } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_CONTACTS) {
                    i2 = R.drawable.msg_contacts;
                } else if ((i3 & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == MessagesController.DIALOG_FILTER_FLAG_BOTS) {
                    i2 = R.drawable.msg_bots;
                } else {
                    i2 = R.drawable.msg_folders;
                }
            } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_CHANNELS) {
                i2 = R.drawable.msg_channel;
            } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_GROUPS) {
                i2 = R.drawable.msg_groups;
            } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_CONTACTS) {
                i2 = R.drawable.msg_contacts;
            } else if ((i3 & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == MessagesController.DIALOG_FILTER_FLAG_BOTS) {
                i2 = R.drawable.msg_bots;
            } else {
                i2 = R.drawable.msg_folders;
            }
            bottomSheetCell.setTextAndIcon(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, bottomSheetCell.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, bottomSheetCell.getTextView().getPaint().getFontMetricsInt()), 0, new FolderDrawable(FiltersListBottomSheet.this.getContext(), i2, dialogFilter.color), false);
            bottomSheetCell.getTextView().setEmojiColor(Theme.getColor(Theme.key_featuredStickers_addButton, ((BottomSheet) FiltersListBottomSheet.this).resourcesProvider));
            boolean z = true;
            for (int i5 = 0; i5 < FiltersListBottomSheet.this.selectedDialogs.size(); i5++) {
                if (!dialogFilter.includesDialog(AccountInstance.getInstance(((BottomSheet) FiltersListBottomSheet.this).currentAccount), ((Long) FiltersListBottomSheet.this.selectedDialogs.get(i5)).longValue())) {
                    z = false;
                }
            }
            bottomSheetCell.setChecked(z);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            BottomSheet.BottomSheetCell bottomSheetCell = new BottomSheet.BottomSheetCell(this.context, 0, null);
            bottomSheetCell.setBackground(null);
            bottomSheetCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(bottomSheetCell);
        }
    }

    public FiltersListBottomSheet(DialogsActivity dialogsActivity, ArrayList<Long> arrayList) {
        super(dialogsActivity.getParentActivity(), false, false, null);
        fixNavigationBar();
        this.selectedDialogs = arrayList;
        this.fragment = dialogsActivity;
        this.dialogFilters = new ArrayList<>(dialogsActivity.getMessagesController().dialogFilters);
        int i = 0;
        while (i < this.dialogFilters.size()) {
            if (this.dialogFilters.get(i).isDefault()) {
                this.dialogFilters.remove(i);
                i--;
            }
            i++;
        }
        Activity parentActivity = dialogsActivity.getParentActivity();
        FrameLayout frameLayout = new FrameLayout(parentActivity) {
            private boolean fullHeight;
            private RectF rect = new RectF();
            private Boolean statusBarOpen;

            private void updateLightStatusBar(boolean z) {
                Boolean bool = this.statusBarOpen;
                if (bool == null || bool.booleanValue() != z) {
                    boolean z2 = AndroidUtilities.computePerceivedBrightness(FiltersListBottomSheet.this.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                    boolean z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(FiltersListBottomSheet.this.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                    this.statusBarOpen = Boolean.valueOf(z);
                    if (!z) {
                        z2 = z3;
                    }
                    AndroidUtilities.setLightStatusBar(FiltersListBottomSheet.this.getWindow(), z2);
                }
            }

            @Override
            public void onDraw(Canvas canvas) {
                float fMin;
                int iMin;
                int iDp = (FiltersListBottomSheet.this.scrollOffsetY - ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop) - AndroidUtilities.dp(8.0f);
                getMeasuredHeight();
                AndroidUtilities.dp(36.0f);
                int unused = ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop;
                int i2 = iDp + AndroidUtilities.statusBarHeight;
                if (this.fullHeight) {
                    int i3 = ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop + i2;
                    int i4 = AndroidUtilities.statusBarHeight;
                    int i5 = i4 * 2;
                    if (i3 < i5) {
                        int iMin2 = Math.min(i4, (i5 - i2) - ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop);
                        i2 -= iMin2;
                        fMin = 1.0f - Math.min(1.0f, (iMin2 * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        fMin = 1.0f;
                    }
                    int i6 = ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop + i2;
                    int i7 = AndroidUtilities.statusBarHeight;
                    iMin = i6 < i7 ? Math.min(i7, (i7 - i2) - ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop) : 0;
                    ((BottomSheet) FiltersListBottomSheet.this).shadowDrawable.setBounds(0, i2, getMeasuredWidth(), getMeasuredHeight());
                    ((BottomSheet) FiltersListBottomSheet.this).shadowDrawable.draw(canvas);
                    if (fMin != 1.0f) {
                        Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        this.rect.set(((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingLeft, ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop + i2, getMeasuredWidth() - ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop + i2);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, Theme.dialogs_onlineCirclePaint);
                    }
                    if (iMin > 0) {
                        Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                        canvas.drawRect(((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                    }
                    updateLightStatusBar(iMin > AndroidUtilities.statusBarHeight / 2);
                }
                fMin = 1.0f;
                ((BottomSheet) FiltersListBottomSheet.this).shadowDrawable.setBounds(0, i2, getMeasuredWidth(), getMeasuredHeight());
                ((BottomSheet) FiltersListBottomSheet.this).shadowDrawable.draw(canvas);
                if (fMin != 1.0f) {
                    Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                    this.rect.set(((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingLeft, ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop + i2, getMeasuredWidth() - ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop + i2);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, Theme.dialogs_onlineCirclePaint);
                }
                if (iMin > 0) {
                    Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                    canvas.drawRect(((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                }
                updateLightStatusBar(iMin > AndroidUtilities.statusBarHeight / 2);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || FiltersListBottomSheet.this.scrollOffsetY == 0 || motionEvent.getY() >= FiltersListBottomSheet.this.scrollOffsetY) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                FiltersListBottomSheet.this.lambda$showGiftOfferSheet$15();
                return true;
            }

            @Override
            public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                super.onLayout(z, i2, i3, i4, i5);
                FiltersListBottomSheet.this.updateLayout();
            }

            @Override
            public void onMeasure(int i2, int i3) {
                int size = View.MeasureSpec.getSize(i3);
                FiltersListBottomSheet.this.ignoreLayout = true;
                setPadding(((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingLeft, 0);
                FiltersListBottomSheet.this.ignoreLayout = false;
                int iDp = ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop + (AndroidUtilities.dp(48.0f) * FiltersListBottomSheet.this.adapter.getItemCount()) + AndroidUtilities.dp(48.0f) + AndroidUtilities.statusBarHeight;
                int i4 = size / 5;
                int i5 = ((double) iDp) < ((double) i4) * 3.2d ? 0 : i4 * 2;
                if (i5 != 0 && iDp < size) {
                    i5 -= size - iDp;
                }
                if (i5 == 0) {
                    i5 = ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop;
                }
                if (FiltersListBottomSheet.this.listView.getPaddingTop() != i5) {
                    FiltersListBottomSheet.this.ignoreLayout = true;
                    FiltersListBottomSheet.this.listView.setPadding(AndroidUtilities.dp(10.0f), i5, AndroidUtilities.dp(10.0f), 0);
                    FiltersListBottomSheet.this.ignoreLayout = false;
                }
                this.fullHeight = iDp >= size;
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(Math.min(iDp, size), 1073741824));
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !FiltersListBottomSheet.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public void requestLayout() {
                if (FiltersListBottomSheet.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.containerView = frameLayout;
        frameLayout.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i2 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i2, 0, i2, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.shadow = view;
        view.setBackgroundColor(Theme.getColor(null, Theme.key_dialogShadowLine, false));
        this.shadow.setAlpha(0.0f);
        this.shadow.setVisibility(4);
        this.shadow.setTag(1);
        this.containerView.addView(this.shadow, layoutParams);
        RecyclerListView recyclerListView = new RecyclerListView(parentActivity) {
            @Override
            public void requestLayout() {
                if (FiltersListBottomSheet.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setTag(14);
        RecyclerListView recyclerListView2 = this.listView;
        getContext();
        recyclerListView2.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(parentActivity);
        this.adapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.listView.setClipToPadding(false);
        this.listView.setGlowColor(Theme.getColor(null, Theme.key_dialogScrollGlow, false));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                FiltersListBottomSheet.this.updateLayout();
            }
        });
        this.listView.setOnItemClickListener(new StarAppsSheet$$ExternalSyntheticLambda0(this, 8));
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.titleTextView = textView;
        textView.setLines(1);
        this.titleTextView.setSingleLine(true);
        this.titleTextView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        this.titleTextView.setTextSize(1, 20.0f);
        this.titleTextView.setLinkTextColor(Theme.getColor(null, Theme.key_dialogTextLink, false));
        this.titleTextView.setHighlightColor(Theme.getColor(null, Theme.key_dialogLinkSelection, false));
        this.titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.titleTextView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        this.titleTextView.setGravity(16);
        this.titleTextView.setText(LocaleController.getString(R.string.FilterChoose));
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.titleTextView, LayoutHelper.createFrame(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static ArrayList<MessagesController.DialogFilter> getCanAddDialogFilters(BaseFragment baseFragment, ArrayList<Long> arrayList) {
        ArrayList<MessagesController.DialogFilter> arrayList2 = new ArrayList<>();
        ArrayList<MessagesController.DialogFilter> arrayList3 = baseFragment.getMessagesController().dialogFilters;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            MessagesController.DialogFilter dialogFilter = arrayList3.get(i);
            if (!getDialogsCount(baseFragment, dialogFilter, arrayList, true, true).isEmpty() && !dialogFilter.isDefault()) {
                arrayList2.add(dialogFilter);
            }
        }
        return arrayList2;
    }

    public static ArrayList<Long> getDialogsCount(BaseFragment baseFragment, MessagesController.DialogFilter dialogFilter, ArrayList<Long> arrayList, boolean z, boolean z2) {
        ArrayList<Long> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long jLongValue = arrayList.get(i).longValue();
            if (DialogObject.isEncryptedDialog(jLongValue)) {
                TLRPC.EncryptedChat encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(baseFragment.getMessagesController(), jLongValue);
                if (encryptedChatM != null) {
                    jLongValue = encryptedChatM.user_id;
                    if (!arrayList2.contains(Long.valueOf(jLongValue))) {
                        if (dialogFilter == null) {
                            arrayList2.add(Long.valueOf(jLongValue));
                            if (z2) {
                                break;
                                break;
                            }
                        } else {
                            arrayList2.add(Long.valueOf(jLongValue));
                            if (z2) {
                                break;
                                break;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            } else if (dialogFilter == null || ((!z || !dialogFilter.alwaysShow.contains(Long.valueOf(jLongValue))) && (z || !dialogFilter.neverShow.contains(Long.valueOf(jLongValue))))) {
                arrayList2.add(Long.valueOf(jLongValue));
                if (z2) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    public static void lambda$didReceivedNotification$1(View view) {
        if (view instanceof BottomSheet.BottomSheetCell) {
            ((BottomSheet.BottomSheetCell) view).getTextView().invalidate();
        } else {
            view.invalidate();
        }
    }

    public void lambda$new$0(View view, int i) {
        this.delegate.didSelectFilter(this.adapter.getItem(i), view instanceof BottomSheet.BottomSheetCell ? ((BottomSheet.BottomSheetCell) view).checked : false);
        lambda$showGiftOfferSheet$15();
    }

    private void runShadowAnimation(final boolean z) {
        if ((!z || this.shadow.getTag() == null) && (z || this.shadow.getTag() != null)) {
            return;
        }
        this.shadow.setTag(z ? null : 1);
        if (z) {
            this.shadow.setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.shadowAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.shadow, (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.shadowAnimation.setDuration(150L);
        this.shadowAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                if (FiltersListBottomSheet.this.shadowAnimation == null || !FiltersListBottomSheet.this.shadowAnimation.equals(animator)) {
                    return;
                }
                FiltersListBottomSheet.this.shadowAnimation = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (FiltersListBottomSheet.this.shadowAnimation == null || !FiltersListBottomSheet.this.shadowAnimation.equals(animator)) {
                    return;
                }
                if (!z) {
                    FiltersListBottomSheet.this.shadow.setVisibility(4);
                }
                FiltersListBottomSheet.this.shadowAnimation = null;
            }
        });
        this.shadowAnimation.start();
    }

    public void updateLayout() {
        if (this.listView.getChildCount() <= 0) {
            RecyclerListView recyclerListView = this.listView;
            int paddingTop = recyclerListView.getPaddingTop();
            this.scrollOffsetY = paddingTop;
            recyclerListView.setTopGlowOffset(paddingTop);
            this.titleTextView.setTranslationY(this.scrollOffsetY);
            this.shadow.setTranslationY(this.scrollOffsetY);
            this.containerView.invalidate();
            return;
        }
        int i = 0;
        View childAt = this.listView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        int top = childAt.getTop();
        if (top < 0 || holder == null || holder.getAdapterPosition() != 0) {
            runShadowAnimation(true);
        } else {
            runShadowAnimation(false);
            i = top;
        }
        if (this.scrollOffsetY != i) {
            RecyclerListView recyclerListView2 = this.listView;
            this.scrollOffsetY = i;
            recyclerListView2.setTopGlowOffset(i);
            this.titleTextView.setTranslationY(this.scrollOffsetY);
            this.shadow.setTranslationY(this.scrollOffsetY);
            this.containerView.invalidate();
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.listView, (Consumer) new StickersAlert$$ExternalSyntheticLambda31(1));
        }
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void setDelegate(FiltersListBottomSheetDelegate filtersListBottomSheetDelegate) {
        this.delegate = filtersListBottomSheetDelegate;
    }

    @Override
    public void setLastVisible(boolean z) {
    }
}
