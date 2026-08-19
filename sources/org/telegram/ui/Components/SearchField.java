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

public abstract class SearchField extends FrameLayout {
    private ImageView clearSearchImageView;
    private CloseProgressDrawable2 progressDrawable;
    private final Theme.ResourcesProvider resourcesProvider;
    private View searchBackground;
    private EditTextBoldCursor searchEditText;
    private ImageView searchIconImageView;

    protected void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
    }

    public abstract void onTextChange(String str);

    public void processTouchEvent(MotionEvent motionEvent) {
    }

    public SearchField(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this(context, z, 14.0f, resourcesProvider);
    }

    public SearchField(Context context, boolean z, float f, Theme.ResourcesProvider resourcesProvider) {
        float f2;
        FrameLayout.LayoutParams layoutParamsCreateFrame;
        FrameLayout.LayoutParams layoutParamsCreateFrame2;
        FrameLayout.LayoutParams layoutParamsCreateFrame3;
        FrameLayout.LayoutParams layoutParamsCreateFrame4;
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
        if (z) {
            layoutParamsCreateFrame2 = LayoutHelper.createFrameRelatively(36.0f, 36.0f, 8388659, f2 + 2.0f, 11.0f, 0.0f, 0.0f);
        } else {
            layoutParamsCreateFrame2 = LayoutHelper.createFrame(36, 36.0f, 51, f2 + 2.0f, 11.0f, 0.0f, 0.0f);
        }
        addView(this.searchIconImageView, layoutParamsCreateFrame2);
        ImageView imageView2 = new ImageView(context);
        this.clearSearchImageView = imageView2;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.clearSearchImageView;
        CloseProgressDrawable2 closeProgressDrawable2 = new CloseProgressDrawable2() {
            @Override
            protected int getCurrentColor() {
                return SearchField.this.getThemedColor(Theme.key_dialogSearchIcon);
            }
        };
        this.progressDrawable = closeProgressDrawable2;
        imageView3.setImageDrawable(closeProgressDrawable2);
        this.progressDrawable.setSide(AndroidUtilities.dp(7.0f));
        this.clearSearchImageView.setScaleX(0.1f);
        this.clearSearchImageView.setScaleY(0.1f);
        this.clearSearchImageView.setAlpha(0.0f);
        if (z) {
            layoutParamsCreateFrame3 = LayoutHelper.createFrameRelatively(36.0f, 36.0f, 8388661, f2, 11.0f, f2, 0.0f);
        } else {
            layoutParamsCreateFrame3 = LayoutHelper.createFrame(36, 36.0f, 53, f2, 11.0f, f2, 0.0f);
        }
        addView(this.clearSearchImageView, layoutParamsCreateFrame3);
        this.clearSearchImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                SearchField.m2719$r8$lambda$Go1mn5pfejzLu9c3Ox330EJkZo(this.f$0, view2);
            }
        });
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
            layoutParamsCreateFrame4 = LayoutHelper.createFrameRelatively(-1.0f, 40.0f, 8388659, f3 + 38.0f, 9.0f, f3 + 30.0f, 0.0f);
        } else {
            float f4 = 2.0f + f2;
            layoutParamsCreateFrame4 = LayoutHelper.createFrame(-1, 40.0f, 51, f4 + 38.0f, 9.0f, f4 + 30.0f, 0.0f);
        }
        addView(this.searchEditText, layoutParamsCreateFrame4);
        this.searchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                boolean z2 = SearchField.this.searchEditText.length() > 0;
                if (z2 != (SearchField.this.clearSearchImageView.getAlpha() != 0.0f)) {
                    SearchField.this.clearSearchImageView.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(150L).scaleX(z2 ? 1.0f : 0.1f).scaleY(z2 ? 1.0f : 0.1f).start();
                }
                SearchField searchField = SearchField.this;
                searchField.onTextChange(searchField.searchEditText.getText().toString());
            }
        });
        this.searchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return SearchField.m2720$r8$lambda$m9Nbora4R9xhAOQ4kZ91TTiwA0(this.f$0, textView, i, keyEvent);
            }
        });
    }

    public static void m2719$r8$lambda$Go1mn5pfejzLu9c3Ox330EJkZo(SearchField searchField, View view) {
        searchField.searchEditText.setText("");
        AndroidUtilities.showKeyboard(searchField.searchEditText);
    }

    public static boolean m2720$r8$lambda$m9Nbora4R9xhAOQ4kZ91TTiwA0(SearchField searchField, TextView textView, int i, KeyEvent keyEvent) {
        searchField.getClass();
        if (keyEvent == null) {
            return false;
        }
        if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        searchField.searchEditText.hideActionMode();
        AndroidUtilities.hideKeyboard(searchField.searchEditText);
        return false;
    }

    public void setHint(String str) {
        this.searchEditText.setHint(str);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public View getSearchBackground() {
        return this.searchBackground;
    }

    public EditTextBoldCursor getSearchEditText() {
        return this.searchEditText;
    }

    public CloseProgressDrawable2 getProgressDrawable() {
        return this.progressDrawable;
    }

    public void getThemeDescriptions(List list) {
        list.add(new ThemeDescription(this.searchBackground, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_dialogSearchBackground));
        ImageView imageView = this.searchIconImageView;
        int i = ThemeDescription.FLAG_IMAGECOLOR;
        int i2 = Theme.key_dialogSearchIcon;
        list.add(new ThemeDescription(imageView, i, null, null, null, null, i2));
        list.add(new ThemeDescription(this.clearSearchImageView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, i2));
        list.add(new ThemeDescription(this.searchEditText, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_dialogSearchText));
        list.add(new ThemeDescription(this.searchEditText, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, Theme.key_dialogSearchHint));
        list.add(new ThemeDescription(this.searchEditText, ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, Theme.key_featuredStickers_addedIcon));
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
