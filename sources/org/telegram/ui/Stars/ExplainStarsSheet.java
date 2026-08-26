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
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda13;

public final class ExplainStarsSheet extends BottomSheetWithRecyclerListView {
    public AnonymousClass1 adapter;
    public final LinearLayout headerView;

    public final class AnonymousClass1 extends UniversalAdapter {
        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }
    }

    public final class FeatureCell extends LinearLayout {
        public final ImageView imageView;
        public final LinkSpanDrawable.LinksTextView subtitleView;
        public final LinkSpanDrawable.LinksTextView titleView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((FeatureCell) view).set(uItem.text, uItem.subtext, uItem.intValue);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new FeatureCell(context, 0, resourcesProvider);
            }
        }

        public FeatureCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            setOrientation(0);
            setPadding(AndroidUtilities.dp(i == 1 ? 11.0f : 32.0f), 0, AndroidUtilities.dp(i == 1 ? 11.0f : 32.0f), AndroidUtilities.dp(i == 1 ? 8.0f : 12.0f));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i2, false), PorterDuff.Mode.SRC_IN));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, LayoutHelper.createLinear(24, 24, 51, 0, 6, 16, 0));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
            this.titleView = linksTextView;
            linksTextView.setTypeface(AndroidUtilities.bold());
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
            int i3 = Theme.key_chat_messageLinkIn;
            linksTextView.setLinkTextColor(Theme.getColor(i3, resourcesProvider));
            linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 3));
            LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, null);
            this.subtitleView = linksTextView2;
            linksTextView2.setTextSize(1, 14.0f);
            linksTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            linksTextView2.setLinkTextColor(Theme.getColor(i3, resourcesProvider));
            linearLayout.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 7));
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1.0f, 55, 0, 0, 0, 0));
        }

        public final void set(CharSequence charSequence, CharSequence charSequence2, int i) {
            this.imageView.setImageResource(i);
            this.titleView.setText(charSequence);
            this.subtitleView.setText(charSequence2);
        }

        public void setSubtitle(CharSequence charSequence) {
            this.subtitleView.setText(charSequence);
        }

        public void setTitle(CharSequence charSequence) {
            this.titleView.setText(charSequence);
        }
    }

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
        StarsIntroActivity.AnonymousClass4 anonymousClass4 = new StarsIntroActivity.AnonymousClass4(context, 70, 0);
        frameLayout.addView(anonymousClass4, LayoutHelper.createFrame(-1.0f, -1));
        GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 2);
        GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
        gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
        gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
        gLIconRenderer.updateColors();
        gLIconTextureView.setStarParticlesView(anonymousClass4);
        frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        gLIconTextureView.setPaused(false);
        linearLayout.addView(frameLayout, LayoutHelper.createFrame(150.0f, -1));
        TextView textView = new TextView(context);
        zzkk.m(20.0f, 1, textView);
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(i2, this.resourcesProvider));
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(-2, -2, 1, 0, 2, 0, 0), context);
        textViewM.setTextSize(1, 14.0f);
        textViewM.setTextColor(Theme.getColor(i2, this.resourcesProvider));
        textViewM.setGravity(17);
        textViewM.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider, true);
        buttonWithCounterView.setText(LocaleController.getString(R.string.ExplainStarsButton), false, true);
        buttonWithCounterView.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, 6));
        frameLayout2.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i3 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i3, 0, i3, 0);
        frameLayout2.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 87));
        this.adapter.update(false);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(recyclerListView, getContext(), this.currentAccount, 0, true, new LinkManager$$ExternalSyntheticLambda1(this, 16), this.resourcesProvider);
        this.adapter = anonymousClass1;
        return anonymousClass1;
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }
}
