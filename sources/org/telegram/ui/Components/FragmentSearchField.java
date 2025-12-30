package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;

public class FragmentSearchField extends FrameLayout implements FactorAnimator.Target {
    private final BoolAnimator animatorCloseIconVisible;
    private boolean closeButtonForcedVisible;
    private final ImageView closeIcon;
    public final EditTextBoldCursor editText;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ImageView searchIcon;

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public FragmentSearchField(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.animatorCloseIconVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
        this.resourcesProvider = resourcesProvider;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.editText = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 15.0f);
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setInputType(655536);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setVerticalScrollBarEnabled(false);
        editTextBoldCursor.setHorizontalScrollBarEnabled(false);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        editTextBoldCursor.setClipToPadding(true);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                FragmentSearchField.this.checkCloseButtonVisible();
            }
        });
        if (Build.VERSION.SDK_INT >= 35) {
            editTextBoldCursor.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.searchIcon = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.outline_search_1_24);
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.closeIcon = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.miniplayer_close);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        addView(imageView2, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        updateColors();
    }

    public void lambda$new$0(View view) {
        this.editText.getText().clear();
    }

    public void updateColors() {
        int iDp = AndroidUtilities.dp(20.0f);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        setBackground(Theme.createRoundRectDrawable(iDp, getThemedColor(i, 0.05f)));
        ImageView imageView = this.searchIcon;
        int themedColor = getThemedColor(i, 0.6f);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(themedColor, mode);
        this.closeIcon.setColorFilter(getThemedColor(i, 0.6f), mode);
        this.closeIcon.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 5, AndroidUtilities.dp(12.0f)));
        this.editText.setHintTextColor(getThemedColor(i, 0.4f));
        this.editText.setTextColor(getThemedColor(i));
        this.editText.setCursorColor(getThemedColor(Theme.key_groupcreate_cursor));
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    private int getThemedColor(int i, float f) {
        return Theme.multAlpha(getThemedColor(i), f);
    }

    public void setCloseButtonOnClickListener(View.OnClickListener onClickListener) {
        this.closeIcon.setOnClickListener(onClickListener);
    }

    public void setCloseButtonVisible(boolean z) {
        this.closeButtonForcedVisible = z;
        checkCloseButtonVisible();
    }

    public void checkCloseButtonVisible() {
        this.animatorCloseIconVisible.setValue(this.closeButtonForcedVisible || this.editText.length() > 0, true);
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        float fLerp = AndroidUtilities.lerp(0.4f, 1.0f, f);
        this.closeIcon.setScaleX(fLerp);
        this.closeIcon.setScaleY(fLerp);
        this.closeIcon.setAlpha(f);
        this.closeIcon.setRotation((1.0f - f) * 90.0f);
        this.closeIcon.setVisibility(f > 0.0f ? 0 : 8);
    }
}
