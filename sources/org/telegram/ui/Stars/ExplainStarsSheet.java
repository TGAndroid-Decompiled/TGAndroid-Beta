package org.telegram.ui.Stars;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StarAppsSheet;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class ExplainStarsSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private FrameLayout buttonContainer;
    private LinearLayout headerView;

    public ExplainStarsSheet(Context context) {
        super(context, null, false, false, false, null);
        this.topPadding = 0.1f;
        fixNavigationBar();
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.headerView = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        StarParticlesView starParticlesViewMakeParticlesView = StarsIntroActivity.makeParticlesView(context, 70, 0);
        frameLayout.addView(starParticlesViewMakeParticlesView, LayoutHelper.createFrame(-1, -1.0f));
        GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 2);
        GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
        gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
        gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
        gLIconRenderer.updateColors();
        gLIconTextureView.setStarParticlesView(starParticlesViewMakeParticlesView);
        frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        gLIconTextureView.setPaused(false);
        this.headerView.addView(frameLayout, LayoutHelper.createFrame(-1, 150.0f));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i2, this.resourcesProvider));
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        this.headerView.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(Theme.getColor(i2, this.resourcesProvider));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        this.headerView.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 16, 9, 16, 18));
        this.buttonContainer = new FrameLayout(context);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.ExplainStarsButton), false);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        this.buttonContainer.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        FrameLayout frameLayout2 = this.buttonContainer;
        int i3 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i3, 0, i3, 0);
        this.buttonContainer.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground));
        this.containerView.addView(this.buttonContainer, LayoutHelper.createFrame(-1, -2, 87));
        this.adapter.update(false);
    }

    public void lambda$new$0(View view) {
        lambda$new$0();
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider) {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return false;
            }
        };
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asCustom(this.headerView));
        arrayList.add(FeatureCell.Factory.of(R.drawable.msg_gift_premium, LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text)));
        arrayList.add(FeatureCell.Factory.of(R.drawable.msg_bot, LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$fillItems$1();
            }
        }), true)));
        arrayList.add(FeatureCell.Factory.of(R.drawable.menu_unlock, LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text)));
        arrayList.add(FeatureCell.Factory.of(R.drawable.menu_feature_paid, LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text)));
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(68.0f)));
    }

    public void lambda$fillItems$1() {
        new StarAppsSheet(getContext()).show();
    }

    public static class FeatureCell extends LinearLayout {
        public final ImageView imageView;
        public final LinkSpanDrawable.LinksTextView subtitleView;
        public final LinearLayout textLayout;
        public final TextView titleView;

        public FeatureCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            setOrientation(0);
            setPadding(AndroidUtilities.dp(i == 1 ? 11.0f : 32.0f), 0, AndroidUtilities.dp(i == 1 ? 11.0f : 32.0f), AndroidUtilities.dp(i == 1 ? 8.0f : 12.0f));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), PorterDuff.Mode.SRC_IN));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, LayoutHelper.createLinear(24, 24, 51, 0, 6, 16, 0));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.titleView = linksTextView;
            linksTextView.setTypeface(AndroidUtilities.bold());
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
            int i3 = Theme.key_chat_messageLinkIn;
            linksTextView.setLinkTextColor(Theme.getColor(i3, resourcesProvider));
            linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 3));
            LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context);
            this.subtitleView = linksTextView2;
            linksTextView2.setTextSize(1, 14.0f);
            linksTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            linksTextView2.setLinkTextColor(Theme.getColor(i3, resourcesProvider));
            linearLayout.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 7));
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 55, 0, 0, 0, 0));
        }

        public void set(int i, CharSequence charSequence, CharSequence charSequence2) {
            this.imageView.setImageResource(i);
            this.titleView.setText(charSequence);
            this.subtitleView.setText(charSequence2);
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public FeatureCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new FeatureCell(context, 0, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((FeatureCell) view).set(uItem.intValue, uItem.text, uItem.subtext);
            }

            public static UItem of(int i, CharSequence charSequence, CharSequence charSequence2) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.selectable = false;
                uItemOfFactory.intValue = i;
                uItemOfFactory.text = charSequence;
                uItemOfFactory.subtext = charSequence2;
                return uItemOfFactory;
            }
        }
    }
}
