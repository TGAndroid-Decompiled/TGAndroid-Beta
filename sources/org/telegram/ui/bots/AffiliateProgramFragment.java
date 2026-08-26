package org.telegram.ui.bots;

import android.content.Context;
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
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline1;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.MentionCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.GradientHeaderActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TON.TONIntroActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20;
import org.telegram.ui.iv.RichEditor$3$$ExternalSyntheticLambda0;

public final class AffiliateProgramFragment extends GradientHeaderActivity implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout aboveTitleView;
    public AnonymousClass4 adapter;
    public boolean attached;
    public final long bot_id;
    public ButtonWithCounterView button;
    public LinearLayout buttonLayout;
    public LinkSpanDrawable.LinksTextView buttonSubtext;
    public GLIconTextureView iconTextureView;
    public TL_payments.starRefProgram initialProgram;
    public boolean new_program;
    public TL_payments.starRefProgram program;
    public final AffiliateProgramFragment$$ExternalSyntheticLambda4 updateTimerRunnable = new AffiliateProgramFragment$$ExternalSyntheticLambda4(this, 0);
    public String[] durationTexts = null;
    public final List durationValues = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public final class AnonymousClass3 extends StarParticlesView {
        @Override
        public final void configure() {
            super.configure();
            StarParticlesView.Drawable drawable = this.drawable;
            drawable.useGradient = true;
            drawable.useBlur = false;
            drawable.forceMaxAlpha = true;
            drawable.checkBounds = true;
            drawable.init();
        }

        @Override
        public final int getStarsRectWidth() {
            return getMeasuredWidth();
        }
    }

    public final class ColorfulTextCell extends FrameLayout {
        public final ImageView imageView;
        public final FrameLayout.LayoutParams imageViewLayoutParams;
        public final TextView percentView;
        public final Theme.ResourcesProvider resourcesProvider;
        public final FrameLayout.LayoutParams textLayoutLayoutParams;
        public final TextView textView;
        public final TextView titleView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((ColorfulTextCell) view).set(uItem.intValue, uItem.iconResId, uItem.text, uItem.subtext);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new ColorfulTextCell(context, resourcesProvider);
            }
        }

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
            linearLayout.setOrientation(1);
            FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, -2.0f, 55, 62.0f, 10.0f, 40.0f, 8.66f);
            this.textLayoutLayoutParams = layoutParamsCreateFrame2;
            addView(linearLayout, layoutParamsCreateFrame2);
            TextView textView = new TextView(context);
            this.titleView = textView;
            AccountFrozenAlert$$ExternalSyntheticOutline1.m(15.0f, 1, textView);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 0), context);
            this.textView = textViewM;
            textViewM.setTextSize(1, 14.0f);
            textViewM.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 55, 0, 3, 0, 0));
            ImageView imageView2 = new ImageView(context);
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_switchTrack, resourcesProvider), mode));
            imageView2.setImageResource(R.drawable.msg_arrowright);
            imageView2.setScaleType(scaleType);
            addView(imageView2, LayoutHelper.createFrame(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.percentView = textView2;
            textView2.setTextColor(-1);
            textView2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(4.0f), Theme.getColor(Theme.key_color_green, resourcesProvider)));
            textView2.setTextSize(1, 13.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(4.0f), 0);
            textView2.setGravity(17);
            textView2.setVisibility(8);
            addView(textView2, LayoutHelper.createFrame(-2, 18.0f, 21, 0.0f, 0.0f, 35.33f, 0.0f));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public final void set(int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
            ImageView imageView = this.imageView;
            imageView.setImageResource(i2);
            imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), i));
            TextView textView = this.titleView;
            textView.setText(charSequence);
            boolean zIsEmpty = TextUtils.isEmpty(charSequence2);
            TextView textView2 = this.textView;
            FrameLayout.LayoutParams layoutParams = this.textLayoutLayoutParams;
            FrameLayout.LayoutParams layoutParams2 = this.imageViewLayoutParams;
            if (zIsEmpty) {
                layoutParams2.topMargin = AndroidUtilities.dp(10.0f);
                layoutParams2.bottomMargin = AndroidUtilities.dp(10.0f);
                textView.setTypeface(null);
                textView.setTextSize(1, 16.0f);
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                layoutParams.gravity = 23;
                textView2.setVisibility(8);
                return;
            }
            layoutParams2.topMargin = AndroidUtilities.dp(14.33f);
            layoutParams2.bottomMargin = AndroidUtilities.dp(10.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 15.0f);
            layoutParams.topMargin = AndroidUtilities.dp(10.0f);
            layoutParams.bottomMargin = AndroidUtilities.dp(8.66f);
            layoutParams.gravity = 55;
            textView2.setText(charSequence2);
            textView2.setVisibility(0);
        }

        public void setPercent(CharSequence charSequence) {
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            TextView textView = this.percentView;
            if (zIsEmpty) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence);
            }
        }
    }

    public final class FeatureCell extends FrameLayout {
        public final ImageView imageView;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView textView;
        public final TextView titleView;

        public final class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem as(int i, String str, String str2) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.iconResId = i;
                uItemOfFactory.text = str;
                uItemOfFactory.subtext = str2;
                return uItemOfFactory;
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((FeatureCell) view).set(uItem.iconResId, uItem.text, uItem.subtext);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new FeatureCell(context, false, resourcesProvider);
            }

            @Override
            public final boolean isClickable() {
                return false;
            }
        }

        public FeatureCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.SRC_IN));
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 23, 64.0f, z ? 2.0f : 9.8f, 24.0f, z ? 4.0f : 9.8f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextColor(Theme.getColor(i, resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 1), context);
            this.textView = textViewM;
            OKLCH.m(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider, textViewM, 14.0f);
            linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 0));
        }

        public final void set(int i, CharSequence charSequence, CharSequence charSequence2) {
            this.imageView.setImageResource(i);
            this.titleView.setText(charSequence);
            this.textView.setText(charSequence2);
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }
    }

    public AffiliateProgramFragment(long j) {
        this.bot_id = j;
        setWhiteBackground(true);
        setMinusHeaderHeight(AndroidUtilities.dp(60.0f));
    }

    public static String percents(int i) {
        float f = i / 10.0f;
        if (((int) f) != f) {
            return String.format(Locale.US, "%.1f%%", Float.valueOf(f));
        }
        Locale locale = Locale.US;
        return RendererCapabilities.CC.m(i / 10, "%");
    }

    public final void closeToProfile(boolean z) {
        BaseFragment backgroundFragment = null;
        if (getParentLayout() == null || ((ActionBarLayout) getParentLayout()).getFragmentStack() == null) {
            finishFragment();
        } else {
            ActionBarLayout actionBarLayout = (ActionBarLayout) getParentLayout();
            List<BaseFragment> fragmentStack = actionBarLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size <= 0) {
                    size = -1;
                    break;
                }
                BaseFragment baseFragment = fragmentStack.get(size);
                if ((baseFragment instanceof ProfileActivity) && ((ProfileActivity) baseFragment).getDialogId() == this.bot_id) {
                    backgroundFragment = baseFragment;
                    break;
                }
                size--;
            }
            if (backgroundFragment != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    actionBarLayout.removeFragmentFromStack(fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                backgroundFragment = actionBarLayout.getBackgroundFragment();
            }
        }
        if (backgroundFragment != null) {
            if (z) {
                BulletinFactory.of(backgroundFragment).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText))).show();
            } else {
                BulletinFactory.of(backgroundFragment).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText)).show();
            }
        }
    }

    @Override
    public final RecyclerView.Adapter createAdapter() {
        ?? r0 = new UniversalAdapter(this.listView, getContext(), this.currentAccount, this.classGuid, new BotDownloads$$ExternalSyntheticLambda0(this, 8), getResourceProvider()) {
            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i != 42) {
                    return super.onCreateViewHolder(viewGroup, i);
                }
                AffiliateProgramFragment affiliateProgramFragment = AffiliateProgramFragment.this;
                HeaderCell headerCell = new HeaderCell(affiliateProgramFragment.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, 0, false, false, ((BaseFragment) affiliateProgramFragment).resourceProvider);
                headerCell.setHeight(25);
                return new RecyclerListView.Holder(headerCell);
            }
        };
        this.adapter = r0;
        return r0;
    }

    @Override
    public final StarParticlesView createParticlesView() {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(getContext());
        anonymousClass3.setClipWithGradient();
        return anonymousClass3;
    }

    @Override
    public final View createView(Context context) {
        this.useFillLastLayoutManager = false;
        this.particlesViewHeight = AndroidUtilities.dp(238.0f);
        new View(context) {
            @Override
            public final void onMeasure(int i, int i2) {
                int iDp;
                AffiliateProgramFragment affiliateProgramFragment = AffiliateProgramFragment.this;
                if (affiliateProgramFragment.isLandscapeMode) {
                    iDp = (((BaseFragment) affiliateProgramFragment).actionBar.getMeasuredHeight() + affiliateProgramFragment.statusBarHeight) - AndroidUtilities.dp(16.0f);
                } else {
                    iDp = affiliateProgramFragment.statusBarHeight + AndroidUtilities.dp(140.0f);
                    if (AndroidUtilities.dp(24.0f) + affiliateProgramFragment.backgroundView.getMeasuredHeight() > iDp) {
                        iDp = AndroidUtilities.dp(24.0f) + affiliateProgramFragment.backgroundView.getMeasuredHeight();
                    }
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (iDp - (((GradientHeaderActivity) affiliateProgramFragment).yOffset * 2.5f)), 1073741824));
            }
        }.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackgroundGray, false));
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
        View view = new View(context);
        view.setBackgroundColor(getThemedColor(Theme.key_divider));
        this.buttonLayout.addView(view, LayoutHelper.createLinear(-1.0f, 1.0f / AndroidUtilities.density));
        int i = 2;
        ButtonWithCounterView round = new BotStarsActivity.AnonymousClass6(context, i, this.resourceProvider, true).setRound();
        this.button = round;
        round.setText(LocaleController.getString(R.string.AffiliateProgramStart), false);
        this.button.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(20, this, context));
        this.buttonLayout.addView(this.button, LayoutHelper.createLinear(-1, 48, 10.0f, 10.0f, 10.0f, 7.0f));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, this.resourceProvider);
        this.buttonSubtext = linksTextView;
        linksTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
        this.buttonSubtext.setLinkTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
        this.buttonSubtext.setTextSize(1, 12.0f);
        this.buttonSubtext.setGravity(17);
        this.buttonLayout.addView(this.buttonSubtext, LayoutHelper.createLinear(-1, -2, 32.0f, 1.0f, 32.0f, 8.0f));
        update$2(false);
        ((FrameLayout) this.fragmentView).addView(this.buttonLayout, LayoutHelper.createFrame(-1, -2, 87));
        this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.listView.setOnItemClickListener(new TONIntroActivity$$ExternalSyntheticLambda3(this, 17));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
    }

    public final void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        int i = 2;
        int i2 = 1;
        if (getContext() == null) {
            return;
        }
        arrayList.add(UItem.asFullyCustom(super.getHeader(getContext())));
        arrayList.add(FeatureCell.Factory.as(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
        arrayList.add(FeatureCell.Factory.as(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
        arrayList.add(FeatureCell.Factory.as(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
        arrayList.add(UItem.asShadow(1, null));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.AffiliateProgramCommission)));
        UItem uItemAsIntSlideView = UItem.asIntSlideView(1, getMessagesController().starrefMinCommissionPermille, this.program.commission_permille, getMessagesController().starrefMaxCommissionPermille, new AffiliateProgramFragment$$ExternalSyntheticLambda6(), new AffiliateProgramFragment$$ExternalSyntheticLambda0(this, i2));
        TL_payments.starRefProgram starrefprogram = this.initialProgram;
        arrayList.add(uItemAsIntSlideView.setMinSliderValue(starrefprogram == null ? -1 : starrefprogram.commission_permille));
        zzkf.m(R.string.AffiliateProgramCommissionInfo, arrayList);
        zzke.m(R.string.AffiliateProgramDuration, arrayList);
        String[] strArr = this.durationTexts;
        List list = this.durationValues;
        if (strArr == null) {
            this.durationTexts = new String[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                if (iIntValue == 0) {
                    this.durationTexts[i3] = LocaleController.getString(R.string.Infinity);
                } else if (iIntValue < 12 || iIntValue % 12 != 0) {
                    this.durationTexts[i3] = LocaleController.formatPluralString("MonthsShort", iIntValue, new Object[0]);
                } else {
                    this.durationTexts[i3] = LocaleController.formatPluralString("YearsShort", iIntValue / 12, new Object[0]);
                }
            }
        }
        UItem uItemAsSlideView = UItem.asSlideView(this.durationTexts, list.indexOf(Integer.valueOf(this.program.duration_months)), new AffiliateProgramFragment$$ExternalSyntheticLambda0(this, i));
        TL_payments.starRefProgram starrefprogram2 = this.initialProgram;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months > 0) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.initialProgram.duration_months) {
                        uItemAsSlideView.setMinSliderValue(size);
                        break;
                    }
                }
            } else {
                uItemAsSlideView.setMinSliderValue(list.size() - 1);
            }
        }
        arrayList.add(uItemAsSlideView);
        zzkf.m(R.string.AffiliateProgramDurationInfo, arrayList);
        int themedColor = getThemedColor(Theme.key_color_green);
        int i4 = R.drawable.filled_earn_stars;
        String string = LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle);
        String string2 = LocaleController.getString(R.string.AffiliateProgramExistingProgramsText);
        int i5 = ColorfulTextCell.Factory.$r8$clinit;
        UItem uItemOfFactory = UItem.ofFactory(ColorfulTextCell.Factory.class);
        uItemOfFactory.id = 2;
        uItemOfFactory.intValue = themedColor;
        uItemOfFactory.iconResId = i4;
        uItemOfFactory.text = string;
        uItemOfFactory.subtext = string2;
        arrayList.add(uItemOfFactory);
        arrayList.add(UItem.asShadow(3, null));
        if (!this.new_program && this.program.end_date == 0) {
            arrayList.add(UItem.asButton(4, LocaleController.getString(R.string.AffiliateProgramStop)).red());
            arrayList.add(UItem.asShadow(5, null));
        }
        arrayList.add(UItem.asShadow(6, null));
        arrayList.add(UItem.asShadow(7, null));
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(Theme.key_windowBackgroundWhite);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$0(AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                BulletinFactory.showError(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        MessagesController messagesController = getMessagesController();
        long j = this.bot_id;
        TLRPC.UserFull userFull = messagesController.getUserFull(j);
        if (userFull != null) {
            userFull.starref_program = starrefprogram;
            getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
        }
        closeToProfile(false);
    }

    public final void lambda$createView$4$1(Context context) {
        String pluralString;
        if (this.button.isEnabled()) {
            FrameLayout frameLayout = new FrameLayout(context);
            TableView tableView = new TableView(context, this.resourceProvider);
            AffiliateProgramFragment$$ExternalSyntheticLambda4 affiliateProgramFragment$$ExternalSyntheticLambda4 = new AffiliateProgramFragment$$ExternalSyntheticLambda4(this, 2);
            tableView.addRow(LocaleController.getString(R.string.AffiliateProgramCommission), percents(this.program.commission_permille));
            String string = LocaleController.getString(R.string.AffiliateProgramDuration);
            int i = this.program.duration_months;
            if (i <= 0) {
                pluralString = LocaleController.getString(R.string.Infinity);
            } else {
                pluralString = (i < 12 || i % 12 != 0) ? LocaleController.formatPluralString("Months", i, new Object[0]) : LocaleController.formatPluralString("Years", i / 12, new Object[0]);
            }
            tableView.addRow(string, pluralString);
            frameLayout.addView(tableView, LayoutHelper.createFrame(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
            new AlertDialog.Builder(context, 0, this.resourceProvider).setTitle(LocaleController.getString(R.string.AffiliateProgramAlert)).setMessage(LocaleController.getString(this.new_program ? R.string.AffiliateProgramStartAlertText : R.string.AffiliateProgramUpdateAlertText)).setView(frameLayout).setPositiveButton(LocaleController.getString(this.new_program ? R.string.AffiliateProgramStartAlertButton : R.string.AffiliateProgramUpdateAlertButton), new RichEditor$3$$ExternalSyntheticLambda0(affiliateProgramFragment$$ExternalSyntheticLambda4, 4)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
        }
    }

    public final void lambda$createView$5(int i) {
        AnonymousClass4 anonymousClass4 = this.adapter;
        if (anonymousClass4 == null) {
            return;
        }
        int i2 = anonymousClass4.getItem(i).id;
        if (i2 != 4) {
            if (i2 == 2) {
                presentFragment(new SuggestedAffiliateProgramsFragment(this.bot_id));
                return;
            }
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 16.0f);
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i3, this.resourceProvider));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.AffiliateProgramStopText, textView);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 17.0f));
        MentionCell.AnonymousClass1 anonymousClass1 = new MentionCell.AnonymousClass1(getContext(), 7);
        anonymousClass1.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        anonymousClass1.setTextSize(1, 16.0f);
        anonymousClass1.setTextColor(Theme.getColor(i3, this.resourceProvider));
        anonymousClass1.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
        linearLayout.addView(anonymousClass1, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 17.0f));
        MentionCell.AnonymousClass1 anonymousClass2 = new MentionCell.AnonymousClass1(getContext(), 7);
        anonymousClass2.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        anonymousClass2.setTextSize(1, 16.0f);
        anonymousClass2.setTextColor(Theme.getColor(i3, this.resourceProvider));
        anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
        linearLayout.addView(anonymousClass2, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 17.0f));
        MentionCell.AnonymousClass1 anonymousClass3 = new MentionCell.AnonymousClass1(getContext(), 7);
        anonymousClass3.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        anonymousClass3.setTextSize(1, 16.0f);
        anonymousClass3.setTextColor(Theme.getColor(i3, this.resourceProvider));
        anonymousClass3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
        linearLayout.addView(anonymousClass3, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 10.0f));
        new AlertDialog.Builder(getContext(), 0, this.resourceProvider).setTitle(LocaleController.getString(R.string.AffiliateProgramAlert)).setView(linearLayout).setPositiveButton(LocaleController.getString(R.string.AffiliateProgramStopButton), new RichEditor$3$$ExternalSyntheticLambda0(this, 5)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
    }

    public final void lambda$end$8(AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                BulletinFactory.showError(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        MessagesController messagesController = getMessagesController();
        long j = this.bot_id;
        TLRPC.UserFull userFull = messagesController.getUserFull(j);
        if (userFull != null) {
            TL_payments.starRefProgram starrefprogram2 = this.program;
            starrefprogram2.flags |= 2;
            starrefprogram2.end_date = getConnectionsManager().getCurrentTime() + (getConnectionsManager().isTestBackend() ? 300 : 86400);
            userFull.starref_program = starrefprogram;
            getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j), userFull);
        }
        closeToProfile(true);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.attached = true;
        this.new_program = true;
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.clamp(50, getMessagesController().starrefMaxCommissionPermille, getMessagesController().starrefMinCommissionPermille);
        starrefprogram.duration_months = 1;
        this.program = starrefprogram;
        this.initialProgram = null;
        MessagesController messagesController = getMessagesController();
        long j = this.bot_id;
        TLRPC.UserFull userFull = messagesController.getUserFull(j);
        if (userFull != null) {
            this.new_program = false;
            TL_payments.starRefProgram starrefprogram2 = userFull.starref_program;
            this.program = starrefprogram2;
            if (starrefprogram2 == null) {
                this.new_program = true;
                TL_payments.starRefProgram starrefprogram3 = new TL_payments.starRefProgram();
                starrefprogram3.commission_permille = Utilities.clamp(50, getMessagesController().starrefMaxCommissionPermille, getMessagesController().starrefMinCommissionPermille);
                starrefprogram3.duration_months = 1;
                this.program = starrefprogram3;
                this.initialProgram = null;
            } else {
                TL_payments.starRefProgram starrefprogram4 = new TL_payments.starRefProgram();
                this.initialProgram = starrefprogram4;
                TL_payments.starRefProgram starrefprogram5 = this.program;
                starrefprogram4.commission_permille = starrefprogram5.commission_permille;
                starrefprogram4.duration_months = starrefprogram5.duration_months;
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j));
            if (user != null) {
                getMessagesController().loadFullUser(user, getClassGuid(), true, new AffiliateProgramFragment$$ExternalSyntheticLambda0(this, 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.attached = false;
        AndroidUtilities.cancelRunOnUIThread(this.updateTimerRunnable);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f) + i4);
        this.listView.setClipToPadding(false);
        this.buttonLayout.setPadding(0, 0, 0, i4);
    }

    @Override
    public final void onPause() {
        super.onPause();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(true);
            this.iconTextureView.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        GLIconTextureView gLIconTextureView = this.iconTextureView;
        if (gLIconTextureView != null) {
            gLIconTextureView.setPaused(false);
            this.iconTextureView.setDialogVisible(false);
        }
    }

    public final void update$2(boolean z) {
        this.button.setText(LocaleController.getString((this.new_program || this.program.end_date != 0) ? R.string.AffiliateProgramStart : R.string.AffiliateProgramUpdate), z);
        AffiliateProgramFragment$$ExternalSyntheticLambda4 affiliateProgramFragment$$ExternalSyntheticLambda4 = this.updateTimerRunnable;
        AndroidUtilities.cancelRunOnUIThread(affiliateProgramFragment$$ExternalSyntheticLambda4);
        affiliateProgramFragment$$ExternalSyntheticLambda4.run();
        this.buttonSubtext.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString((this.new_program || this.program.end_date != 0) ? R.string.AffiliateProgramStartInfo : R.string.AffiliateProgramUpdateInfo), new AffiliateProgramFragment$$ExternalSyntheticLambda4(this, 1)));
        updateEnabled();
        AnonymousClass4 anonymousClass4 = this.adapter;
        if (anonymousClass4 != null) {
            anonymousClass4.update(z);
        }
    }

    public final void updateEnabled() {
        TL_payments.starRefProgram starrefprogram;
        ButtonWithCounterView buttonWithCounterView = this.button;
        TL_payments.starRefProgram starrefprogram2 = this.program;
        buttonWithCounterView.setEnabled(starrefprogram2.end_date == 0 && !((starrefprogram = this.initialProgram) != null && starrefprogram.commission_permille == starrefprogram2.commission_permille && starrefprogram.duration_months == starrefprogram2.duration_months));
    }
}
