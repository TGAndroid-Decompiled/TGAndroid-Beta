package org.telegram.ui.Components.Paint.Views;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public final class LPhotoPaintView$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final LPhotoPaintView f$0;
    public final EntityView f$1;

    public LPhotoPaintView$$ExternalSyntheticLambda8(LPhotoPaintView lPhotoPaintView, EntityView entityView, int i) {
        this.$r8$classId = i;
        this.f$0 = lPhotoPaintView;
        this.f$1 = entityView;
    }

    @Override
    public final void run() {
        float f;
        int i;
        switch (this.$r8$classId) {
            case 0:
                final LPhotoPaintView lPhotoPaintView = this.f$0;
                lPhotoPaintView.getClass();
                LinearLayout linearLayout = new LinearLayout(lPhotoPaintView.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(lPhotoPaintView.getContext());
                int i2 = Theme.key_actionBarDefaultSubmenuItem;
                LPhotoPaintView$$ExternalSyntheticLambda9 lPhotoPaintView$$ExternalSyntheticLambda9 = lPhotoPaintView.resourcesProvider;
                textView.setTextColor(Theme.getColor(i2, lPhotoPaintView$$ExternalSyntheticLambda9));
                textView.setBackground(Theme.getSelectorDrawable(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final EntityView entityView = this.f$1;
                final int i3 = 0;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                LPhotoPaintView lPhotoPaintView2 = lPhotoPaintView;
                                lPhotoPaintView2.removeEntity(entityView);
                                ActionBarPopupWindow actionBarPopupWindow = lPhotoPaintView2.popupWindow;
                                if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                                    lPhotoPaintView2.popupWindow.dismiss(true);
                                    break;
                                }
                                break;
                            default:
                                LPhotoPaintView lPhotoPaintView3 = lPhotoPaintView;
                                lPhotoPaintView3.getClass();
                                ((StickerView) entityView).mirror(true);
                                ActionBarPopupWindow actionBarPopupWindow2 = lPhotoPaintView3.popupWindow;
                                if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                                    lPhotoPaintView3.popupWindow.dismiss(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                linearLayout.addView(textView, LayoutHelper.createLinear(-2, 48));
                if (entityView instanceof TextPaintView) {
                    TextView textView2 = new TextView(lPhotoPaintView.getContext());
                    textView2.setTextColor(Theme.getColor(i2, lPhotoPaintView$$ExternalSyntheticLambda9));
                    textView2.setBackground(Theme.getSelectorDrawable(false));
                    textView2.setGravity(16);
                    f = 16.0f;
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda1(lPhotoPaintView, 1));
                    linearLayout.addView(textView2, LayoutHelper.createLinear(-2, 48));
                } else {
                    f = 16.0f;
                }
                if (entityView instanceof StickerView) {
                    TextView textView3 = new TextView(lPhotoPaintView.getContext());
                    textView3.setTextColor(Theme.getColor(i2, lPhotoPaintView$$ExternalSyntheticLambda9));
                    textView3.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    i = 2;
                    textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(LocaleController.getString(R.string.Flip));
                    final int i4 = 1;
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    LPhotoPaintView lPhotoPaintView2 = lPhotoPaintView;
                                    lPhotoPaintView2.removeEntity(entityView);
                                    ActionBarPopupWindow actionBarPopupWindow = lPhotoPaintView2.popupWindow;
                                    if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                                        lPhotoPaintView2.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                                default:
                                    LPhotoPaintView lPhotoPaintView3 = lPhotoPaintView;
                                    lPhotoPaintView3.getClass();
                                    ((StickerView) entityView).mirror(true);
                                    ActionBarPopupWindow actionBarPopupWindow2 = lPhotoPaintView3.popupWindow;
                                    if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                                        lPhotoPaintView3.popupWindow.dismiss(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, LayoutHelper.createLinear(-2, 48));
                } else {
                    i = 2;
                }
                boolean z = entityView instanceof PhotoView;
                if (!z) {
                    TextView textView4 = new TextView(lPhotoPaintView.getContext());
                    textView4.setTextColor(Theme.getColor(i2, lPhotoPaintView$$ExternalSyntheticLambda9));
                    textView4.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(Integer.valueOf(i));
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new LPhotoPaintView$$ExternalSyntheticLambda1(lPhotoPaintView, 2));
                    linearLayout.addView(textView4, LayoutHelper.createLinear(-2, 48));
                }
                if (z) {
                    ((PhotoView) entityView).getClass();
                }
                lPhotoPaintView.popupLayout.linearLayout.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
            default:
                this.f$0.removeEntity(this.f$1);
                break;
        }
    }
}
