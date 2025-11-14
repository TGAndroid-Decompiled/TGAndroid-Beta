package org.telegram.ui.bots;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.GradientHeaderActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;

public class ChannelAffiliateProgramsFragment extends GradientHeaderActivity implements NotificationCenter.NotificationCenterDelegate {
    private FrameLayout aboveTitleView;
    private UniversalAdapter adapter;
    public final long dialogId;
    private View emptyLayout;
    private GLIconTextureView iconTextureView;

    public static void lambda$showConnectAffiliateAlert$14(DialogInterface dialogInterface) {
    }

    public static void lambda$showShareAffiliateAlert$24(DialogInterface dialogInterface) {
    }

    public ChannelAffiliateProgramsFragment(long j) {
        this.dialogId = j;
        setWhiteBackground(true);
        setMinusHeaderHeight(AndroidUtilities.dp(60.0f));
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
    }

    @Override
    public View createView(final Context context) {
        this.useFillLastLayoutManager = false;
        this.particlesViewHeight = AndroidUtilities.dp(238.0f);
        View view = new View(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
            }
        };
        this.emptyLayout = view;
        view.setBackgroundColor(Theme.getColor(Theme.key_dialogBackgroundGray));
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.aboveTitleView = frameLayout;
        frameLayout.setClickable(true);
        GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 3);
        this.iconTextureView = gLIconTextureView;
        GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
        gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
        gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
        gLIconRenderer.updateColors();
        this.iconTextureView.setStarParticlesView(this.particlesView);
        this.aboveTitleView.addView(this.iconTextureView, LayoutHelper.createFrame(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        configureHeader(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.aboveTitleView, null);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i) {
                ChannelAffiliateProgramsFragment.this.lambda$createView$0(context, view2, i);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view2, int i) {
                boolean lambda$createView$8;
                lambda$createView$8 = ChannelAffiliateProgramsFragment.this.lambda$createView$8(context, view2, i);
                return lambda$createView$8;
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (ChannelAffiliateProgramsFragment.this.isLoadingVisible() || !recyclerView.canScrollVertically(1)) {
                    BotStarsController.getInstance(((BaseFragment) ChannelAffiliateProgramsFragment.this).currentAccount).getChannelConnectedBots(ChannelAffiliateProgramsFragment.this.dialogId).load();
                    BotStarsController.getInstance(((BaseFragment) ChannelAffiliateProgramsFragment.this).currentAccount).getChannelSuggestedBots(ChannelAffiliateProgramsFragment.this.dialogId).load();
                }
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$0(Context context, View view, int i) {
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter == null) {
            return;
        }
        Object obj = universalAdapter.getItem(i).object;
        if (obj instanceof TL_payments.starRefProgram) {
            showConnectAffiliateAlert(context, this.currentAccount, (TL_payments.starRefProgram) obj, this.dialogId, this.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            showShareAffiliateAlert(context, this.currentAccount, (TL_payments.connectedBotStarRef) obj, this.dialogId, this.resourceProvider);
        }
    }

    public boolean lambda$createView$8(final Context context, View view, int i) {
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter == null) {
            return false;
        }
        Object obj = universalAdapter.getItem(i).object;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            return false;
        }
        final TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        final TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
        ItemOptions makeOptions = ItemOptions.makeOptions(this, view);
        boolean z = user.bot_has_main_app;
        int i2 = R.drawable.msg_bot;
        makeOptions.addIf(z, i2, LocaleController.getString(R.string.ProfileBotOpenApp), new Runnable() {
            @Override
            public final void run() {
                ChannelAffiliateProgramsFragment.this.lambda$createView$1(user);
            }
        }).addIf(!user.bot_has_main_app, i2, LocaleController.getString(R.string.BotWebViewOpenBot), new Runnable() {
            @Override
            public final void run() {
                ChannelAffiliateProgramsFragment.this.lambda$createView$2(connectedbotstarref);
            }
        }).add(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new Runnable() {
            @Override
            public final void run() {
                ChannelAffiliateProgramsFragment.this.lambda$createView$3(connectedbotstarref, user);
            }
        }).addIf(!connectedbotstarref.revoked, R.drawable.msg_leave, (CharSequence) LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new Runnable() {
            @Override
            public final void run() {
                ChannelAffiliateProgramsFragment.this.lambda$createView$7(context, user, connectedbotstarref);
            }
        }).setGravity(5).show();
        return true;
    }

    public void lambda$createView$1(TLRPC.User user) {
        getMessagesController().openApp(user, getClassGuid());
    }

    public void lambda$createView$2(TL_payments.connectedBotStarRef connectedbotstarref) {
        presentFragment(ChatActivity.of(connectedbotstarref.bot_id));
    }

    public void lambda$createView$3(TL_payments.connectedBotStarRef connectedbotstarref, TLRPC.User user) {
        AndroidUtilities.addToClipboard(connectedbotstarref.url);
        BulletinFactory.of(this).createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, AffiliateProgramFragment.percents(connectedbotstarref.commission_permille), UserObject.getUserName(user)))).show();
    }

    public void lambda$createView$7(Context context, TLRPC.User user, final TL_payments.connectedBotStarRef connectedbotstarref) {
        new AlertDialog.Builder(context, this.resourceProvider).setTitle(LocaleController.getString(R.string.LeaveAffiliateLink)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)))).setPositiveButton(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                ChannelAffiliateProgramsFragment.this.lambda$createView$6(connectedbotstarref, alertDialog, i);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
    }

    public void lambda$createView$6(TL_payments.connectedBotStarRef connectedbotstarref, AlertDialog alertDialog, int i) {
        final AlertDialog alertDialog2 = new AlertDialog(getParentActivity(), 3);
        alertDialog2.showDelayed(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        editconnectedstarrefbot.revoked = true;
        getConnectionsManager().sendRequest(editconnectedstarrefbot, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChannelAffiliateProgramsFragment.this.lambda$createView$5(alertDialog2, tLObject, tL_error);
            }
        });
    }

    public void lambda$createView$5(final AlertDialog alertDialog, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelAffiliateProgramsFragment.this.lambda$createView$4(tLObject, alertDialog);
            }
        });
    }

    public void lambda$createView$4(TLObject tLObject, AlertDialog alertDialog) {
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            BotStarsController.getInstance(this.currentAccount).getChannelConnectedBots(this.dialogId).applyEdit((TL_payments.connectedStarRefBots) tLObject);
            BotStarsController.getInstance(this.currentAccount).getChannelSuggestedBots(this.dialogId).reload();
            this.adapter.update(true);
        }
        alertDialog.dismiss();
    }

    public boolean isLoadingVisible() {
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected RecyclerView.Adapter createAdapter() {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.listView, getContext(), this.currentAccount, this.classGuid, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ChannelAffiliateProgramsFragment.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, getResourceProvider()) {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i == 42) {
                    HeaderCell headerCell = new HeaderCell(ChannelAffiliateProgramsFragment.this.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, false, ((BaseFragment) ChannelAffiliateProgramsFragment.this).resourceProvider);
                    headerCell.setHeight(25);
                    return new RecyclerListView.Holder(headerCell);
                }
                return super.onCreateViewHolder(viewGroup, i);
            }
        };
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        if (getContext() == null) {
            return;
        }
        arrayList.add(UItem.asFullyCustom(getHeader(getContext())));
        arrayList.add(AffiliateProgramFragment.FeatureCell.Factory.as(R.drawable.menu_feature_reliable, LocaleController.getString(R.string.ChannelAffiliateProgramFeature1Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature1)));
        arrayList.add(AffiliateProgramFragment.FeatureCell.Factory.as(R.drawable.menu_feature_transparent, LocaleController.getString(R.string.ChannelAffiliateProgramFeature2Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature2)));
        arrayList.add(AffiliateProgramFragment.FeatureCell.Factory.as(R.drawable.menu_feature_simple, LocaleController.getString(R.string.ChannelAffiliateProgramFeature3Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature3)));
        arrayList.add(UItem.asShadow(1, null));
        BotStarsController.ChannelConnectedBots channelConnectedBots = BotStarsController.getInstance(this.currentAccount).getChannelConnectedBots(this.dialogId);
        if (!channelConnectedBots.bots.isEmpty() || channelConnectedBots.count > 0) {
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.ChannelAffiliateProgramMyPrograms)));
            for (int i = 0; i < channelConnectedBots.bots.size(); i++) {
                arrayList.add(BotCell.Factory.as((TL_payments.connectedBotStarRef) channelConnectedBots.bots.get(i)));
            }
            if (!channelConnectedBots.endReached || channelConnectedBots.isLoading()) {
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
            }
            arrayList.add(UItem.asShadow(2, null));
        }
        BotStarsController.ChannelSuggestedBots channelSuggestedBots = BotStarsController.getInstance(this.currentAccount).getChannelSuggestedBots(this.dialogId);
        if (!channelSuggestedBots.bots.isEmpty() || channelSuggestedBots.count > 0) {
            arrayList.add(HeaderSortCell.Factory.as(LocaleController.getString(R.string.ChannelAffiliateProgramPrograms), sortText(channelSuggestedBots.getSort())));
            for (int i2 = 0; i2 < channelSuggestedBots.bots.size(); i2++) {
                arrayList.add(BotCell.Factory.as(channelSuggestedBots.bots.get(i2)));
            }
            if (!channelSuggestedBots.endReached || channelSuggestedBots.isLoading()) {
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
            }
            arrayList.add(UItem.asShadow(3, null));
        }
        arrayList.add(UItem.asCustom(this.emptyLayout));
    }

    private CharSequence sortText(BotStarsController.ChannelSuggestedBots.Sort sort) {
        SpannableString spannableString;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSort)).append((CharSequence) " ");
        if (sort == BotStarsController.ChannelSuggestedBots.Sort.BY_PROFITABILITY) {
            spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability) + "v");
        } else if (sort == BotStarsController.ChannelSuggestedBots.Sort.BY_REVENUE) {
            spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue) + "v");
        } else {
            if (sort == BotStarsController.ChannelSuggestedBots.Sort.BY_DATE) {
                spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate) + "v");
            }
            return spannableStringBuilder;
        }
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.arrow_more);
        coloredImageSpan.useLinkPaintColor = true;
        coloredImageSpan.setScale(0.6f, 0.6f);
        spannableString.setSpan(coloredImageSpan, spannableString.length() - 1, spannableString.length(), 33);
        spannableString.setSpan(new AnonymousClass4(sort, BotStarsController.getInstance(this.currentAccount).getChannelSuggestedBots(this.dialogId)), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public class AnonymousClass4 extends ClickableSpan {
        final BotStarsController.ChannelSuggestedBots.Sort val$sort;
        final BotStarsController.ChannelSuggestedBots val$suggestedBots;

        AnonymousClass4(BotStarsController.ChannelSuggestedBots.Sort sort, BotStarsController.ChannelSuggestedBots channelSuggestedBots) {
            this.val$sort = sort;
            this.val$suggestedBots = channelSuggestedBots;
        }

        @Override
        public void onClick(View view) {
            ItemOptions makeOptions = ItemOptions.makeOptions(ChannelAffiliateProgramsFragment.this, view);
            boolean z = this.val$sort == BotStarsController.ChannelSuggestedBots.Sort.BY_DATE;
            String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
            final BotStarsController.ChannelSuggestedBots channelSuggestedBots = this.val$suggestedBots;
            ItemOptions addChecked = makeOptions.addChecked(z, string, new Runnable() {
                @Override
                public final void run() {
                    ChannelAffiliateProgramsFragment.AnonymousClass4.lambda$onClick$0(BotStarsController.ChannelSuggestedBots.this);
                }
            });
            boolean z2 = this.val$sort == BotStarsController.ChannelSuggestedBots.Sort.BY_REVENUE;
            String string2 = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue);
            final BotStarsController.ChannelSuggestedBots channelSuggestedBots2 = this.val$suggestedBots;
            ItemOptions addChecked2 = addChecked.addChecked(z2, string2, new Runnable() {
                @Override
                public final void run() {
                    ChannelAffiliateProgramsFragment.AnonymousClass4.lambda$onClick$1(BotStarsController.ChannelSuggestedBots.this);
                }
            });
            boolean z3 = this.val$sort == BotStarsController.ChannelSuggestedBots.Sort.BY_PROFITABILITY;
            String string3 = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability);
            final BotStarsController.ChannelSuggestedBots channelSuggestedBots3 = this.val$suggestedBots;
            addChecked2.addChecked(z3, string3, new Runnable() {
                @Override
                public final void run() {
                    ChannelAffiliateProgramsFragment.AnonymousClass4.lambda$onClick$2(BotStarsController.ChannelSuggestedBots.this);
                }
            }).setGravity(5).setDrawScrim(false).setDimAlpha(0).translate(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f)).show();
        }

        public static void lambda$onClick$0(BotStarsController.ChannelSuggestedBots channelSuggestedBots) {
            channelSuggestedBots.setSort(BotStarsController.ChannelSuggestedBots.Sort.BY_DATE);
        }

        public static void lambda$onClick$1(BotStarsController.ChannelSuggestedBots channelSuggestedBots) {
            channelSuggestedBots.setSort(BotStarsController.ChannelSuggestedBots.Sort.BY_REVENUE);
        }

        public static void lambda$onClick$2(BotStarsController.ChannelSuggestedBots channelSuggestedBots) {
            channelSuggestedBots.setSort(BotStarsController.ChannelSuggestedBots.Sort.BY_PROFITABILITY);
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setUnderlineText(false);
            textPaint.setColor(textPaint.linkColor);
        }
    }

    @Override
    public StarParticlesView createParticlesView() {
        return makeParticlesView(getContext(), 75, 1);
    }

    public static StarParticlesView makeParticlesView(Context context, int i, int i2) {
        return new StarParticlesView(context) {
            {
                setClipWithGradient();
            }

            @Override
            public void configure() {
                super.configure();
                StarParticlesView.Drawable drawable = this.drawable;
                drawable.useGradient = true;
                drawable.useBlur = false;
                drawable.forceMaxAlpha = true;
                drawable.checkBounds = true;
                drawable.init();
            }

            @Override
            protected int getStarsRectWidth() {
                return getMeasuredWidth();
            }
        };
    }

    @Override
    public void onResume() {
        super.onResume();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(false);
            this.iconTextureView.setDialogVisible(false);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(true);
            this.iconTextureView.setDialogVisible(true);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalAdapter universalAdapter;
        if (i != NotificationCenter.channelConnectedBotsUpdate) {
            if (i == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.dialogId && (universalAdapter = this.adapter) != null) {
                universalAdapter.update(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == this.dialogId) {
            UniversalAdapter universalAdapter2 = this.adapter;
            if (universalAdapter2 != null) {
                universalAdapter2.update(true);
            }
            BotStarsController.getInstance(this.currentAccount).getChannelConnectedBots(this.dialogId).load();
        }
    }

    public static class BotCell extends FrameLayout {
        private final ImageView arrowView;
        private final int currentAccount;
        private final BackupImageView imageView;
        private final View linkBgView;
        private final View linkFg2View;
        private final ImageView linkFgView;
        private boolean needDivider;
        private final Theme.ResourcesProvider resourcesProvider;
        private final LinearLayout textLayout;
        private final TextView textView;
        private final TextView titleView;

        public BotCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(46.0f));
            addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
            View view = new View(context);
            this.linkBgView = view;
            view.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(11.0f), Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            addView(view, LayoutHelper.createFrame(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
            View view2 = new View(context);
            this.linkFg2View = view2;
            view2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(9.665f), Theme.getColor(Theme.key_color_green, resourcesProvider)));
            addView(view2, LayoutHelper.createFrame(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.linkFgView = imageView;
            imageView.setScaleX(0.6f);
            imageView.setScaleY(0.6f);
            addView(imageView, LayoutHelper.createFrame(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            NotificationCenter.listenEmojiLoading(textView);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 55, 6, 0, 24, 0));
            TextView textView2 = new TextView(context);
            this.textView = textView2;
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(truncateAt);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 6, 1, 24, 0));
            ImageView imageView2 = new ImageView(context);
            this.arrowView = imageView2;
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_switchTrack, resourcesProvider), PorterDuff.Mode.SRC_IN));
            imageView2.setImageResource(R.drawable.msg_arrowright);
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView2, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        }

        public void set(TL_payments.connectedBotStarRef connectedbotstarref, boolean z, boolean z2) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(user);
            this.imageView.setForUserOrChat(user, avatarDrawable);
            this.titleView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), this.titleView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                FilterCreateActivity.NewSpan newSpan = new FilterCreateActivity.NewSpan(10.0f);
                newSpan.setColor(Theme.getColor(Theme.key_color_green));
                newSpan.setText(AffiliateProgramFragment.percents(connectedbotstarref.commission_permille));
                spannableStringBuilder.setSpan(newSpan, 1, 2, 33);
            }
            int i = connectedbotstarref.duration_months;
            if (i == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i < 12 || i % 12 != 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i / 12, new Object[0]));
            }
            this.textView.setText(spannableStringBuilder);
            this.arrowView.setVisibility(z ? 0 : 8);
            this.linkBgView.setVisibility(0);
            this.linkFgView.setVisibility(0);
            this.linkFg2View.setVisibility(0);
            this.linkFg2View.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(9.665f), Theme.getColor(connectedbotstarref.revoked ? Theme.key_color_red : Theme.key_color_green, this.resourcesProvider)));
            this.linkFgView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
            this.linkFgView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
            this.linkFgView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
            this.needDivider = z2;
            setWillNotDraw(!z2);
        }

        public void set(TL_payments.starRefProgram starrefprogram, boolean z, boolean z2) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(starrefprogram.bot_id));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(user);
            this.imageView.setForUserOrChat(user, avatarDrawable);
            this.titleView.setText(UserObject.getUserName(user));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                FilterCreateActivity.NewSpan newSpan = new FilterCreateActivity.NewSpan(10.0f);
                newSpan.setColor(Theme.getColor(Theme.key_color_green));
                newSpan.setText(AffiliateProgramFragment.percents(starrefprogram.commission_permille));
                spannableStringBuilder.setSpan(newSpan, 1, 2, 33);
            }
            int i = starrefprogram.duration_months;
            if (i == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i < 12 || i % 12 != 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i / 12, new Object[0]));
            }
            this.textView.setText(spannableStringBuilder);
            this.arrowView.setVisibility(z ? 0 : 8);
            this.linkBgView.setVisibility(8);
            this.linkFgView.setVisibility(8);
            this.linkFg2View.setVisibility(8);
            this.needDivider = z2;
            setWillNotDraw(!z2);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), Theme.dividerPaint);
            }
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public BotCell createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new BotCell(context, i, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                Object obj = uItem.object;
                if (obj instanceof TL_payments.connectedBotStarRef) {
                    ((BotCell) view).set((TL_payments.connectedBotStarRef) obj, uItem.red, z);
                } else if (obj instanceof TL_payments.starRefProgram) {
                    ((BotCell) view).set((TL_payments.starRefProgram) obj, uItem.red, z);
                }
            }

            public static UItem as(Object obj) {
                return as(obj, true);
            }

            public static UItem as(Object obj, boolean z) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.object = obj;
                ofFactory.red = z;
                return ofFactory;
            }
        }
    }

    public static class HeaderSortCell extends HeaderCell {
        private final LinkSpanDrawable.LinksTextView subtextView;

        public HeaderSortCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            this.subtextView = linksTextView;
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider));
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 20.0f, 10.0f, 0.0f));
        }

        public void set(CharSequence charSequence, CharSequence charSequence2) {
            setText(charSequence);
            this.subtextView.setText(charSequence2);
        }

        public static class Factory extends UItem.UItemFactory {
            @Override
            public boolean isClickable() {
                return false;
            }

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public HeaderSortCell createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new HeaderSortCell(context, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((HeaderSortCell) view).set(uItem.text, uItem.subtext);
            }

            public static UItem as(CharSequence charSequence, CharSequence charSequence2) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.text = charSequence;
                ofFactory.subtext = charSequence2;
                return ofFactory;
            }
        }
    }

    public static void showConnectAffiliateAlert(final Context context, final int i, final TL_payments.starRefProgram starrefprogram, final long j, final Theme.ResourcesProvider resourcesProvider, final boolean z) {
        long[] jArr;
        TLRPC.User user;
        String formatPluralString;
        LinearLayout linearLayout;
        BackupImageView backupImageView;
        TextView textView;
        if (starrefprogram == null || context == null) {
            return;
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, resourcesProvider);
        long[] jArr2 = {j};
        TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(starrefprogram.bot_id));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        BackupImageView backupImageView2 = new BackupImageView(context);
        backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(user2);
        backupImageView2.setForUserOrChat(user2, avatarDrawable);
        ScaleStateListAnimator.apply(backupImageView2);
        frameLayout2.addView(backupImageView2, LayoutHelper.createFrame(60, 60, 119));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), Theme.getColor(Theme.key_dialogBackground, resourcesProvider)));
            frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
            TextView textView2 = new TextView(context);
            textView2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), Theme.getColor(Theme.key_color_green, resourcesProvider)));
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 10.0f);
            textView2.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            StringBuilder sb = new StringBuilder();
            sb.append("⭐️ ");
            jArr = jArr2;
            sb.append((Object) StarsIntroActivity.formatStarsAmountShort(starrefprogram.daily_revenue_per_user, 1.0f, ','));
            textView2.setText(StarsIntroActivity.replaceStars(sb.toString(), 0.75f, new ColoredImageSpan[1]));
            frameLayout3.addView(textView2, LayoutHelper.createFrame(-2, 15.66f));
            frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            jArr = jArr2;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setTranslationX(-AndroidUtilities.dp(2.0825f));
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        frameLayout.addView(imageView, LayoutHelper.createFrame(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, LayoutHelper.createFrame(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        final BackupImageView backupImageView3 = new BackupImageView(context);
        backupImageView3.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout4.addView(backupImageView3, LayoutHelper.createFrame(60, 60, 119));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(10.0f);
        int i2 = Theme.key_dialogBackground;
        frameLayout5.setBackground(Theme.createRoundRectDrawable(dp, Theme.getColor(i2, resourcesProvider)));
        frameLayout5.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        TextView textView3 = new TextView(context);
        textView3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) AffiliateProgramFragment.percents(starrefprogram.commission_permille)));
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_link_1);
        coloredImageSpan.setScale(0.65f, 0.65f);
        coloredImageSpan.spaceScaleX = 0.7f;
        coloredImageSpan.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
        spannableString.setSpan(coloredImageSpan, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, LayoutHelper.createFrame(-2, 15.66f));
        frameLayout4.addView(frameLayout5, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        textView4.setTextColor(Theme.getColor(i3, resourcesProvider));
        textView4.setTextSize(1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinTitle));
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView4, LayoutHelper.createLinear(-1, -2, 0.0f, 21.0f, 0.0f, 9.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i4 = Theme.key_windowBackgroundGray;
        linearLayout3.setBackground(Theme.createRoundRectDrawable(dp2, Theme.getColor(i4, resourcesProvider)));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setTextColor(Theme.getColor(i3, resourcesProvider));
        textView5.setText(LocaleController.formatString(R.string.ChannelAffiliateProgramJoinViewBot, DialogObject.getName(i, starrefprogram.bot_id)));
        linearLayout3.addView(textView5, LayoutHelper.createLinear(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i5 = Theme.key_dialogTextGray3;
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i5, resourcesProvider), mode));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 16, 5, 0, 8, 0));
        linearLayout2.addView(linearLayout3, LayoutHelper.createLinear(-2, 28, 1, 4, 0, 4, 0));
        ScaleStateListAnimator.apply(linearLayout3);
        TextView textView6 = new TextView(context);
        textView6.setTextColor(Theme.getColor(i3, resourcesProvider));
        textView6.setTextSize(1, 14.0f);
        textView6.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView6);
        SpannableString spannableString2 = new SpannableString(StarsIntroActivity.formatStarsAmountShort(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        textView6.setText(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatSpannable(R.string.ChannelAffiliateProgramJoinRevenue, spannableString2), 0.725f));
        linearLayout2.addView(textView6, LayoutHelper.createLinear(-1, -2, 0.0f, 10.0f, 0.0f, 20.0f));
        TextView textView7 = new TextView(context);
        textView7.setTextColor(Theme.getColor(i3, resourcesProvider));
        textView7.setTextSize(1, 14.0f);
        textView7.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView7);
        int i6 = R.string.ChannelAffiliateProgramJoinText;
        String userName = UserObject.getUserName(user2);
        CharSequence percents = AffiliateProgramFragment.percents(starrefprogram.commission_permille);
        int i7 = starrefprogram.duration_months;
        if (i7 <= 0) {
            formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
            user = user2;
        } else if (i7 < 12 || i7 % 12 != 0) {
            user = user2;
            formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i7, new Object[0]);
        } else {
            user = user2;
            formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i7 / 12, new Object[0]);
        }
        textView7.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i6, userName, percents, formatPluralString)), textView7.getPaint().getFontMetricsInt(), false));
        linearLayout2.addView(textView7, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 22.0f));
        if (j >= 0) {
            TextView textView8 = new TextView(context);
            textView8.setTextColor(Theme.getColor(i3, resourcesProvider));
            textView8.setTextSize(1, 14.0f);
            textView8.setGravity(17);
            textView8.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            linearLayout2.addView(textView8, LayoutHelper.createLinear(-1, -2, 20.0f, 0.0f, 20.0f, 0.0f));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(i4, resourcesProvider)));
            linearLayout4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(i4, resourcesProvider), Theme.blendOver(Theme.getColor(i4, resourcesProvider), Theme.getColor(Theme.key_listSelector, resourcesProvider))));
            BackupImageView backupImageView4 = new BackupImageView(context);
            backupImageView4.setRoundRadius(AndroidUtilities.dp(14.0f));
            linearLayout4.addView(backupImageView4, LayoutHelper.createLinear(28, 28));
            TextView textView9 = new TextView(context);
            textView9.setTextSize(1, 13.0f);
            textView9.setTextColor(Theme.getColor(i3, resourcesProvider));
            linearLayout4.addView(textView9, LayoutHelper.createLinear(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType);
            imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i5, resourcesProvider), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, LayoutHelper.createLinear(-2, -2, 16, 2, 0, 5, 0));
            linearLayout2.addView(linearLayout4, LayoutHelper.createLinear(-2, 28, 1, 0, 11, 0, 20));
            linearLayout = linearLayout4;
            backupImageView = backupImageView4;
            textView = textView9;
        } else {
            linearLayout = null;
            backupImageView = null;
            textView = null;
        }
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false);
        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new Runnable() {
            @Override
            public final void run() {
                ChannelAffiliateProgramsFragment.lambda$showConnectAffiliateAlert$9(context);
            }
        }));
        linksTextView.setGravity(17);
        linksTextView.setTextSize(1, 12.0f);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linearLayout2.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 49, 14, 14, 14, 6));
        builder.setCustomView(linearLayout2);
        final BottomSheet create = builder.create();
        backupImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChannelAffiliateProgramsFragment.lambda$showConnectAffiliateAlert$10(BottomSheet.this, starrefprogram, view);
            }
        });
        final long[] jArr3 = jArr;
        final LinearLayout linearLayout5 = linearLayout;
        final TLRPC.User user3 = user;
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChannelAffiliateProgramsFragment.lambda$showConnectAffiliateAlert$13(ButtonWithCounterView.this, jArr3, i, starrefprogram, create, j, z, context, resourcesProvider, user3, view);
            }
        });
        create.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                ChannelAffiliateProgramsFragment.lambda$showConnectAffiliateAlert$14(dialogInterface);
            }
        });
        final long[] jArr4 = jArr;
        final BackupImageView backupImageView5 = backupImageView;
        final TextView textView10 = textView;
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ChannelAffiliateProgramsFragment.lambda$showConnectAffiliateAlert$15(jArr4, i, backupImageView3, backupImageView5, textView10);
            }
        };
        runnable.run();
        if (linearLayout5 != null) {
            BotStarsController.getInstance(i).loadAdminedBots();
            BotStarsController.getInstance(i).loadAdminedChannels();
            final long[] jArr5 = jArr;
            linearLayout5.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChannelAffiliateProgramsFragment.lambda$showConnectAffiliateAlert$17(i, create, resourcesProvider, linearLayout5, jArr5, runnable, view);
                }
            });
        }
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChannelAffiliateProgramsFragment.lambda$showConnectAffiliateAlert$18(BottomSheet.this, starrefprogram, view);
            }
        });
        create.fixNavigationBar(Theme.getColor(i2, resourcesProvider));
        create.show();
    }

    public static void lambda$showConnectAffiliateAlert$9(Context context) {
        Browser.openUrl(context, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
    }

    public static void lambda$showConnectAffiliateAlert$10(BottomSheet bottomSheet, TL_payments.starRefProgram starrefprogram, View view) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            bottomSheet.dismiss();
            safeLastFragment.presentFragment(ProfileActivity.of(starrefprogram.bot_id));
        }
    }

    public static void lambda$showConnectAffiliateAlert$13(final ButtonWithCounterView buttonWithCounterView, long[] jArr, final int i, final TL_payments.starRefProgram starrefprogram, final BottomSheet bottomSheet, final long j, final boolean z, final Context context, final Theme.ResourcesProvider resourcesProvider, final TLRPC.User user, View view) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        final long j2 = jArr[0];
        TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
        connectstarrefbot.bot = MessagesController.getInstance(i).getInputUser(starrefprogram.bot_id);
        connectstarrefbot.peer = MessagesController.getInstance(i).getInputPeer(j2);
        ConnectionsManager.getInstance(i).sendRequest(connectstarrefbot, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ChannelAffiliateProgramsFragment.lambda$showConnectAffiliateAlert$12(ButtonWithCounterView.this, i, j2, bottomSheet, starrefprogram, j, z, context, resourcesProvider, user, tLObject, tL_error);
            }
        });
    }

    public static void lambda$showConnectAffiliateAlert$12(final ButtonWithCounterView buttonWithCounterView, final int i, final long j, final BottomSheet bottomSheet, final TL_payments.starRefProgram starrefprogram, final long j2, final boolean z, final Context context, final Theme.ResourcesProvider resourcesProvider, final TLRPC.User user, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelAffiliateProgramsFragment.lambda$showConnectAffiliateAlert$11(ButtonWithCounterView.this, tLObject, i, j, bottomSheet, starrefprogram, j2, z, context, resourcesProvider, user, tL_error);
            }
        });
    }

    public static void lambda$showConnectAffiliateAlert$11(ButtonWithCounterView buttonWithCounterView, TLObject tLObject, int i, long j, BottomSheet bottomSheet, TL_payments.starRefProgram starrefprogram, long j2, boolean z, Context context, Theme.ResourcesProvider resourcesProvider, TLRPC.User user, TLRPC.TL_error tL_error) {
        TL_payments.connectedBotStarRef connectedbotstarref;
        BaseFragment safeLastFragment;
        int i2 = 0;
        buttonWithCounterView.setLoading(false);
        if (!(tLObject instanceof TL_payments.connectedStarRefBots)) {
            if (tL_error != null) {
                BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).showForError(tL_error);
                return;
            }
            return;
        }
        TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
        BotStarsController.getInstance(i).getChannelConnectedBots(j).apply(connectedstarrefbots);
        bottomSheet.dismiss();
        while (true) {
            if (i2 >= connectedstarrefbots.connected_bots.size()) {
                connectedbotstarref = null;
                break;
            }
            connectedbotstarref = connectedstarrefbots.connected_bots.get(i2);
            if (connectedbotstarref.bot_id == starrefprogram.bot_id) {
                break;
            } else {
                i2++;
            }
        }
        if ((j2 != j || z) && (safeLastFragment = LaunchActivity.getSafeLastFragment()) != null && (!(safeLastFragment instanceof ChannelAffiliateProgramsFragment) || ((ChannelAffiliateProgramsFragment) safeLastFragment).dialogId != j)) {
            safeLastFragment.presentFragment(new ChannelAffiliateProgramsFragment(j));
        }
        if (connectedbotstarref != null) {
            BotStarsController.getInstance(i).getChannelSuggestedBots(j).remove(connectedbotstarref.bot_id);
            BulletinFactory.of(showShareAffiliateAlert(context, i, connectedbotstarref, j, resourcesProvider).topBulletinContainer, resourcesProvider).createUsersBulletin(user, LocaleController.getString(R.string.AffiliateProgramJoinedTitle), LocaleController.getString(R.string.AffiliateProgramJoinedText)).show();
        }
    }

    public static void lambda$showConnectAffiliateAlert$15(long[] jArr, int i, BackupImageView backupImageView, BackupImageView backupImageView2, TextView textView) {
        if (jArr[0] >= 0) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(jArr[0]));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(user);
            backupImageView.setForUserOrChat(user, avatarDrawable);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-jArr[0]));
            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
            avatarDrawable2.setInfo(chat);
            backupImageView.setForUserOrChat(chat, avatarDrawable2);
        }
        if (jArr[0] >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(jArr[0]));
            if (backupImageView2 != null) {
                AvatarDrawable avatarDrawable3 = new AvatarDrawable();
                avatarDrawable3.setInfo(user2);
                backupImageView2.setForUserOrChat(user2, avatarDrawable3);
            }
            if (textView != null) {
                textView.setText(UserObject.getUserName(user2));
                return;
            }
            return;
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(-jArr[0]));
        if (backupImageView2 != null) {
            AvatarDrawable avatarDrawable4 = new AvatarDrawable();
            avatarDrawable4.setInfo(chat2);
            backupImageView2.setForUserOrChat(chat2, avatarDrawable4);
        }
        if (textView != null) {
            textView.setText(chat2 == null ? "" : chat2.title);
        }
    }

    public static void lambda$showConnectAffiliateAlert$17(int i, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, View view, final long[] jArr, final Runnable runnable, View view2) {
        final long j;
        ArrayList admined = BotStarsController.getInstance(i).getAdmined();
        admined.add(0, UserConfig.getInstance(i).getCurrentUser());
        ItemOptions makeOptions = ItemOptions.makeOptions(bottomSheet.getContainerView(), resourcesProvider, view);
        Iterator it = admined.iterator();
        while (it.hasNext()) {
            TLObject tLObject = (TLObject) it.next();
            if (tLObject instanceof TLRPC.User) {
                j = ((TLRPC.User) tLObject).id;
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    j = -chat.id;
                }
            }
            makeOptions.addChat(tLObject, j == jArr[0], new Runnable() {
                @Override
                public final void run() {
                    ChannelAffiliateProgramsFragment.lambda$showConnectAffiliateAlert$16(jArr, j, runnable);
                }
            });
        }
        makeOptions.setDrawScrim(false).setDimAlpha(0).setGravity(5).translate(AndroidUtilities.dp(24.0f), 0.0f).show();
    }

    public static void lambda$showConnectAffiliateAlert$16(long[] jArr, long j, Runnable runnable) {
        jArr[0] = j;
        runnable.run();
    }

    public static void lambda$showConnectAffiliateAlert$18(final BottomSheet bottomSheet, TL_payments.starRefProgram starrefprogram, View view) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            bottomSheet.dismiss();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", starrefprogram.bot_id);
            safeLastFragment.presentFragment(new ChatActivity(bundle) {
                @Override
                public void onFragmentDestroy() {
                    super.onFragmentDestroy();
                    bottomSheet.makeAttached(null);
                    bottomSheet.show();
                }
            });
        }
    }

    public static BottomSheet showShareAffiliateAlert(final Context context, final int i, final TL_payments.connectedBotStarRef connectedbotstarref, final long j, final Theme.ResourcesProvider resourcesProvider) {
        FrameLayout frameLayout;
        BottomSheet.Builder builder;
        int i2;
        PorterDuff.Mode mode;
        LinearLayout linearLayout;
        TLRPC.User user;
        char c;
        String formatPluralString;
        int i3;
        char c2;
        String formatPluralString2;
        int i4;
        LinearLayout linearLayout2;
        int i5;
        String formatPluralString3;
        ImageView.ScaleType scaleType;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        BottomSheet.Builder builder2 = new BottomSheet.Builder(context, false, resourcesProvider);
        TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayout3.setClipChildren(false);
        linearLayout3.setClipToPadding(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(40.0f), Theme.getColor(connectedbotstarref.revoked ? Theme.key_color_red : Theme.key_featuredStickers_addButton, resourcesProvider)));
        frameLayout2.addView(view, LayoutHelper.createFrame(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout2.addView(imageView, LayoutHelper.createFrame(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(50.0f), Theme.getColor(Theme.key_dialogBackground, resourcesProvider)));
            frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.5f), Theme.getColor(connectedbotstarref.revoked ? Theme.key_color_red : Theme.key_color_green, resourcesProvider)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_reply_user);
            coloredImageSpan.setScale(0.937f, 0.937f);
            coloredImageSpan.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            coloredImageSpan.spaceScaleX = 0.8f;
            builder = builder2;
            spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
            frameLayout = frameLayout2;
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout3.addView(textView, LayoutHelper.createFrame(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            frameLayout = frameLayout2;
            builder = builder2;
        }
        linearLayout3.addView(frameLayout, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        textView2.setTextColor(Theme.getColor(i6, resourcesProvider));
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        linearLayout3.addView(textView2, LayoutHelper.createLinear(-1, -2, 20.0f, 16.0f, 20.0f, 9.33f));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        int dp = AndroidUtilities.dp(28.0f);
        int i7 = Theme.key_windowBackgroundGray;
        linearLayout4.setBackground(Theme.createRoundRectDrawable(dp, Theme.getColor(i7, resourcesProvider)));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        linearLayout4.addView(backupImageView, LayoutHelper.createLinear(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(Theme.getColor(i6, resourcesProvider));
        textView3.setText(DialogObject.getName(i, connectedbotstarref.bot_id));
        avatarDrawable.setInfo(user2);
        backupImageView.setForUserOrChat(user2, avatarDrawable);
        linearLayout4.addView(textView3, LayoutHelper.createLinear(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType2);
        int i8 = Theme.key_dialogTextGray3;
        int color = Theme.getColor(i8, resourcesProvider);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(color, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout4.addView(imageView2, LayoutHelper.createLinear(-2, -2, 16, 5, 0, 8, 0));
        linearLayout3.addView(linearLayout4, LayoutHelper.createLinear(-2, 28, 1, 4, 0, 4, 0));
        ScaleStateListAnimator.apply(linearLayout4);
        TextView textView4 = new TextView(context);
        textView4.setTextColor(Theme.getColor(i6, resourcesProvider));
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            textView4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTextRevoked)));
            i2 = i8;
            mode = mode2;
            user = user2;
            linearLayout = linearLayout4;
        } else if (j < 0) {
            int i9 = R.string.ChannelAffiliateProgramLinkTextChannel;
            linearLayout = linearLayout4;
            CharSequence percents = AffiliateProgramFragment.percents(connectedbotstarref.commission_permille);
            String userName = UserObject.getUserName(user2);
            mode = mode2;
            int i10 = connectedbotstarref.duration_months;
            if (i10 <= 0) {
                formatPluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                i2 = i8;
                c2 = 0;
            } else {
                i2 = i8;
                if (i10 < 12 || i10 % 12 != 0) {
                    c2 = 0;
                    formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i10, new Object[0]);
                } else {
                    c2 = 0;
                    formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i10 / 12, new Object[0]);
                }
            }
            Object[] objArr = new Object[3];
            objArr[c2] = percents;
            objArr[1] = userName;
            objArr[2] = formatPluralString2;
            textView4.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i9, objArr)));
            user = user2;
        } else {
            i2 = i8;
            mode = mode2;
            linearLayout = linearLayout4;
            int i11 = R.string.ChannelAffiliateProgramLinkTextUser;
            CharSequence percents2 = AffiliateProgramFragment.percents(connectedbotstarref.commission_permille);
            String userName2 = UserObject.getUserName(user2);
            int i12 = connectedbotstarref.duration_months;
            if (i12 <= 0) {
                formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                user = user2;
                i3 = 3;
                c = 0;
            } else {
                user = user2;
                if (i12 < 12 || i12 % 12 != 0) {
                    c = 0;
                    formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i12, new Object[0]);
                } else {
                    c = 0;
                    formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i12 / 12, new Object[0]);
                }
                i3 = 3;
            }
            Object[] objArr2 = new Object[i3];
            objArr2[c] = percents2;
            objArr2[1] = userName2;
            objArr2[2] = formatPluralString;
            textView4.setText(AndroidUtilities.replaceTags(LocaleController.formatString(i11, objArr2)));
        }
        linearLayout3.addView(textView4, LayoutHelper.createLinear(-1, -2, 20.0f, 19.0f, 20.0f, 18.0f));
        if (connectedbotstarref.revoked) {
            i4 = i7;
            linearLayout2 = null;
        } else {
            TextView textView5 = new TextView(context);
            textView5.setTextColor(Theme.getColor(i6, resourcesProvider));
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            linearLayout3.addView(textView5, LayoutHelper.createLinear(-1, -2, 20.0f, 0.0f, 20.0f, 0.0f));
            LinearLayout linearLayout5 = new LinearLayout(context);
            linearLayout5.setOrientation(0);
            i4 = i7;
            linearLayout5.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), Theme.getColor(i4, resourcesProvider)));
            BackupImageView backupImageView2 = new BackupImageView(context);
            backupImageView2.setRoundRadius(AndroidUtilities.dp(14.0f));
            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
            linearLayout5.addView(backupImageView2, LayoutHelper.createLinear(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(Theme.getColor(i6, resourcesProvider));
            if (j >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i).getUser(Long.valueOf(j));
                avatarDrawable2.setInfo(user3);
                backupImageView2.setForUserOrChat(user3, avatarDrawable2);
                textView6.setText(UserObject.getUserName(user3));
                scaleType = scaleType2;
            } else {
                scaleType = scaleType2;
                TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
                avatarDrawable2.setInfo(chat);
                backupImageView2.setForUserOrChat(chat, avatarDrawable2);
                textView6.setText(chat == null ? "" : chat.title);
            }
            linearLayout5.addView(textView6, LayoutHelper.createLinear(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType);
            imageView3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout5.addView(imageView3, LayoutHelper.createLinear(-2, -2, 16, 2, 0, 5, 0));
            linearLayout3.addView(linearLayout5, LayoutHelper.createLinear(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout5;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(Theme.getColor(i6, resourcesProvider));
        textView7.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(i4, resourcesProvider), Theme.blendOver(Theme.getColor(i4, resourcesProvider), Theme.getColor(Theme.key_listSelector, resourcesProvider))));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        linearLayout3.addView(textView7, LayoutHelper.createFrame(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.msg_copy_filled), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            buttonWithCounterView.setText(spannableStringBuilder2, false);
        } else {
            buttonWithCounterView.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false);
        }
        linearLayout3.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        long j2 = connectedbotstarref.participants;
        if (j2 <= 0) {
            i5 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i5 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j2, UserObject.getUserName(user));
        }
        linksTextView.setText(formatPluralString3);
        linksTextView.setGravity(17);
        linksTextView.setTextSize(i5, 12.0f);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linearLayout3.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 49, 14, 12, 14, 2));
        BottomSheet.Builder builder3 = builder;
        builder3.setCustomView(linearLayout3);
        final BottomSheet create = builder3.create();
        final TLRPC.User user4 = user;
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ChannelAffiliateProgramsFragment.lambda$showShareAffiliateAlert$19(TL_payments.connectedBotStarRef.this, create, resourcesProvider, user4);
            }
        };
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    runnable.run();
                }
            });
        }
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ChannelAffiliateProgramsFragment.lambda$showShareAffiliateAlert$23(TL_payments.connectedBotStarRef.this, i, create, context, j, resourcesProvider, runnable, view2);
            }
        });
        create.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                ChannelAffiliateProgramsFragment.lambda$showShareAffiliateAlert$24(dialogInterface);
            }
        });
        if (linearLayout2 != null) {
            BotStarsController.getInstance(i).loadAdminedBots();
            BotStarsController.getInstance(i).loadAdminedChannels();
            final LinearLayout linearLayout6 = linearLayout2;
            linearLayout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ChannelAffiliateProgramsFragment.lambda$showShareAffiliateAlert$29(i, create, resourcesProvider, linearLayout6, j, context, connectedbotstarref, view2);
                }
            });
        }
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ChannelAffiliateProgramsFragment.lambda$showShareAffiliateAlert$30(BottomSheet.this, connectedbotstarref, view2);
            }
        });
        create.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!AndroidUtilities.isTablet() && safeLastFragment != null && !AndroidUtilities.hasDialogOnTop(safeLastFragment)) {
            create.makeAttached(safeLastFragment);
        }
        create.show();
        return create;
    }

    public static void lambda$showShareAffiliateAlert$19(TL_payments.connectedBotStarRef connectedbotstarref, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider, TLRPC.User user) {
        AndroidUtilities.addToClipboard(connectedbotstarref.url);
        BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).createSimpleBulletin(R.raw.copy, LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, AffiliateProgramFragment.percents(connectedbotstarref.commission_permille), UserObject.getUserName(user)))).show();
    }

    public static void lambda$showShareAffiliateAlert$23(TL_payments.connectedBotStarRef connectedbotstarref, final int i, final BottomSheet bottomSheet, final Context context, final long j, final Theme.ResourcesProvider resourcesProvider, Runnable runnable, View view) {
        if (connectedbotstarref.revoked) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(connectedbotstarref.bot_id));
            if (user != null) {
                MessagesController.getInstance(i).loadFullUser(user, 0, true, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        ChannelAffiliateProgramsFragment.lambda$showShareAffiliateAlert$22(BottomSheet.this, context, i, j, resourcesProvider, (TLRPC.UserFull) obj);
                    }
                });
                return;
            }
            return;
        }
        runnable.run();
    }

    public static void lambda$showShareAffiliateAlert$22(final BottomSheet bottomSheet, final Context context, final int i, final long j, final Theme.ResourcesProvider resourcesProvider, final TLRPC.UserFull userFull) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelAffiliateProgramsFragment.lambda$showShareAffiliateAlert$21(TLRPC.UserFull.this, bottomSheet, context, i, j, resourcesProvider);
            }
        });
    }

    public static void lambda$showShareAffiliateAlert$21(TLRPC.UserFull userFull, BottomSheet bottomSheet, Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        if (userFull == null || userFull.starref_program == null) {
            return;
        }
        bottomSheet.dismiss();
        showConnectAffiliateAlert(context, i, userFull.starref_program, j, resourcesProvider, true);
    }

    public static void lambda$showShareAffiliateAlert$29(final int i, final BottomSheet bottomSheet, final Theme.ResourcesProvider resourcesProvider, View view, long j, final Context context, final TL_payments.connectedBotStarRef connectedbotstarref, View view2) {
        long j2;
        ArrayList admined = BotStarsController.getInstance(i).getAdmined();
        admined.add(0, UserConfig.getInstance(i).getCurrentUser());
        ItemOptions makeOptions = ItemOptions.makeOptions(bottomSheet.getContainerView(), resourcesProvider, view);
        Iterator it = admined.iterator();
        while (it.hasNext()) {
            TLObject tLObject = (TLObject) it.next();
            if (tLObject instanceof TLRPC.User) {
                j2 = ((TLRPC.User) tLObject).id;
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                    j2 = -chat.id;
                }
            }
            final long j3 = j2;
            makeOptions.addChat(tLObject, j3 == j, new Runnable() {
                @Override
                public final void run() {
                    ChannelAffiliateProgramsFragment.lambda$showShareAffiliateAlert$28(i, context, j3, connectedbotstarref, bottomSheet, resourcesProvider);
                }
            });
        }
        makeOptions.setDrawScrim(false).setDimAlpha(0).setGravity(5).translate(AndroidUtilities.dp(24.0f), 0.0f).show();
    }

    public static void lambda$showShareAffiliateAlert$28(final int i, final Context context, final long j, final TL_payments.connectedBotStarRef connectedbotstarref, final BottomSheet bottomSheet, final Theme.ResourcesProvider resourcesProvider) {
        BotStarsController.getInstance(i).getConnectedBot(context, j, connectedbotstarref.bot_id, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChannelAffiliateProgramsFragment.lambda$showShareAffiliateAlert$27(i, connectedbotstarref, bottomSheet, context, j, resourcesProvider, (TL_payments.connectedBotStarRef) obj);
            }
        });
    }

    public static void lambda$showShareAffiliateAlert$27(final int i, TL_payments.connectedBotStarRef connectedbotstarref, final BottomSheet bottomSheet, final Context context, final long j, final Theme.ResourcesProvider resourcesProvider, TL_payments.connectedBotStarRef connectedbotstarref2) {
        if (connectedbotstarref2 == null) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(connectedbotstarref.bot_id));
            if (user != null) {
                MessagesController.getInstance(i).loadFullUser(user, 0, true, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        ChannelAffiliateProgramsFragment.lambda$showShareAffiliateAlert$26(BottomSheet.this, context, i, j, resourcesProvider, (TLRPC.UserFull) obj);
                    }
                });
                return;
            }
            return;
        }
        bottomSheet.dismiss();
        showShareAffiliateAlert(context, i, connectedbotstarref2, j, resourcesProvider);
    }

    public static void lambda$showShareAffiliateAlert$26(final BottomSheet bottomSheet, final Context context, final int i, final long j, final Theme.ResourcesProvider resourcesProvider, final TLRPC.UserFull userFull) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChannelAffiliateProgramsFragment.lambda$showShareAffiliateAlert$25(TLRPC.UserFull.this, bottomSheet, context, i, j, resourcesProvider);
            }
        });
    }

    public static void lambda$showShareAffiliateAlert$25(TLRPC.UserFull userFull, BottomSheet bottomSheet, Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        if (userFull == null || userFull.starref_program == null) {
            return;
        }
        bottomSheet.dismiss();
        showConnectAffiliateAlert(context, i, userFull.starref_program, j, resourcesProvider, true);
    }

    public static void lambda$showShareAffiliateAlert$30(BottomSheet bottomSheet, TL_payments.connectedBotStarRef connectedbotstarref, View view) {
        bottomSheet.dismiss();
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ProfileActivity.of(connectedbotstarref.bot_id));
        }
    }
}
