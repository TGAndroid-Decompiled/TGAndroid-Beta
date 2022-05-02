package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.DialogsActivity;
import org.telegram.tgnet.TLRPC$EncryptedChat;

public class FiltersListBottomSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private ListAdapter adapter;
    private FiltersListBottomSheetDelegate delegate;
    private ArrayList<MessagesController.DialogFilter> dialogFilters;
    private boolean ignoreLayout;
    private RecyclerListView listView;
    private int scrollOffsetY;
    private View shadow;
    private AnimatorSet shadowAnimation;
    private TextView titleTextView;

    public interface FiltersListBottomSheetDelegate {
        void didSelectFilter(MessagesController.DialogFilter dialogFilter);
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public FiltersListBottomSheet(DialogsActivity dialogsActivity, ArrayList<Long> arrayList) {
        super(dialogsActivity.getParentActivity(), false);
        this.dialogFilters = getCanAddDialogFilters(dialogsActivity, arrayList);
        Activity parentActivity = dialogsActivity.getParentActivity();
        FrameLayout frameLayout = new FrameLayout(parentActivity) {
            private boolean fullHeight;
            private RectF rect = new RectF();

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || FiltersListBottomSheet.this.scrollOffsetY == 0 || motionEvent.getY() >= FiltersListBottomSheet.this.scrollOffsetY) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                FiltersListBottomSheet.this.dismiss();
                return true;
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !FiltersListBottomSheet.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i2);
                boolean z = true;
                if (Build.VERSION.SDK_INT >= 21) {
                    FiltersListBottomSheet.this.ignoreLayout = true;
                    setPadding(((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingLeft, 0);
                    FiltersListBottomSheet.this.ignoreLayout = false;
                }
                int dp = AndroidUtilities.m34dp(48.0f) + (AndroidUtilities.m34dp(48.0f) * FiltersListBottomSheet.this.adapter.getItemCount()) + ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop + AndroidUtilities.statusBarHeight;
                int i3 = size / 5;
                double d = i3;
                Double.isNaN(d);
                int i4 = ((double) dp) < d * 3.2d ? 0 : i3 * 2;
                if (i4 != 0 && dp < size) {
                    i4 -= size - dp;
                }
                if (i4 == 0) {
                    i4 = ((BottomSheet) FiltersListBottomSheet.this).backgroundPaddingTop;
                }
                if (FiltersListBottomSheet.this.listView.getPaddingTop() != i4) {
                    FiltersListBottomSheet.this.ignoreLayout = true;
                    FiltersListBottomSheet.this.listView.setPadding(AndroidUtilities.m34dp(10.0f), i4, AndroidUtilities.m34dp(10.0f), 0);
                    FiltersListBottomSheet.this.ignoreLayout = false;
                }
                if (dp < size) {
                    z = false;
                }
                this.fullHeight = z;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(dp, size), 1073741824));
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                FiltersListBottomSheet.this.updateLayout();
            }

            @Override
            public void requestLayout() {
                if (!FiltersListBottomSheet.this.ignoreLayout) {
                    super.requestLayout();
                }
            }

            @Override
            protected void onDraw(android.graphics.Canvas r13) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.FiltersListBottomSheet.C20441.onDraw(android.graphics.Canvas):void");
            }
        };
        this.containerView = frameLayout;
        frameLayout.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i = this.backgroundPaddingLeft;
        viewGroup.setPadding(i, 0, i, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.m34dp(48.0f);
        View view = new View(parentActivity);
        this.shadow = view;
        view.setBackgroundColor(Theme.getColor("dialogShadowLine"));
        this.shadow.setAlpha(0.0f);
        this.shadow.setVisibility(4);
        this.shadow.setTag(1);
        this.containerView.addView(this.shadow, layoutParams);
        RecyclerListView recyclerListView = new RecyclerListView(parentActivity) {
            @Override
            public void requestLayout() {
                if (!FiltersListBottomSheet.this.ignoreLayout) {
                    super.requestLayout();
                }
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setTag(14);
        this.listView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(parentActivity);
        this.adapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setPadding(AndroidUtilities.m34dp(10.0f), 0, AndroidUtilities.m34dp(10.0f), 0);
        this.listView.setClipToPadding(false);
        this.listView.setGlowColor(Theme.getColor("dialogScrollGlow"));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                FiltersListBottomSheet.this.updateLayout();
            }
        });
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i2) {
                FiltersListBottomSheet.this.lambda$new$0(view2, i2);
            }
        });
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.titleTextView = textView;
        textView.setLines(1);
        this.titleTextView.setSingleLine(true);
        this.titleTextView.setTextColor(Theme.getColor("dialogTextBlack"));
        this.titleTextView.setTextSize(1, 20.0f);
        this.titleTextView.setLinkTextColor(Theme.getColor("dialogTextLink"));
        this.titleTextView.setHighlightColor(Theme.getColor("dialogLinkSelection"));
        this.titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.titleTextView.setPadding(AndroidUtilities.m34dp(18.0f), 0, AndroidUtilities.m34dp(18.0f), 0);
        this.titleTextView.setGravity(16);
        this.titleTextView.setText(LocaleController.getString("FilterChoose", C0952R.string.FilterChoose));
        this.titleTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.containerView.addView(this.titleTextView, LayoutHelper.createFrame(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public void lambda$new$0(View view, int i) {
        this.delegate.didSelectFilter(this.adapter.getItem(i));
        dismiss();
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

    private void runShadowAnimation(final boolean z) {
        if ((z && this.shadow.getTag() != null) || (!z && this.shadow.getTag() == null)) {
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
            Animator[] animatorArr = new Animator[1];
            View view = this.shadow;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(view, property, fArr);
            animatorSet2.playTogether(animatorArr);
            this.shadowAnimation.setDuration(150L);
            this.shadowAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (FiltersListBottomSheet.this.shadowAnimation != null && FiltersListBottomSheet.this.shadowAnimation.equals(animator)) {
                        if (!z) {
                            FiltersListBottomSheet.this.shadow.setVisibility(4);
                        }
                        FiltersListBottomSheet.this.shadowAnimation = null;
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (FiltersListBottomSheet.this.shadowAnimation != null && FiltersListBottomSheet.this.shadowAnimation.equals(animator)) {
                        FiltersListBottomSheet.this.shadowAnimation = null;
                    }
                }
            });
            this.shadowAnimation.start();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerListView recyclerListView;
        if (i == NotificationCenter.emojiLoaded && (recyclerListView = this.listView) != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                this.listView.getChildAt(i3).invalidate();
            }
        }
    }

    public void setDelegate(FiltersListBottomSheetDelegate filtersListBottomSheetDelegate) {
        this.delegate = filtersListBottomSheetDelegate;
    }

    public static ArrayList<MessagesController.DialogFilter> getCanAddDialogFilters(BaseFragment baseFragment, ArrayList<Long> arrayList) {
        ArrayList<MessagesController.DialogFilter> arrayList2 = new ArrayList<>();
        ArrayList<MessagesController.DialogFilter> arrayList3 = baseFragment.getMessagesController().dialogFilters;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            MessagesController.DialogFilter dialogFilter = arrayList3.get(i);
            if (!getDialogsCount(baseFragment, dialogFilter, arrayList, true, true).isEmpty()) {
                arrayList2.add(dialogFilter);
            }
        }
        return arrayList2;
    }

    public static ArrayList<Long> getDialogsCount(BaseFragment baseFragment, MessagesController.DialogFilter dialogFilter, ArrayList<Long> arrayList, boolean z, boolean z2) {
        ArrayList<Long> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long longValue = arrayList.get(i).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC$EncryptedChat encryptedChat = baseFragment.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(longValue)));
                if (encryptedChat != null) {
                    longValue = encryptedChat.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (dialogFilter == null || ((!z || !dialogFilter.alwaysShow.contains(Long.valueOf(longValue))) && (z || !dialogFilter.neverShow.contains(Long.valueOf(longValue))))) {
                arrayList2.add(Long.valueOf(longValue));
                if (z2) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

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
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            BottomSheet.BottomSheetCell bottomSheetCell = new BottomSheet.BottomSheetCell(this.context, 0);
            bottomSheetCell.setBackground(null);
            bottomSheetCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(bottomSheetCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            BottomSheet.BottomSheetCell bottomSheetCell = (BottomSheet.BottomSheetCell) viewHolder.itemView;
            if (i < FiltersListBottomSheet.this.dialogFilters.size()) {
                bottomSheetCell.getImageView().setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogIcon"), PorterDuff.Mode.MULTIPLY));
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) FiltersListBottomSheet.this.dialogFilters.get(i);
                bottomSheetCell.setTextColor(Theme.getColor("dialogTextBlack"));
                int i3 = dialogFilter.flags;
                if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == (MessagesController.DIALOG_FILTER_FLAG_CONTACTS | MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS)) {
                    i2 = C0952R.C0953drawable.menu_private;
                } else {
                    if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i3) != 0) {
                        int i4 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                        if ((i3 & i4) == i4) {
                            i2 = C0952R.C0953drawable.menu_unread;
                        }
                    }
                    if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_CHANNELS) {
                        i2 = C0952R.C0953drawable.menu_broadcast;
                    } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_GROUPS) {
                        i2 = C0952R.C0953drawable.menu_groups;
                    } else if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i3) == MessagesController.DIALOG_FILTER_FLAG_CONTACTS) {
                        i2 = C0952R.C0953drawable.menu_contacts;
                    } else {
                        i2 = (i3 & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == MessagesController.DIALOG_FILTER_FLAG_BOTS ? C0952R.C0953drawable.menu_bots : C0952R.C0953drawable.menu_folders;
                    }
                }
                bottomSheetCell.setTextAndIcon(dialogFilter.name, i2);
                return;
            }
            bottomSheetCell.getImageView().setColorFilter((ColorFilter) null);
            Drawable drawable = this.context.getResources().getDrawable(C0952R.C0953drawable.poll_add_circle);
            Drawable drawable2 = this.context.getResources().getDrawable(C0952R.C0953drawable.poll_add_plus);
            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("switchTrackChecked"), PorterDuff.Mode.MULTIPLY));
            drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor("checkboxCheck"), PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(drawable, drawable2);
            bottomSheetCell.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText4"));
            bottomSheetCell.setTextAndIcon(LocaleController.getString("CreateNewFilter", C0952R.string.CreateNewFilter), combinedDrawable);
        }
    }
}
