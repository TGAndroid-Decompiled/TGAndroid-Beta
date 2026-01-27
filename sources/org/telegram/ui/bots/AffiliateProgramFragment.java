package org.telegram.ui.bots;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.GradientHeaderActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class AffiliateProgramFragment extends GradientHeaderActivity implements NotificationCenter.NotificationCenterDelegate {
    private FrameLayout aboveTitleView;
    private UniversalAdapter adapter;
    private boolean attached;
    private final long bot_id;
    private ButtonWithCounterView button;
    private LinearLayout buttonLayout;
    private LinkSpanDrawable.LinksTextView buttonSubtext;
    private View emptyLayout;
    private GLIconTextureView iconTextureView;
    private TL_payments.starRefProgram initialProgram;
    private boolean new_program;
    private TL_payments.starRefProgram program;
    private final Runnable updateTimerRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.lambda$new$7();
        }
    };
    private String[] durationTexts = null;
    private final List durationValues = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
    }

    public AffiliateProgramFragment(long j) {
        this.bot_id = j;
        setWhiteBackground(true);
        setMinusHeaderHeight(AndroidUtilities.dp(60.0f));
    }

    @Override
    public View createView(final Context context) {
        this.useFillLastLayoutManager = false;
        this.particlesViewHeight = AndroidUtilities.dp(238.0f);
        View view = new View(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                int iDp;
                AffiliateProgramFragment affiliateProgramFragment = AffiliateProgramFragment.this;
                if (affiliateProgramFragment.isLandscapeMode) {
                    iDp = (affiliateProgramFragment.statusBarHeight + ((BaseFragment) affiliateProgramFragment).actionBar.getMeasuredHeight()) - AndroidUtilities.dp(16.0f);
                } else {
                    int iDp2 = AndroidUtilities.dp(140.0f);
                    AffiliateProgramFragment affiliateProgramFragment2 = AffiliateProgramFragment.this;
                    int i3 = iDp2 + affiliateProgramFragment2.statusBarHeight;
                    if (affiliateProgramFragment2.backgroundView.getMeasuredHeight() + AndroidUtilities.dp(24.0f) > i3) {
                        iDp = AndroidUtilities.dp(24.0f) + AffiliateProgramFragment.this.backgroundView.getMeasuredHeight();
                    } else {
                        iDp = i3;
                    }
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (iDp - (((GradientHeaderActivity) AffiliateProgramFragment.this).yOffset * 2.5f)), 1073741824));
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
        this.aboveTitleView.addView(this.iconTextureView, LayoutHelper.createFrame(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        configureHeader(LocaleController.getString(R.string.BotAffiliateProgramTitle), LocaleController.getString(R.string.BotAffiliateProgramText), this.aboveTitleView, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttonLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.buttonLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
        View view2 = new View(context);
        view2.setBackgroundColor(getThemedColor(Theme.key_divider));
        this.buttonLayout.addView(view2, LayoutHelper.createLinear(-1.0f, 1.0f / AndroidUtilities.density));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourceProvider) {
            @Override
            protected boolean subTextSplitToWords() {
                return false;
            }
        };
        this.button = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.AffiliateProgramStart), false);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                this.f$0.lambda$createView$4(context, view3);
            }
        });
        this.buttonLayout.addView(this.button, LayoutHelper.createLinear(-1, 48, 10.0f, 10.0f, 10.0f, 7.0f));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, this.resourceProvider);
        this.buttonSubtext = linksTextView;
        linksTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
        this.buttonSubtext.setLinkTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
        this.buttonSubtext.setTextSize(1, 12.0f);
        this.buttonSubtext.setGravity(17);
        this.buttonLayout.addView(this.buttonSubtext, LayoutHelper.createLinear(-1, -2, 32.0f, 1.0f, 32.0f, 8.0f));
        update(false);
        ((FrameLayout) this.fragmentView).addView(this.buttonLayout, LayoutHelper.createFrame(-1, -2, 87));
        this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view3, int i) {
                this.f$0.lambda$createView$5(view3, i);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.listView.setItemAnimator(defaultItemAnimator);
        return this.fragmentView;
    }

    public void lambda$createView$4(Context context, View view) {
        if (this.button.isEnabled()) {
            FrameLayout frameLayout = new FrameLayout(context);
            TableView tableView = new TableView(context, this.resourceProvider);
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$2();
                }
            };
            tableView.addRow(LocaleController.getString(R.string.AffiliateProgramCommission), percents(this.program.commission_permille));
            String string = LocaleController.getString(R.string.AffiliateProgramDuration);
            int i = this.program.duration_months;
            tableView.addRow(string, i <= 0 ? LocaleController.getString(R.string.Infinity) : (i < 12 || i % 12 != 0) ? LocaleController.formatPluralString("Months", i, new Object[0]) : LocaleController.formatPluralString("Years", i / 12, new Object[0]));
            frameLayout.addView(tableView, LayoutHelper.createFrame(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
            new AlertDialog.Builder(context, this.resourceProvider).setTitle(LocaleController.getString(R.string.AffiliateProgramAlert)).setMessage(LocaleController.getString(this.new_program ? R.string.AffiliateProgramStartAlertText : R.string.AffiliateProgramUpdateAlertText)).setView(frameLayout).setPositiveButton(LocaleController.getString(this.new_program ? R.string.AffiliateProgramStartAlertButton : R.string.AffiliateProgramUpdateAlertButton), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    runnable.run();
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
        }
    }

    public void lambda$createView$2() {
        TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
        updatestarrefprogram.bot = getMessagesController().getInputUser(this.bot_id);
        TL_payments.starRefProgram starrefprogram = this.program;
        updatestarrefprogram.commission_permille = starrefprogram.commission_permille;
        int i = starrefprogram.duration_months;
        updatestarrefprogram.duration_months = i;
        if (i > 0) {
            updatestarrefprogram.flags |= 1;
            starrefprogram.duration_months = i | 1;
        } else {
            updatestarrefprogram.flags &= -2;
            starrefprogram.duration_months = i & (-2);
        }
        final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
        alertDialog.showDelayed(150L);
        getConnectionsManager().sendRequest(updatestarrefprogram, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$createView$1(alertDialog, tLObject, tL_error);
            }
        });
    }

    public void lambda$createView$1(final AlertDialog alertDialog, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$0(alertDialog, tLObject, tL_error);
            }
        });
    }

    public void lambda$createView$0(AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                BulletinFactory.showError(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull userFull = getMessagesController().getUserFull(this.bot_id);
        if (userFull != null) {
            userFull.starref_program = starrefprogram;
            getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(this.bot_id), userFull);
        }
        closeToProfile(false);
    }

    public void lambda$createView$5(View view, int i) {
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter == null) {
            return;
        }
        int i2 = universalAdapter.getItem(i).id;
        if (i2 == 4) {
            end();
        } else if (i2 == 2) {
            presentFragment(new SuggestedAffiliateProgramsFragment(this.bot_id));
        }
    }

    private void closeToProfile(boolean z) {
        BaseFragment backgroundFragment = null;
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            INavigationLayout parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size <= 0) {
                    size = -1;
                    break;
                }
                BaseFragment baseFragment = (BaseFragment) fragmentStack.get(size);
                if ((baseFragment instanceof ProfileActivity) && ((ProfileActivity) baseFragment).getDialogId() == this.bot_id) {
                    backgroundFragment = baseFragment;
                    break;
                }
                size--;
            }
            if (backgroundFragment != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    parentLayout.removeFragmentFromStack((BaseFragment) fragmentStack.get(size2));
                }
                finishFragment();
            } else {
                finishFragment();
                backgroundFragment = parentLayout.getBackgroundFragment();
            }
        } else {
            finishFragment();
        }
        if (backgroundFragment != null) {
            if (z) {
                BulletinFactory.of(backgroundFragment).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText))).show();
            } else {
                BulletinFactory.of(backgroundFragment).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText)).show();
            }
        }
    }

    private void update(boolean z) {
        this.button.setText(LocaleController.getString((this.new_program || this.program.end_date != 0) ? R.string.AffiliateProgramStart : R.string.AffiliateProgramUpdate), z);
        AndroidUtilities.cancelRunOnUIThread(this.updateTimerRunnable);
        this.updateTimerRunnable.run();
        this.buttonSubtext.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString((this.new_program || this.program.end_date != 0) ? R.string.AffiliateProgramStartInfo : R.string.AffiliateProgramUpdateInfo), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$update$6();
            }
        }));
        updateEnabled();
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(z);
        }
    }

    public void lambda$update$6() {
        Browser.openUrl(getContext(), LocaleController.getString((this.new_program || this.program.end_date != 0) ? R.string.AffiliateProgramUpdateInfoLink : R.string.AffiliateProgramStartInfoLink));
    }

    public void lambda$new$7() {
        this.button.setSubText(this.program.end_date == 0 ? null : SelectorUserCell.buildCountDownTime((r1 - getConnectionsManager().getCurrentTime()) * 1000), true);
        if (this.program.end_date == 0 || !this.attached) {
            return;
        }
        AndroidUtilities.runOnUIThread(this.updateTimerRunnable, 1000L);
    }

    private void updateEnabled() {
        TL_payments.starRefProgram starrefprogram;
        ButtonWithCounterView buttonWithCounterView = this.button;
        TL_payments.starRefProgram starrefprogram2 = this.program;
        buttonWithCounterView.setEnabled(starrefprogram2.end_date == 0 && !((starrefprogram = this.initialProgram) != null && starrefprogram.commission_permille == starrefprogram2.commission_permille && starrefprogram.duration_months == starrefprogram2.duration_months));
    }

    private class BulletinTextView extends TextView {
        public BulletinTextView(Context context) {
            super(context);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            canvas.drawCircle(AndroidUtilities.dp(3.5f), AndroidUtilities.dp(11.5f), AndroidUtilities.dp(2.5f), getPaint());
        }
    }

    private void end() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 16.0f);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i, this.resourceProvider));
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText)));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 17.0f));
        BulletinTextView bulletinTextView = new BulletinTextView(getContext());
        bulletinTextView.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        bulletinTextView.setTextSize(1, 16.0f);
        bulletinTextView.setTextColor(Theme.getColor(i, this.resourceProvider));
        bulletinTextView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
        linearLayout.addView(bulletinTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 17.0f));
        BulletinTextView bulletinTextView2 = new BulletinTextView(getContext());
        bulletinTextView2.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        bulletinTextView2.setTextSize(1, 16.0f);
        bulletinTextView2.setTextColor(Theme.getColor(i, this.resourceProvider));
        bulletinTextView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
        linearLayout.addView(bulletinTextView2, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 17.0f));
        BulletinTextView bulletinTextView3 = new BulletinTextView(getContext());
        bulletinTextView3.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        bulletinTextView3.setTextSize(1, 16.0f);
        bulletinTextView3.setTextColor(Theme.getColor(i, this.resourceProvider));
        bulletinTextView3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
        linearLayout.addView(bulletinTextView3, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 10.0f));
        new AlertDialog.Builder(getContext(), this.resourceProvider).setTitle(LocaleController.getString(R.string.AffiliateProgramAlert)).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.AffiliateProgramStopButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                this.f$0.lambda$end$10(alertDialog, i2);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
    }

    public void lambda$end$10(AlertDialog alertDialog, int i) {
        TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
        updatestarrefprogram.bot = getMessagesController().getInputUser(this.bot_id);
        updatestarrefprogram.commission_permille = 0;
        final AlertDialog alertDialog2 = new AlertDialog(getContext(), 3);
        alertDialog2.showDelayed(150L);
        getConnectionsManager().sendRequest(updatestarrefprogram, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$end$9(alertDialog2, tLObject, tL_error);
            }
        });
    }

    public void lambda$end$9(final AlertDialog alertDialog, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$end$8(alertDialog, tLObject, tL_error);
            }
        });
    }

    public void lambda$end$8(AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                BulletinFactory.showError(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull userFull = getMessagesController().getUserFull(this.bot_id);
        if (userFull != null) {
            TL_payments.starRefProgram starrefprogram2 = this.program;
            starrefprogram2.flags |= 2;
            starrefprogram2.end_date = getConnectionsManager().getCurrentTime() + (getConnectionsManager().isTestBackend() ? 300 : 86400);
            userFull.starref_program = starrefprogram;
            getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(this.bot_id), userFull);
        }
        closeToProfile(true);
    }

    public TL_payments.starRefProgram getDefaultProgram() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.clamp(50, getMessagesController().starrefMaxCommissionPermille, getMessagesController().starrefMinCommissionPermille);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        if (getContext() == null) {
            return;
        }
        arrayList.add(UItem.asFullyCustom(getHeader(getContext())));
        arrayList.add(FeatureCell.Factory.as(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
        arrayList.add(FeatureCell.Factory.as(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
        arrayList.add(FeatureCell.Factory.as(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
        arrayList.add(UItem.asShadow(1, null));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.AffiliateProgramCommission)));
        UItem uItemAsIntSlideView = UItem.asIntSlideView(1, getMessagesController().starrefMinCommissionPermille, this.program.commission_permille, getMessagesController().starrefMaxCommissionPermille, new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                return AffiliateProgramFragment.lambda$fillItems$11((Integer) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$fillItems$12((Integer) obj);
            }
        });
        TL_payments.starRefProgram starrefprogram = this.initialProgram;
        arrayList.add(uItemAsIntSlideView.setMinSliderValue(starrefprogram == null ? -1 : starrefprogram.commission_permille));
        arrayList.add(UItem.asShadow(LocaleController.getString(R.string.AffiliateProgramCommissionInfo)));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.AffiliateProgramDuration)));
        if (this.durationTexts == null) {
            this.durationTexts = new String[this.durationValues.size()];
            for (int i = 0; i < this.durationValues.size(); i++) {
                int iIntValue = ((Integer) this.durationValues.get(i)).intValue();
                if (iIntValue == 0) {
                    this.durationTexts[i] = LocaleController.getString(R.string.Infinity);
                } else if (iIntValue < 12 || iIntValue % 12 != 0) {
                    this.durationTexts[i] = LocaleController.formatPluralString("MonthsShort", iIntValue, new Object[0]);
                } else {
                    this.durationTexts[i] = LocaleController.formatPluralString("YearsShort", iIntValue / 12, new Object[0]);
                }
            }
        }
        UItem uItemAsSlideView = UItem.asSlideView(this.durationTexts, this.durationValues.indexOf(Integer.valueOf(this.program.duration_months)), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$fillItems$13((Integer) obj);
            }
        });
        TL_payments.starRefProgram starrefprogram2 = this.initialProgram;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                uItemAsSlideView.setMinSliderValue(this.durationValues.size() - 1);
            } else {
                int size = this.durationValues.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) this.durationValues.get(size)).intValue() > 0 && ((Integer) this.durationValues.get(size)).intValue() <= this.initialProgram.duration_months) {
                        uItemAsSlideView.setMinSliderValue(size);
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(uItemAsSlideView);
        arrayList.add(UItem.asShadow(LocaleController.getString(R.string.AffiliateProgramDurationInfo)));
        arrayList.add(ColorfulTextCell.Factory.as(2, getThemedColor(Theme.key_color_green), R.drawable.filled_earn_stars, LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle), LocaleController.getString(R.string.AffiliateProgramExistingProgramsText)));
        arrayList.add(UItem.asShadow(3, null));
        if (!this.new_program && this.program.end_date == 0) {
            arrayList.add(UItem.asButton(4, LocaleController.getString(R.string.AffiliateProgramStop)).red());
            arrayList.add(UItem.asShadow(5, null));
        }
        arrayList.add(UItem.asShadow(6, null));
        arrayList.add(UItem.asShadow(7, null));
    }

    public static CharSequence lambda$fillItems$11(Integer num) {
        return String.format(Locale.US, "%.1f%%", Float.valueOf(num.intValue() / 10.0f));
    }

    public void lambda$fillItems$12(Integer num) {
        this.program.commission_permille = num.intValue();
        updateEnabled();
    }

    public void lambda$fillItems$13(Integer num) {
        this.program.duration_months = ((Integer) this.durationValues.get(num.intValue())).intValue();
        updateEnabled();
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
            protected void configure() {
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
    public boolean onFragmentCreate() {
        this.attached = true;
        this.new_program = true;
        this.program = getDefaultProgram();
        this.initialProgram = null;
        TLRPC.UserFull userFull = getMessagesController().getUserFull(this.bot_id);
        if (userFull != null) {
            this.new_program = false;
            TL_payments.starRefProgram starrefprogram = userFull.starref_program;
            this.program = starrefprogram;
            if (starrefprogram == null) {
                this.new_program = true;
                this.program = getDefaultProgram();
                this.initialProgram = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.initialProgram = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.program;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.bot_id));
            if (user != null) {
                getMessagesController().loadFullUser(user, getClassGuid(), true, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$onFragmentCreate$15((TLRPC.UserFull) obj);
                    }
                });
            }
        }
        return super.onFragmentCreate();
    }

    public void lambda$onFragmentCreate$15(final TLRPC.UserFull userFull) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onFragmentCreate$14(userFull);
            }
        });
    }

    public void lambda$onFragmentCreate$14(TLRPC.UserFull userFull) {
        if (userFull != null) {
            this.new_program = false;
            TL_payments.starRefProgram starrefprogram = userFull.starref_program;
            this.program = starrefprogram;
            if (starrefprogram == null) {
                this.new_program = true;
                this.program = getDefaultProgram();
                this.initialProgram = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.initialProgram = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.program;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        }
        update(true);
    }

    @Override
    public void onFragmentDestroy() {
        this.attached = false;
        AndroidUtilities.cancelRunOnUIThread(this.updateTimerRunnable);
        super.onFragmentDestroy();
    }

    @Override
    protected View getHeader(Context context) {
        return super.getHeader(context);
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
    protected RecyclerView.Adapter createAdapter() {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.listView, getContext(), this.currentAccount, this.classGuid, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, getResourceProvider()) {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i == 42) {
                    HeaderCell headerCell = new HeaderCell(AffiliateProgramFragment.this.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, false, ((BaseFragment) AffiliateProgramFragment.this).resourceProvider);
                    headerCell.setHeight(25);
                    return new RecyclerListView.Holder(headerCell);
                }
                return super.onCreateViewHolder(viewGroup, i);
            }
        };
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    public static class FeatureCell extends FrameLayout {
        private ImageView imageView;
        private final Theme.ResourcesProvider resourcesProvider;
        private LinearLayout textLayout;
        private TextView textView;
        private TextView titleView;

        public FeatureCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            this(context, false, resourcesProvider);
        }

        public FeatureCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            ImageView imageView2 = this.imageView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.SRC_IN));
            addView(this.imageView, LayoutHelper.createFrame(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            addView(this.textLayout, LayoutHelper.createFrame(-1, -2.0f, 23, 64.0f, z ? 2.0f : 9.8f, 24.0f, z ? 4.0f : 9.8f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setTextSize(1, 14.0f);
            this.textLayout.addView(this.titleView, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 1));
            TextView textView2 = new TextView(context);
            this.textView = textView2;
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            this.textView.setTextSize(1, 14.0f);
            this.textLayout.addView(this.textView, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 0));
        }

        public void set(int i, CharSequence charSequence, CharSequence charSequence2) {
            this.imageView.setImageResource(i);
            this.titleView.setText(charSequence);
            this.textView.setText(charSequence2);
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
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
            public FeatureCell createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new FeatureCell(context, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((FeatureCell) view).set(uItem.iconResId, uItem.text, uItem.subtext);
            }

            public static UItem as(int i, CharSequence charSequence, CharSequence charSequence2) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.iconResId = i;
                uItemOfFactory.text = charSequence;
                uItemOfFactory.subtext = charSequence2;
                return uItemOfFactory;
            }
        }
    }

    @Override
    public int getNavigationBarColor() {
        return getThemedColor(Theme.key_windowBackgroundWhite);
    }

    public static class ColorfulTextCell extends FrameLayout {
        private final ImageView arrowView;
        private final ImageView imageView;
        private final FrameLayout.LayoutParams imageViewLayoutParams;
        private final TextView percentView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final LinearLayout textLayout;
        private final FrameLayout.LayoutParams textLayoutLayoutParams;
        private final TextView textView;
        private final TextView titleView;

        public ColorfulTextCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(28, 28.0f, 51, 17.0f, 14.33f, 0.0f, 0.0f);
            this.imageViewLayoutParams = layoutParamsCreateFrame;
            addView(imageView, layoutParamsCreateFrame);
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, -2.0f, 55, 62.0f, 10.0f, 40.0f, 8.66f);
            this.textLayoutLayoutParams = layoutParamsCreateFrame2;
            addView(linearLayout, layoutParamsCreateFrame2);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 15.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 0));
            TextView textView2 = new TextView(context);
            this.textView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 0, 3, 0, 0));
            ImageView imageView2 = new ImageView(context);
            this.arrowView = imageView2;
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_switchTrack, resourcesProvider), mode));
            imageView2.setImageResource(R.drawable.msg_arrowright);
            imageView2.setScaleType(scaleType);
            addView(imageView2, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.percentView = textView3;
            textView3.setTextColor(-1);
            textView3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(4.0f), Theme.getColor(Theme.key_color_green, resourcesProvider)));
            textView3.setTextSize(1, 13.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(4.0f), 0);
            textView3.setGravity(17);
            textView3.setVisibility(8);
            addView(textView3, LayoutHelper.createFrame(-2, 18.0f, 21, 0.0f, 0.0f, 35.33f, 0.0f));
        }

        public void set(int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
            this.imageView.setImageResource(i2);
            this.imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), i));
            this.titleView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence2)) {
                this.imageViewLayoutParams.topMargin = AndroidUtilities.dp(10.0f);
                this.imageViewLayoutParams.bottomMargin = AndroidUtilities.dp(10.0f);
                this.titleView.setTypeface(null);
                this.titleView.setTextSize(1, 16.0f);
                FrameLayout.LayoutParams layoutParams = this.textLayoutLayoutParams;
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                layoutParams.gravity = 23;
                this.textView.setVisibility(8);
                return;
            }
            this.imageViewLayoutParams.topMargin = AndroidUtilities.dp(14.33f);
            this.imageViewLayoutParams.bottomMargin = AndroidUtilities.dp(10.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setTextSize(1, 15.0f);
            this.textLayoutLayoutParams.topMargin = AndroidUtilities.dp(10.0f);
            this.textLayoutLayoutParams.bottomMargin = AndroidUtilities.dp(8.66f);
            this.textLayoutLayoutParams.gravity = 55;
            this.textView.setText(charSequence2);
            this.textView.setVisibility(0);
        }

        public void setPercent(CharSequence charSequence) {
            if (TextUtils.isEmpty(charSequence)) {
                this.percentView.setVisibility(8);
            } else {
                this.percentView.setVisibility(0);
                this.percentView.setText(charSequence);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public ColorfulTextCell createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new ColorfulTextCell(context, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((ColorfulTextCell) view).set(uItem.intValue, uItem.iconResId, uItem.text, uItem.subtext);
            }

            public static UItem as(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = i;
                uItemOfFactory.intValue = i2;
                uItemOfFactory.iconResId = i3;
                uItemOfFactory.text = charSequence;
                uItemOfFactory.subtext = charSequence2;
                return uItemOfFactory;
            }
        }
    }

    public static CharSequence percents(int i) {
        float f = i / 10.0f;
        return ((float) ((int) f)) == f ? String.format(Locale.US, "%d%%", Integer.valueOf(i / 10)) : String.format(Locale.US, "%.1f%%", Float.valueOf(f));
    }
}
