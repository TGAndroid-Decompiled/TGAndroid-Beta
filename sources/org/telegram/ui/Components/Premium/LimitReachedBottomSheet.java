package org.telegram.ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AdminedChannelCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.ChannelColorActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatEditActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Loadable;
import org.telegram.ui.Components.LoginOrView;
import org.telegram.ui.Components.Premium.boosts.BoostCounterView;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostPagerBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.GroupColorActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.Stories.ChannelBoostUtilities;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public class LimitReachedBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    TextView actionBtn;
    ArrayList boostFeatures;
    int boostFeaturesStartRow;
    ButtonWithCounterView boostMiniBtn;
    private ButtonWithCounterView boostToUnlockGroupBtn;
    private TL_stories.TL_premium_boostsStatus boostsStatus;
    int bottomRow;
    private ChannelBoostsController.CanApplyBoost canApplyBoost;
    private boolean canSendLink;
    int chatEndRow;
    private ChatMessageCell chatMessageCell;
    int chatStartRow;
    ArrayList chats;
    int chatsTitleRow;
    private int currentValue;
    private long dialogId;
    View divider;
    int dividerRow;
    int emptyViewDividerRow;
    RecyclerItemsEnterAnimator enterAnimator;
    FireworksOverlay fireworksOverlay;
    private String forceLink;
    private TLRPC.Chat fromChat;
    int headerRow;
    private HeaderView headerView;
    private ArrayList inactiveChats;
    private ArrayList inactiveChatsSignatures;
    private boolean isCurrentChat;
    private boolean isVeryLargeFile;
    LimitParams limitParams;
    LimitPreviewView limitPreviewView;
    private int linkRow;
    private boolean loading;
    boolean loadingAdminedChannels;
    int loadingRow;
    private boolean lockInvalidation;
    public Runnable onShowPremiumScreenRunnable;
    public Runnable onSuccessRunnable;
    BaseFragment parentFragment;
    public boolean parentIsChannel;
    boolean premiumButtonSetSubscribe;
    PremiumButtonView premiumButtonView;
    private ArrayList premiumInviteBlockedUsers;
    private ArrayList premiumMessagingBlockedUsers;
    private int requiredLvl;
    private ArrayList restrictedUsers;
    int rowCount;
    HashSet selectedChats;
    private int shiftDp;
    Runnable statisticClickRunnable;
    protected int storiesCount;
    final int type;

    public static class LimitParams {
        int icon = 0;
        String descriptionStr = null;
        String descriptionStrPremium = null;
        String descriptionStrLocked = null;
        int defaultLimit = 0;
        int premiumLimit = 0;
    }

    private static boolean hasFixedSize(int i) {
        return i == 0 || i == 33 || i == 3 || i == 4 || i == 6 || i == 7 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16;
    }

    protected int channelColorLevelMin() {
        return 0;
    }

    public static String limitTypeToServerString(int i) {
        switch (i) {
            case 0:
                return "double_limits__dialog_pinned";
            case 1:
            case 7:
            case 11:
            default:
                return null;
            case 2:
                return "double_limits__channels_public";
            case 3:
                return "double_limits__dialog_filters";
            case 4:
                return "double_limits__dialog_filters_chats";
            case 5:
                return "double_limits__channels";
            case 6:
                return "double_limits__upload_max_fileparts";
            case 8:
                return "double_limits__caption_length";
            case 9:
                return "double_limits__saved_gifs";
            case 10:
                return "double_limits__stickers_faved";
            case 12:
                return "double_limits__chatlist_invites";
            case 13:
                return "double_limits__chatlists_joined";
        }
    }

    private static class BoostFeature {
        public final int countPlural;
        public final String countValue;
        public final int iconResId;
        public boolean incremental;
        public final int textKey;
        public final String textKeyPlural;

        private BoostFeature(int i, int i2, String str, String str2, int i3) {
            this.iconResId = i;
            this.textKey = i2;
            this.countValue = str;
            this.textKeyPlural = str2;
            this.countPlural = i3;
        }

        public static BoostFeature of(int i, int i2) {
            return new BoostFeature(i, i2, null, null, -1);
        }

        public static BoostFeature of(int i, int i2, String str) {
            return new BoostFeature(i, i2, str, null, -1);
        }

        public static BoostFeature of(int i, String str, int i2) {
            return new BoostFeature(i, -1, null, str, i2);
        }

        public boolean equals(BoostFeature boostFeature) {
            if (boostFeature == null) {
                return false;
            }
            if (!this.incremental || this.countPlural <= 2) {
                return this.iconResId == boostFeature.iconResId && this.textKey == boostFeature.textKey && TextUtils.equals(this.countValue, boostFeature.countValue) && TextUtils.equals(this.textKeyPlural, boostFeature.textKeyPlural) && this.countPlural == boostFeature.countPlural;
            }
            return true;
        }

        public BoostFeature asIncremental() {
            this.incremental = true;
            return this;
        }

        public static boolean arraysEqual(ArrayList arrayList, ArrayList arrayList2) {
            if (arrayList == null && arrayList2 == null) {
                return true;
            }
            if ((arrayList != null && arrayList2 == null) || ((arrayList == null && arrayList2 != null) || arrayList.size() != arrayList2.size())) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (!((BoostFeature) arrayList.get(i)).equals((BoostFeature) arrayList2.get(i))) {
                    return false;
                }
            }
            return true;
        }

        public static class BoostFeatureLevel extends BoostFeature {
            public final boolean isFirst;
            public final int lvl;

            @Override
            public BoostFeature asIncremental() {
                return super.asIncremental();
            }

            @Override
            public boolean equals(BoostFeature boostFeature) {
                return super.equals(boostFeature);
            }

            public BoostFeatureLevel(int i, boolean z) {
                super(-1, -1, null, null, -1);
                this.lvl = i;
                this.isFirst = z;
            }
        }
    }

    public LimitReachedBottomSheet(BaseFragment baseFragment, Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        super(context, baseFragment, false, hasFixedSize(i), false, resourcesProvider);
        this.linkRow = -1;
        this.lockInvalidation = false;
        this.chats = new ArrayList();
        this.headerRow = -1;
        this.dividerRow = -1;
        this.chatsTitleRow = -1;
        this.chatStartRow = -1;
        this.chatEndRow = -1;
        this.loadingRow = -1;
        this.emptyViewDividerRow = -1;
        this.bottomRow = -1;
        this.boostFeaturesStartRow = -1;
        this.currentValue = -1;
        this.selectedChats = new HashSet();
        this.inactiveChats = new ArrayList();
        this.inactiveChatsSignatures = new ArrayList();
        this.restrictedUsers = new ArrayList();
        this.premiumMessagingBlockedUsers = new ArrayList();
        this.premiumInviteBlockedUsers = new ArrayList();
        this.loading = false;
        this.requiredLvl = 0;
        this.shiftDp = -4;
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        this.parentFragment = baseFragment;
        this.currentAccount = i2;
        this.type = i;
        updateTitle();
        updateRows();
        if (i == 2) {
            loadAdminedChannels();
        } else if (i == 5) {
            loadInactiveChannels();
        }
        updatePremiumButtonText();
        if (i == 32 || isBoostingForAdminPossible()) {
            FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
            this.fireworksOverlay = fireworksOverlay;
            this.container.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
        }
        if (i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 23 || i == 21 || i == 27 || i == 28 || i == 30 || i == 35 || i == 31) {
            ((ViewGroup) this.premiumButtonView.getParent()).removeView(this.premiumButtonView);
            View view = this.divider;
            if (view != null) {
                ((ViewGroup) view.getParent()).removeView(this.divider);
            }
            this.recyclerListView.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.actionBtn = textView;
            textView.setGravity(17);
            this.actionBtn.setEllipsize(TextUtils.TruncateAt.END);
            this.actionBtn.setSingleLine(true);
            this.actionBtn.setTextSize(1, 14.0f);
            this.actionBtn.setTypeface(AndroidUtilities.bold());
            this.actionBtn.setText(this.premiumButtonView.getTextView().getText());
            this.actionBtn.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
            this.actionBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$new$0(view2);
                }
            });
            this.actionBtn.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), 120)));
        }
        if (i == 32) {
            ((ViewGroup) this.premiumButtonView.getParent()).removeView(this.premiumButtonView);
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
            this.boostToUnlockGroupBtn = buttonWithCounterView;
            buttonWithCounterView.withCounterIcon();
            this.boostToUnlockGroupBtn.setText(LocaleController.getString(R.string.BoostGroup), false);
            this.boostToUnlockGroupBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$new$1(view2);
                }
            });
            this.containerView.addView(this.boostToUnlockGroupBtn, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.containerView.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$2();
                }
            });
        }
        if (i == 19 || i == 18) {
            this.containerView.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$3();
                }
            });
        }
    }

    public void lambda$new$0(View view) {
        AndroidUtilities.addToClipboard(getBoostLink());
        lambda$new$0();
    }

    public void lambda$new$1(View view) {
        if (this.premiumButtonView.isShowOverlay()) {
            this.premiumButtonView.overlayTextView.performClick();
        } else {
            this.premiumButtonView.buttonLayout.performClick();
        }
    }

    public void lambda$new$2() {
        this.boostToUnlockGroupBtn.setCount(getNeededBoostsForUnlockGroup(), false);
    }

    public void lambda$new$3() {
        if (ChatObject.hasAdminRights(getChat())) {
            if (this.premiumButtonView.getParent() != null) {
                ((ViewGroup) this.premiumButtonView.getParent()).removeView(this.premiumButtonView);
            }
            View view = this.divider;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) this.divider.getParent()).removeView(this.divider);
            }
            this.recyclerListView.setPadding(0, 0, 0, 0);
        }
    }

    @Override
    public void onViewCreated(FrameLayout frameLayout) {
        int i;
        super.onViewCreated(frameLayout);
        final Context context = frameLayout.getContext();
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider);
        this.boostMiniBtn = buttonWithCounterView;
        buttonWithCounterView.setFlickeringLoading(true);
        this.boostMiniBtn.setText(LocaleController.getString(R.string.BoostBtn), false);
        this.boostMiniBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$onViewCreated$4(view);
            }
        });
        PremiumButtonView premiumButtonView = new PremiumButtonView(context, true, this.resourcesProvider) {
            @Override
            public void invalidate() {
                if (LimitReachedBottomSheet.this.lockInvalidation) {
                    return;
                }
                super.invalidate();
            }
        };
        this.premiumButtonView = premiumButtonView;
        ScaleStateListAnimator.apply(premiumButtonView, 0.02f, 1.2f);
        if (!this.hasFixedSize && (i = this.type) != 18 && i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 23 && i != 21 && i != 27 && i != 28 && i != 30 && i != 35) {
            View view = new View(context) {
                @Override
                protected void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                    if (limitReachedBottomSheet.chatEndRow - limitReachedBottomSheet.chatStartRow > 1) {
                        Paint themePaint = Theme.getThemePaint("paintDivider", ((BottomSheet) limitReachedBottomSheet).resourcesProvider);
                        if (themePaint == null) {
                            themePaint = Theme.dividerPaint;
                        }
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, themePaint);
                    }
                }
            };
            this.divider = view;
            view.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
            frameLayout.addView(this.divider, LayoutHelper.createFrame(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        PremiumButtonView premiumButtonView2 = this.premiumButtonView;
        float f = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        frameLayout.addView(premiumButtonView2, LayoutHelper.createFrame(-1, 48.0f, 80, f, 0.0f, f, 12.0f));
        this.recyclerListView.setPadding(0, 0, 0, AndroidUtilities.dp(72.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setClipChildren(false);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i2) {
                this.f$0.lambda$onViewCreated$5(view2, i2);
            }
        });
        this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view2, int i2) {
                return this.f$0.lambda$onViewCreated$6(view2, i2);
            }
        });
        this.premiumButtonView.buttonLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$onViewCreated$12(context, view2);
            }
        });
        this.premiumButtonView.overlayTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$onViewCreated$14(view2);
            }
        });
        this.enterAnimator = new RecyclerItemsEnterAnimator(this.recyclerListView, true);
    }

    public void lambda$onViewCreated$4(View view) {
        if (this.premiumButtonView.isShowOverlay()) {
            this.premiumButtonView.overlayTextView.performClick();
        } else {
            this.premiumButtonView.buttonLayout.performClick();
        }
    }

    public void lambda$onViewCreated$5(View view, int i) {
        int i2;
        if (view instanceof AdminedChannelCell) {
            AdminedChannelCell adminedChannelCell = (AdminedChannelCell) view;
            TLRPC.Chat currentChannel = adminedChannelCell.getCurrentChannel();
            if (this.selectedChats.contains(currentChannel)) {
                this.selectedChats.remove(currentChannel);
            } else {
                this.selectedChats.add(currentChannel);
            }
            adminedChannelCell.setChecked(this.selectedChats.contains(currentChannel), true);
            updateButton();
            return;
        }
        if (view instanceof GroupCreateUserCell) {
            if (this.canSendLink || !((i2 = this.type) == 11 || i2 == 34)) {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
                Object object = groupCreateUserCell.getObject();
                if (groupCreateUserCell.isBlocked()) {
                    if (object instanceof TLRPC.User) {
                        showPremiumBlockedToast(groupCreateUserCell, ((TLRPC.User) object).id);
                    }
                } else {
                    if (this.selectedChats.contains(object)) {
                        this.selectedChats.remove(object);
                    } else {
                        this.selectedChats.add(object);
                    }
                    groupCreateUserCell.setChecked(this.selectedChats.contains(object), true);
                    updateButton();
                }
            }
        }
    }

    public boolean lambda$onViewCreated$6(View view, int i) {
        this.recyclerListView.getOnItemClickListener().onItemClick(view, i);
        if (this.type != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void lambda$onViewCreated$12(Context context, View view) {
        int i = this.type;
        if (i == 11 || i == 34) {
            return;
        }
        if (i == 19 || i == 32 || isMiniBoostBtnForAdminAvailable()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
            if (canApplyBoost.empty) {
                if (UserConfig.getInstance(this.currentAccount).isPremium() && BoostRepository.isMultiBoostsAvailable()) {
                    BoostDialogs.showMoreBoostsNeeded(this.dialogId, this);
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context, this.resourcesProvider);
                builder.setTitle(LocaleController.getString(R.string.PremiumNeeded));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(isGroup() ? R.string.PremiumNeededForBoostingGroup : R.string.PremiumNeededForBoosting)));
                builder.setPositiveButton(LocaleController.getString(R.string.CheckPhoneNumberYes), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        this.f$0.lambda$onViewCreated$7(alertDialog, i2);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        alertDialog.dismiss();
                    }
                });
                builder.show();
                return;
            }
            boolean z = canApplyBoost.canApply;
            if (z && canApplyBoost.replaceDialogId == 0) {
                if (canApplyBoost.needSelector && BoostRepository.isMultiBoostsAvailable()) {
                    this.lockInvalidation = true;
                    this.limitPreviewView.invalidationEnabled = false;
                    BaseFragment baseFragment = getBaseFragment();
                    ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.canApplyBoost;
                    ReassignBoostBottomSheet.show(baseFragment, canApplyBoost2.myBoosts, canApplyBoost2.currentChat).setOnHideListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            this.f$0.lambda$onViewCreated$9(dialogInterface);
                        }
                    });
                    return;
                }
                boostChannel();
                return;
            }
            if (z) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                BackupImageView backupImageView = new BackupImageView(getContext());
                backupImageView.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(backupImageView, LayoutHelper.createFrame(60, 60.0f));
                frameLayout.setClipChildren(false);
                final Paint paint = new Paint(1);
                paint.setColor(Theme.getColor(Theme.key_dialogBackground));
                final Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.filled_limit_boost);
                frameLayout.addView(new View(getContext()) {
                    @Override
                    protected void onDraw(Canvas canvas) {
                        float measuredWidth = getMeasuredWidth() / 2.0f;
                        float measuredHeight = getMeasuredHeight() / 2.0f;
                        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, paint);
                        PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), -AndroidUtilities.dp(10.0f), 0.0f);
                        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), PremiumGradient.getInstance().getMainGradientPaint());
                        float fDp = AndroidUtilities.dp(18.0f) / 2.0f;
                        drawable.setBounds((int) (measuredWidth - fDp), (int) (measuredHeight - fDp), (int) (measuredWidth + fDp), (int) (measuredHeight + fDp));
                        drawable.draw(canvas);
                    }
                }, LayoutHelper.createFrame(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                imageView.setColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon));
                frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
                BackupImageView backupImageView2 = new BackupImageView(getContext());
                backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout2 = new FrameLayout(getContext());
                frameLayout2.addView(frameLayout, LayoutHelper.createFrame(-2, 60, 1));
                frameLayout2.setClipChildren(false);
                TextView textView = new TextView(context);
                textView.setLetterSpacing(0.025f);
                textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
                textView.setTextSize(1, 16.0f);
                frameLayout2.addView(textView, LayoutHelper.createLinear(-1, -2, 0, 24, 80, 24, 0));
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.canApplyBoost.replaceDialogId));
                avatarDrawable.setInfo(this.currentAccount, chat);
                backupImageView.setForUserOrChat(chat, avatarDrawable);
                AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                avatarDrawable2.setInfo(this.currentAccount, chat2);
                backupImageView2.setForUserOrChat(chat2, avatarDrawable2);
                AlertDialog.Builder builder2 = new AlertDialog.Builder(context);
                builder2.setView(frameLayout2);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
                builder2.setPositiveButton(LocaleController.getString(R.string.Replace), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        this.f$0.lambda$onViewCreated$10(alertDialog, i2);
                    }
                });
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        alertDialog.dismiss();
                    }
                });
                builder2.show();
                return;
            }
            int i2 = canApplyBoost.floodWait;
            if (i2 != 0) {
                BoostDialogs.showFloodWait(i2);
                return;
            }
            return;
        }
        int i3 = this.type;
        if (i3 == 18 || i3 == 20 || i3 == 24 || i3 == 25 || i3 == 26 || i3 == 29 || i3 == 22 || i3 == 23 || i3 == 21 || i3 == 27 || i3 == 28 || i3 == 30 || i3 == 35) {
            AndroidUtilities.addToClipboard(getBoostLink());
            lambda$new$0();
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.isVeryLargeFile) {
            lambda$new$0();
            return;
        }
        BaseFragment baseFragment2 = this.parentFragment;
        if (baseFragment2 == null) {
            return;
        }
        if (baseFragment2.getVisibleDialog() != null) {
            this.parentFragment.getVisibleDialog().dismiss();
        }
        this.parentFragment.presentFragment(new PremiumPreviewFragment(limitTypeToServerString(this.type)));
        Runnable runnable = this.onShowPremiumScreenRunnable;
        if (runnable != null) {
            runnable.run();
        }
        lambda$new$0();
    }

    public void lambda$onViewCreated$7(AlertDialog alertDialog, int i) {
        this.parentFragment.presentFragment(new PremiumPreviewFragment(null));
        lambda$new$0();
        alertDialog.dismiss();
    }

    public void lambda$onViewCreated$9(DialogInterface dialogInterface) {
        this.lockInvalidation = false;
        this.limitPreviewView.invalidationEnabled = true;
        this.premiumButtonView.invalidate();
        this.limitPreviewView.invalidate();
    }

    public void lambda$onViewCreated$10(AlertDialog alertDialog, int i) {
        alertDialog.dismiss();
        boostChannel();
    }

    public void lambda$onViewCreated$14(View view) {
        if (this.premiumButtonSetSubscribe) {
            if (this.parentFragment == null) {
                return;
            }
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            this.parentFragment.showAsSheet(new PremiumPreviewFragment("invite_privacy"), bottomSheetParams);
        } else {
            int i = this.type;
            if (i == 19 || i == 32 || isMiniBoostBtnForAdminAvailable()) {
                ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
                if (canApplyBoost.canApply) {
                    this.premiumButtonView.buttonLayout.callOnClick();
                    ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.canApplyBoost;
                    if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onViewCreated$13();
                            }
                        }, this.canApplyBoost.needSelector ? 300L : 0L);
                        return;
                    }
                    return;
                }
                if (canApplyBoost.alreadyActive && BoostRepository.isMultiBoostsAvailable() && !this.canApplyBoost.isMaxLvl) {
                    BoostDialogs.showMoreBoostsNeeded(this.dialogId, this);
                    return;
                } else {
                    lambda$new$0();
                    return;
                }
            }
        }
        int i2 = this.type;
        if (i2 == 11 || i2 == 34) {
            if (this.selectedChats.isEmpty()) {
                lambda$new$0();
                return;
            } else {
                sendInviteMessages(null);
                return;
            }
        }
        if (this.selectedChats.isEmpty()) {
            return;
        }
        int i3 = this.type;
        if (i3 == 2) {
            revokeSelectedLinks();
        } else if (i3 == 5) {
            leaveFromSelectedGroups();
        }
    }

    public void lambda$onViewCreated$13() {
        this.limitPreviewView.setBoosts(this.boostsStatus, false);
        limitPreviewIncreaseCurrentValue();
    }

    private void limitPreviewIncreaseCurrentValue() {
        LimitPreviewView limitPreviewView = this.limitPreviewView;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        int i = tL_premium_boostsStatus.boosts;
        int i2 = tL_premium_boostsStatus.current_level_boosts;
        limitPreviewView.increaseCurrentValue(i, i - i2, tL_premium_boostsStatus.next_level_boosts - i2);
    }

    private void showPremiumBlockedToast(View view, long j) {
        String forcedFirstName;
        Bulletin bulletinCreateSimpleBulletin;
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(view, i);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j < 0) {
            forcedFirstName = "";
        } else {
            forcedFirstName = UserObject.getForcedFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
        }
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            bulletinCreateSimpleBulletin = BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName)));
        } else {
            bulletinCreateSimpleBulletin = BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showPremiumBlockedToast$15();
                }
            });
        }
        bulletinCreateSimpleBulletin.show();
    }

    public void lambda$showPremiumBlockedToast$15() {
        if (LaunchActivity.getLastFragment() == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        this.parentFragment.showAsSheet(new PremiumPreviewFragment("noncontacts"), bottomSheetParams);
    }

    private void boostChannel(Loadable loadable) {
        boostChannel(loadable, false);
    }

    private void boostChannel(final Loadable loadable, boolean z) {
        if (!loadable.isLoading() || z) {
            loadable.setLoading(true);
            MessagesController.getInstance(this.currentAccount).getBoostsController().applyBoost(this.dialogId, this.canApplyBoost.slot, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$boostChannel$17(loadable, (TL_stories.TL_premium_myBoosts) obj);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$boostChannel$19(loadable, (TLRPC.TL_error) obj);
                }
            });
        }
    }

    public void lambda$boostChannel$17(final Loadable loadable, final TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(this.dialogId, new Consumer() {
            @Override
            public final void accept(Object obj) {
                this.f$0.lambda$boostChannel$16(loadable, tL_premium_myBoosts, (TL_stories.TL_premium_boostsStatus) obj);
            }
        });
    }

    public void lambda$boostChannel$16(Loadable loadable, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        TLRPC.ChatFull chatFull;
        loadable.setLoading(false);
        if (tL_premium_boostsStatus == null) {
            return;
        }
        this.boostsStatus.boosts++;
        if (this.type == 32 && (chatFull = getChatFull()) != null) {
            chatFull.boosts_applied++;
        }
        limitPreviewIncreaseCurrentValue();
        setBoostsStats(tL_premium_boostsStatus, this.isCurrentChat);
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
        canApplyBoost.isMaxLvl = this.boostsStatus.next_level_boosts <= 0;
        canApplyBoost.boostedNow = true;
        canApplyBoost.setMyBoosts(tL_premium_myBoosts);
        onBoostSuccess();
    }

    public void lambda$boostChannel$19(final Loadable loadable, TLRPC.TL_error tL_error) {
        if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (iIntValue <= 5) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$boostChannel$18(loadable);
                    }
                }, ((long) iIntValue) * 1000);
                return;
            }
            BoostDialogs.showFloodWait(iIntValue);
        }
        loadable.setLoading(false);
    }

    public void lambda$boostChannel$18(Loadable loadable) {
        boostChannel(loadable, true);
    }

    private void boostChannel() {
        if (this.boostMiniBtn.isAttachedToWindow()) {
            boostChannel(this.boostMiniBtn);
            return;
        }
        ButtonWithCounterView buttonWithCounterView = this.boostToUnlockGroupBtn;
        if (buttonWithCounterView != null && buttonWithCounterView.isAttachedToWindow()) {
            boostChannel(this.boostToUnlockGroupBtn);
        } else {
            boostChannel(this.premiumButtonView);
        }
    }

    private boolean onBoostSuccess() {
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.boostsStatus, this.canApplyBoost.copy(), Long.valueOf(this.dialogId));
        if (this.boostToUnlockGroupBtn != null) {
            int neededBoostsForUnlockGroup = getNeededBoostsForUnlockGroup();
            if (neededBoostsForUnlockGroup == 0) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.groupRestrictionsUnlockedByBoosts, new Object[0]);
                lambda$new$0();
                return false;
            }
            this.boostToUnlockGroupBtn.setCount(neededBoostsForUnlockGroup, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new Visibility() {
            @Override
            public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(20.0f), 0.0f));
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                return animatorSet;
            }

            @Override
            public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -AndroidUtilities.dp(20.0f)));
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                return animatorSet;
            }
        });
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.headerView, transitionSet);
        this.headerView.recreateTitleAndDescription();
        this.headerView.title.setText(getBoostsTitleString());
        this.headerView.description.setText(AndroidUtilities.replaceTags(getBoostDescriptionStringAfterBoost()));
        updateButton();
        this.fireworksOverlay.start();
        try {
            this.fireworksOverlay.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.headerView.boostCounterView.setCount(this.canApplyBoost.boostCount, true);
        this.recyclerListView.smoothScrollToPosition(0);
        if (this.type == 32) {
            this.headerView.boostCounterView.setVisibility(8);
        }
        return true;
    }

    public void sendInviteMessages(HashMap map) {
        String str;
        if (!TextUtils.isEmpty(this.forceLink)) {
            str = this.forceLink;
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.fromChat.id);
            if (chatFull == null) {
                lambda$new$0();
                return;
            }
            if (this.fromChat.username != null) {
                str = "@" + this.fromChat.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                if (tL_chatInviteExported != null) {
                    str = tL_chatInviteExported.link;
                } else {
                    lambda$new$0();
                    return;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TLRPC.User user : this.selectedChats) {
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.id));
            }
            (sendPaidMessagesStars >= 0 ? arrayList : arrayList2).add(user);
        }
        if (map == null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(Long.valueOf(((TLRPC.User) it.next()).id));
            }
            AlertsCreator.ensurePaidMessagesMultiConfirmation(this.currentAccount, arrayList3, 1, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.sendInviteMessages((HashMap) obj);
                }
            });
            return;
        }
        boolean z = false;
        for (TLRPC.User user2 : this.selectedChats) {
            long jLongValue = map == null ? 0L : ((Long) map.get(Long.valueOf(user2.id))).longValue();
            SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(str, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            sendMessageParamsOf.payStars = jLongValue;
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
            if (sendMessageParamsOf.payStars > 0) {
                z = true;
            }
        }
        if (!z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$sendInviteMessages$20();
                }
            });
        }
        lambda$new$0();
    }

    public void lambda$sendInviteMessages$20() {
        BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
        if (bulletinFactoryGlobal != null) {
            if (this.selectedChats.size() == 1) {
                bulletinFactoryGlobal.createSimpleBulletin(R.raw.voip_invite, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.InviteLinkSentSingle, ContactsController.formatName((TLRPC.User) this.selectedChats.iterator().next())))).show();
            } else {
                bulletinFactoryGlobal.createSimpleBulletin(R.raw.voip_invite, AndroidUtilities.replaceTags(LocaleController.formatPluralString("InviteLinkSent", this.selectedChats.size(), Integer.valueOf(this.selectedChats.size())))).show();
            }
        }
    }

    public void setRequiredLvl(int i) {
        this.requiredLvl = i;
    }

    public void updatePremiumButtonText() {
        String string;
        if (this.premiumButtonSetSubscribe) {
            this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i = this.type;
        if (i == 19 || i == 32 || isMiniBoostBtnForAdminAvailable()) {
            if (BoostRepository.isMultiBoostsAvailable()) {
                AnimatedTextView animatedTextView = this.premiumButtonView.buttonTextView;
                ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
                if (canApplyBoost != null && canApplyBoost.alreadyActive) {
                    string = LocaleController.getString(R.string.BoostingBoostAgain);
                } else {
                    string = LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
                }
                animatedTextView.setText(string);
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.canApplyBoost;
                if (canApplyBoost2 == null || !canApplyBoost2.isMaxLvl) {
                    return;
                }
                this.premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.OK));
                return;
            }
            this.premiumButtonView.buttonTextView.setText(LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel));
            return;
        }
        int i2 = this.type;
        if (i2 == 18 || i2 == 20 || i2 == 24 || i2 == 25 || i2 == 26 || i2 == 29 || i2 == 22 || i2 == 23 || i2 == 21 || i2 == 27 || i2 == 28 || i2 == 30 || i2 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_copy_filled), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.premiumButtonView.buttonTextView.setText(spannableStringBuilder);
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.isVeryLargeFile) {
            this.premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.OK));
            this.premiumButtonView.hideIcon();
            return;
        }
        this.premiumButtonView.buttonTextView.setText(LocaleController.getString(R.string.IncreaseLimit));
        LimitParams limitParams = this.limitParams;
        if (limitParams != null) {
            int i3 = limitParams.defaultLimit;
            int i4 = i3 + 1;
            int i5 = limitParams.premiumLimit;
            if (i4 == i5) {
                this.premiumButtonView.setIcon(R.raw.addone_icon);
                return;
            }
            if (i3 != 0 && i5 != 0) {
                float f = i5 / i3;
                if (f >= 1.6f && f <= 2.5f) {
                    this.premiumButtonView.setIcon(R.raw.double_icon);
                    return;
                }
            }
            this.premiumButtonView.hideIcon();
            return;
        }
        this.premiumButtonView.hideIcon();
    }

    private void leaveFromSelectedGroups() {
        final TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.selectedChats.iterator();
        while (it.hasNext()) {
            arrayList.add((TLRPC.Chat) it.next());
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.formatPluralString("LeaveCommunities", arrayList.size(), new Object[0]));
        if (arrayList.size() == 1) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList.get(0)).title)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0])));
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupLeave), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$leaveFromSelectedGroups$21(arrayList, user, alertDialog, i);
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        }
    }

    public void lambda$leaveFromSelectedGroups$21(ArrayList arrayList, TLRPC.User user, AlertDialog alertDialog, int i) {
        lambda$new$0();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i2);
            MessagesController.getInstance(this.currentAccount).putChat(chat, false);
            MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(chat.id, user);
        }
    }

    private void updateButton() {
        String pluralString;
        if (this.premiumButtonSetSubscribe) {
            this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i = this.type;
        if (i == 19 || i == 32 || isMiniBoostBtnForAdminAvailable()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
            boolean z = canApplyBoost.canApply;
            if ((z || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
                if (canApplyBoost.isMaxLvl) {
                    this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.OK), true, true);
                    return;
                } else {
                    this.premiumButtonView.clearOverlayText();
                    return;
                }
            }
            if (z) {
                if (BoostRepository.isMultiBoostsAvailable()) {
                    this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
                } else {
                    this.premiumButtonView.setOverlayText(LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel), true, true);
                }
                this.boostMiniBtn.setText(LocaleController.getString(R.string.BoostBtn), true);
                ButtonWithCounterView buttonWithCounterView = this.boostToUnlockGroupBtn;
                if (buttonWithCounterView != null) {
                    buttonWithCounterView.setText(LocaleController.getString(R.string.BoostGroup), true);
                    return;
                }
                return;
            }
            if (canApplyBoost.isMaxLvl) {
                ButtonWithCounterView buttonWithCounterView2 = this.boostMiniBtn;
                int i2 = R.string.OK;
                buttonWithCounterView2.setText(LocaleController.getString(i2), true);
                ButtonWithCounterView buttonWithCounterView3 = this.boostToUnlockGroupBtn;
                if (buttonWithCounterView3 != null) {
                    buttonWithCounterView3.setText(LocaleController.getString(i2), true);
                }
                this.premiumButtonView.setOverlayText(LocaleController.getString(i2), true, true);
                return;
            }
            if (BoostRepository.isMultiBoostsAvailable()) {
                ButtonWithCounterView buttonWithCounterView4 = this.boostToUnlockGroupBtn;
                if (buttonWithCounterView4 != null) {
                    buttonWithCounterView4.setText(LocaleController.getString(R.string.BoostGroup), true);
                }
                this.boostMiniBtn.setText(LocaleController.getString(R.string.BoostBtn), true);
                this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
                return;
            }
            ButtonWithCounterView buttonWithCounterView5 = this.boostToUnlockGroupBtn;
            if (buttonWithCounterView5 != null) {
                buttonWithCounterView5.setText(LocaleController.getString(R.string.OK), true);
            }
            ButtonWithCounterView buttonWithCounterView6 = this.boostMiniBtn;
            int i3 = R.string.OK;
            buttonWithCounterView6.setText(LocaleController.getString(i3), true);
            this.premiumButtonView.setOverlayText(LocaleController.getString(i3), true, true);
            return;
        }
        int i4 = this.type;
        if (i4 == 11 || i4 == 34) {
            this.premiumButtonView.checkCounterView();
            if (!this.canSendLink) {
                this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.Close), true, true);
            } else if (this.selectedChats.size() > 0) {
                this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            this.premiumButtonView.counterView.setCount(this.selectedChats.size(), true);
            this.premiumButtonView.invalidate();
            return;
        }
        if (this.selectedChats.size() > 0) {
            int i5 = this.type;
            if (i5 == 2) {
                pluralString = LocaleController.formatPluralString("RevokeLinks", this.selectedChats.size(), new Object[0]);
            } else {
                pluralString = i5 == 5 ? LocaleController.formatPluralString("LeaveCommunities", this.selectedChats.size(), new Object[0]) : null;
            }
            this.premiumButtonView.setOverlayText(pluralString, true, true);
            return;
        }
        this.premiumButtonView.clearOverlayText();
    }

    @Override
    public CharSequence getTitle() {
        int i = this.type;
        if (i == 11) {
            return LocaleController.getString(R.string.ChannelInviteViaLink2);
        }
        if (i == 34) {
            return LocaleController.getString(R.string.CallInviteViaLink);
        }
        if (i != 35) {
            switch (i) {
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
                case 19:
                case 30:
                    return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
                case 31:
                    return LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle);
                case 32:
                    return LocaleController.getString(R.string.BoostGroup);
                default:
                    return LocaleController.getString(R.string.LimitReached);
            }
        }
        return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        if (i == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            BaseFragment lastFragment = getBaseFragment().getParentLayout().getLastFragment();
            BaseFragment baseFragment = null;
            if (lastFragment instanceof ChatCustomReactionsEditActivity) {
                List fragmentStack = getBaseFragment().getParentLayout().getFragmentStack();
                BaseFragment baseFragment2 = fragmentStack.size() >= 2 ? (BaseFragment) fragmentStack.get(fragmentStack.size() - 2) : null;
                BaseFragment baseFragment3 = fragmentStack.size() >= 3 ? (BaseFragment) fragmentStack.get(fragmentStack.size() - 3) : null;
                baseFragment = fragmentStack.size() >= 4 ? (BaseFragment) fragmentStack.get(fragmentStack.size() - 4) : null;
                if (baseFragment2 instanceof ChatEditActivity) {
                    getBaseFragment().getParentLayout().removeFragmentFromStack(baseFragment2);
                }
                lambda$new$0();
                if (zBooleanValue) {
                    if (baseFragment3 instanceof ProfileActivity) {
                        getBaseFragment().getParentLayout().removeFragmentFromStack(baseFragment3);
                    }
                    lastFragment.finishFragment();
                    BoostDialogs.showBulletin(baseFragment, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                BoostDialogs.showBulletin(baseFragment3, chat, false);
                return;
            }
            if ((lastFragment instanceof ChatActivity) && zBooleanValue) {
                BoostDialogs.showBulletin(lastFragment, chat, true);
                return;
            }
            if ((lastFragment instanceof ChannelColorActivity) && zBooleanValue) {
                List fragmentStack2 = getBaseFragment().getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    BaseFragment baseFragment4 = (BaseFragment) fragmentStack2.get(size);
                    if ((baseFragment4 instanceof ChatActivity) || (baseFragment4 instanceof DialogsActivity)) {
                        baseFragment = baseFragment4;
                        break;
                    }
                    arrayList.add(baseFragment4);
                }
                if (baseFragment == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    getBaseFragment().getParentLayout().removeFragmentFromStack((BaseFragment) it.next());
                }
                getBaseFragment().finishFragment();
                lambda$new$0();
                BoostDialogs.showBulletin(baseFragment, chat, true);
                return;
            }
            if (zBooleanValue) {
                if (StoryRecorder.isVisible()) {
                    ChatActivity chatActivityOf = ChatActivity.of(-chat.id);
                    LaunchActivity.getLastFragment().presentFragment(chatActivityOf, false, false);
                    StoryRecorder.destroyInstance();
                    lambda$new$0();
                    BoostDialogs.showBulletin(chatActivityOf, chat, true);
                    return;
                }
                List fragmentStack3 = getBaseFragment().getParentLayout().getFragmentStack();
                baseFragment = fragmentStack3.size() >= 2 ? (BaseFragment) fragmentStack3.get(fragmentStack3.size() - 2) : null;
                getBaseFragment().finishFragment();
                lambda$new$0();
                if (baseFragment instanceof ChatActivity) {
                    BoostDialogs.showBulletin(baseFragment, chat, true);
                    return;
                }
                return;
            }
            if (StoryRecorder.isVisible()) {
                ChatActivity chatActivityOf2 = ChatActivity.of(-chat.id);
                LaunchActivity.getLastFragment().presentFragment(chatActivityOf2, false, false);
                StoryRecorder.destroyInstance();
                lambda$new$0();
                BoostDialogs.showBulletin(chatActivityOf2, chat, false);
                return;
            }
            lambda$new$0();
            BoostDialogs.showBulletin(LaunchActivity.getLastFragment(), chat, false);
            return;
        }
        if (i == NotificationCenter.boostedChannelByUser) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int iIntValue = ((Integer) objArr[1]).intValue();
            int iIntValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus == null || this.canApplyBoost == null) {
                return;
            }
            this.boostsStatus.boosts += iIntValue;
            if (this.type == 32 && (chatFull = getChatFull()) != null) {
                chatFull.boosts_applied += iIntValue;
            }
            limitPreviewIncreaseCurrentValue();
            setBoostsStats(tL_premium_boostsStatus, this.isCurrentChat);
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
            canApplyBoost.isMaxLvl = this.boostsStatus.next_level_boosts <= 0;
            canApplyBoost.boostedNow = true;
            canApplyBoost.setMyBoosts(tL_premium_myBoosts);
            if (onBoostSuccess()) {
                BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.ic_boosts_replace, LocaleController.formatPluralString("BoostingReassignedFromPlural", iIntValue, LocaleController.formatPluralString("BoostingFromOtherChannel", iIntValue2, new Object[0])), 30).setDuration(4000).show(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.didStartedMultiGiftsSelector) {
            lambda$new$0();
        }
    }

    class AnonymousClass5 extends RecyclerListView.SelectionAdapter {
        AnonymousClass5() {
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
            int i = limitReachedBottomSheet.type;
            if ((i == 11 || i == 34) && !limitReachedBottomSheet.canSendLink) {
                return false;
            }
            return viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 4;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View adminedChannelCell;
            Context context = viewGroup.getContext();
            switch (i) {
                case 1:
                    adminedChannelCell = new AdminedChannelCell(context, new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            AdminedChannelCell adminedChannelCell2 = (AdminedChannelCell) view.getParent();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(adminedChannelCell2.getCurrentChannel());
                            LimitReachedBottomSheet.this.revokeLinks(arrayList);
                        }
                    }, true, 9);
                    break;
                case 2:
                    adminedChannelCell = new ShadowSectionCell(context, 12, Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    break;
                case 3:
                    HeaderCell headerCell = new HeaderCell(context);
                    headerCell.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    adminedChannelCell = headerCell;
                    break;
                case 4:
                    GroupCreateUserCell groupCreateUserCell = new GroupCreateUserCell(context, 1, 0, false, false, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                    groupCreateUserCell.setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft, 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft, 0);
                    adminedChannelCell = groupCreateUserCell;
                    break;
                case 5:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
                    flickerLoadingView.setViewType(LimitReachedBottomSheet.this.type == 2 ? 22 : 21);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setIgnoreHeightCheck(true);
                    flickerLoadingView.setItemsCount(10);
                    adminedChannelCell = flickerLoadingView;
                    break;
                case 6:
                    adminedChannelCell = new View(LimitReachedBottomSheet.this.getContext()) {
                        @Override
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
                        }
                    };
                    break;
                case 7:
                    FrameLayout frameLayout = new FrameLayout(LimitReachedBottomSheet.this.getContext());
                    frameLayout.setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0);
                    TextView textView = new TextView(context);
                    LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                    if (limitReachedBottomSheet.statisticClickRunnable == null && ChatObject.hasAdminRights(limitReachedBottomSheet.getChat())) {
                        LimitReachedBottomSheet.this.statisticClickRunnable = new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onCreateViewHolder$3();
                            }
                        };
                    }
                    textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(LimitReachedBottomSheet.this.statisticClickRunnable != null ? 50.0f : 18.0f), AndroidUtilities.dp(13.0f));
                    textView.setTextSize(1, 16.0f);
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    textView.setSingleLine(true);
                    frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                    int iDp = AndroidUtilities.dp(8.0f);
                    int color = Theme.getColor(Theme.key_graySection, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                    int i2 = Theme.key_listSelector;
                    textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, color, ColorUtils.setAlphaComponent(Theme.getColor(i2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider), 76)));
                    textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$onCreateViewHolder$4(view);
                        }
                    });
                    if (LimitReachedBottomSheet.this.statisticClickRunnable != null) {
                        ImageView imageView = new ImageView(LimitReachedBottomSheet.this.getContext());
                        imageView.setImageResource(R.drawable.msg_stats);
                        imageView.setColorFilter(Theme.getColor(Theme.key_dialogTextBlack, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(Theme.getColor(i2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider), 76)));
                        frameLayout.addView(imageView, LayoutHelper.createFrame(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                this.f$0.lambda$onCreateViewHolder$5(view);
                            }
                        });
                    }
                    textView.setText(LimitReachedBottomSheet.this.getBoostLink());
                    textView.setGravity(17);
                    adminedChannelCell = frameLayout;
                    break;
                case 8:
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0);
                    linearLayout.setOrientation(1);
                    LoginOrView loginOrView = new LoginOrView(context);
                    final LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
                    SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(LimitReachedBottomSheet.this.isGroup() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                    spannableStringBuilder.setSpan(new ClickableSpan() {
                        @Override
                        public void updateDrawState(TextPaint textPaint) {
                            super.updateDrawState(textPaint);
                            textPaint.setUnderlineText(false);
                            textPaint.setColor(Theme.getColor(Theme.key_chat_messageLinkIn, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        }

                        @Override
                        public void onClick(View view) {
                            BoostPagerBottomSheet.show(LimitReachedBottomSheet.this.getBaseFragment(), LimitReachedBottomSheet.this.dialogId, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                        }
                    }, 0, spannableStringBuilder.length(), 33);
                    SpannableString spannableString = new SpannableString(">");
                    Drawable drawableMutate = LimitReachedBottomSheet.this.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                    int i3 = Theme.key_chat_messageLinkIn;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(drawableMutate);
                    coloredImageSpan.setColorKey(i3);
                    coloredImageSpan.setSize(AndroidUtilities.dp(18.0f));
                    coloredImageSpan.setWidth(AndroidUtilities.dp(11.0f));
                    coloredImageSpan.setTranslateX(-AndroidUtilities.dp(5.0f));
                    spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
                    linksTextView.setText(TextUtils.concat(spannableStringBuilderReplaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                    linksTextView.setTextSize(1, 14.0f);
                    linksTextView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                    if (((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider instanceof DarkThemeResourceProvider) {
                        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    } else {
                        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    }
                    linksTextView.setGravity(1);
                    linksTextView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$onCreateViewHolder$0(view);
                        }
                    });
                    loginOrView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            linksTextView.performClick();
                        }
                    });
                    if (LimitReachedBottomSheet.this.isMiniBoostBtnForAdminAvailable()) {
                        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                        buttonWithCounterView.setText(LocaleController.getString(R.string.Copy), false);
                        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                this.f$0.lambda$onCreateViewHolder$2(view);
                            }
                        });
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.addView(LimitReachedBottomSheet.this.boostMiniBtn, LayoutHelper.createLinear(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, 44, 12.0f, 12.0f, 12.0f, 8.0f));
                    } else {
                        linearLayout.addView(LimitReachedBottomSheet.this.actionBtn, LayoutHelper.createLinear(-1, 48, 12.0f, 12.0f, 12.0f, 8.0f));
                    }
                    linearLayout.addView(loginOrView, LayoutHelper.createLinear(-1, 48, 0.0f, -5.0f, 0.0f, 0.0f));
                    linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 12.0f, -6.0f, 12.0f, 17.0f));
                    adminedChannelCell = linearLayout;
                    break;
                case 9:
                    LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
                    adminedChannelCell = limitReachedBottomSheet2.new BoostFeatureCell(context, ((BottomSheet) limitReachedBottomSheet2).resourcesProvider);
                    break;
                default:
                    adminedChannelCell = LimitReachedBottomSheet.this.headerView = LimitReachedBottomSheet.this.new HeaderView(context);
                    break;
            }
            adminedChannelCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(adminedChannelCell);
        }

        public void lambda$onCreateViewHolder$0(View view) {
            BoostPagerBottomSheet.show(LimitReachedBottomSheet.this.getBaseFragment(), LimitReachedBottomSheet.this.dialogId, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
        }

        public void lambda$onCreateViewHolder$2(View view) {
            AndroidUtilities.addToClipboard(LimitReachedBottomSheet.this.getBoostLink());
            LimitReachedBottomSheet.this.lambda$new$0();
        }

        public void lambda$onCreateViewHolder$3() {
            LimitReachedBottomSheet.this.getBaseFragment().presentFragment(StatisticActivity.create(LimitReachedBottomSheet.this.getChat()));
        }

        public void lambda$onCreateViewHolder$4(View view) {
            AndroidUtilities.addToClipboard(LimitReachedBottomSheet.this.getBoostLink());
        }

        public void lambda$onCreateViewHolder$5(View view) {
            LimitReachedBottomSheet.this.statisticClickRunnable.run();
            LimitReachedBottomSheet.this.lambda$new$0();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String userStatus;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 1) {
                LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                TLRPC.Chat chat = (TLRPC.Chat) limitReachedBottomSheet.chats.get(i - limitReachedBottomSheet.chatStartRow);
                AdminedChannelCell adminedChannelCell = (AdminedChannelCell) viewHolder.itemView;
                TLRPC.Chat currentChannel = adminedChannelCell.getCurrentChannel();
                adminedChannelCell.setChannel(chat, false);
                adminedChannelCell.setChecked(LimitReachedBottomSheet.this.selectedChats.contains(chat), currentChannel == chat);
                return;
            }
            if (itemViewType == 9) {
                LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
                int i2 = i - limitReachedBottomSheet2.boostFeaturesStartRow;
                ArrayList arrayList = limitReachedBottomSheet2.boostFeatures;
                if (arrayList == null || i2 < 0 || i2 >= arrayList.size()) {
                    return;
                }
                ((BoostFeatureCell) viewHolder.itemView).set((BoostFeature) LimitReachedBottomSheet.this.boostFeatures.get(i2));
                return;
            }
            if (itemViewType == 3) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                LimitReachedBottomSheet limitReachedBottomSheet3 = LimitReachedBottomSheet.this;
                int i3 = limitReachedBottomSheet3.type;
                if (i3 != 11 && i3 != 34) {
                    if (i3 == 2) {
                        headerCell.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                }
                if (!limitReachedBottomSheet3.canSendLink) {
                    if (LimitReachedBottomSheet.this.restrictedUsers.size() == 1) {
                        headerCell.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                        return;
                    }
                }
                headerCell.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                return;
            }
            if (itemViewType != 4) {
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) viewHolder.itemView;
            LimitReachedBottomSheet limitReachedBottomSheet4 = LimitReachedBottomSheet.this;
            int i4 = limitReachedBottomSheet4.type;
            if (i4 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) limitReachedBottomSheet4.inactiveChats.get(i - LimitReachedBottomSheet.this.chatStartRow);
                groupCreateUserCell.setObject(chat2, chat2.title, (String) LimitReachedBottomSheet.this.inactiveChatsSignatures.get(i - LimitReachedBottomSheet.this.chatStartRow), ((float) i) != ((float) LimitReachedBottomSheet.this.chatEndRow) - 1.0f);
                groupCreateUserCell.setChecked(LimitReachedBottomSheet.this.selectedChats.contains(chat2), false);
            } else if (i4 == 11 || i4 == 34) {
                TLRPC.User user = (TLRPC.User) limitReachedBottomSheet4.restrictedUsers.get(i - LimitReachedBottomSheet.this.chatStartRow);
                boolean z = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null && LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.contains(Long.valueOf(user.id));
                groupCreateUserCell.overridePremiumBlocked(z ? new TL_account.requirementToContactPremium() : null, false);
                if (!z) {
                    userStatus = LocaleController.formatUserStatus(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, user, null, null);
                } else {
                    userStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                }
                groupCreateUserCell.setObject(user, ContactsController.formatName(user.first_name, user.last_name), userStatus, ((float) i) != ((float) LimitReachedBottomSheet.this.chatEndRow) - 1.0f);
                groupCreateUserCell.setChecked(LimitReachedBottomSheet.this.selectedChats.contains(user), false);
            }
        }

        @Override
        public int getItemViewType(int i) {
            int i2;
            LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
            if (limitReachedBottomSheet.headerRow == i) {
                return 0;
            }
            if (limitReachedBottomSheet.dividerRow == i) {
                return 2;
            }
            if (limitReachedBottomSheet.chatsTitleRow == i) {
                return 3;
            }
            if (limitReachedBottomSheet.loadingRow == i) {
                return 5;
            }
            if (limitReachedBottomSheet.emptyViewDividerRow == i) {
                return 6;
            }
            if (limitReachedBottomSheet.linkRow == i) {
                return 7;
            }
            LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
            if (limitReachedBottomSheet2.bottomRow == i) {
                return 8;
            }
            ArrayList arrayList = limitReachedBottomSheet2.boostFeatures;
            if (arrayList != null && i >= (i2 = limitReachedBottomSheet2.boostFeaturesStartRow) && i <= i2 + arrayList.size()) {
                return 9;
            }
            int i3 = LimitReachedBottomSheet.this.type;
            return (i3 == 5 || i3 == 11 || i3 == 34) ? 4 : 1;
        }

        @Override
        public int getItemCount() {
            return LimitReachedBottomSheet.this.rowCount;
        }
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        return new AnonymousClass5();
    }

    public boolean isMiniBoostBtnForAdminAvailable() {
        return isBoostingForAdminPossible() && ChatObject.hasAdminRights(getChat());
    }

    private boolean isBoostingForAdminPossible() {
        int i = this.type;
        return i == 19 || i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 27 || i == 28 || i == 23 || i == 30 || i == 35;
    }

    public String getBoostLink() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.boostsStatus.boost_url;
        }
        return ChannelBoostUtilities.createLink(this.currentAccount, this.dialogId);
    }

    public void setCurrentValue(int i) {
        this.currentValue = i;
    }

    public void setVeryLargeFile(boolean z) {
        this.isVeryLargeFile = z;
        updatePremiumButtonText();
    }

    public void setRestrictedUsers(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.fromChat = chat;
        this.forceLink = str;
        this.canSendLink = !TextUtils.isEmpty(str) || ChatObject.canUserDoAdminAction(chat, 3);
        this.restrictedUsers = new ArrayList(arrayList);
        this.premiumMessagingBlockedUsers = arrayList2;
        this.premiumInviteBlockedUsers = arrayList3;
        this.selectedChats.clear();
        if (this.canSendLink) {
            for (TLRPC.User user : this.restrictedUsers) {
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.id))) {
                    this.selectedChats.add(user);
                }
            }
        }
        updateRows();
        updateButton();
        int i = this.type;
        if ((i == 11 || i == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.restrictedUsers.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            PremiumButtonView premiumButtonView = this.premiumButtonView;
            if (premiumButtonView != null && premiumButtonView.getParent() != null) {
                ((ViewGroup) this.premiumButtonView.getParent()).removeView(this.premiumButtonView);
            }
            View view = this.divider;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) this.divider.getParent()).removeView(this.divider);
            }
            RecyclerListView recyclerListView = this.recyclerListView;
            if (recyclerListView != null) {
                recyclerListView.setPadding(0, 0, 0, 0);
            }
        }
    }

    public void setDialogId(long j) {
        this.dialogId = j;
        updateRows();
    }

    public void setChatMessageCell(ChatMessageCell chatMessageCell) {
        this.chatMessageCell = chatMessageCell;
    }

    public void setBoostsStats(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        this.boostsStatus = tL_premium_boostsStatus;
        this.isCurrentChat = z;
        updateRows();
    }

    public void setCanApplyBoost(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.canApplyBoost = canApplyBoost;
        updateButton();
        updatePremiumButtonText();
    }

    public void showStatisticButtonInLink(Runnable runnable) {
        this.statisticClickRunnable = runnable;
    }

    class HeaderView extends LinearLayout {
        BoostCounterView boostCounterView;
        TextView description;
        TextView title;
        LinearLayout titleLinearLayout;

        public HeaderView(Context context) {
            String string;
            String pluralString;
            String str;
            boolean z;
            int i;
            int activatedAccountsCount;
            int i2;
            ArrayList<TLRPC.Dialog> dialogs;
            int size;
            int i3;
            int i4;
            TLRPC.Dialog dialog;
            float f;
            int i5;
            boolean z2;
            int i6;
            ArrayList arrayList;
            AvatarsImageView avatarsImageView;
            int iMin;
            int i7;
            TextView textView;
            boolean z3;
            boolean z4;
            String str2;
            String string2;
            int i8;
            int i9;
            int size2;
            int size3;
            int i10;
            int i11;
            int i12;
            float f2;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            TLRPC.Chat chat;
            TextView textView2;
            int i19;
            float f3;
            float f4;
            super(context);
            setOrientation(1);
            setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft + AndroidUtilities.dp(6.0f), 0);
            LimitParams limitParams = LimitReachedBottomSheet.getLimitParams(LimitReachedBottomSheet.this.type, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount);
            LimitReachedBottomSheet.this.limitParams = limitParams;
            int i20 = limitParams.icon;
            MessagesController messagesController = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount);
            boolean zPremiumFeaturesBlocked = messagesController.premiumFeaturesBlocked();
            boolean zIsGroup = LimitReachedBottomSheet.this.isGroup();
            int i21 = LimitReachedBottomSheet.this.type;
            if (i21 == 31) {
                string = LocaleController.getString(zIsGroup ? R.string.BoostingAdditionalFeaturesSubtitle : R.string.BoostingAdditionalFeaturesSubtitleChannel);
            } else if (i21 == 32) {
                string = LimitReachedBottomSheet.this.getBoostsDescriptionString(true);
            } else if (i21 == 19) {
                if (LimitReachedBottomSheet.this.chatMessageCell != null) {
                    int i22 = LimitReachedBottomSheet.this.chatMessageCell.getMessageObject().messageOwner.from_boosts_applied;
                    TLRPC.Chat chat2 = LimitReachedBottomSheet.this.getChat();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("GroupBoostedByUserWithTimes", i22, UserObject.getFirstName(LimitReachedBottomSheet.this.chatMessageCell.getCurrentUser())));
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.GroupBoostedByUserWithDescription, chat2 == null ? "" : chat2.title));
                    string = spannableStringBuilder.toString();
                } else if (LimitReachedBottomSheet.this.getBaseFragment() instanceof GroupColorActivity) {
                    string = LocaleController.formatPluralString("BoostingGroupBoostWhatAreBoostsDescription", BoostRepository.giveawayBoostsPerPremium(), new Object[0]);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LimitReachedBottomSheet.this.getBoostsDescriptionString(true));
                    if (ChatObject.hasAdminRights(LimitReachedBottomSheet.this.getChat()) && zIsGroup) {
                        spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.BoostingPremiumUserCanBoostGroupWithLink));
                    }
                    string = spannableStringBuilder2.toString();
                }
            } else if (i21 == 18) {
                string = LimitReachedBottomSheet.this.boostsStatus.level == 0 ? LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsDescription : R.string.ChannelNeedBoostsDescription, LocaleController.formatPluralString("MoreBoosts", LimitReachedBottomSheet.this.boostsStatus.next_level_boosts, Integer.valueOf(LimitReachedBottomSheet.this.boostsStatus.next_level_boosts))) : LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsDescriptionNextLevel : R.string.ChannelNeedBoostsDescriptionNextLevel, LocaleController.formatPluralString("MoreBoosts", LimitReachedBottomSheet.this.boostsStatus.next_level_boosts - LimitReachedBottomSheet.this.boostsStatus.boosts, Integer.valueOf(LimitReachedBottomSheet.this.boostsStatus.next_level_boosts - LimitReachedBottomSheet.this.boostsStatus.boosts)), LocaleController.formatPluralString("BoostStories", LimitReachedBottomSheet.this.boostsStatus.level + 1, new Object[0]));
            } else if (i21 == 20) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(LimitReachedBottomSheet.this.channelColorLevelMin()));
            } else if (i21 == 24) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(LimitReachedBottomSheet.this.channelColorLevelMin()));
            } else if (i21 == 29) {
                string = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
            } else if (i21 == 30) {
                string = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
            } else if (i21 == 35) {
                string = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
            } else if (i21 == 25) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(zIsGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
            } else if (i21 == 26) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(zIsGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
            } else if (i21 == 27) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
            } else if (i21 == 28) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(zIsGroup ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
            } else if (i21 == 22) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(zIsGroup ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
            } else if (i21 == 23) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(zIsGroup ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
            } else if (i21 == 21) {
                string = LocaleController.formatPluralString("ReactionReachLvlForReaction", LimitReachedBottomSheet.this.requiredLvl, Integer.valueOf(LimitReachedBottomSheet.this.requiredLvl));
            } else {
                if (i21 == 11) {
                    if (!LimitReachedBottomSheet.this.canSendLink) {
                        if (ChatObject.isChannelAndNotMegaGroup(LimitReachedBottomSheet.this.fromChat)) {
                            pluralString = LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsers2One, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers2", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                        } else {
                            pluralString = LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsers2One, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers2", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                        }
                    } else if (!ChatObject.isChannelAndNotMegaGroup(LimitReachedBottomSheet.this.fromChat)) {
                        if (LimitReachedBottomSheet.this.restrictedUsers.size() != 1) {
                            pluralString = LocaleController.formatPluralString("InviteRestrictedUsers", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                        } else {
                            pluralString = LocaleController.formatString(R.string.InviteRestrictedUsersOne, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0)));
                        }
                    } else {
                        pluralString = LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsersOne, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                    }
                    str = pluralString;
                    z = true;
                } else {
                    string = i21 == 34 ? LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString(R.string.InviteCallRestrictedUsersOne, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteCallRestrictedUsers", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size())) : zPremiumFeaturesBlocked ? LimitReachedBottomSheet.this.limitParams.descriptionStrLocked : (UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium() || LimitReachedBottomSheet.this.isVeryLargeFile) ? LimitReachedBottomSheet.this.limitParams.descriptionStrPremium : LimitReachedBottomSheet.this.limitParams.descriptionStr;
                }
                LimitParams limitParams2 = LimitReachedBottomSheet.this.limitParams;
                int i23 = limitParams2.defaultLimit;
                i = limitParams2.premiumLimit;
                activatedAccountsCount = LimitReachedBottomSheet.this.currentValue;
                i2 = LimitReachedBottomSheet.this.type;
                if (i2 == 3) {
                    activatedAccountsCount = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).dialogFilters.size() - 1;
                } else if (i2 == 7) {
                    activatedAccountsCount = UserConfig.getActivatedAccountsCount();
                } else if (i2 == 0) {
                    dialogs = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getDialogs(0);
                    size = dialogs.size();
                    i3 = 0;
                    for (i4 = 0; i4 < size; i4++) {
                        dialog = dialogs.get(i4);
                        if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                            i3++;
                        }
                    }
                    activatedAccountsCount = i3;
                }
                if (!UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium() || LimitReachedBottomSheet.this.isVeryLargeFile) {
                    activatedAccountsCount = i;
                    f = 1.0f;
                } else {
                    activatedAccountsCount = activatedAccountsCount < 0 ? i23 : activatedAccountsCount;
                    if (LimitReachedBottomSheet.this.type != 7) {
                        f3 = activatedAccountsCount;
                        f4 = i;
                    } else if (activatedAccountsCount > i23) {
                        f3 = activatedAccountsCount - i23;
                        f4 = i - i23;
                    } else {
                        f = 0.5f;
                    }
                    f = f3 / f4;
                }
                float f5 = i23 / i;
                i5 = LimitReachedBottomSheet.this.type;
                if (i5 == 18 && i5 != 20 && i5 != 24 && i5 != 25 && i5 != 26 && i5 != 29 && i5 != 22 && i5 != 23 && i5 != 19 && i5 != 30 && i5 != 35) {
                    if (i5 != 21) {
                        if (i5 != 27) {
                            if (i5 != 28 && i5 != 32) {
                                z2 = false;
                            }
                            if (z2) {
                                i6 = 0;
                            } else {
                                i6 = activatedAccountsCount;
                            }
                            if ((i5 != 11 || i5 == 34) && !MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).premiumFeaturesBlocked() && ((LimitReachedBottomSheet.this.premiumInviteBlockedUsers != null && !LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) || (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null && LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size() >= LimitReachedBottomSheet.this.restrictedUsers.size()))) {
                                if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                                    arrayList = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                                } else {
                                    arrayList = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                                }
                                avatarsImageView = new AvatarsImageView(context, false);
                                avatarsImageView.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
                                avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                                avatarsImageView.setStepFactor(0.4f);
                                iMin = Math.min(arrayList.size(), 3);
                                avatarsImageView.setCount(iMin);
                                for (i7 = 0; i7 < iMin; i7++) {
                                    Long l = (Long) arrayList.get(i7);
                                    l.longValue();
                                    avatarsImageView.setObject(i7, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l));
                                }
                                avatarsImageView.commitTransition(false);
                                addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                                TextView textView3 = new TextView(context);
                                textView3.setGravity(17);
                                textView3.setTypeface(AndroidUtilities.bold());
                                textView3.setTextSize(1, 20.0f);
                                int i24 = Theme.key_dialogTextBlack;
                                textView3.setTextColor(Theme.getColor(i24, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                textView3.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                                addView(textView3, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                                textView = new TextView(context);
                                textView.setGravity(17);
                                textView.setTextSize(1, 14.0f);
                                textView.setTextColor(Theme.getColor(i24, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                                if (LimitReachedBottomSheet.this.type == 34) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null || LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size() < LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size()) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (arrayList.size() == 1) {
                                    if (z3) {
                                        i10 = R.string.InviteCallMessagePremiumBlockedOne;
                                    } else if (z4) {
                                        i10 = R.string.InviteMessagePremiumBlockedOne;
                                    } else {
                                        i10 = R.string.InvitePremiumBlockedOne;
                                    }
                                    string2 = LocaleController.formatString(i10, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))));
                                } else if (arrayList.size() == 2) {
                                    if (z3) {
                                        i9 = R.string.InviteCallMessagePremiumBlockedTwo;
                                    } else if (z4) {
                                        i9 = R.string.InviteMessagePremiumBlockedTwo;
                                    } else {
                                        i9 = R.string.InvitePremiumBlockedTwo;
                                    }
                                    string2 = LocaleController.formatString(i9, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                                } else if (arrayList.size() == 3) {
                                    if (z3) {
                                        i8 = R.string.InviteCallMessagePremiumBlockedThree;
                                    } else if (z4) {
                                        i8 = R.string.InviteMessagePremiumBlockedThree;
                                    } else {
                                        i8 = R.string.InvitePremiumBlockedThree;
                                    }
                                    string2 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(2))));
                                } else {
                                    if (z3) {
                                        str2 = "InviteCallMessagePremiumBlockedMany";
                                    } else if (z4) {
                                        str2 = "InviteMessagePremiumBlockedMany";
                                    } else {
                                        str2 = "InvitePremiumBlockedMany";
                                    }
                                    String pluralString2 = LocaleController.formatPluralString(str2, arrayList.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                                    avatarsImageView.setPlus(arrayList.size() - 2, LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground));
                                    string2 = pluralString2;
                                }
                                textView.setText(AndroidUtilities.replaceTags(string2));
                                if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers == null) {
                                    size2 = 0;
                                } else {
                                    size2 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size();
                                }
                                if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers == null) {
                                    size3 = 0;
                                } else {
                                    size3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size();
                                }
                                if (size2 - size3 <= 0 && ((size2 != 1 || size3 != 1) && LimitReachedBottomSheet.this.canSendLink)) {
                                    PremiumButtonView premiumButtonView = new PremiumButtonView(context, false, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                    ScaleStateListAnimator.apply(premiumButtonView, 0.02f, 1.2f);
                                    premiumButtonView.setButton(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), new View.OnClickListener() {
                                        @Override
                                        public final void onClick(View view) {
                                            this.f$0.lambda$new$0(view);
                                        }
                                    });
                                    addView(premiumButtonView, LayoutHelper.createLinear(-1, 48, (((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft / AndroidUtilities.density) + 4.0f, 0.0f, (((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft / AndroidUtilities.density) + 4.0f, 18.0f));
                                    TextView textView4 = new TextView(context) {
                                        private final Paint paint = new Paint(1);

                                        @Override
                                        protected void dispatchDraw(Canvas canvas) {
                                            this.paint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider), 0.8f));
                                            this.paint.setStyle(Paint.Style.STROKE);
                                            this.paint.setStrokeWidth(1.0f);
                                            float height = getHeight() / 2.0f;
                                            Layout layout = getLayout();
                                            int iMax = 0;
                                            for (int i25 = 0; i25 < layout.getLineCount(); i25++) {
                                                iMax = Math.max(iMax, (int) layout.getLineWidth(i25));
                                            }
                                            float f6 = iMax / 2.0f;
                                            canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f6) - AndroidUtilities.dp(8.0f), height, this.paint);
                                            canvas.drawLine((getWidth() / 2.0f) + f6 + AndroidUtilities.dp(8.0f), height, getWidth(), height, this.paint);
                                            super.dispatchDraw(canvas);
                                        }
                                    };
                                    textView4.setGravity(17);
                                    textView4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    textView4.setText(" " + LocaleController.getString(R.string.InvitePremiumBlockedOr) + " ");
                                    textView4.setTextSize(14.0f);
                                    addView(textView4, LayoutHelper.createLinear(190, -2, 1, 12, 0, 12, 20));
                                    TextView textView5 = new TextView(context);
                                    textView5.setGravity(17);
                                    textView5.setTypeface(AndroidUtilities.bold());
                                    textView5.setTextSize(1, 20.0f);
                                    textView5.setTextColor(Theme.getColor(i24, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    textView5.setText(LocaleController.getString(R.string.InviteBlockedTitle));
                                    addView(textView5, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                                    TextView textView6 = new TextView(context);
                                    textView6.setGravity(17);
                                    textView6.setTextSize(1, 14.0f);
                                    textView6.setTextColor(Theme.getColor(i24, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size() <= 1) {
                                        textView6.setText(LocaleController.getString(R.string.InviteBlockedOneMessage));
                                    } else {
                                        textView6.setText(LocaleController.getString(R.string.InviteBlockedManyMessage));
                                    }
                                    addView(textView6, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                                } else {
                                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                    LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                                }
                                LimitReachedBottomSheet.this.updatePremiumButtonText();
                                return;
                            }
                            i11 = LimitReachedBottomSheet.this.type;
                            if (i11 != 31 || i11 == 34) {
                                i12 = 31;
                                f2 = 14.0f;
                            } else {
                                f2 = 14.0f;
                                i12 = 31;
                                LimitPreviewView limitPreviewView = new LimitPreviewView(context, i20, i6, i, f5, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider) {
                                    @Override
                                    public void invalidate() {
                                        if (LimitReachedBottomSheet.this.lockInvalidation) {
                                            return;
                                        }
                                        super.invalidate();
                                    }
                                };
                                LimitReachedBottomSheet.this.limitPreviewView = limitPreviewView;
                                if (z2) {
                                    if (LimitReachedBottomSheet.this.boostsStatus != null) {
                                        LimitReachedBottomSheet.this.limitPreviewView.setBoosts(LimitReachedBottomSheet.this.boostsStatus, LimitReachedBottomSheet.this.canApplyBoost != null && LimitReachedBottomSheet.this.canApplyBoost.boostedNow);
                                    }
                                } else {
                                    limitPreviewView.setBagePosition(f);
                                    LimitReachedBottomSheet.this.limitPreviewView.setType(LimitReachedBottomSheet.this.type);
                                    LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setVisibility(8);
                                    if (!z) {
                                        if (UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium() || LimitReachedBottomSheet.this.isVeryLargeFile) {
                                            LimitReachedBottomSheet.this.limitPreviewView.premiumCount.setVisibility(8);
                                            if (LimitReachedBottomSheet.this.type == 6) {
                                                LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setText("2 GB");
                                            } else {
                                                LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setText(Integer.toString(i23));
                                            }
                                            LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setVisibility(0);
                                        }
                                    } else {
                                        LimitReachedBottomSheet.this.limitPreviewView.setPremiumLocked();
                                    }
                                }
                                int i25 = LimitReachedBottomSheet.this.type;
                                if (i25 == 2 || i25 == 5) {
                                    LimitReachedBottomSheet.this.limitPreviewView.setDelayedAnimation();
                                }
                                addView(LimitReachedBottomSheet.this.limitPreviewView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                            }
                            if (LimitReachedBottomSheet.this.type == i12) {
                                FrameLayout frameLayout = new FrameLayout(context);
                                ImageView imageView = new ImageView(context);
                                imageView.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.large_boosts));
                                frameLayout.addView(imageView, LayoutHelper.createFrame(-2, -2, 17));
                                frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(79.0f), Theme.getColor(Theme.key_featuredStickers_addButton)));
                                addView(frameLayout, LayoutHelper.createLinear(79, 79, 1, 0, 23, 0, 0));
                            }
                            TextView textView7 = new TextView(context);
                            this.title = textView7;
                            textView7.setTypeface(AndroidUtilities.bold());
                            i13 = LimitReachedBottomSheet.this.type;
                            if (i13 == i12) {
                                this.title.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                                i14 = 32;
                            } else {
                                i14 = 32;
                                if (i13 == 32) {
                                    this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                                } else if (i13 == 19) {
                                    if (!(LimitReachedBottomSheet.this.getBaseFragment() instanceof GroupColorActivity)) {
                                        this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                                    } else {
                                        this.title.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                                    }
                                } else if (i13 == 30) {
                                    this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                                } else if (i13 == 35) {
                                    this.title.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                                } else if (i13 == 18) {
                                    if (LimitReachedBottomSheet.this.boostsStatus.level == 0) {
                                        this.title.setText(LocaleController.getString(R.string.BoostingEnableStories));
                                    } else {
                                        this.title.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                                    }
                                } else if (i13 == 21) {
                                    this.title.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                                } else if (i13 == 20) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableColor));
                                } else if (i13 == 24) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                                } else {
                                    if (i13 == 27) {
                                        this.title.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                                    } else {
                                        i15 = 28;
                                        if (i13 == 28) {
                                            this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                                        } else if (i13 == 25) {
                                            this.title.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                                        } else if (i13 == 26) {
                                            this.title.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                                        } else if (i13 == 29) {
                                            this.title.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                                        } else if (i13 != 22 || i13 == 23) {
                                            this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                        } else if (i13 == 11) {
                                            if (LimitReachedBottomSheet.this.canSendLink) {
                                                this.title.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                                            } else {
                                                this.title.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted));
                                            }
                                        } else if (i13 == 34) {
                                            this.title.setText(LocaleController.getString(R.string.CallInviteViaLinkTitle));
                                        } else if (i13 == 6) {
                                            this.title.setText(LocaleController.getString(R.string.FileTooLarge));
                                        } else if (i13 == 14 && LimitReachedBottomSheet.this.storiesCount > 1) {
                                            this.title.setText(LocaleController.getString(R.string.CreateMultipleStories));
                                        } else {
                                            this.title.setText(LocaleController.getString(R.string.LimitReached));
                                        }
                                    }
                                    this.title.setTextSize(1, 20.0f);
                                    TextView textView8 = this.title;
                                    i16 = Theme.key_windowBackgroundWhiteBlackText;
                                    textView8.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    this.title.setGravity(17);
                                    i17 = LimitReachedBottomSheet.this.type;
                                    if (i17 != 19 || i17 == i14 || LimitReachedBottomSheet.this.isMiniBoostBtnForAdminAvailable()) {
                                        BoostCounterView boostCounterView = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                        this.boostCounterView = boostCounterView;
                                        boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                        if (LimitReachedBottomSheet.this.type == i14) {
                                            this.boostCounterView.setVisibility(8);
                                        }
                                        if (LimitReachedBottomSheet.this.isCurrentChat) {
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            this.titleLinearLayout = linearLayout;
                                            linearLayout.setOrientation(0);
                                            this.titleLinearLayout.setWeightSum(1.0f);
                                            this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                            this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                            View view = this.titleLinearLayout;
                                            if (z) {
                                                i19 = 8;
                                            } else {
                                                i19 = 22;
                                            }
                                            addView(view, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                                        } else {
                                            View view2 = this.title;
                                            if (z) {
                                                i18 = 8;
                                            } else {
                                                i18 = 22;
                                            }
                                            addView(view2, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                                            LinearLayout linearLayout2 = new LinearLayout(getContext());
                                            linearLayout2.setOrientation(0);
                                            linearLayout2.setClipChildren(false);
                                            FrameLayout frameLayout2 = new FrameLayout(getContext());
                                            frameLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                            BackupImageView backupImageView = new BackupImageView(getContext());
                                            backupImageView.setRoundRadius(AndroidUtilities.dp(f2));
                                            chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                            AvatarDrawable avatarDrawable = new AvatarDrawable();
                                            avatarDrawable.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                            backupImageView.setForUserOrChat(chat, avatarDrawable);
                                            frameLayout2.addView(backupImageView, LayoutHelper.createFrame(i15, 28.0f));
                                            textView2 = new TextView(getContext());
                                            if (chat != null) {
                                                textView2.setText(chat.title);
                                            }
                                            textView2.setSingleLine(true);
                                            textView2.setMaxLines(1);
                                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                                            textView2.setTextSize(1, 13.0f);
                                            textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                            frameLayout2.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                            linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                            LayoutTransition layoutTransition = new LayoutTransition();
                                            layoutTransition.setDuration(100L);
                                            layoutTransition.enableTransitionType(4);
                                            linearLayout2.setLayoutTransition(layoutTransition);
                                            linearLayout2.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                            addView(linearLayout2, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                            ScaleStateListAnimator.apply(linearLayout2);
                                            linearLayout2.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public final void onClick(View view3) {
                                                    this.f$0.lambda$new$1(view3);
                                                }
                                            });
                                        }
                                    } else {
                                        addView(this.title, LayoutHelper.createLinear(-2, -2, 1, 0, z ? 8 : 22, 0, 10));
                                    }
                                    TextView textView9 = new TextView(context);
                                    this.description = textView9;
                                    textView9.setText(AndroidUtilities.replaceTags(str));
                                    this.description.setTextSize(1, 14.0f);
                                    this.description.setGravity(1);
                                    TextView textView10 = this.description;
                                    textView10.setLineSpacing(textView10.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                                    if (LimitReachedBottomSheet.this.type == 18 || !(((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider instanceof DarkThemeResourceProvider)) {
                                        this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    } else {
                                        this.description.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    }
                                    if (LimitReachedBottomSheet.this.type == 19) {
                                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                                    } else {
                                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                                    }
                                    if (LimitReachedBottomSheet.this.type == i12) {
                                        ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                                    }
                                    LimitReachedBottomSheet.this.updatePremiumButtonText();
                                }
                            }
                            i15 = 28;
                            this.title.setTextSize(1, 20.0f);
                            TextView textView11 = this.title;
                            i16 = Theme.key_windowBackgroundWhiteBlackText;
                            textView11.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            this.title.setGravity(17);
                            i17 = LimitReachedBottomSheet.this.type;
                            if (i17 != 19) {
                                BoostCounterView boostCounterView2 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                this.boostCounterView = boostCounterView2;
                                boostCounterView2.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                if (LimitReachedBottomSheet.this.type == i14) {
                                    this.boostCounterView.setVisibility(8);
                                }
                                if (LimitReachedBottomSheet.this.isCurrentChat) {
                                    LinearLayout linearLayout3 = new LinearLayout(context);
                                    this.titleLinearLayout = linearLayout3;
                                    linearLayout3.setOrientation(0);
                                    this.titleLinearLayout.setWeightSum(1.0f);
                                    this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                    this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                    View view3 = this.titleLinearLayout;
                                    if (z) {
                                        i19 = 8;
                                    } else {
                                        i19 = 22;
                                    }
                                    addView(view3, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                                } else {
                                    View view4 = this.title;
                                    if (z) {
                                        i18 = 8;
                                    } else {
                                        i18 = 22;
                                    }
                                    addView(view4, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                                    LinearLayout linearLayout4 = new LinearLayout(getContext());
                                    linearLayout4.setOrientation(0);
                                    linearLayout4.setClipChildren(false);
                                    FrameLayout frameLayout3 = new FrameLayout(getContext());
                                    frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                    BackupImageView backupImageView2 = new BackupImageView(getContext());
                                    backupImageView2.setRoundRadius(AndroidUtilities.dp(f2));
                                    chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                    AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                                    avatarDrawable2.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                    backupImageView2.setForUserOrChat(chat, avatarDrawable2);
                                    frameLayout3.addView(backupImageView2, LayoutHelper.createFrame(i15, 28.0f));
                                    textView2 = new TextView(getContext());
                                    if (chat != null) {
                                        textView2.setText(chat.title);
                                    }
                                    textView2.setSingleLine(true);
                                    textView2.setMaxLines(1);
                                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                                    textView2.setTextSize(1, 13.0f);
                                    textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    frameLayout3.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                    linearLayout4.addView(frameLayout3, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                    LayoutTransition layoutTransition2 = new LayoutTransition();
                                    layoutTransition2.setDuration(100L);
                                    layoutTransition2.enableTransitionType(4);
                                    linearLayout4.setLayoutTransition(layoutTransition2);
                                    linearLayout4.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                    addView(linearLayout4, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                    ScaleStateListAnimator.apply(linearLayout4);
                                    linearLayout4.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public final void onClick(View view5) {
                                            this.f$0.lambda$new$1(view5);
                                        }
                                    });
                                }
                            } else {
                                BoostCounterView boostCounterView3 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                this.boostCounterView = boostCounterView3;
                                boostCounterView3.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                if (LimitReachedBottomSheet.this.type == i14) {
                                    this.boostCounterView.setVisibility(8);
                                }
                                if (LimitReachedBottomSheet.this.isCurrentChat) {
                                    LinearLayout linearLayout5 = new LinearLayout(context);
                                    this.titleLinearLayout = linearLayout5;
                                    linearLayout5.setOrientation(0);
                                    this.titleLinearLayout.setWeightSum(1.0f);
                                    this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                    this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                    View view5 = this.titleLinearLayout;
                                    if (z) {
                                        i19 = 8;
                                    } else {
                                        i19 = 22;
                                    }
                                    addView(view5, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                                } else {
                                    View view6 = this.title;
                                    if (z) {
                                        i18 = 8;
                                    } else {
                                        i18 = 22;
                                    }
                                    addView(view6, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                                    LinearLayout linearLayout6 = new LinearLayout(getContext());
                                    linearLayout6.setOrientation(0);
                                    linearLayout6.setClipChildren(false);
                                    FrameLayout frameLayout4 = new FrameLayout(getContext());
                                    frameLayout4.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                    BackupImageView backupImageView3 = new BackupImageView(getContext());
                                    backupImageView3.setRoundRadius(AndroidUtilities.dp(f2));
                                    chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                    AvatarDrawable avatarDrawable3 = new AvatarDrawable();
                                    avatarDrawable3.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                    backupImageView3.setForUserOrChat(chat, avatarDrawable3);
                                    frameLayout4.addView(backupImageView3, LayoutHelper.createFrame(i15, 28.0f));
                                    textView2 = new TextView(getContext());
                                    if (chat != null) {
                                        textView2.setText(chat.title);
                                    }
                                    textView2.setSingleLine(true);
                                    textView2.setMaxLines(1);
                                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                                    textView2.setTextSize(1, 13.0f);
                                    textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    frameLayout4.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                    linearLayout6.addView(frameLayout4, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                    LayoutTransition layoutTransition3 = new LayoutTransition();
                                    layoutTransition3.setDuration(100L);
                                    layoutTransition3.enableTransitionType(4);
                                    linearLayout6.setLayoutTransition(layoutTransition3);
                                    linearLayout6.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                    addView(linearLayout6, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                    ScaleStateListAnimator.apply(linearLayout6);
                                    linearLayout6.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public final void onClick(View view7) {
                                            this.f$0.lambda$new$1(view7);
                                        }
                                    });
                                }
                            }
                            TextView textView12 = new TextView(context);
                            this.description = textView12;
                            textView12.setText(AndroidUtilities.replaceTags(str));
                            this.description.setTextSize(1, 14.0f);
                            this.description.setGravity(1);
                            TextView textView13 = this.description;
                            textView13.setLineSpacing(textView13.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                            if (LimitReachedBottomSheet.this.type == 18) {
                                this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            } else {
                                this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            }
                            if (LimitReachedBottomSheet.this.type == 19) {
                                addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                            } else {
                                addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                            }
                            if (LimitReachedBottomSheet.this.type == i12) {
                                ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                            }
                            LimitReachedBottomSheet.this.updatePremiumButtonText();
                        }
                        if (z2) {
                            i6 = 0;
                        } else {
                            i6 = activatedAccountsCount;
                        }
                        if (i5 != 11) {
                            if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                                arrayList = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                            } else {
                                arrayList = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                            }
                            avatarsImageView = new AvatarsImageView(context, false);
                            avatarsImageView.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
                            avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                            avatarsImageView.setStepFactor(0.4f);
                            iMin = Math.min(arrayList.size(), 3);
                            avatarsImageView.setCount(iMin);
                            while (i7 < iMin) {
                                Long l2 = (Long) arrayList.get(i7);
                                l2.longValue();
                                avatarsImageView.setObject(i7, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l2));
                            }
                            avatarsImageView.commitTransition(false);
                            addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                            TextView textView14 = new TextView(context);
                            textView14.setGravity(17);
                            textView14.setTypeface(AndroidUtilities.bold());
                            textView14.setTextSize(1, 20.0f);
                            int i26 = Theme.key_dialogTextBlack;
                            textView14.setTextColor(Theme.getColor(i26, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            textView14.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                            addView(textView14, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                            textView = new TextView(context);
                            textView.setGravity(17);
                            textView.setTextSize(1, 14.0f);
                            textView.setTextColor(Theme.getColor(i26, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                            if (LimitReachedBottomSheet.this.type == 34) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (arrayList.size() == 1) {
                                if (z3) {
                                    i10 = R.string.InviteCallMessagePremiumBlockedOne;
                                } else if (z4) {
                                    i10 = R.string.InviteMessagePremiumBlockedOne;
                                } else {
                                    i10 = R.string.InvitePremiumBlockedOne;
                                }
                                string2 = LocaleController.formatString(i10, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))));
                            } else if (arrayList.size() == 2) {
                                if (z3) {
                                    i9 = R.string.InviteCallMessagePremiumBlockedTwo;
                                } else if (z4) {
                                    i9 = R.string.InviteMessagePremiumBlockedTwo;
                                } else {
                                    i9 = R.string.InvitePremiumBlockedTwo;
                                }
                                string2 = LocaleController.formatString(i9, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                            } else if (arrayList.size() == 3) {
                                if (z3) {
                                    i8 = R.string.InviteCallMessagePremiumBlockedThree;
                                } else if (z4) {
                                    i8 = R.string.InviteMessagePremiumBlockedThree;
                                } else {
                                    i8 = R.string.InvitePremiumBlockedThree;
                                }
                                string2 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(2))));
                            } else {
                                if (z3) {
                                    str2 = "InviteCallMessagePremiumBlockedMany";
                                } else if (z4) {
                                    str2 = "InviteMessagePremiumBlockedMany";
                                } else {
                                    str2 = "InvitePremiumBlockedMany";
                                }
                                String pluralString3 = LocaleController.formatPluralString(str2, arrayList.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                                avatarsImageView.setPlus(arrayList.size() - 2, LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground));
                                string2 = pluralString3;
                            }
                            textView.setText(AndroidUtilities.replaceTags(string2));
                            if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers == null) {
                                size2 = 0;
                            } else {
                                size2 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size();
                            }
                            if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers == null) {
                                size3 = 0;
                            } else {
                                size3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size();
                            }
                            if (size2 - size3 <= 0) {
                                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                            } else {
                                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                            }
                            LimitReachedBottomSheet.this.updatePremiumButtonText();
                            return;
                        }
                        if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                            arrayList = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                        } else {
                            arrayList = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                        }
                        avatarsImageView = new AvatarsImageView(context, false);
                        avatarsImageView.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
                        avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                        avatarsImageView.setStepFactor(0.4f);
                        iMin = Math.min(arrayList.size(), 3);
                        avatarsImageView.setCount(iMin);
                        while (i7 < iMin) {
                            Long l3 = (Long) arrayList.get(i7);
                            l3.longValue();
                            avatarsImageView.setObject(i7, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l3));
                        }
                        avatarsImageView.commitTransition(false);
                        addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                        TextView textView15 = new TextView(context);
                        textView15.setGravity(17);
                        textView15.setTypeface(AndroidUtilities.bold());
                        textView15.setTextSize(1, 20.0f);
                        int i27 = Theme.key_dialogTextBlack;
                        textView15.setTextColor(Theme.getColor(i27, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        textView15.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                        addView(textView15, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                        textView = new TextView(context);
                        textView.setGravity(17);
                        textView.setTextSize(1, 14.0f);
                        textView.setTextColor(Theme.getColor(i27, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                        if (LimitReachedBottomSheet.this.type == 34) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (arrayList.size() == 1) {
                            if (z3) {
                                i10 = R.string.InviteCallMessagePremiumBlockedOne;
                            } else if (z4) {
                                i10 = R.string.InviteMessagePremiumBlockedOne;
                            } else {
                                i10 = R.string.InvitePremiumBlockedOne;
                            }
                            string2 = LocaleController.formatString(i10, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))));
                        } else if (arrayList.size() == 2) {
                            if (z3) {
                                i9 = R.string.InviteCallMessagePremiumBlockedTwo;
                            } else if (z4) {
                                i9 = R.string.InviteMessagePremiumBlockedTwo;
                            } else {
                                i9 = R.string.InvitePremiumBlockedTwo;
                            }
                            string2 = LocaleController.formatString(i9, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                        } else if (arrayList.size() == 3) {
                            if (z3) {
                                i8 = R.string.InviteCallMessagePremiumBlockedThree;
                            } else if (z4) {
                                i8 = R.string.InviteMessagePremiumBlockedThree;
                            } else {
                                i8 = R.string.InvitePremiumBlockedThree;
                            }
                            string2 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(2))));
                        } else {
                            if (z3) {
                                str2 = "InviteCallMessagePremiumBlockedMany";
                            } else if (z4) {
                                str2 = "InviteMessagePremiumBlockedMany";
                            } else {
                                str2 = "InvitePremiumBlockedMany";
                            }
                            String pluralString4 = LocaleController.formatPluralString(str2, arrayList.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                            avatarsImageView.setPlus(arrayList.size() - 2, LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground));
                            string2 = pluralString4;
                        }
                        textView.setText(AndroidUtilities.replaceTags(string2));
                        if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers == null) {
                            size2 = 0;
                        } else {
                            size2 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size();
                        }
                        if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers == null) {
                            size3 = 0;
                        } else {
                            size3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size();
                        }
                        if (size2 - size3 <= 0) {
                            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                            LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                        } else {
                            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                            LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                        }
                        LimitReachedBottomSheet.this.updatePremiumButtonText();
                        return;
                        i11 = LimitReachedBottomSheet.this.type;
                        if (i11 != 31) {
                            i12 = 31;
                            f2 = 14.0f;
                        } else {
                            i12 = 31;
                            f2 = 14.0f;
                        }
                        if (LimitReachedBottomSheet.this.type == i12) {
                            FrameLayout frameLayout5 = new FrameLayout(context);
                            ImageView imageView2 = new ImageView(context);
                            imageView2.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.large_boosts));
                            frameLayout5.addView(imageView2, LayoutHelper.createFrame(-2, -2, 17));
                            frameLayout5.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(79.0f), Theme.getColor(Theme.key_featuredStickers_addButton)));
                            addView(frameLayout5, LayoutHelper.createLinear(79, 79, 1, 0, 23, 0, 0));
                        }
                        TextView textView16 = new TextView(context);
                        this.title = textView16;
                        textView16.setTypeface(AndroidUtilities.bold());
                        i13 = LimitReachedBottomSheet.this.type;
                        if (i13 == i12) {
                            this.title.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                            i14 = 32;
                        } else {
                            i14 = 32;
                            if (i13 == 32) {
                                this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                            } else if (i13 == 19) {
                                if (!(LimitReachedBottomSheet.this.getBaseFragment() instanceof GroupColorActivity)) {
                                    this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                                } else {
                                    this.title.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                                }
                            } else if (i13 == 30) {
                                this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                            } else if (i13 == 35) {
                                this.title.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                            } else if (i13 == 18) {
                                if (LimitReachedBottomSheet.this.boostsStatus.level == 0) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableStories));
                                } else {
                                    this.title.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                                }
                            } else if (i13 == 21) {
                                this.title.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                            } else if (i13 == 20) {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableColor));
                            } else if (i13 == 24) {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                            } else {
                                if (i13 == 27) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                                } else {
                                    i15 = 28;
                                    if (i13 == 28) {
                                        this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                                    } else if (i13 == 25) {
                                        this.title.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                                    } else if (i13 == 26) {
                                        this.title.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                                    } else if (i13 == 29) {
                                        this.title.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                                    } else if (i13 != 22) {
                                        this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                    } else {
                                        this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                    }
                                }
                                this.title.setTextSize(1, 20.0f);
                                TextView textView17 = this.title;
                                i16 = Theme.key_windowBackgroundWhiteBlackText;
                                textView17.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                this.title.setGravity(17);
                                i17 = LimitReachedBottomSheet.this.type;
                                if (i17 != 19) {
                                    BoostCounterView boostCounterView4 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                    this.boostCounterView = boostCounterView4;
                                    boostCounterView4.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                    if (LimitReachedBottomSheet.this.type == i14) {
                                        this.boostCounterView.setVisibility(8);
                                    }
                                    if (LimitReachedBottomSheet.this.isCurrentChat) {
                                        LinearLayout linearLayout7 = new LinearLayout(context);
                                        this.titleLinearLayout = linearLayout7;
                                        linearLayout7.setOrientation(0);
                                        this.titleLinearLayout.setWeightSum(1.0f);
                                        this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                        this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                        View view7 = this.titleLinearLayout;
                                        if (z) {
                                            i19 = 8;
                                        } else {
                                            i19 = 22;
                                        }
                                        addView(view7, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                                    } else {
                                        View view8 = this.title;
                                        if (z) {
                                            i18 = 8;
                                        } else {
                                            i18 = 22;
                                        }
                                        addView(view8, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                                        LinearLayout linearLayout8 = new LinearLayout(getContext());
                                        linearLayout8.setOrientation(0);
                                        linearLayout8.setClipChildren(false);
                                        FrameLayout frameLayout6 = new FrameLayout(getContext());
                                        frameLayout6.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                        BackupImageView backupImageView4 = new BackupImageView(getContext());
                                        backupImageView4.setRoundRadius(AndroidUtilities.dp(f2));
                                        chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                        AvatarDrawable avatarDrawable4 = new AvatarDrawable();
                                        avatarDrawable4.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                        backupImageView4.setForUserOrChat(chat, avatarDrawable4);
                                        frameLayout6.addView(backupImageView4, LayoutHelper.createFrame(i15, 28.0f));
                                        textView2 = new TextView(getContext());
                                        if (chat != null) {
                                            textView2.setText(chat.title);
                                        }
                                        textView2.setSingleLine(true);
                                        textView2.setMaxLines(1);
                                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                                        textView2.setTextSize(1, 13.0f);
                                        textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                        frameLayout6.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                        linearLayout8.addView(frameLayout6, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                        LayoutTransition layoutTransition4 = new LayoutTransition();
                                        layoutTransition4.setDuration(100L);
                                        layoutTransition4.enableTransitionType(4);
                                        linearLayout8.setLayoutTransition(layoutTransition4);
                                        linearLayout8.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                        addView(linearLayout8, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                        ScaleStateListAnimator.apply(linearLayout8);
                                        linearLayout8.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public final void onClick(View view9) {
                                                this.f$0.lambda$new$1(view9);
                                            }
                                        });
                                    }
                                } else {
                                    BoostCounterView boostCounterView5 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                    this.boostCounterView = boostCounterView5;
                                    boostCounterView5.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                    if (LimitReachedBottomSheet.this.type == i14) {
                                        this.boostCounterView.setVisibility(8);
                                    }
                                    if (LimitReachedBottomSheet.this.isCurrentChat) {
                                        LinearLayout linearLayout9 = new LinearLayout(context);
                                        this.titleLinearLayout = linearLayout9;
                                        linearLayout9.setOrientation(0);
                                        this.titleLinearLayout.setWeightSum(1.0f);
                                        this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                        this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                        View view9 = this.titleLinearLayout;
                                        if (z) {
                                            i19 = 8;
                                        } else {
                                            i19 = 22;
                                        }
                                        addView(view9, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                                    } else {
                                        View view10 = this.title;
                                        if (z) {
                                            i18 = 8;
                                        } else {
                                            i18 = 22;
                                        }
                                        addView(view10, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                                        LinearLayout linearLayout10 = new LinearLayout(getContext());
                                        linearLayout10.setOrientation(0);
                                        linearLayout10.setClipChildren(false);
                                        FrameLayout frameLayout7 = new FrameLayout(getContext());
                                        frameLayout7.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                        BackupImageView backupImageView5 = new BackupImageView(getContext());
                                        backupImageView5.setRoundRadius(AndroidUtilities.dp(f2));
                                        chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                        AvatarDrawable avatarDrawable5 = new AvatarDrawable();
                                        avatarDrawable5.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                        backupImageView5.setForUserOrChat(chat, avatarDrawable5);
                                        frameLayout7.addView(backupImageView5, LayoutHelper.createFrame(i15, 28.0f));
                                        textView2 = new TextView(getContext());
                                        if (chat != null) {
                                            textView2.setText(chat.title);
                                        }
                                        textView2.setSingleLine(true);
                                        textView2.setMaxLines(1);
                                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                                        textView2.setTextSize(1, 13.0f);
                                        textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                        frameLayout7.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                        linearLayout10.addView(frameLayout7, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                        LayoutTransition layoutTransition5 = new LayoutTransition();
                                        layoutTransition5.setDuration(100L);
                                        layoutTransition5.enableTransitionType(4);
                                        linearLayout10.setLayoutTransition(layoutTransition5);
                                        linearLayout10.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                        addView(linearLayout10, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                        ScaleStateListAnimator.apply(linearLayout10);
                                        linearLayout10.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public final void onClick(View view11) {
                                                this.f$0.lambda$new$1(view11);
                                            }
                                        });
                                    }
                                }
                                TextView textView18 = new TextView(context);
                                this.description = textView18;
                                textView18.setText(AndroidUtilities.replaceTags(str));
                                this.description.setTextSize(1, 14.0f);
                                this.description.setGravity(1);
                                TextView textView19 = this.description;
                                textView19.setLineSpacing(textView19.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                                if (LimitReachedBottomSheet.this.type == 18) {
                                    this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                } else {
                                    this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                }
                                if (LimitReachedBottomSheet.this.type == 19) {
                                    addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                                } else {
                                    addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                                }
                                if (LimitReachedBottomSheet.this.type == i12) {
                                    ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                    ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                    ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                                }
                                LimitReachedBottomSheet.this.updatePremiumButtonText();
                            }
                        }
                        i15 = 28;
                        this.title.setTextSize(1, 20.0f);
                        TextView textView110 = this.title;
                        i16 = Theme.key_windowBackgroundWhiteBlackText;
                        textView110.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        this.title.setGravity(17);
                        i17 = LimitReachedBottomSheet.this.type;
                        if (i17 != 19) {
                            BoostCounterView boostCounterView6 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                            this.boostCounterView = boostCounterView6;
                            boostCounterView6.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                            if (LimitReachedBottomSheet.this.type == i14) {
                                this.boostCounterView.setVisibility(8);
                            }
                            if (LimitReachedBottomSheet.this.isCurrentChat) {
                                LinearLayout linearLayout11 = new LinearLayout(context);
                                this.titleLinearLayout = linearLayout11;
                                linearLayout11.setOrientation(0);
                                this.titleLinearLayout.setWeightSum(1.0f);
                                this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                View view11 = this.titleLinearLayout;
                                if (z) {
                                    i19 = 8;
                                } else {
                                    i19 = 22;
                                }
                                addView(view11, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                            } else {
                                View view12 = this.title;
                                if (z) {
                                    i18 = 8;
                                } else {
                                    i18 = 22;
                                }
                                addView(view12, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                                LinearLayout linearLayout12 = new LinearLayout(getContext());
                                linearLayout12.setOrientation(0);
                                linearLayout12.setClipChildren(false);
                                FrameLayout frameLayout8 = new FrameLayout(getContext());
                                frameLayout8.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                BackupImageView backupImageView6 = new BackupImageView(getContext());
                                backupImageView6.setRoundRadius(AndroidUtilities.dp(f2));
                                chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                AvatarDrawable avatarDrawable6 = new AvatarDrawable();
                                avatarDrawable6.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                backupImageView6.setForUserOrChat(chat, avatarDrawable6);
                                frameLayout8.addView(backupImageView6, LayoutHelper.createFrame(i15, 28.0f));
                                textView2 = new TextView(getContext());
                                if (chat != null) {
                                    textView2.setText(chat.title);
                                }
                                textView2.setSingleLine(true);
                                textView2.setMaxLines(1);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setTextSize(1, 13.0f);
                                textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                frameLayout8.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                linearLayout12.addView(frameLayout8, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                LayoutTransition layoutTransition6 = new LayoutTransition();
                                layoutTransition6.setDuration(100L);
                                layoutTransition6.enableTransitionType(4);
                                linearLayout12.setLayoutTransition(layoutTransition6);
                                linearLayout12.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                addView(linearLayout12, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                ScaleStateListAnimator.apply(linearLayout12);
                                linearLayout12.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view13) {
                                        this.f$0.lambda$new$1(view13);
                                    }
                                });
                            }
                        } else {
                            BoostCounterView boostCounterView7 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                            this.boostCounterView = boostCounterView7;
                            boostCounterView7.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                            if (LimitReachedBottomSheet.this.type == i14) {
                                this.boostCounterView.setVisibility(8);
                            }
                            if (LimitReachedBottomSheet.this.isCurrentChat) {
                                LinearLayout linearLayout13 = new LinearLayout(context);
                                this.titleLinearLayout = linearLayout13;
                                linearLayout13.setOrientation(0);
                                this.titleLinearLayout.setWeightSum(1.0f);
                                this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                View view13 = this.titleLinearLayout;
                                if (z) {
                                    i19 = 8;
                                } else {
                                    i19 = 22;
                                }
                                addView(view13, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                            } else {
                                View view14 = this.title;
                                if (z) {
                                    i18 = 8;
                                } else {
                                    i18 = 22;
                                }
                                addView(view14, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                                LinearLayout linearLayout14 = new LinearLayout(getContext());
                                linearLayout14.setOrientation(0);
                                linearLayout14.setClipChildren(false);
                                FrameLayout frameLayout9 = new FrameLayout(getContext());
                                frameLayout9.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                BackupImageView backupImageView7 = new BackupImageView(getContext());
                                backupImageView7.setRoundRadius(AndroidUtilities.dp(f2));
                                chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                AvatarDrawable avatarDrawable7 = new AvatarDrawable();
                                avatarDrawable7.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                backupImageView7.setForUserOrChat(chat, avatarDrawable7);
                                frameLayout9.addView(backupImageView7, LayoutHelper.createFrame(i15, 28.0f));
                                textView2 = new TextView(getContext());
                                if (chat != null) {
                                    textView2.setText(chat.title);
                                }
                                textView2.setSingleLine(true);
                                textView2.setMaxLines(1);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setTextSize(1, 13.0f);
                                textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                frameLayout9.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                linearLayout14.addView(frameLayout9, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                LayoutTransition layoutTransition7 = new LayoutTransition();
                                layoutTransition7.setDuration(100L);
                                layoutTransition7.enableTransitionType(4);
                                linearLayout14.setLayoutTransition(layoutTransition7);
                                linearLayout14.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                addView(linearLayout14, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                ScaleStateListAnimator.apply(linearLayout14);
                                linearLayout14.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view15) {
                                        this.f$0.lambda$new$1(view15);
                                    }
                                });
                            }
                        }
                        TextView textView111 = new TextView(context);
                        this.description = textView111;
                        textView111.setText(AndroidUtilities.replaceTags(str));
                        this.description.setTextSize(1, 14.0f);
                        this.description.setGravity(1);
                        TextView textView112 = this.description;
                        textView112.setLineSpacing(textView112.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                        if (LimitReachedBottomSheet.this.type == 18) {
                            this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        } else {
                            this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        }
                        if (LimitReachedBottomSheet.this.type == 19) {
                            addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                        } else {
                            addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                        }
                        if (LimitReachedBottomSheet.this.type == i12) {
                            ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                            ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                            ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        }
                        LimitReachedBottomSheet.this.updatePremiumButtonText();
                    }
                    if (z2) {
                        i6 = 0;
                    } else {
                        i6 = activatedAccountsCount;
                    }
                    if (i5 != 11) {
                        if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                            arrayList = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                        } else {
                            arrayList = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                        }
                        avatarsImageView = new AvatarsImageView(context, false);
                        avatarsImageView.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
                        avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                        avatarsImageView.setStepFactor(0.4f);
                        iMin = Math.min(arrayList.size(), 3);
                        avatarsImageView.setCount(iMin);
                        while (i7 < iMin) {
                            Long l4 = (Long) arrayList.get(i7);
                            l4.longValue();
                            avatarsImageView.setObject(i7, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l4));
                        }
                        avatarsImageView.commitTransition(false);
                        addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                        TextView textView113 = new TextView(context);
                        textView113.setGravity(17);
                        textView113.setTypeface(AndroidUtilities.bold());
                        textView113.setTextSize(1, 20.0f);
                        int i28 = Theme.key_dialogTextBlack;
                        textView113.setTextColor(Theme.getColor(i28, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        textView113.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                        addView(textView113, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                        textView = new TextView(context);
                        textView.setGravity(17);
                        textView.setTextSize(1, 14.0f);
                        textView.setTextColor(Theme.getColor(i28, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                        if (LimitReachedBottomSheet.this.type == 34) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (arrayList.size() == 1) {
                            if (z3) {
                                i10 = R.string.InviteCallMessagePremiumBlockedOne;
                            } else if (z4) {
                                i10 = R.string.InviteMessagePremiumBlockedOne;
                            } else {
                                i10 = R.string.InvitePremiumBlockedOne;
                            }
                            string2 = LocaleController.formatString(i10, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))));
                        } else if (arrayList.size() == 2) {
                            if (z3) {
                                i9 = R.string.InviteCallMessagePremiumBlockedTwo;
                            } else if (z4) {
                                i9 = R.string.InviteMessagePremiumBlockedTwo;
                            } else {
                                i9 = R.string.InvitePremiumBlockedTwo;
                            }
                            string2 = LocaleController.formatString(i9, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                        } else if (arrayList.size() == 3) {
                            if (z3) {
                                i8 = R.string.InviteCallMessagePremiumBlockedThree;
                            } else if (z4) {
                                i8 = R.string.InviteMessagePremiumBlockedThree;
                            } else {
                                i8 = R.string.InvitePremiumBlockedThree;
                            }
                            string2 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(2))));
                        } else {
                            if (z3) {
                                str2 = "InviteCallMessagePremiumBlockedMany";
                            } else if (z4) {
                                str2 = "InviteMessagePremiumBlockedMany";
                            } else {
                                str2 = "InvitePremiumBlockedMany";
                            }
                            String pluralString5 = LocaleController.formatPluralString(str2, arrayList.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                            avatarsImageView.setPlus(arrayList.size() - 2, LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground));
                            string2 = pluralString5;
                        }
                        textView.setText(AndroidUtilities.replaceTags(string2));
                        if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers == null) {
                            size2 = 0;
                        } else {
                            size2 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size();
                        }
                        if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers == null) {
                            size3 = 0;
                        } else {
                            size3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size();
                        }
                        if (size2 - size3 <= 0) {
                            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                            LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                        } else {
                            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                            LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                        }
                        LimitReachedBottomSheet.this.updatePremiumButtonText();
                        return;
                    }
                    if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                        arrayList = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                    } else {
                        arrayList = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                    }
                    avatarsImageView = new AvatarsImageView(context, false);
                    avatarsImageView.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
                    avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                    avatarsImageView.setStepFactor(0.4f);
                    iMin = Math.min(arrayList.size(), 3);
                    avatarsImageView.setCount(iMin);
                    while (i7 < iMin) {
                        Long l5 = (Long) arrayList.get(i7);
                        l5.longValue();
                        avatarsImageView.setObject(i7, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l5));
                    }
                    avatarsImageView.commitTransition(false);
                    addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                    TextView textView114 = new TextView(context);
                    textView114.setGravity(17);
                    textView114.setTypeface(AndroidUtilities.bold());
                    textView114.setTextSize(1, 20.0f);
                    int i29 = Theme.key_dialogTextBlack;
                    textView114.setTextColor(Theme.getColor(i29, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    textView114.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                    addView(textView114, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                    textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setTextSize(1, 14.0f);
                    textView.setTextColor(Theme.getColor(i29, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                    if (LimitReachedBottomSheet.this.type == 34) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (arrayList.size() == 1) {
                        if (z3) {
                            i10 = R.string.InviteCallMessagePremiumBlockedOne;
                        } else if (z4) {
                            i10 = R.string.InviteMessagePremiumBlockedOne;
                        } else {
                            i10 = R.string.InvitePremiumBlockedOne;
                        }
                        string2 = LocaleController.formatString(i10, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))));
                    } else if (arrayList.size() == 2) {
                        if (z3) {
                            i9 = R.string.InviteCallMessagePremiumBlockedTwo;
                        } else if (z4) {
                            i9 = R.string.InviteMessagePremiumBlockedTwo;
                        } else {
                            i9 = R.string.InvitePremiumBlockedTwo;
                        }
                        string2 = LocaleController.formatString(i9, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                    } else if (arrayList.size() == 3) {
                        if (z3) {
                            i8 = R.string.InviteCallMessagePremiumBlockedThree;
                        } else if (z4) {
                            i8 = R.string.InviteMessagePremiumBlockedThree;
                        } else {
                            i8 = R.string.InvitePremiumBlockedThree;
                        }
                        string2 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(2))));
                    } else {
                        if (z3) {
                            str2 = "InviteCallMessagePremiumBlockedMany";
                        } else if (z4) {
                            str2 = "InviteMessagePremiumBlockedMany";
                        } else {
                            str2 = "InvitePremiumBlockedMany";
                        }
                        String pluralString6 = LocaleController.formatPluralString(str2, arrayList.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                        avatarsImageView.setPlus(arrayList.size() - 2, LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground));
                        string2 = pluralString6;
                    }
                    textView.setText(AndroidUtilities.replaceTags(string2));
                    if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers == null) {
                        size2 = 0;
                    } else {
                        size2 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size();
                    }
                    if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers == null) {
                        size3 = 0;
                    } else {
                        size3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size();
                    }
                    if (size2 - size3 <= 0) {
                        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                        LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                    } else {
                        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                        LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                    }
                    LimitReachedBottomSheet.this.updatePremiumButtonText();
                    return;
                    i11 = LimitReachedBottomSheet.this.type;
                    if (i11 != 31) {
                        i12 = 31;
                        f2 = 14.0f;
                    } else {
                        i12 = 31;
                        f2 = 14.0f;
                    }
                    if (LimitReachedBottomSheet.this.type == i12) {
                        FrameLayout frameLayout10 = new FrameLayout(context);
                        ImageView imageView3 = new ImageView(context);
                        imageView3.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.large_boosts));
                        frameLayout10.addView(imageView3, LayoutHelper.createFrame(-2, -2, 17));
                        frameLayout10.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(79.0f), Theme.getColor(Theme.key_featuredStickers_addButton)));
                        addView(frameLayout10, LayoutHelper.createLinear(79, 79, 1, 0, 23, 0, 0));
                    }
                    TextView textView115 = new TextView(context);
                    this.title = textView115;
                    textView115.setTypeface(AndroidUtilities.bold());
                    i13 = LimitReachedBottomSheet.this.type;
                    if (i13 == i12) {
                        this.title.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                        i14 = 32;
                    } else {
                        i14 = 32;
                        if (i13 == 32) {
                            this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                        } else if (i13 == 19) {
                            if (!(LimitReachedBottomSheet.this.getBaseFragment() instanceof GroupColorActivity)) {
                                this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                            } else {
                                this.title.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                            }
                        } else if (i13 == 30) {
                            this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                        } else if (i13 == 35) {
                            this.title.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                        } else if (i13 == 18) {
                            if (LimitReachedBottomSheet.this.boostsStatus.level == 0) {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableStories));
                            } else {
                                this.title.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                            }
                        } else if (i13 == 21) {
                            this.title.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                        } else if (i13 == 20) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableColor));
                        } else if (i13 == 24) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                        } else {
                            if (i13 == 27) {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                            } else {
                                i15 = 28;
                                if (i13 == 28) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                                } else if (i13 == 25) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                                } else if (i13 == 26) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                                } else if (i13 == 29) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                                } else if (i13 != 22) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                } else {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                }
                            }
                            this.title.setTextSize(1, 20.0f);
                            TextView textView116 = this.title;
                            i16 = Theme.key_windowBackgroundWhiteBlackText;
                            textView116.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            this.title.setGravity(17);
                            i17 = LimitReachedBottomSheet.this.type;
                            if (i17 != 19) {
                                BoostCounterView boostCounterView8 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                this.boostCounterView = boostCounterView8;
                                boostCounterView8.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                if (LimitReachedBottomSheet.this.type == i14) {
                                    this.boostCounterView.setVisibility(8);
                                }
                                if (LimitReachedBottomSheet.this.isCurrentChat) {
                                    LinearLayout linearLayout15 = new LinearLayout(context);
                                    this.titleLinearLayout = linearLayout15;
                                    linearLayout15.setOrientation(0);
                                    this.titleLinearLayout.setWeightSum(1.0f);
                                    this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                    this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                    View view15 = this.titleLinearLayout;
                                    if (z) {
                                        i19 = 8;
                                    } else {
                                        i19 = 22;
                                    }
                                    addView(view15, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                                } else {
                                    View view16 = this.title;
                                    if (z) {
                                        i18 = 8;
                                    } else {
                                        i18 = 22;
                                    }
                                    addView(view16, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                                    LinearLayout linearLayout16 = new LinearLayout(getContext());
                                    linearLayout16.setOrientation(0);
                                    linearLayout16.setClipChildren(false);
                                    FrameLayout frameLayout11 = new FrameLayout(getContext());
                                    frameLayout11.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                    BackupImageView backupImageView8 = new BackupImageView(getContext());
                                    backupImageView8.setRoundRadius(AndroidUtilities.dp(f2));
                                    chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                    AvatarDrawable avatarDrawable8 = new AvatarDrawable();
                                    avatarDrawable8.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                    backupImageView8.setForUserOrChat(chat, avatarDrawable8);
                                    frameLayout11.addView(backupImageView8, LayoutHelper.createFrame(i15, 28.0f));
                                    textView2 = new TextView(getContext());
                                    if (chat != null) {
                                        textView2.setText(chat.title);
                                    }
                                    textView2.setSingleLine(true);
                                    textView2.setMaxLines(1);
                                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                                    textView2.setTextSize(1, 13.0f);
                                    textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    frameLayout11.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                    linearLayout16.addView(frameLayout11, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                    LayoutTransition layoutTransition8 = new LayoutTransition();
                                    layoutTransition8.setDuration(100L);
                                    layoutTransition8.enableTransitionType(4);
                                    linearLayout16.setLayoutTransition(layoutTransition8);
                                    linearLayout16.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                    addView(linearLayout16, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                    ScaleStateListAnimator.apply(linearLayout16);
                                    linearLayout16.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public final void onClick(View view17) {
                                            this.f$0.lambda$new$1(view17);
                                        }
                                    });
                                }
                            } else {
                                BoostCounterView boostCounterView9 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                                this.boostCounterView = boostCounterView9;
                                boostCounterView9.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                if (LimitReachedBottomSheet.this.type == i14) {
                                    this.boostCounterView.setVisibility(8);
                                }
                                if (LimitReachedBottomSheet.this.isCurrentChat) {
                                    LinearLayout linearLayout17 = new LinearLayout(context);
                                    this.titleLinearLayout = linearLayout17;
                                    linearLayout17.setOrientation(0);
                                    this.titleLinearLayout.setWeightSum(1.0f);
                                    this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                    this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                    View view17 = this.titleLinearLayout;
                                    if (z) {
                                        i19 = 8;
                                    } else {
                                        i19 = 22;
                                    }
                                    addView(view17, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                                } else {
                                    View view18 = this.title;
                                    if (z) {
                                        i18 = 8;
                                    } else {
                                        i18 = 22;
                                    }
                                    addView(view18, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                                    LinearLayout linearLayout18 = new LinearLayout(getContext());
                                    linearLayout18.setOrientation(0);
                                    linearLayout18.setClipChildren(false);
                                    FrameLayout frameLayout12 = new FrameLayout(getContext());
                                    frameLayout12.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                    BackupImageView backupImageView9 = new BackupImageView(getContext());
                                    backupImageView9.setRoundRadius(AndroidUtilities.dp(f2));
                                    chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                    AvatarDrawable avatarDrawable9 = new AvatarDrawable();
                                    avatarDrawable9.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                    backupImageView9.setForUserOrChat(chat, avatarDrawable9);
                                    frameLayout12.addView(backupImageView9, LayoutHelper.createFrame(i15, 28.0f));
                                    textView2 = new TextView(getContext());
                                    if (chat != null) {
                                        textView2.setText(chat.title);
                                    }
                                    textView2.setSingleLine(true);
                                    textView2.setMaxLines(1);
                                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                                    textView2.setTextSize(1, 13.0f);
                                    textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    frameLayout12.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                    linearLayout18.addView(frameLayout12, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                    LayoutTransition layoutTransition9 = new LayoutTransition();
                                    layoutTransition9.setDuration(100L);
                                    layoutTransition9.enableTransitionType(4);
                                    linearLayout18.setLayoutTransition(layoutTransition9);
                                    linearLayout18.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                    addView(linearLayout18, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                    ScaleStateListAnimator.apply(linearLayout18);
                                    linearLayout18.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public final void onClick(View view19) {
                                            this.f$0.lambda$new$1(view19);
                                        }
                                    });
                                }
                            }
                            TextView textView117 = new TextView(context);
                            this.description = textView117;
                            textView117.setText(AndroidUtilities.replaceTags(str));
                            this.description.setTextSize(1, 14.0f);
                            this.description.setGravity(1);
                            TextView textView118 = this.description;
                            textView118.setLineSpacing(textView118.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                            if (LimitReachedBottomSheet.this.type == 18) {
                                this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            } else {
                                this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            }
                            if (LimitReachedBottomSheet.this.type == 19) {
                                addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                            } else {
                                addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                            }
                            if (LimitReachedBottomSheet.this.type == i12) {
                                ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                            }
                            LimitReachedBottomSheet.this.updatePremiumButtonText();
                        }
                    }
                    i15 = 28;
                    this.title.setTextSize(1, 20.0f);
                    TextView textView119 = this.title;
                    i16 = Theme.key_windowBackgroundWhiteBlackText;
                    textView119.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    this.title.setGravity(17);
                    i17 = LimitReachedBottomSheet.this.type;
                    if (i17 != 19) {
                        BoostCounterView boostCounterView10 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                        this.boostCounterView = boostCounterView10;
                        boostCounterView10.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                        if (LimitReachedBottomSheet.this.type == i14) {
                            this.boostCounterView.setVisibility(8);
                        }
                        if (LimitReachedBottomSheet.this.isCurrentChat) {
                            LinearLayout linearLayout19 = new LinearLayout(context);
                            this.titleLinearLayout = linearLayout19;
                            linearLayout19.setOrientation(0);
                            this.titleLinearLayout.setWeightSum(1.0f);
                            this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                            this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                            View view19 = this.titleLinearLayout;
                            if (z) {
                                i19 = 8;
                            } else {
                                i19 = 22;
                            }
                            addView(view19, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                        } else {
                            View view110 = this.title;
                            if (z) {
                                i18 = 8;
                            } else {
                                i18 = 22;
                            }
                            addView(view110, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                            LinearLayout linearLayout110 = new LinearLayout(getContext());
                            linearLayout110.setOrientation(0);
                            linearLayout110.setClipChildren(false);
                            FrameLayout frameLayout13 = new FrameLayout(getContext());
                            frameLayout13.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                            BackupImageView backupImageView10 = new BackupImageView(getContext());
                            backupImageView10.setRoundRadius(AndroidUtilities.dp(f2));
                            chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                            AvatarDrawable avatarDrawable10 = new AvatarDrawable();
                            avatarDrawable10.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                            backupImageView10.setForUserOrChat(chat, avatarDrawable10);
                            frameLayout13.addView(backupImageView10, LayoutHelper.createFrame(i15, 28.0f));
                            textView2 = new TextView(getContext());
                            if (chat != null) {
                                textView2.setText(chat.title);
                            }
                            textView2.setSingleLine(true);
                            textView2.setMaxLines(1);
                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                            textView2.setTextSize(1, 13.0f);
                            textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            frameLayout13.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                            linearLayout110.addView(frameLayout13, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                            LayoutTransition layoutTransition10 = new LayoutTransition();
                            layoutTransition10.setDuration(100L);
                            layoutTransition10.enableTransitionType(4);
                            linearLayout110.setLayoutTransition(layoutTransition10);
                            linearLayout110.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                            addView(linearLayout110, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                            ScaleStateListAnimator.apply(linearLayout110);
                            linearLayout110.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view111) {
                                    this.f$0.lambda$new$1(view111);
                                }
                            });
                        }
                    } else {
                        BoostCounterView boostCounterView11 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                        this.boostCounterView = boostCounterView11;
                        boostCounterView11.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                        if (LimitReachedBottomSheet.this.type == i14) {
                            this.boostCounterView.setVisibility(8);
                        }
                        if (LimitReachedBottomSheet.this.isCurrentChat) {
                            LinearLayout linearLayout111 = new LinearLayout(context);
                            this.titleLinearLayout = linearLayout111;
                            linearLayout111.setOrientation(0);
                            this.titleLinearLayout.setWeightSum(1.0f);
                            this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                            this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                            View view111 = this.titleLinearLayout;
                            if (z) {
                                i19 = 8;
                            } else {
                                i19 = 22;
                            }
                            addView(view111, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                        } else {
                            View view112 = this.title;
                            if (z) {
                                i18 = 8;
                            } else {
                                i18 = 22;
                            }
                            addView(view112, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                            LinearLayout linearLayout112 = new LinearLayout(getContext());
                            linearLayout112.setOrientation(0);
                            linearLayout112.setClipChildren(false);
                            FrameLayout frameLayout14 = new FrameLayout(getContext());
                            frameLayout14.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                            BackupImageView backupImageView11 = new BackupImageView(getContext());
                            backupImageView11.setRoundRadius(AndroidUtilities.dp(f2));
                            chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                            AvatarDrawable avatarDrawable11 = new AvatarDrawable();
                            avatarDrawable11.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                            backupImageView11.setForUserOrChat(chat, avatarDrawable11);
                            frameLayout14.addView(backupImageView11, LayoutHelper.createFrame(i15, 28.0f));
                            textView2 = new TextView(getContext());
                            if (chat != null) {
                                textView2.setText(chat.title);
                            }
                            textView2.setSingleLine(true);
                            textView2.setMaxLines(1);
                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                            textView2.setTextSize(1, 13.0f);
                            textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            frameLayout14.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                            linearLayout112.addView(frameLayout14, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                            LayoutTransition layoutTransition11 = new LayoutTransition();
                            layoutTransition11.setDuration(100L);
                            layoutTransition11.enableTransitionType(4);
                            linearLayout112.setLayoutTransition(layoutTransition11);
                            linearLayout112.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                            addView(linearLayout112, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                            ScaleStateListAnimator.apply(linearLayout112);
                            linearLayout112.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view113) {
                                    this.f$0.lambda$new$1(view113);
                                }
                            });
                        }
                    }
                    TextView textView1110 = new TextView(context);
                    this.description = textView1110;
                    textView1110.setText(AndroidUtilities.replaceTags(str));
                    this.description.setTextSize(1, 14.0f);
                    this.description.setGravity(1);
                    TextView textView1111 = this.description;
                    textView1111.setLineSpacing(textView1111.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                    if (LimitReachedBottomSheet.this.type == 18) {
                        this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    } else {
                        this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    }
                    if (LimitReachedBottomSheet.this.type == 19) {
                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                    } else {
                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                    }
                    if (LimitReachedBottomSheet.this.type == i12) {
                        ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                    }
                    LimitReachedBottomSheet.this.updatePremiumButtonText();
                }
                if (z2) {
                    i6 = 0;
                } else {
                    i6 = activatedAccountsCount;
                }
                if (i5 != 11) {
                    if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                        arrayList = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                    } else {
                        arrayList = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                    }
                    avatarsImageView = new AvatarsImageView(context, false);
                    avatarsImageView.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
                    avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                    avatarsImageView.setStepFactor(0.4f);
                    iMin = Math.min(arrayList.size(), 3);
                    avatarsImageView.setCount(iMin);
                    while (i7 < iMin) {
                        Long l6 = (Long) arrayList.get(i7);
                        l6.longValue();
                        avatarsImageView.setObject(i7, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l6));
                    }
                    avatarsImageView.commitTransition(false);
                    addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                    TextView textView1112 = new TextView(context);
                    textView1112.setGravity(17);
                    textView1112.setTypeface(AndroidUtilities.bold());
                    textView1112.setTextSize(1, 20.0f);
                    int i210 = Theme.key_dialogTextBlack;
                    textView1112.setTextColor(Theme.getColor(i210, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    textView1112.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                    addView(textView1112, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                    textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setTextSize(1, 14.0f);
                    textView.setTextColor(Theme.getColor(i210, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                    if (LimitReachedBottomSheet.this.type == 34) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (arrayList.size() == 1) {
                        if (z3) {
                            i10 = R.string.InviteCallMessagePremiumBlockedOne;
                        } else if (z4) {
                            i10 = R.string.InviteMessagePremiumBlockedOne;
                        } else {
                            i10 = R.string.InvitePremiumBlockedOne;
                        }
                        string2 = LocaleController.formatString(i10, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))));
                    } else if (arrayList.size() == 2) {
                        if (z3) {
                            i9 = R.string.InviteCallMessagePremiumBlockedTwo;
                        } else if (z4) {
                            i9 = R.string.InviteMessagePremiumBlockedTwo;
                        } else {
                            i9 = R.string.InvitePremiumBlockedTwo;
                        }
                        string2 = LocaleController.formatString(i9, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                    } else if (arrayList.size() == 3) {
                        if (z3) {
                            i8 = R.string.InviteCallMessagePremiumBlockedThree;
                        } else if (z4) {
                            i8 = R.string.InviteMessagePremiumBlockedThree;
                        } else {
                            i8 = R.string.InvitePremiumBlockedThree;
                        }
                        string2 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(2))));
                    } else {
                        if (z3) {
                            str2 = "InviteCallMessagePremiumBlockedMany";
                        } else if (z4) {
                            str2 = "InviteMessagePremiumBlockedMany";
                        } else {
                            str2 = "InvitePremiumBlockedMany";
                        }
                        String pluralString7 = LocaleController.formatPluralString(str2, arrayList.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                        avatarsImageView.setPlus(arrayList.size() - 2, LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground));
                        string2 = pluralString7;
                    }
                    textView.setText(AndroidUtilities.replaceTags(string2));
                    if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers == null) {
                        size2 = 0;
                    } else {
                        size2 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size();
                    }
                    if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers == null) {
                        size3 = 0;
                    } else {
                        size3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size();
                    }
                    if (size2 - size3 <= 0) {
                        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                        LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                    } else {
                        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                        LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                    }
                    LimitReachedBottomSheet.this.updatePremiumButtonText();
                    return;
                }
                if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                    arrayList = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                } else {
                    arrayList = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                }
                avatarsImageView = new AvatarsImageView(context, false);
                avatarsImageView.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
                avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                avatarsImageView.setStepFactor(0.4f);
                iMin = Math.min(arrayList.size(), 3);
                avatarsImageView.setCount(iMin);
                while (i7 < iMin) {
                    Long l7 = (Long) arrayList.get(i7);
                    l7.longValue();
                    avatarsImageView.setObject(i7, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l7));
                }
                avatarsImageView.commitTransition(false);
                addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                TextView textView1113 = new TextView(context);
                textView1113.setGravity(17);
                textView1113.setTypeface(AndroidUtilities.bold());
                textView1113.setTextSize(1, 20.0f);
                int i211 = Theme.key_dialogTextBlack;
                textView1113.setTextColor(Theme.getColor(i211, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                textView1113.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                addView(textView1113, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                textView = new TextView(context);
                textView.setGravity(17);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(Theme.getColor(i211, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                if (LimitReachedBottomSheet.this.type == 34) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (arrayList.size() == 1) {
                    if (z3) {
                        i10 = R.string.InviteCallMessagePremiumBlockedOne;
                    } else if (z4) {
                        i10 = R.string.InviteMessagePremiumBlockedOne;
                    } else {
                        i10 = R.string.InvitePremiumBlockedOne;
                    }
                    string2 = LocaleController.formatString(i10, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))));
                } else if (arrayList.size() == 2) {
                    if (z3) {
                        i9 = R.string.InviteCallMessagePremiumBlockedTwo;
                    } else if (z4) {
                        i9 = R.string.InviteMessagePremiumBlockedTwo;
                    } else {
                        i9 = R.string.InvitePremiumBlockedTwo;
                    }
                    string2 = LocaleController.formatString(i9, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                } else if (arrayList.size() == 3) {
                    if (z3) {
                        i8 = R.string.InviteCallMessagePremiumBlockedThree;
                    } else if (z4) {
                        i8 = R.string.InviteMessagePremiumBlockedThree;
                    } else {
                        i8 = R.string.InvitePremiumBlockedThree;
                    }
                    string2 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(2))));
                } else {
                    if (z3) {
                        str2 = "InviteCallMessagePremiumBlockedMany";
                    } else if (z4) {
                        str2 = "InviteMessagePremiumBlockedMany";
                    } else {
                        str2 = "InvitePremiumBlockedMany";
                    }
                    String pluralString8 = LocaleController.formatPluralString(str2, arrayList.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                    avatarsImageView.setPlus(arrayList.size() - 2, LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground));
                    string2 = pluralString8;
                }
                textView.setText(AndroidUtilities.replaceTags(string2));
                if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers == null) {
                    size2 = 0;
                } else {
                    size2 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size();
                }
                if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers == null) {
                    size3 = 0;
                } else {
                    size3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size();
                }
                if (size2 - size3 <= 0) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                } else {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                }
                LimitReachedBottomSheet.this.updatePremiumButtonText();
                return;
                i11 = LimitReachedBottomSheet.this.type;
                if (i11 != 31) {
                    i12 = 31;
                    f2 = 14.0f;
                } else {
                    i12 = 31;
                    f2 = 14.0f;
                }
                if (LimitReachedBottomSheet.this.type == i12) {
                    FrameLayout frameLayout15 = new FrameLayout(context);
                    ImageView imageView4 = new ImageView(context);
                    imageView4.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.large_boosts));
                    frameLayout15.addView(imageView4, LayoutHelper.createFrame(-2, -2, 17));
                    frameLayout15.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(79.0f), Theme.getColor(Theme.key_featuredStickers_addButton)));
                    addView(frameLayout15, LayoutHelper.createLinear(79, 79, 1, 0, 23, 0, 0));
                }
                TextView textView1114 = new TextView(context);
                this.title = textView1114;
                textView1114.setTypeface(AndroidUtilities.bold());
                i13 = LimitReachedBottomSheet.this.type;
                if (i13 == i12) {
                    this.title.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                    i14 = 32;
                } else {
                    i14 = 32;
                    if (i13 == 32) {
                        this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                    } else if (i13 == 19) {
                        if (!(LimitReachedBottomSheet.this.getBaseFragment() instanceof GroupColorActivity)) {
                            this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                        } else {
                            this.title.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                        }
                    } else if (i13 == 30) {
                        this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                    } else if (i13 == 35) {
                        this.title.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                    } else if (i13 == 18) {
                        if (LimitReachedBottomSheet.this.boostsStatus.level == 0) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableStories));
                        } else {
                            this.title.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                        }
                    } else if (i13 == 21) {
                        this.title.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                    } else if (i13 == 20) {
                        this.title.setText(LocaleController.getString(R.string.BoostingEnableColor));
                    } else if (i13 == 24) {
                        this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                    } else {
                        if (i13 == 27) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                        } else {
                            i15 = 28;
                            if (i13 == 28) {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                            } else if (i13 == 25) {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                            } else if (i13 == 26) {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                            } else if (i13 == 29) {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                            } else if (i13 != 22) {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                            } else {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                            }
                        }
                        this.title.setTextSize(1, 20.0f);
                        TextView textView1115 = this.title;
                        i16 = Theme.key_windowBackgroundWhiteBlackText;
                        textView1115.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        this.title.setGravity(17);
                        i17 = LimitReachedBottomSheet.this.type;
                        if (i17 != 19) {
                            BoostCounterView boostCounterView12 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                            this.boostCounterView = boostCounterView12;
                            boostCounterView12.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                            if (LimitReachedBottomSheet.this.type == i14) {
                                this.boostCounterView.setVisibility(8);
                            }
                            if (LimitReachedBottomSheet.this.isCurrentChat) {
                                LinearLayout linearLayout113 = new LinearLayout(context);
                                this.titleLinearLayout = linearLayout113;
                                linearLayout113.setOrientation(0);
                                this.titleLinearLayout.setWeightSum(1.0f);
                                this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                View view113 = this.titleLinearLayout;
                                if (z) {
                                    i19 = 8;
                                } else {
                                    i19 = 22;
                                }
                                addView(view113, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                            } else {
                                View view114 = this.title;
                                if (z) {
                                    i18 = 8;
                                } else {
                                    i18 = 22;
                                }
                                addView(view114, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                                LinearLayout linearLayout114 = new LinearLayout(getContext());
                                linearLayout114.setOrientation(0);
                                linearLayout114.setClipChildren(false);
                                FrameLayout frameLayout16 = new FrameLayout(getContext());
                                frameLayout16.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                BackupImageView backupImageView12 = new BackupImageView(getContext());
                                backupImageView12.setRoundRadius(AndroidUtilities.dp(f2));
                                chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                AvatarDrawable avatarDrawable12 = new AvatarDrawable();
                                avatarDrawable12.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                backupImageView12.setForUserOrChat(chat, avatarDrawable12);
                                frameLayout16.addView(backupImageView12, LayoutHelper.createFrame(i15, 28.0f));
                                textView2 = new TextView(getContext());
                                if (chat != null) {
                                    textView2.setText(chat.title);
                                }
                                textView2.setSingleLine(true);
                                textView2.setMaxLines(1);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setTextSize(1, 13.0f);
                                textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                frameLayout16.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                linearLayout114.addView(frameLayout16, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                LayoutTransition layoutTransition12 = new LayoutTransition();
                                layoutTransition12.setDuration(100L);
                                layoutTransition12.enableTransitionType(4);
                                linearLayout114.setLayoutTransition(layoutTransition12);
                                linearLayout114.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                addView(linearLayout114, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                ScaleStateListAnimator.apply(linearLayout114);
                                linearLayout114.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view115) {
                                        this.f$0.lambda$new$1(view115);
                                    }
                                });
                            }
                        } else {
                            BoostCounterView boostCounterView13 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                            this.boostCounterView = boostCounterView13;
                            boostCounterView13.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                            if (LimitReachedBottomSheet.this.type == i14) {
                                this.boostCounterView.setVisibility(8);
                            }
                            if (LimitReachedBottomSheet.this.isCurrentChat) {
                                LinearLayout linearLayout115 = new LinearLayout(context);
                                this.titleLinearLayout = linearLayout115;
                                linearLayout115.setOrientation(0);
                                this.titleLinearLayout.setWeightSum(1.0f);
                                this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                View view115 = this.titleLinearLayout;
                                if (z) {
                                    i19 = 8;
                                } else {
                                    i19 = 22;
                                }
                                addView(view115, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                            } else {
                                View view116 = this.title;
                                if (z) {
                                    i18 = 8;
                                } else {
                                    i18 = 22;
                                }
                                addView(view116, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                                LinearLayout linearLayout116 = new LinearLayout(getContext());
                                linearLayout116.setOrientation(0);
                                linearLayout116.setClipChildren(false);
                                FrameLayout frameLayout17 = new FrameLayout(getContext());
                                frameLayout17.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                BackupImageView backupImageView13 = new BackupImageView(getContext());
                                backupImageView13.setRoundRadius(AndroidUtilities.dp(f2));
                                chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                AvatarDrawable avatarDrawable13 = new AvatarDrawable();
                                avatarDrawable13.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                backupImageView13.setForUserOrChat(chat, avatarDrawable13);
                                frameLayout17.addView(backupImageView13, LayoutHelper.createFrame(i15, 28.0f));
                                textView2 = new TextView(getContext());
                                if (chat != null) {
                                    textView2.setText(chat.title);
                                }
                                textView2.setSingleLine(true);
                                textView2.setMaxLines(1);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setTextSize(1, 13.0f);
                                textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                frameLayout17.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                linearLayout116.addView(frameLayout17, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                LayoutTransition layoutTransition13 = new LayoutTransition();
                                layoutTransition13.setDuration(100L);
                                layoutTransition13.enableTransitionType(4);
                                linearLayout116.setLayoutTransition(layoutTransition13);
                                linearLayout116.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                addView(linearLayout116, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                ScaleStateListAnimator.apply(linearLayout116);
                                linearLayout116.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public final void onClick(View view117) {
                                        this.f$0.lambda$new$1(view117);
                                    }
                                });
                            }
                        }
                        TextView textView1116 = new TextView(context);
                        this.description = textView1116;
                        textView1116.setText(AndroidUtilities.replaceTags(str));
                        this.description.setTextSize(1, 14.0f);
                        this.description.setGravity(1);
                        TextView textView1117 = this.description;
                        textView1117.setLineSpacing(textView1117.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                        if (LimitReachedBottomSheet.this.type == 18) {
                            this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        } else {
                            this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        }
                        if (LimitReachedBottomSheet.this.type == 19) {
                            addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                        } else {
                            addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                        }
                        if (LimitReachedBottomSheet.this.type == i12) {
                            ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                            ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                            ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        }
                        LimitReachedBottomSheet.this.updatePremiumButtonText();
                    }
                }
                i15 = 28;
                this.title.setTextSize(1, 20.0f);
                TextView textView1118 = this.title;
                i16 = Theme.key_windowBackgroundWhiteBlackText;
                textView1118.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                this.title.setGravity(17);
                i17 = LimitReachedBottomSheet.this.type;
                if (i17 != 19) {
                    BoostCounterView boostCounterView14 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                    this.boostCounterView = boostCounterView14;
                    boostCounterView14.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                    if (LimitReachedBottomSheet.this.type == i14) {
                        this.boostCounterView.setVisibility(8);
                    }
                    if (LimitReachedBottomSheet.this.isCurrentChat) {
                        LinearLayout linearLayout117 = new LinearLayout(context);
                        this.titleLinearLayout = linearLayout117;
                        linearLayout117.setOrientation(0);
                        this.titleLinearLayout.setWeightSum(1.0f);
                        this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                        this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                        View view117 = this.titleLinearLayout;
                        if (z) {
                            i19 = 8;
                        } else {
                            i19 = 22;
                        }
                        addView(view117, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                    } else {
                        View view118 = this.title;
                        if (z) {
                            i18 = 8;
                        } else {
                            i18 = 22;
                        }
                        addView(view118, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                        LinearLayout linearLayout118 = new LinearLayout(getContext());
                        linearLayout118.setOrientation(0);
                        linearLayout118.setClipChildren(false);
                        FrameLayout frameLayout18 = new FrameLayout(getContext());
                        frameLayout18.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                        BackupImageView backupImageView14 = new BackupImageView(getContext());
                        backupImageView14.setRoundRadius(AndroidUtilities.dp(f2));
                        chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                        AvatarDrawable avatarDrawable14 = new AvatarDrawable();
                        avatarDrawable14.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                        backupImageView14.setForUserOrChat(chat, avatarDrawable14);
                        frameLayout18.addView(backupImageView14, LayoutHelper.createFrame(i15, 28.0f));
                        textView2 = new TextView(getContext());
                        if (chat != null) {
                            textView2.setText(chat.title);
                        }
                        textView2.setSingleLine(true);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setTextSize(1, 13.0f);
                        textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        frameLayout18.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                        linearLayout118.addView(frameLayout18, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                        LayoutTransition layoutTransition14 = new LayoutTransition();
                        layoutTransition14.setDuration(100L);
                        layoutTransition14.enableTransitionType(4);
                        linearLayout118.setLayoutTransition(layoutTransition14);
                        linearLayout118.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                        addView(linearLayout118, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                        ScaleStateListAnimator.apply(linearLayout118);
                        linearLayout118.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view119) {
                                this.f$0.lambda$new$1(view119);
                            }
                        });
                    }
                } else {
                    BoostCounterView boostCounterView15 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                    this.boostCounterView = boostCounterView15;
                    boostCounterView15.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                    if (LimitReachedBottomSheet.this.type == i14) {
                        this.boostCounterView.setVisibility(8);
                    }
                    if (LimitReachedBottomSheet.this.isCurrentChat) {
                        LinearLayout linearLayout119 = new LinearLayout(context);
                        this.titleLinearLayout = linearLayout119;
                        linearLayout119.setOrientation(0);
                        this.titleLinearLayout.setWeightSum(1.0f);
                        this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                        this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                        View view119 = this.titleLinearLayout;
                        if (z) {
                            i19 = 8;
                        } else {
                            i19 = 22;
                        }
                        addView(view119, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                    } else {
                        View view1110 = this.title;
                        if (z) {
                            i18 = 8;
                        } else {
                            i18 = 22;
                        }
                        addView(view1110, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                        LinearLayout linearLayout1110 = new LinearLayout(getContext());
                        linearLayout1110.setOrientation(0);
                        linearLayout1110.setClipChildren(false);
                        FrameLayout frameLayout19 = new FrameLayout(getContext());
                        frameLayout19.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                        BackupImageView backupImageView15 = new BackupImageView(getContext());
                        backupImageView15.setRoundRadius(AndroidUtilities.dp(f2));
                        chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                        AvatarDrawable avatarDrawable15 = new AvatarDrawable();
                        avatarDrawable15.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                        backupImageView15.setForUserOrChat(chat, avatarDrawable15);
                        frameLayout19.addView(backupImageView15, LayoutHelper.createFrame(i15, 28.0f));
                        textView2 = new TextView(getContext());
                        if (chat != null) {
                            textView2.setText(chat.title);
                        }
                        textView2.setSingleLine(true);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setTextSize(1, 13.0f);
                        textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        frameLayout19.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                        linearLayout1110.addView(frameLayout19, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                        LayoutTransition layoutTransition15 = new LayoutTransition();
                        layoutTransition15.setDuration(100L);
                        layoutTransition15.enableTransitionType(4);
                        linearLayout1110.setLayoutTransition(layoutTransition15);
                        linearLayout1110.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                        addView(linearLayout1110, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                        ScaleStateListAnimator.apply(linearLayout1110);
                        linearLayout1110.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view1111) {
                                this.f$0.lambda$new$1(view1111);
                            }
                        });
                    }
                }
                TextView textView1119 = new TextView(context);
                this.description = textView1119;
                textView1119.setText(AndroidUtilities.replaceTags(str));
                this.description.setTextSize(1, 14.0f);
                this.description.setGravity(1);
                TextView textView11110 = this.description;
                textView11110.setLineSpacing(textView11110.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                if (LimitReachedBottomSheet.this.type == 18) {
                    this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                } else {
                    this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                }
                if (LimitReachedBottomSheet.this.type == 19) {
                    addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                } else {
                    addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                }
                if (LimitReachedBottomSheet.this.type == i12) {
                    ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                    ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                    ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                }
                LimitReachedBottomSheet.this.updatePremiumButtonText();
            }
            z = zPremiumFeaturesBlocked;
            str = string;
            LimitParams limitParams3 = LimitReachedBottomSheet.this.limitParams;
            int i212 = limitParams3.defaultLimit;
            i = limitParams3.premiumLimit;
            activatedAccountsCount = LimitReachedBottomSheet.this.currentValue;
            i2 = LimitReachedBottomSheet.this.type;
            if (i2 == 3) {
                activatedAccountsCount = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).dialogFilters.size() - 1;
            } else if (i2 == 7) {
                activatedAccountsCount = UserConfig.getActivatedAccountsCount();
            } else if (i2 == 0) {
                dialogs = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getDialogs(0);
                size = dialogs.size();
                i3 = 0;
                while (i4 < size) {
                    dialog = dialogs.get(i4);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                        i3++;
                    }
                }
                activatedAccountsCount = i3;
            }
            if (UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium()) {
                activatedAccountsCount = i;
                f = 1.0f;
            } else {
                activatedAccountsCount = i;
                f = 1.0f;
            }
            float f6 = i212 / i;
            i5 = LimitReachedBottomSheet.this.type;
            z2 = i5 == 18 ? true : true;
            if (z2) {
                i6 = 0;
            } else {
                i6 = activatedAccountsCount;
            }
            if (i5 != 11) {
                if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                    arrayList = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                } else {
                    arrayList = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                }
                avatarsImageView = new AvatarsImageView(context, false);
                avatarsImageView.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
                avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                avatarsImageView.setStepFactor(0.4f);
                iMin = Math.min(arrayList.size(), 3);
                avatarsImageView.setCount(iMin);
                while (i7 < iMin) {
                    Long l8 = (Long) arrayList.get(i7);
                    l8.longValue();
                    avatarsImageView.setObject(i7, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l8));
                }
                avatarsImageView.commitTransition(false);
                addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                TextView textView11111 = new TextView(context);
                textView11111.setGravity(17);
                textView11111.setTypeface(AndroidUtilities.bold());
                textView11111.setTextSize(1, 20.0f);
                int i213 = Theme.key_dialogTextBlack;
                textView11111.setTextColor(Theme.getColor(i213, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                textView11111.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                addView(textView11111, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                textView = new TextView(context);
                textView.setGravity(17);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(Theme.getColor(i213, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                if (LimitReachedBottomSheet.this.type == 34) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (arrayList.size() == 1) {
                    if (z3) {
                        i10 = R.string.InviteCallMessagePremiumBlockedOne;
                    } else if (z4) {
                        i10 = R.string.InviteMessagePremiumBlockedOne;
                    } else {
                        i10 = R.string.InvitePremiumBlockedOne;
                    }
                    string2 = LocaleController.formatString(i10, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))));
                } else if (arrayList.size() == 2) {
                    if (z3) {
                        i9 = R.string.InviteCallMessagePremiumBlockedTwo;
                    } else if (z4) {
                        i9 = R.string.InviteMessagePremiumBlockedTwo;
                    } else {
                        i9 = R.string.InvitePremiumBlockedTwo;
                    }
                    string2 = LocaleController.formatString(i9, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                } else if (arrayList.size() == 3) {
                    if (z3) {
                        i8 = R.string.InviteCallMessagePremiumBlockedThree;
                    } else if (z4) {
                        i8 = R.string.InviteMessagePremiumBlockedThree;
                    } else {
                        i8 = R.string.InvitePremiumBlockedThree;
                    }
                    string2 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(2))));
                } else {
                    if (z3) {
                        str2 = "InviteCallMessagePremiumBlockedMany";
                    } else if (z4) {
                        str2 = "InviteMessagePremiumBlockedMany";
                    } else {
                        str2 = "InvitePremiumBlockedMany";
                    }
                    String pluralString9 = LocaleController.formatPluralString(str2, arrayList.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                    avatarsImageView.setPlus(arrayList.size() - 2, LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground));
                    string2 = pluralString9;
                }
                textView.setText(AndroidUtilities.replaceTags(string2));
                if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers == null) {
                    size2 = 0;
                } else {
                    size2 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size();
                }
                if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers == null) {
                    size3 = 0;
                } else {
                    size3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size();
                }
                if (size2 - size3 <= 0) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                } else {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                }
                LimitReachedBottomSheet.this.updatePremiumButtonText();
                return;
            }
            if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                arrayList = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
            } else {
                arrayList = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
            }
            avatarsImageView = new AvatarsImageView(context, false);
            avatarsImageView.avatarsDrawable.strokeWidth = AndroidUtilities.dp(3.33f);
            avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
            avatarsImageView.setStepFactor(0.4f);
            iMin = Math.min(arrayList.size(), 3);
            avatarsImageView.setCount(iMin);
            while (i7 < iMin) {
                Long l9 = (Long) arrayList.get(i7);
                l9.longValue();
                avatarsImageView.setObject(i7, ((BottomSheet) LimitReachedBottomSheet.this).currentAccount, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l9));
            }
            avatarsImageView.commitTransition(false);
            addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
            TextView textView11112 = new TextView(context);
            textView11112.setGravity(17);
            textView11112.setTypeface(AndroidUtilities.bold());
            textView11112.setTextSize(1, 20.0f);
            int i214 = Theme.key_dialogTextBlack;
            textView11112.setTextColor(Theme.getColor(i214, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            textView11112.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
            addView(textView11112, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
            textView = new TextView(context);
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(Theme.getColor(i214, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
            if (LimitReachedBottomSheet.this.type == 34) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers != null) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (arrayList.size() == 1) {
                if (z3) {
                    i10 = R.string.InviteCallMessagePremiumBlockedOne;
                } else if (z4) {
                    i10 = R.string.InviteMessagePremiumBlockedOne;
                } else {
                    i10 = R.string.InvitePremiumBlockedOne;
                }
                string2 = LocaleController.formatString(i10, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))));
            } else if (arrayList.size() == 2) {
                if (z3) {
                    i9 = R.string.InviteCallMessagePremiumBlockedTwo;
                } else if (z4) {
                    i9 = R.string.InviteMessagePremiumBlockedTwo;
                } else {
                    i9 = R.string.InvitePremiumBlockedTwo;
                }
                string2 = LocaleController.formatString(i9, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
            } else if (arrayList.size() == 3) {
                if (z3) {
                    i8 = R.string.InviteCallMessagePremiumBlockedThree;
                } else if (z4) {
                    i8 = R.string.InviteMessagePremiumBlockedThree;
                } else {
                    i8 = R.string.InvitePremiumBlockedThree;
                }
                string2 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(2))));
            } else {
                if (z3) {
                    str2 = "InviteCallMessagePremiumBlockedMany";
                } else if (z4) {
                    str2 = "InviteMessagePremiumBlockedMany";
                } else {
                    str2 = "InvitePremiumBlockedMany";
                }
                String pluralString10 = LocaleController.formatPluralString(str2, arrayList.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList.get(1))));
                avatarsImageView.setPlus(arrayList.size() - 2, LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground));
                string2 = pluralString10;
            }
            textView.setText(AndroidUtilities.replaceTags(string2));
            if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers == null) {
                size2 = 0;
            } else {
                size2 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size();
            }
            if (LimitReachedBottomSheet.this.premiumMessagingBlockedUsers == null) {
                size3 = 0;
            } else {
                size3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers.size();
            }
            if (size2 - size3 <= 0) {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
            } else {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
            }
            LimitReachedBottomSheet.this.updatePremiumButtonText();
            return;
            i11 = LimitReachedBottomSheet.this.type;
            if (i11 != 31) {
                i12 = 31;
                f2 = 14.0f;
            } else {
                i12 = 31;
                f2 = 14.0f;
            }
            if (LimitReachedBottomSheet.this.type == i12) {
                FrameLayout frameLayout110 = new FrameLayout(context);
                ImageView imageView5 = new ImageView(context);
                imageView5.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.large_boosts));
                frameLayout110.addView(imageView5, LayoutHelper.createFrame(-2, -2, 17));
                frameLayout110.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(79.0f), Theme.getColor(Theme.key_featuredStickers_addButton)));
                addView(frameLayout110, LayoutHelper.createLinear(79, 79, 1, 0, 23, 0, 0));
            }
            TextView textView11113 = new TextView(context);
            this.title = textView11113;
            textView11113.setTypeface(AndroidUtilities.bold());
            i13 = LimitReachedBottomSheet.this.type;
            if (i13 == i12) {
                this.title.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                i14 = 32;
            } else {
                i14 = 32;
                if (i13 == 32) {
                    this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                } else if (i13 == 19) {
                    if (!(LimitReachedBottomSheet.this.getBaseFragment() instanceof GroupColorActivity)) {
                        this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                    } else {
                        this.title.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                    }
                } else if (i13 == 30) {
                    this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                } else if (i13 == 35) {
                    this.title.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                } else if (i13 == 18) {
                    if (LimitReachedBottomSheet.this.boostsStatus.level == 0) {
                        this.title.setText(LocaleController.getString(R.string.BoostingEnableStories));
                    } else {
                        this.title.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                    }
                } else if (i13 == 21) {
                    this.title.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                } else if (i13 == 20) {
                    this.title.setText(LocaleController.getString(R.string.BoostingEnableColor));
                } else if (i13 == 24) {
                    this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                } else {
                    if (i13 == 27) {
                        this.title.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                    } else {
                        i15 = 28;
                        if (i13 == 28) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                        } else if (i13 == 25) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                        } else if (i13 == 26) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                        } else if (i13 == 29) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                        } else if (i13 != 22) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                        } else {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                        }
                    }
                    this.title.setTextSize(1, 20.0f);
                    TextView textView11114 = this.title;
                    i16 = Theme.key_windowBackgroundWhiteBlackText;
                    textView11114.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    this.title.setGravity(17);
                    i17 = LimitReachedBottomSheet.this.type;
                    if (i17 != 19) {
                        BoostCounterView boostCounterView16 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                        this.boostCounterView = boostCounterView16;
                        boostCounterView16.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                        if (LimitReachedBottomSheet.this.type == i14) {
                            this.boostCounterView.setVisibility(8);
                        }
                        if (LimitReachedBottomSheet.this.isCurrentChat) {
                            LinearLayout linearLayout1111 = new LinearLayout(context);
                            this.titleLinearLayout = linearLayout1111;
                            linearLayout1111.setOrientation(0);
                            this.titleLinearLayout.setWeightSum(1.0f);
                            this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                            this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                            View view1111 = this.titleLinearLayout;
                            if (z) {
                                i19 = 8;
                            } else {
                                i19 = 22;
                            }
                            addView(view1111, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                        } else {
                            View view1112 = this.title;
                            if (z) {
                                i18 = 8;
                            } else {
                                i18 = 22;
                            }
                            addView(view1112, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                            LinearLayout linearLayout1112 = new LinearLayout(getContext());
                            linearLayout1112.setOrientation(0);
                            linearLayout1112.setClipChildren(false);
                            FrameLayout frameLayout111 = new FrameLayout(getContext());
                            frameLayout111.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                            BackupImageView backupImageView16 = new BackupImageView(getContext());
                            backupImageView16.setRoundRadius(AndroidUtilities.dp(f2));
                            chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                            AvatarDrawable avatarDrawable16 = new AvatarDrawable();
                            avatarDrawable16.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                            backupImageView16.setForUserOrChat(chat, avatarDrawable16);
                            frameLayout111.addView(backupImageView16, LayoutHelper.createFrame(i15, 28.0f));
                            textView2 = new TextView(getContext());
                            if (chat != null) {
                                textView2.setText(chat.title);
                            }
                            textView2.setSingleLine(true);
                            textView2.setMaxLines(1);
                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                            textView2.setTextSize(1, 13.0f);
                            textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            frameLayout111.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                            linearLayout1112.addView(frameLayout111, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                            LayoutTransition layoutTransition16 = new LayoutTransition();
                            layoutTransition16.setDuration(100L);
                            layoutTransition16.enableTransitionType(4);
                            linearLayout1112.setLayoutTransition(layoutTransition16);
                            linearLayout1112.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                            addView(linearLayout1112, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                            ScaleStateListAnimator.apply(linearLayout1112);
                            linearLayout1112.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view1113) {
                                    this.f$0.lambda$new$1(view1113);
                                }
                            });
                        }
                    } else {
                        BoostCounterView boostCounterView17 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                        this.boostCounterView = boostCounterView17;
                        boostCounterView17.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                        if (LimitReachedBottomSheet.this.type == i14) {
                            this.boostCounterView.setVisibility(8);
                        }
                        if (LimitReachedBottomSheet.this.isCurrentChat) {
                            LinearLayout linearLayout1113 = new LinearLayout(context);
                            this.titleLinearLayout = linearLayout1113;
                            linearLayout1113.setOrientation(0);
                            this.titleLinearLayout.setWeightSum(1.0f);
                            this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                            this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                            View view1113 = this.titleLinearLayout;
                            if (z) {
                                i19 = 8;
                            } else {
                                i19 = 22;
                            }
                            addView(view1113, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                        } else {
                            View view1114 = this.title;
                            if (z) {
                                i18 = 8;
                            } else {
                                i18 = 22;
                            }
                            addView(view1114, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                            LinearLayout linearLayout1114 = new LinearLayout(getContext());
                            linearLayout1114.setOrientation(0);
                            linearLayout1114.setClipChildren(false);
                            FrameLayout frameLayout112 = new FrameLayout(getContext());
                            frameLayout112.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                            BackupImageView backupImageView17 = new BackupImageView(getContext());
                            backupImageView17.setRoundRadius(AndroidUtilities.dp(f2));
                            chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                            AvatarDrawable avatarDrawable17 = new AvatarDrawable();
                            avatarDrawable17.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                            backupImageView17.setForUserOrChat(chat, avatarDrawable17);
                            frameLayout112.addView(backupImageView17, LayoutHelper.createFrame(i15, 28.0f));
                            textView2 = new TextView(getContext());
                            if (chat != null) {
                                textView2.setText(chat.title);
                            }
                            textView2.setSingleLine(true);
                            textView2.setMaxLines(1);
                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                            textView2.setTextSize(1, 13.0f);
                            textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            frameLayout112.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                            linearLayout1114.addView(frameLayout112, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                            LayoutTransition layoutTransition17 = new LayoutTransition();
                            layoutTransition17.setDuration(100L);
                            layoutTransition17.enableTransitionType(4);
                            linearLayout1114.setLayoutTransition(layoutTransition17);
                            linearLayout1114.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                            addView(linearLayout1114, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                            ScaleStateListAnimator.apply(linearLayout1114);
                            linearLayout1114.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view1115) {
                                    this.f$0.lambda$new$1(view1115);
                                }
                            });
                        }
                    }
                    TextView textView11115 = new TextView(context);
                    this.description = textView11115;
                    textView11115.setText(AndroidUtilities.replaceTags(str));
                    this.description.setTextSize(1, 14.0f);
                    this.description.setGravity(1);
                    TextView textView11116 = this.description;
                    textView11116.setLineSpacing(textView11116.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                    if (LimitReachedBottomSheet.this.type == 18) {
                        this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    } else {
                        this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    }
                    if (LimitReachedBottomSheet.this.type == 19) {
                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                    } else {
                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                    }
                    if (LimitReachedBottomSheet.this.type == i12) {
                        ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                    }
                    LimitReachedBottomSheet.this.updatePremiumButtonText();
                }
            }
            i15 = 28;
            this.title.setTextSize(1, 20.0f);
            TextView textView11117 = this.title;
            i16 = Theme.key_windowBackgroundWhiteBlackText;
            textView11117.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            this.title.setGravity(17);
            i17 = LimitReachedBottomSheet.this.type;
            if (i17 != 19) {
                BoostCounterView boostCounterView18 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                this.boostCounterView = boostCounterView18;
                boostCounterView18.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                if (LimitReachedBottomSheet.this.type == i14) {
                    this.boostCounterView.setVisibility(8);
                }
                if (LimitReachedBottomSheet.this.isCurrentChat) {
                    LinearLayout linearLayout1115 = new LinearLayout(context);
                    this.titleLinearLayout = linearLayout1115;
                    linearLayout1115.setOrientation(0);
                    this.titleLinearLayout.setWeightSum(1.0f);
                    this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                    this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                    View view1115 = this.titleLinearLayout;
                    if (z) {
                        i19 = 8;
                    } else {
                        i19 = 22;
                    }
                    addView(view1115, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                } else {
                    View view1116 = this.title;
                    if (z) {
                        i18 = 8;
                    } else {
                        i18 = 22;
                    }
                    addView(view1116, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                    LinearLayout linearLayout1116 = new LinearLayout(getContext());
                    linearLayout1116.setOrientation(0);
                    linearLayout1116.setClipChildren(false);
                    FrameLayout frameLayout113 = new FrameLayout(getContext());
                    frameLayout113.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                    BackupImageView backupImageView18 = new BackupImageView(getContext());
                    backupImageView18.setRoundRadius(AndroidUtilities.dp(f2));
                    chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                    AvatarDrawable avatarDrawable18 = new AvatarDrawable();
                    avatarDrawable18.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                    backupImageView18.setForUserOrChat(chat, avatarDrawable18);
                    frameLayout113.addView(backupImageView18, LayoutHelper.createFrame(i15, 28.0f));
                    textView2 = new TextView(getContext());
                    if (chat != null) {
                        textView2.setText(chat.title);
                    }
                    textView2.setSingleLine(true);
                    textView2.setMaxLines(1);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    frameLayout113.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                    linearLayout1116.addView(frameLayout113, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                    LayoutTransition layoutTransition18 = new LayoutTransition();
                    layoutTransition18.setDuration(100L);
                    layoutTransition18.enableTransitionType(4);
                    linearLayout1116.setLayoutTransition(layoutTransition18);
                    linearLayout1116.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                    addView(linearLayout1116, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                    ScaleStateListAnimator.apply(linearLayout1116);
                    linearLayout1116.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view1117) {
                            this.f$0.lambda$new$1(view1117);
                        }
                    });
                }
            } else {
                BoostCounterView boostCounterView19 = new BoostCounterView(context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                this.boostCounterView = boostCounterView19;
                boostCounterView19.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                if (LimitReachedBottomSheet.this.type == i14) {
                    this.boostCounterView.setVisibility(8);
                }
                if (LimitReachedBottomSheet.this.isCurrentChat) {
                    LinearLayout linearLayout1117 = new LinearLayout(context);
                    this.titleLinearLayout = linearLayout1117;
                    linearLayout1117.setOrientation(0);
                    this.titleLinearLayout.setWeightSum(1.0f);
                    this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                    this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                    View view1117 = this.titleLinearLayout;
                    if (z) {
                        i19 = 8;
                    } else {
                        i19 = 22;
                    }
                    addView(view1117, LayoutHelper.createLinear(-2, -2, 1, 12, i19, 12, 9));
                } else {
                    View view1118 = this.title;
                    if (z) {
                        i18 = 8;
                    } else {
                        i18 = 22;
                    }
                    addView(view1118, LayoutHelper.createLinear(-2, -2, 1, 0, i18, 0, 0));
                    LinearLayout linearLayout1118 = new LinearLayout(getContext());
                    linearLayout1118.setOrientation(0);
                    linearLayout1118.setClipChildren(false);
                    FrameLayout frameLayout114 = new FrameLayout(getContext());
                    frameLayout114.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(f2), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                    BackupImageView backupImageView19 = new BackupImageView(getContext());
                    backupImageView19.setRoundRadius(AndroidUtilities.dp(f2));
                    chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                    AvatarDrawable avatarDrawable19 = new AvatarDrawable();
                    avatarDrawable19.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                    backupImageView19.setForUserOrChat(chat, avatarDrawable19);
                    frameLayout114.addView(backupImageView19, LayoutHelper.createFrame(i15, 28.0f));
                    textView2 = new TextView(getContext());
                    if (chat != null) {
                        textView2.setText(chat.title);
                    }
                    textView2.setSingleLine(true);
                    textView2.setMaxLines(1);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    frameLayout114.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                    linearLayout1118.addView(frameLayout114, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                    LayoutTransition layoutTransition19 = new LayoutTransition();
                    layoutTransition19.setDuration(100L);
                    layoutTransition19.enableTransitionType(4);
                    linearLayout1118.setLayoutTransition(layoutTransition19);
                    linearLayout1118.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                    addView(linearLayout1118, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                    ScaleStateListAnimator.apply(linearLayout1118);
                    linearLayout1118.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view1119) {
                            this.f$0.lambda$new$1(view1119);
                        }
                    });
                }
            }
            TextView textView11118 = new TextView(context);
            this.description = textView11118;
            textView11118.setText(AndroidUtilities.replaceTags(str));
            this.description.setTextSize(1, 14.0f);
            this.description.setGravity(1);
            TextView textView11119 = this.description;
            textView11119.setLineSpacing(textView11119.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
            if (LimitReachedBottomSheet.this.type == 18) {
                this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            } else {
                this.description.setTextColor(Theme.getColor(i16, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            }
            if (LimitReachedBottomSheet.this.type == 19) {
                addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
            } else {
                addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
            }
            if (LimitReachedBottomSheet.this.type == i12) {
                ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
            }
            LimitReachedBottomSheet.this.updatePremiumButtonText();
        }

        public void lambda$new$0(View view) {
            if (LimitReachedBottomSheet.this.parentFragment == null) {
                return;
            }
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            LimitReachedBottomSheet.this.parentFragment.showAsSheet(new PremiumPreviewFragment("invite_privacy"), bottomSheetParams);
        }

        public void lambda$new$1(View view) {
            LimitReachedBottomSheet.this.getBaseFragment().presentFragment(ChatActivity.of(LimitReachedBottomSheet.this.dialogId));
            LimitReachedBottomSheet.this.lambda$new$0();
        }

        public void recreateTitleAndDescription() {
            int iIndexOfChild = indexOfChild(this.description);
            if (LimitReachedBottomSheet.this.isCurrentChat) {
                int iIndexOfChild2 = indexOfChild(this.titleLinearLayout);
                removeView(this.titleLinearLayout);
                this.titleLinearLayout.removeView(this.title);
                this.titleLinearLayout.removeView(this.boostCounterView);
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.titleLinearLayout = linearLayout;
                linearLayout.setOrientation(0);
                this.titleLinearLayout.setWeightSum(1.0f);
                this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                this.titleLinearLayout.addView(this.boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                addView(this.titleLinearLayout, iIndexOfChild2, LayoutHelper.createLinear(-2, -2, 1, 25, 22, 12, 9));
            } else {
                int iIndexOfChild3 = indexOfChild(this.title);
                removeView(this.title);
                TextView textView = new TextView(getContext());
                this.title = textView;
                textView.setTypeface(AndroidUtilities.bold());
                this.title.setTextSize(1, 20.0f);
                this.title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                this.title.setGravity(17);
                addView(this.title, iIndexOfChild3, LayoutHelper.createLinear(-2, -2, 1, 0, 22, 0, 0));
            }
            removeView(this.description);
            TextView textView2 = new TextView(getContext());
            this.description = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.description;
            textView3.setLineSpacing(textView3.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
            this.description.setGravity(1);
            this.description.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            addView(this.description, iIndexOfChild, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
        }
    }

    public String getBoostsTitleString() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.canApplyBoost.alreadyActive) {
            return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        if (this.isCurrentChat) {
            if (this.type == 32) {
                return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
            if (this.canApplyBoost.alreadyActive) {
                return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
            }
            return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        if (this.type == 32) {
            return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        if (this.canApplyBoost.alreadyActive) {
            return LocaleController.getString(isGroup() ? R.string.YouBoostedGroup : R.string.YouBoostedChannel);
        }
        return LocaleController.getString(isGroup() ? R.string.BoostingEnableStoriesForGroup : R.string.BoostingEnableStoriesForChannel);
    }

    public TLRPC.Chat getChat() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
    }

    private TLRPC.ChatFull getChatFull() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialogId);
    }

    public boolean isGroup() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)));
    }

    private String getDescriptionForRemoveRestrictions() {
        TLRPC.Chat chat = getChat();
        return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", getNeededBoostsForUnlockGroup(), chat == null ? "" : chat.title);
    }

    private int getNeededBoostsForUnlockGroup() {
        TLRPC.ChatFull chatFull = getChatFull();
        return Math.max(chatFull.boosts_unrestrict - chatFull.boosts_applied, 0);
    }

    private String getBoostDescriptionStringAfterBoost() {
        String string;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean zIsGroup = isGroup();
        int i = this.type;
        if (i == 20) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(channelColorLevelMin()));
        } else if (i == 24) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(channelColorLevelMin()));
        } else if (i == 29) {
            string = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i == 30) {
            string = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i == 35) {
            string = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i == 25) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(zIsGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i == 26) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(zIsGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i == 27) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i == 28) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(zIsGroup ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i == 22) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(zIsGroup ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i == 23) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(zIsGroup ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
        } else {
            string = null;
        }
        return string != null ? string : getBoostsDescriptionString(false);
    }

    public String getBoostsDescriptionString(boolean z) {
        String string;
        if (this.type == 32) {
            return getDescriptionForRemoveRestrictions();
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        if (chat == null) {
            string = LocaleController.getString(isGroup() ? R.string.AccDescrGroup : R.string.AccDescrChannel);
        } else {
            string = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        boolean z2 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (isMiniBoostBtnForAdminAvailable() && this.boostsStatus.next_level_boosts != 0 && z) {
            int i = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.boostsStatus;
            int i2 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i, string, LocaleController.formatPluralString("MoreBoosts", i2, Integer.valueOf(i2)));
        }
        if (z2 && this.canApplyBoost.alreadyActive) {
            if (this.boostsStatus.level == 1) {
                return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevel1 : R.string.ChannelBoostsJustReachedLevel1, new Object[0]);
            }
            return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.boostsStatus.level), LocaleController.formatPluralString("BoostStories", this.boostsStatus.level, new Object[0]));
        }
        if (this.canApplyBoost.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.boostsStatus;
            if (tL_premium_boostsStatus3.level == 0) {
                int i3 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.boostsStatus;
                int i4 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i3, string, LocaleController.formatPluralString("MoreBoosts", i4, Integer.valueOf(i4)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.boostsStatus.level), LocaleController.formatPluralString("BoostStories", this.boostsStatus.level + 1, new Object[0]));
            }
            int i5 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.boostsStatus;
            int i6 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return LocaleController.formatString(i5, string, LocaleController.formatPluralString("MoreBoosts", i6, Integer.valueOf(i6)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.boostsStatus;
        if (tL_premium_boostsStatus6.level == 0) {
            int i7 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.boostsStatus;
            int i8 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return LocaleController.formatString(i7, string, LocaleController.formatPluralString("MoreBoosts", i8, Integer.valueOf(i8)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.boostsStatus.level), LocaleController.formatPluralString("BoostStories", this.boostsStatus.level + 1, new Object[0]));
        }
        int i9 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.boostsStatus;
        int i10 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return LocaleController.formatString(i9, string, LocaleController.formatPluralString("MoreBoosts", i10, Integer.valueOf(i10)));
    }

    public static LimitParams getLimitParams(int i, int i2) {
        LimitParams limitParams = new LimitParams();
        if (i == 0) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).dialogFiltersPinnedLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).dialogFiltersPinnedLimitPremium;
            limitParams.icon = R.drawable.msg_limit_pin;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 33) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).savedDialogsPinnedLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).savedDialogsPinnedLimitPremium;
            limitParams.icon = R.drawable.msg_limit_pin;
            limitParams.descriptionStr = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 2) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).publicLinksLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).publicLinksLimitPremium;
            limitParams.icon = R.drawable.msg_limit_links;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 12) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).chatlistInvitesLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).chatlistInvitesLimitPremium;
            limitParams.icon = R.drawable.msg_limit_links;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 13) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).chatlistJoinedLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).chatlistJoinedLimitPremium;
            limitParams.icon = R.drawable.msg_limit_folder;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 3) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).dialogFiltersLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).dialogFiltersLimitPremium;
            limitParams.icon = R.drawable.msg_limit_folder;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 4) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).dialogFiltersChatsLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).dialogFiltersChatsLimitPremium;
            limitParams.icon = R.drawable.msg_limit_chats;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 5) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).channelsLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).channelsLimitPremium;
            limitParams.icon = R.drawable.msg_limit_groups;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 6) {
            limitParams.defaultLimit = 100;
            limitParams.premiumLimit = 200;
            limitParams.icon = R.drawable.msg_limit_folder;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
        } else if (i == 7) {
            limitParams.defaultLimit = 3;
            limitParams.premiumLimit = 4;
            limitParams.icon = R.drawable.msg_limit_accounts;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(limitParams.premiumLimit));
            int i3 = R.string.LimitReachedAccountsPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedAccountsPremium", i3, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedAccountsPremium", i3, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 11) {
            limitParams.defaultLimit = 0;
            limitParams.premiumLimit = 0;
            limitParams.icon = R.drawable.msg_limit_links;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrPremium = "";
            limitParams.descriptionStrLocked = "";
        } else if (i == 14) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storyExpiringLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storyExpiringLimitPremium;
            limitParams.icon = R.drawable.msg_limit_stories;
            limitParams.descriptionStr = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", limitParams.defaultLimit) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", limitParams.premiumLimit);
            limitParams.descriptionStrPremium = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", limitParams.premiumLimit);
            limitParams.descriptionStrLocked = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", limitParams.defaultLimit);
        } else if (i == 15) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storiesSentWeeklyLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storiesSentWeeklyLimitPremium;
            limitParams.icon = R.drawable.msg_limit_stories;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            int i4 = R.string.LimitReachedStoriesWeeklyPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", i4, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", i4, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 16) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitPremium;
            limitParams.icon = R.drawable.msg_limit_stories;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            int i5 = R.string.LimitReachedStoriesMonthlyPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i5, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i5, Integer.valueOf(limitParams.defaultLimit));
        } else if (i == 18 || i == 32 || i == 20 || i == 24 || i == 27 || i == 28 || i == 25 || i == 30 || i == 35 || i == 29 || i == 22 || i == 23 || i == 19 || i == 21 || i == 26) {
            limitParams.defaultLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitDefault;
            limitParams.premiumLimit = MessagesController.getInstance(i2).storiesSentMonthlyLimitPremium;
            limitParams.icon = R.drawable.filled_limit_boost;
            limitParams.descriptionStr = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(limitParams.defaultLimit), Integer.valueOf(limitParams.premiumLimit));
            int i6 = R.string.LimitReachedStoriesMonthlyPremium;
            limitParams.descriptionStrPremium = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i6, Integer.valueOf(limitParams.premiumLimit));
            limitParams.descriptionStrLocked = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i6, Integer.valueOf(limitParams.defaultLimit));
        }
        return limitParams;
    }

    private void loadAdminedChannels() {
        this.loadingAdminedChannels = true;
        this.loading = true;
        updateRows();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadAdminedChannels$23(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadAdminedChannels$23(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadAdminedChannels$22(tLObject);
            }
        });
    }

    public void lambda$loadAdminedChannels$22(TLObject tLObject) {
        int top;
        this.loadingAdminedChannels = false;
        if (tLObject != null) {
            this.chats.clear();
            this.chats.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
            this.loading = false;
            this.enterAnimator.showItemsAnimated(this.chatsTitleRow + 4);
            int i = 0;
            while (true) {
                if (i >= this.recyclerListView.getChildCount()) {
                    top = 0;
                    break;
                } else {
                    if (this.recyclerListView.getChildAt(i) instanceof HeaderView) {
                        top = this.recyclerListView.getChildAt(i).getTop();
                        break;
                    }
                    i++;
                }
            }
            updateRows();
            if (this.headerRow >= 0 && top != 0) {
                ((LinearLayoutManager) this.recyclerListView.getLayoutManager()).scrollToPositionWithOffset(this.headerRow + 1, top);
            }
        }
        int iMax = Math.max(this.chats.size(), this.limitParams.defaultLimit);
        this.limitPreviewView.setIconValue(iMax, false);
        this.limitPreviewView.setBagePosition(iMax / this.limitParams.premiumLimit);
        this.limitPreviewView.startDelayedAnimation();
    }

    private void updateRows() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.dividerRow = -1;
        this.chatStartRow = -1;
        this.chatEndRow = -1;
        this.loadingRow = -1;
        this.linkRow = -1;
        this.emptyViewDividerRow = -1;
        this.boostFeaturesStartRow = -1;
        this.rowCount = 1;
        this.headerRow = 0;
        int i = this.type;
        if (i == 19 || i == 18 || i == 20 || i == 24 || i == 27 || i == 28 || i == 22 || i == 23 || i == 25 || i == 26 || i == 29 || i == 21 || i == 30 || i == 35) {
            if (i != 19 || ChatObject.hasAdminRights(getChat())) {
                this.topPadding = 0.24f;
                int i2 = this.rowCount;
                this.rowCount = i2 + 1;
                this.linkRow = i2;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i3 = this.rowCount;
                    this.rowCount = i3 + 1;
                    this.bottomRow = i3;
                }
            }
            setupBoostFeatures();
            int i4 = this.rowCount;
            int i5 = i4 + 1;
            this.rowCount = i5;
            this.boostFeaturesStartRow = i4;
            this.rowCount = i5 + (this.boostFeatures.size() - 1);
        } else if (i == 31 || i == 32) {
            this.topPadding = 0.24f;
            setupBoostFeatures();
            int i6 = this.rowCount;
            this.chatStartRow = i6;
            int i7 = i6 + 1;
            this.rowCount = i7;
            this.boostFeaturesStartRow = i6;
            int size = i7 + (this.boostFeatures.size() - 1);
            this.rowCount = size;
            this.chatEndRow = size;
        } else if (!hasFixedSize(i)) {
            int i8 = this.type;
            if (i8 != 11 && i8 != 34) {
                int i9 = this.rowCount;
                this.dividerRow = i9;
                this.rowCount = i9 + 2;
                this.chatsTitleRow = i9 + 1;
            } else {
                this.topPadding = 0.24f;
            }
            if (this.loading) {
                int i10 = this.rowCount;
                this.rowCount = i10 + 1;
                this.loadingRow = i10;
            } else if (i8 != 11 || this.canSendLink) {
                if (i8 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.premiumInviteBlockedUsers) == null || arrayList.isEmpty()) && ((arrayList2 = this.premiumMessagingBlockedUsers) == null || arrayList2.size() < this.restrictedUsers.size())) || (arrayList3 = this.premiumInviteBlockedUsers) == null || arrayList3.size() != 1 || (arrayList4 = this.premiumMessagingBlockedUsers) == null || arrayList4.size() != 1 || !this.canSendLink)) {
                    int i11 = this.rowCount;
                    this.chatStartRow = i11;
                    int i12 = this.type;
                    if (i12 == 11 || i12 == 34) {
                        this.rowCount = i11 + this.restrictedUsers.size();
                    } else if (i12 == 5) {
                        this.rowCount = i11 + this.inactiveChats.size();
                    } else {
                        this.rowCount = i11 + this.chats.size();
                    }
                    this.chatEndRow = this.rowCount;
                }
                if (this.chatEndRow - this.chatStartRow > 1) {
                    int i13 = this.rowCount;
                    this.rowCount = i13 + 1;
                    this.emptyViewDividerRow = i13;
                }
            }
        }
        notifyDataSetChanged();
    }

    private void revokeSelectedLinks() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.selectedChats.iterator();
        while (it.hasNext()) {
            this.chats.add((TLRPC.Chat) it.next());
        }
        revokeLinks(arrayList);
    }

    public void revokeLinks(final ArrayList arrayList) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]));
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.parentIsChannel) {
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title)));
            } else {
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title)));
            }
        } else if (this.parentIsChannel) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0])));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0])));
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$revokeLinks$25(arrayList, alertDialog, i);
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        }
    }

    public void lambda$revokeLinks$25(ArrayList arrayList, AlertDialog alertDialog, int i) {
        lambda$new$0();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i2));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_updateUsername, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$revokeLinks$24(tLObject, tL_error);
                }
            }, 64);
        }
    }

    public void lambda$revokeLinks$24(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            AndroidUtilities.runOnUIThread(this.onSuccessRunnable);
        }
    }

    private void loadInactiveChannels() {
        this.loading = true;
        updateRows();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadInactiveChannels$27(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadInactiveChannels$27(TLObject tLObject, TLRPC.TL_error tL_error) {
        String pluralString;
        if (tL_error == null) {
            final TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
            final ArrayList arrayList = new ArrayList();
            final int iMin = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
            for (int i = 0; i < iMin; i++) {
                TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i);
                int currentTime = (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - tL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                if (currentTime < 30) {
                    pluralString = LocaleController.formatPluralString("Days", currentTime, new Object[0]);
                } else if (currentTime < 365) {
                    pluralString = LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]);
                } else {
                    pluralString = LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                }
                if (ChatObject.isMegagroup(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), pluralString));
                } else if (ChatObject.isChannel(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, pluralString));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), pluralString));
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadInactiveChannels$26(arrayList, iMin, tL_messages_inactiveChats);
                }
            });
        }
    }

    public void lambda$loadInactiveChannels$26(ArrayList arrayList, int i, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        int top;
        this.inactiveChatsSignatures.clear();
        this.inactiveChats.clear();
        this.inactiveChatsSignatures.addAll(arrayList);
        for (int i2 = 0; i2 < i; i2++) {
            this.inactiveChats.add(tL_messages_inactiveChats.chats.get(i2));
        }
        this.loading = false;
        this.enterAnimator.showItemsAnimated(this.chatsTitleRow + 4);
        int i3 = 0;
        while (true) {
            if (i3 >= this.recyclerListView.getChildCount()) {
                top = 0;
                break;
            } else {
                if (this.recyclerListView.getChildAt(i3) instanceof HeaderView) {
                    top = this.recyclerListView.getChildAt(i3).getTop();
                    break;
                }
                i3++;
            }
        }
        updateRows();
        if (this.headerRow >= 0 && top != 0) {
            ((LinearLayoutManager) this.recyclerListView.getLayoutManager()).scrollToPositionWithOffset(this.headerRow + 1, top);
        }
        if (this.limitParams == null) {
            this.limitParams = getLimitParams(this.type, this.currentAccount);
        }
        int iMax = Math.max(this.inactiveChats.size(), this.limitParams.defaultLimit);
        LimitPreviewView limitPreviewView = this.limitPreviewView;
        if (limitPreviewView != null) {
            limitPreviewView.setIconValue(iMax, false);
            this.limitPreviewView.setBagePosition(iMax / this.limitParams.premiumLimit);
            this.limitPreviewView.startDelayedAnimation();
        }
    }

    private void setupBoostFeatures() {
        this.boostFeatures = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ArrayList arrayList = null;
        int iMax = 10;
        if (messagesController != null) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int iMax2 = Math.max(10, peerColors != null ? peerColors.maxLevel(isGroup()) : 0);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            int iMax3 = Math.max(iMax2, peerColors2 != null ? peerColors2.maxLevel(isGroup()) : 0);
            if (isGroup()) {
                iMax = Math.max(Math.max(Math.max(Math.max(Math.max(iMax3, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin);
            } else {
                iMax = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(iMax3, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin), messagesController.channelAutotranslationLevelMin);
            }
        }
        for (int i = this.type != 31 ? tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1 : 1; i <= iMax; i++) {
            ArrayList arrayListBoostFeaturesForLevel = boostFeaturesForLevel(i);
            if (arrayList == null || !BoostFeature.arraysEqual(arrayList, arrayListBoostFeaturesForLevel)) {
                ArrayList arrayList2 = this.boostFeatures;
                arrayList2.add(new BoostFeature.BoostFeatureLevel(i, arrayList2.isEmpty()));
                this.boostFeatures.addAll(arrayListBoostFeaturesForLevel);
                arrayList = arrayListBoostFeaturesForLevel;
            }
        }
    }

    private ArrayList boostFeaturesForLevel(int i) {
        boolean zIsGroup = isGroup();
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        if (messagesController == null) {
            return arrayList;
        }
        if (!zIsGroup && i >= messagesController.channelAutotranslationLevelMin) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
        }
        arrayList.add(BoostFeature.of(R.drawable.menu_feature_stories, "BoostFeatureStoriesPerDay", i).asIncremental());
        if (!zIsGroup) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_reactions, "BoostFeatureCustomReaction", i).asIncremental());
        }
        MessagesController.PeerColors peerColors = messagesController.peerColors;
        int iColorsAvailable = peerColors != null ? peerColors.colorsAvailable(i, false) : 0;
        MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
        int iColorsAvailable2 = peerColors2 != null ? peerColors2.colorsAvailable(i, zIsGroup) : 0;
        if (!zIsGroup && iColorsAvailable > 0) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_color_name, "BoostFeatureNameColor", 7));
        }
        if (!zIsGroup && iColorsAvailable > 0) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_links, "BoostFeatureReplyColor", iColorsAvailable));
        }
        if (!zIsGroup && i >= messagesController.channelBgIconLevelMin) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
        }
        if (iColorsAvailable2 > 0) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_color_profile, zIsGroup ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor", iColorsAvailable2));
        }
        if (zIsGroup && i >= messagesController.groupEmojiStickersLevelMin) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
        }
        if ((!zIsGroup && i >= messagesController.channelProfileIconLevelMin) || (zIsGroup && i >= messagesController.groupProfileBgIconLevelMin)) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_cover, zIsGroup ? R.string.BoostFeatureProfileIconGroup : R.string.BoostFeatureProfileIcon));
        }
        if (zIsGroup && i >= messagesController.groupTranscribeLevelMin) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
        }
        if ((!zIsGroup && i >= messagesController.channelEmojiStatusLevelMin) || (zIsGroup && i >= messagesController.groupEmojiStatusLevelMin)) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, "1000+"));
        }
        if ((!zIsGroup && i >= messagesController.channelWallpaperLevelMin) || (zIsGroup && i >= messagesController.groupWallpaperLevelMin)) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_wallpaper, zIsGroup ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground", 8));
        }
        if ((!zIsGroup && i >= messagesController.channelCustomWallpaperLevelMin) || (zIsGroup && i >= messagesController.groupCustomWallpaperLevelMin)) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_custombg, zIsGroup ? R.string.BoostFeatureCustomBackgroundGroup : R.string.BoostFeatureCustomBackground));
        }
        if (!zIsGroup && i >= messagesController.channelRestrictSponsoredLevelMin) {
            arrayList.add(BoostFeature.of(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    private class BoostFeatureCell extends FrameLayout {
        public BoostFeature feature;
        private final ImageView imageView;
        public BoostFeature.BoostFeatureLevel level;
        private final FrameLayout levelLayout;
        private final SimpleTextView levelTextView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final SimpleTextView textView;

        public BoostFeatureCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setPadding(((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft, 0, ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft, 0);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_premiumGradient1, resourcesProvider), PorterDuff.Mode.SRC_IN));
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.textView = simpleTextView;
            simpleTextView.setWidthWrapContent(true);
            simpleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            simpleTextView.setTextSize(14);
            boolean z = LocaleController.isRTL;
            addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 16, z ? 30.0f : 60.0f, 0.0f, z ? 60.0f : 30.0f, 0.0f));
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.levelTextView = simpleTextView2;
            simpleTextView2.setTextColor(-1);
            simpleTextView2.setWidthWrapContent(true);
            simpleTextView2.setTypeface(AndroidUtilities.bold());
            simpleTextView2.setTextSize(14);
            FrameLayout frameLayout = new FrameLayout(context, LimitReachedBottomSheet.this, resourcesProvider) {
                private final Paint dividerPaint;
                private final PremiumGradient.PremiumGradientTools gradientTools;
                final Theme.ResourcesProvider val$resourcesProvider;
                final LimitReachedBottomSheet val$this$0;

                {
                    this.val$resourcesProvider = resourcesProvider;
                    this.gradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, -1, resourcesProvider);
                    Paint paint = new Paint(1);
                    this.dividerPaint = paint;
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(1.0f);
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    this.dividerPaint.setColor(Theme.getColor(Theme.key_sheet_scrollUp, this.val$resourcesProvider));
                    canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, BoostFeatureCell.this.levelTextView.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, this.dividerPaint);
                    canvas.drawLine(BoostFeatureCell.this.levelTextView.getRight() + AndroidUtilities.dp(20.0f), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, this.dividerPaint);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(BoostFeatureCell.this.levelTextView.getLeft() - AndroidUtilities.dp(15.0f), ((BoostFeatureCell.this.levelTextView.getTop() + BoostFeatureCell.this.levelTextView.getBottom()) - AndroidUtilities.dp(30.0f)) / 2.0f, BoostFeatureCell.this.levelTextView.getRight() + AndroidUtilities.dp(15.0f), ((BoostFeatureCell.this.levelTextView.getTop() + BoostFeatureCell.this.levelTextView.getBottom()) + AndroidUtilities.dp(30.0f)) / 2.0f);
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    rectF.set(0.0f, 0.0f, rectF.width(), rectF.height());
                    this.gradientTools.gradientMatrix(rectF);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.gradientTools.paint);
                    canvas.restore();
                    super.dispatchDraw(canvas);
                }
            };
            this.levelLayout = frameLayout;
            frameLayout.setWillNotDraw(false);
            frameLayout.addView(simpleTextView2, LayoutHelper.createFrame(-2, -2, 17));
            addView(frameLayout, LayoutHelper.createFrame(-1, -1.0f));
        }

        public void set(BoostFeature boostFeature) {
            if (boostFeature instanceof BoostFeature.BoostFeatureLevel) {
                this.level = (BoostFeature.BoostFeatureLevel) boostFeature;
                this.feature = null;
                this.imageView.setVisibility(8);
                this.textView.setVisibility(8);
                this.levelLayout.setVisibility(0);
                SimpleTextView simpleTextView = this.levelTextView;
                BoostFeature.BoostFeatureLevel boostFeatureLevel = this.level;
                simpleTextView.setText(LocaleController.formatPluralString(boostFeatureLevel.isFirst ? "BoostLevelUnlocks" : "BoostLevel", boostFeatureLevel.lvl, new Object[0]));
                return;
            }
            if (boostFeature != null) {
                this.level = null;
                this.feature = boostFeature;
                this.imageView.setVisibility(0);
                this.imageView.setImageResource(this.feature.iconResId);
                this.textView.setVisibility(0);
                BoostFeature boostFeature2 = this.feature;
                if (boostFeature2.textKeyPlural != null) {
                    String string = LocaleController.getString(this.feature.textKeyPlural + "_" + LocaleController.getStringParamForNumber(this.feature.countPlural));
                    if (string == null || string.startsWith("LOC_ERR")) {
                        string = LocaleController.getString(this.feature.textKeyPlural + "_other");
                    }
                    if (string == null) {
                        string = "";
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int iIndexOf = string.indexOf("%d");
                    if (iIndexOf >= 0) {
                        spannableStringBuilder = new SpannableStringBuilder(string);
                        SpannableString spannableString = new SpannableString(this.feature.countPlural + "");
                        spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                        spannableStringBuilder.replace(iIndexOf, iIndexOf + 2, (CharSequence) spannableString);
                    }
                    this.textView.setText(spannableStringBuilder);
                } else {
                    String string2 = LocaleController.getString(boostFeature2.textKey);
                    String str = string2 != null ? string2 : "";
                    if (this.feature.countValue != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                        int iIndexOf2 = str.indexOf("%s");
                        if (iIndexOf2 >= 0) {
                            spannableStringBuilder2 = new SpannableStringBuilder(str);
                            SpannableString spannableString2 = new SpannableString(this.feature.countValue);
                            spannableString2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                            spannableStringBuilder2.replace(iIndexOf2, iIndexOf2 + 2, (CharSequence) spannableString2);
                        }
                        this.textView.setText(spannableStringBuilder2);
                    } else {
                        this.textView.setText(str);
                    }
                }
                this.levelLayout.setVisibility(8);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.level != null ? 49.0f : 36.0f), 1073741824));
        }
    }

    public static LimitReachedBottomSheet openBoostsForRemoveRestrictions(BaseFragment baseFragment, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j, boolean z) {
        if (baseFragment == null || tL_premium_boostsStatus == null || canApplyBoost == null || baseFragment.getContext() == null) {
            return null;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 32, baseFragment.getCurrentAccount(), baseFragment.getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        if (z) {
            baseFragment.showDialog(limitReachedBottomSheet);
        } else {
            limitReachedBottomSheet.show();
        }
        return limitReachedBottomSheet;
    }

    public static void openBoostsForUsers(BaseFragment baseFragment, boolean z, long j, ChannelBoostsController.CanApplyBoost canApplyBoost, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChatMessageCell chatMessageCell) {
        if (baseFragment == null || canApplyBoost == null || tL_premium_boostsStatus == null || baseFragment.getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 19, baseFragment.getCurrentAccount(), baseFragment.getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, z);
        limitReachedBottomSheet.setDialogId(j);
        limitReachedBottomSheet.setChatMessageCell(chatMessageCell);
        baseFragment.showDialog(limitReachedBottomSheet);
    }

    public static void openBoostsForPostingStories(BaseFragment baseFragment, long j, ChannelBoostsController.CanApplyBoost canApplyBoost, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, Runnable runnable) {
        if (baseFragment == null || canApplyBoost == null || tL_premium_boostsStatus == null || baseFragment.getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 18, baseFragment.getCurrentAccount(), baseFragment.getResourceProvider());
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, true);
        limitReachedBottomSheet.setDialogId(j);
        limitReachedBottomSheet.showStatisticButtonInLink(runnable);
        limitReachedBottomSheet.show();
    }
}
