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
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.HeaderCell;
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
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda3;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda9;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda28;
import org.telegram.ui.iv.RichDetailsCell;

public final class AffiliateProgramFragment extends GradientHeaderActivity implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout aboveTitleView;
    public AnonymousClass4 adapter;
    public boolean attached;
    public final long bot_id;
    public BotStarsActivity.AnonymousClass6 button;
    public LinearLayout buttonLayout;
    public LinkSpanDrawable.LinksTextView buttonSubtext;
    public GLIconTextureView iconTextureView;
    public TL_payments.starRefProgram initialProgram;
    public boolean new_program;
    public TL_payments.starRefProgram program;
    public final AffiliateProgramFragment$$ExternalSyntheticLambda3 updateTimerRunnable = new AffiliateProgramFragment$$ExternalSyntheticLambda3(this, 0);
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
            zzkh.m(15.0f, textView);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 0), context);
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
                ((FeatureCell) view).set(uItem.text, uItem.subtext, uItem.iconResId);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new FeatureCell(context, resourcesProvider, false);
            }

            @Override
            public final boolean isClickable() {
                return false;
            }
        }

        public FeatureCell(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context);
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
            TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 1), context);
            this.textView = textViewM;
            OKLCH.m(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider, textViewM, 14.0f);
            linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 0));
        }

        public final void set(CharSequence charSequence, CharSequence charSequence2, int i) {
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
        this.whiteBackground = true;
        this.minusHeaderHeight = AndroidUtilities.dp(60.0f);
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
                BulletinFactory.of(backgroundFragment).createSimpleBulletin(LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText)), R.raw.linkbroken).show();
            } else {
                BulletinFactory.of(backgroundFragment).createSimpleBulletin(LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText), R.raw.contact_check).show();
            }
        }
    }

    @Override
    public final RecyclerView.Adapter createAdapter() {
        ?? r0 = new UniversalAdapter(this.listView, getParentActivity(), this.currentAccount, this.classGuid, new TodoItemMenu$$ExternalSyntheticLambda17(this, 8), getResourceProvider()) {
            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i != 42) {
                    return super.onCreateViewHolder(viewGroup, i);
                }
                AffiliateProgramFragment affiliateProgramFragment = AffiliateProgramFragment.this;
                HeaderCell headerCell = new HeaderCell(affiliateProgramFragment.getParentActivity(), Theme.key_windowBackgroundWhiteBlueHeader, 21, 0, 0, false, false, ((BaseFragment) affiliateProgramFragment).resourceProvider);
                headerCell.setHeight(25);
                return new RecyclerListView.Holder(headerCell);
            }
        };
        this.adapter = r0;
        return r0;
    }

    @Override
    public final StarParticlesView createParticlesView() {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(getParentActivity());
        anonymousClass3.setClipWithGradient();
        return anonymousClass3;
    }

    @Override
    public final View createView(Context context) {
        this.useFillLastLayoutManager = false;
        this.particlesViewHeight = AndroidUtilities.dp(238.0f);
        new RichDetailsCell.AnonymousClass2(this, context, 4).setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackgroundGray, false));
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
        this.buttonLayout.addView(view, new LinearLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(1.0f / AndroidUtilities.density)));
        int i = 2;
        BotStarsActivity.AnonymousClass6 anonymousClass6 = new BotStarsActivity.AnonymousClass6(i, context, this.resourceProvider, true);
        anonymousClass6.setRoundRadius(24);
        this.button = anonymousClass6;
        anonymousClass6.setText(LocaleController.getString(R.string.AffiliateProgramStart), false, true);
        this.button.setOnClickListener(new VoIPFragment$$ExternalSyntheticLambda28(4, this, context));
        this.buttonLayout.addView(this.button, LayoutHelper.createLinear(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, this.resourceProvider);
        this.buttonSubtext = linksTextView;
        linksTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
        this.buttonSubtext.setLinkTextColor(getThemedColor(Theme.key_chat_messageLinkIn));
        this.buttonSubtext.setTextSize(1, 12.0f);
        this.buttonSubtext.setGravity(17);
        this.buttonLayout.addView(this.buttonSubtext, LayoutHelper.createLinear(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        update$2(false);
        ((FrameLayout) this.fragmentView).addView(this.buttonLayout, LayoutHelper.createFrame(-1, -2, 87));
        this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 27));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        this.listView.setItemAnimator(defaultItemAnimator);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(Theme.key_windowBackgroundWhite);
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

    public final void lambda$createView$4(Context context) {
        String pluralString;
        if (this.button.enabled) {
            FrameLayout frameLayout = new FrameLayout(context);
            TableView tableView = new TableView(context, this.resourceProvider);
            AffiliateProgramFragment$$ExternalSyntheticLambda3 affiliateProgramFragment$$ExternalSyntheticLambda3 = new AffiliateProgramFragment$$ExternalSyntheticLambda3(this, 2);
            tableView.addRow(LocaleController.getString(R.string.AffiliateProgramCommission), percents(this.program.commission_permille), null, null);
            String string = LocaleController.getString(R.string.AffiliateProgramDuration);
            int i = this.program.duration_months;
            if (i <= 0) {
                pluralString = LocaleController.getString(R.string.Infinity);
            } else {
                pluralString = (i < 12 || i % 12 != 0) ? LocaleController.formatPluralString("Months", i, new Object[0]) : LocaleController.formatPluralString("Years", i / 12, new Object[0]);
            }
            tableView.addRow(string, pluralString, null, null);
            frameLayout.addView(tableView, LayoutHelper.createFrame(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
            AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, this.resourceProvider);
            String string2 = LocaleController.getString(R.string.AffiliateProgramAlert);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string2;
            alertDialog.message = LocaleController.getString(this.new_program ? R.string.AffiliateProgramStartAlertText : R.string.AffiliateProgramUpdateAlertText);
            builder.setView(frameLayout);
            builder.setPositiveButton(LocaleController.getString(this.new_program ? R.string.AffiliateProgramStartAlertButton : R.string.AffiliateProgramUpdateAlertButton), new TodoItemMenu$$ExternalSyntheticLambda3(affiliateProgramFragment$$ExternalSyntheticLambda3, 7));
            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
        }
    }

    public final void lambda$createView$5$2(int i) {
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
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        TextView textView = new TextView(getParentActivity());
        textView.setTextSize(1, 16.0f);
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i3, this.resourceProvider));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.AffiliateProgramStopText, textView);
        linearLayout.addView(textView, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(getParentActivity(), 24);
        anonymousClass9.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        anonymousClass9.setTextSize(1, 16.0f);
        anonymousClass9.setTextColor(Theme.getColor(i3, this.resourceProvider));
        anonymousClass9.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
        linearLayout.addView(anonymousClass9, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        ArticleViewer.AnonymousClass9 anonymousClass10 = new ArticleViewer.AnonymousClass9(getParentActivity(), 24);
        anonymousClass10.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        anonymousClass10.setTextSize(1, 16.0f);
        anonymousClass10.setTextColor(Theme.getColor(i3, this.resourceProvider));
        anonymousClass10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
        linearLayout.addView(anonymousClass10, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        ArticleViewer.AnonymousClass9 anonymousClass11 = new ArticleViewer.AnonymousClass9(getParentActivity(), 24);
        anonymousClass11.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        anonymousClass11.setTextSize(1, 16.0f);
        anonymousClass11.setTextColor(Theme.getColor(i3, this.resourceProvider));
        anonymousClass11.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
        linearLayout.addView(anonymousClass11, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, this.resourceProvider);
        builder.alertDialog.title = LocaleController.getString(R.string.AffiliateProgramAlert);
        builder.setView(linearLayout);
        builder.setPositiveButton(LocaleController.getString(R.string.AffiliateProgramStopButton), new TodoItemMenu$$ExternalSyntheticLambda3(this, 8));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.makeRed(-1);
        builder.show();
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
        this.button.setText(LocaleController.getString((this.new_program || this.program.end_date != 0) ? R.string.AffiliateProgramStart : R.string.AffiliateProgramUpdate), z, true);
        AffiliateProgramFragment$$ExternalSyntheticLambda3 affiliateProgramFragment$$ExternalSyntheticLambda3 = this.updateTimerRunnable;
        AndroidUtilities.cancelRunOnUIThread(affiliateProgramFragment$$ExternalSyntheticLambda3);
        affiliateProgramFragment$$ExternalSyntheticLambda3.run();
        this.buttonSubtext.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString((this.new_program || this.program.end_date != 0) ? R.string.AffiliateProgramStartInfo : R.string.AffiliateProgramUpdateInfo), new AffiliateProgramFragment$$ExternalSyntheticLambda3(this, 1)));
        updateEnabled();
        AnonymousClass4 anonymousClass4 = this.adapter;
        if (anonymousClass4 != null) {
            anonymousClass4.update(z);
        }
    }

    public final void updateEnabled() {
        TL_payments.starRefProgram starrefprogram;
        BotStarsActivity.AnonymousClass6 anonymousClass6 = this.button;
        TL_payments.starRefProgram starrefprogram2 = this.program;
        anonymousClass6.setEnabled(starrefprogram2.end_date == 0 && !((starrefprogram = this.initialProgram) != null && starrefprogram.commission_permille == starrefprogram2.commission_permille && starrefprogram.duration_months == starrefprogram2.duration_months));
    }
}
