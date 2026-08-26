package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;

public class SearchField extends FrameLayout {
    private ImageView clearSearchImageView;
    private CloseProgressDrawable2 progressDrawable;
    private final Theme.ResourcesProvider resourcesProvider;
    private View searchBackground;
    private EditTextBoldCursor searchEditText;
    private ImageView searchIconImageView;

    public SearchField(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this(context, z, 14.0f, resourcesProvider);
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void lambda$new$0(View view) {
        this.searchEditText.setText("");
        AndroidUtilities.showKeyboard(this.searchEditText);
    }

    public boolean lambda$new$1(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        this.searchEditText.hideActionMode();
        AndroidUtilities.hideKeyboard(this.searchEditText);
        return false;
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

    public void getThemeDescriptions(List<ThemeDescription> list) {
        list.add(new ThemeDescription(this.searchBackground, 32, null, null, null, null, Theme.key_dialogSearchBackground));
        ImageView imageView = this.searchIconImageView;
        int i = Theme.key_dialogSearchIcon;
        list.add(new ThemeDescription(imageView, 8, null, null, null, null, i));
        list.add(new ThemeDescription(this.clearSearchImageView, 8, null, null, null, null, i));
        list.add(new ThemeDescription(this.searchEditText, 4, null, null, null, null, Theme.key_dialogSearchText));
        list.add(new ThemeDescription(this.searchEditText, 8388608, null, null, null, null, Theme.key_dialogSearchHint));
        list.add(new ThemeDescription(this.searchEditText, 16777216, null, null, null, null, Theme.key_featuredStickers_addedIcon));
    }

    public void hideKeyboard() {
        AndroidUtilities.hideKeyboard(this.searchEditText);
    }

    public void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
    }

    public void onTextChange(String str) {
    }

    public void processTouchEvent(MotionEvent motionEvent) {
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setHint(String str) {
        this.searchEditText.setHint(str);
    }

    public SearchField(Context context, boolean z, float f, Theme.ResourcesProvider resourcesProvider) {
        float f2;
        FrameLayout.LayoutParams layoutParamsCreateFrame;
        FrameLayout.LayoutParams layoutParamsCreateFrame2;
        super(context);
        this.resourcesProvider = resourcesProvider;
        View view = new View(context);
        this.searchBackground = view;
        view.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), getThemedColor(Theme.key_dialogSearchBackground)));
        if (z) {
            layoutParamsCreateFrame = LayoutHelper.createFrameRelatively(-1.0f, 36.0f, 8388659, f, 11.0f, f, 0.0f);
            f2 = f;
        } else {
            f2 = f;
            layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 36.0f, 51, f2, 11.0f, f2, 0.0f);
        }
        addView(this.searchBackground, layoutParamsCreateFrame);
        ImageView imageView = new ImageView(context);
        this.searchIconImageView = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.searchIconImageView.setImageResource(R.drawable.smiles_inputsearch);
        this.searchIconImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogSearchIcon), PorterDuff.Mode.MULTIPLY));
        addView(this.searchIconImageView, z ? LayoutHelper.createFrameRelatively(36.0f, 36.0f, 8388659, f2 + 2.0f, 11.0f, 0.0f, 0.0f) : LayoutHelper.createFrame(36, 36.0f, 51, f2 + 2.0f, 11.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.clearSearchImageView = imageView2;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.clearSearchImageView;
        CloseProgressDrawable2 closeProgressDrawable2 = new CloseProgressDrawable2() {
            @Override
            public int getCurrentColor() {
                return SearchField.this.getThemedColor(Theme.key_dialogSearchIcon);
            }
        };
        this.progressDrawable = closeProgressDrawable2;
        imageView3.setImageDrawable(closeProgressDrawable2);
        this.progressDrawable.setSide(AndroidUtilities.dp(7.0f));
        this.clearSearchImageView.setScaleX(0.1f);
        this.clearSearchImageView.setScaleY(0.1f);
        this.clearSearchImageView.setAlpha(0.0f);
        addView(this.clearSearchImageView, z ? LayoutHelper.createFrameRelatively(36.0f, 36.0f, 8388661, f2, 11.0f, f2, 0.0f) : LayoutHelper.createFrame(36, 36.0f, 53, f2, 11.0f, f2, 0.0f));
        this.clearSearchImageView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                SearchField.this.processTouchEvent(motionEvent);
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    SearchField.this.onFieldTouchUp(this);
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.searchEditText = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.searchEditText.setHintTextColor(getThemedColor(Theme.key_dialogSearchHint));
        this.searchEditText.setTextColor(getThemedColor(Theme.key_dialogSearchText));
        this.searchEditText.setBackgroundDrawable(null);
        this.searchEditText.setPadding(0, 0, 0, 0);
        this.searchEditText.setMaxLines(1);
        this.searchEditText.setLines(1);
        this.searchEditText.setSingleLine(true);
        this.searchEditText.setGravity((z ? LayoutHelper.getAbsoluteGravityStart() : 3) | 16);
        this.searchEditText.setImeOptions(268435459);
        this.searchEditText.setCursorColor(getThemedColor(Theme.key_featuredStickers_addedIcon));
        this.searchEditText.setCursorSize(AndroidUtilities.dp(20.0f));
        this.searchEditText.setCursorWidth(1.5f);
        if (z) {
            float f3 = 2.0f + f2;
            layoutParamsCreateFrame2 = LayoutHelper.createFrameRelatively(-1.0f, 40.0f, 8388659, f3 + 38.0f, 9.0f, f3 + 30.0f, 0.0f);
        } else {
            float f4 = 2.0f + f2;
            layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, 40.0f, 51, f4 + 38.0f, 9.0f, f4 + 30.0f, 0.0f);
        }
        addView(this.searchEditText, layoutParamsCreateFrame2);
        this.searchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                boolean z2 = SearchField.this.searchEditText.length() > 0;
                if (z2 != (SearchField.this.clearSearchImageView.getAlpha() != 0.0f)) {
                    SearchField.this.clearSearchImageView.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(150L).scaleX(z2 ? 1.0f : 0.1f).scaleY(z2 ? 1.0f : 0.1f).start();
                }
                SearchField searchField = SearchField.this;
                searchField.onTextChange(searchField.searchEditText.getText().toString());
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        this.searchEditText.setOnEditorActionListener(new ReportAlert$$ExternalSyntheticLambda0(this, 6));
    }
}
