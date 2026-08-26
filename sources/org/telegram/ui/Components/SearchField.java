package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda380;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.UsersSelectActivity;

public abstract class SearchField extends FrameLayout {
    public final ImageView clearSearchImageView;
    public final AnonymousClass1 progressDrawable;
    public final Theme.ResourcesProvider resourcesProvider;
    public final View searchBackground;
    public final UsersSelectActivity.AnonymousClass4 searchEditText;
    public final ImageView searchIconImageView;

    public final class AnonymousClass1 extends CloseProgressDrawable2 {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(FrameLayout frameLayout, int i) {
            super(2.0f);
            this.$r8$classId = i;
            this.this$0 = frameLayout;
        }

        @Override
        public final int getCurrentColor() {
            switch (this.$r8$classId) {
                case 0:
                    return Theme.getColor(Theme.key_dialogSearchIcon, ((SearchField) this.this$0).resourcesProvider);
                case 1:
                    return ((ActionBarMenuItem) this.this$0).parentMenu.parentActionBar.itemsColor;
                case 2:
                    return Theme.getColor(Theme.key_chat_emojiSearchIcon, EmojiView.this.resourcesProvider);
                case 3:
                    return Theme.getColor(Theme.key_chat_emojiSearchIcon, ((SelectAnimatedEmojiDialog.SearchBox) ((SelectAnimatedEmojiDialog.AnonymousClass18) this.this$0)).this$0.resourcesProvider);
                default:
                    return Theme.getColor(Theme.key_chat_emojiSearchIcon, (Theme.ResourcesProvider) this.this$0);
            }
        }

        public AnonymousClass1(Theme.ResourcesProvider resourcesProvider) {
            super(1.25f);
            this.$r8$classId = 4;
            this.this$0 = resourcesProvider;
            this.side = AndroidUtilities.dp(7.0f);
        }

        public AnonymousClass1(EmojiView.SearchField searchField) {
            super(1.25f);
            this.$r8$classId = 2;
            this.this$0 = searchField;
            this.side = AndroidUtilities.dp(7.0f);
        }

        public AnonymousClass1(SelectAnimatedEmojiDialog.AnonymousClass18 anonymousClass18) {
            super(1.25f);
            this.$r8$classId = 3;
            this.this$0 = anonymousClass18;
            this.side = AndroidUtilities.dp(7.0f);
        }
    }

    public SearchField(Context context, float f, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        View view = new View(context);
        this.searchBackground = view;
        view.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), Theme.getColor(Theme.key_dialogSearchBackground, resourcesProvider)));
        addView(view, LayoutHelper.createFrameRelatively(-1.0f, 36.0f, 8388659, f, 11.0f, f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.searchIconImageView = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogSearchIcon, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        float f2 = f + 2.0f;
        addView(imageView, LayoutHelper.createFrameRelatively(36.0f, 36.0f, 8388659, f2, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.clearSearchImageView = imageView2;
        imageView2.setScaleType(scaleType);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, 0);
        this.progressDrawable = anonymousClass1;
        imageView2.setImageDrawable(anonymousClass1);
        anonymousClass1.side = AndroidUtilities.dp(7.0f);
        imageView2.setScaleX(0.1f);
        imageView2.setScaleY(0.1f);
        imageView2.setAlpha(0.0f);
        addView(imageView2, LayoutHelper.createFrameRelatively(36.0f, 36.0f, 8388661, f, 11.0f, f, 0.0f));
        imageView2.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 0));
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = new UsersSelectActivity.AnonymousClass4(this, context, 6);
        this.searchEditText = anonymousClass4;
        anonymousClass4.setTextSize(1, 16.0f);
        anonymousClass4.setHintTextColor(Theme.getColor(Theme.key_dialogSearchHint, resourcesProvider));
        anonymousClass4.setTextColor(Theme.getColor(Theme.key_dialogSearchText, resourcesProvider));
        anonymousClass4.setBackgroundDrawable(null);
        anonymousClass4.setPadding(0, 0, 0, 0);
        anonymousClass4.setMaxLines(1);
        anonymousClass4.setLines(1);
        anonymousClass4.setSingleLine(true);
        anonymousClass4.setGravity(LayoutHelper.getAbsoluteGravityStart() | 16);
        anonymousClass4.setImeOptions(268435459);
        anonymousClass4.setCursorColor(Theme.getColor(Theme.key_featuredStickers_addedIcon, resourcesProvider));
        anonymousClass4.setCursorSize(AndroidUtilities.dp(20.0f));
        anonymousClass4.setCursorWidth(1.5f);
        addView(anonymousClass4, LayoutHelper.createFrameRelatively(-1.0f, 40.0f, 8388659, f2 + 38.0f, 9.0f, f2 + 30.0f, 0.0f));
        anonymousClass4.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 16));
        anonymousClass4.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 10));
    }

    public CloseProgressDrawable2 getProgressDrawable() {
        return this.progressDrawable;
    }

    public View getSearchBackground() {
        return this.searchBackground;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.searchEditText;
    }

    public abstract void onTextChange(String str);

    public void setHint(String str) {
        this.searchEditText.setHint(str);
    }
}
