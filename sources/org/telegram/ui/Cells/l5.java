package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
public final class l5 extends FrameLayout {
    public final TextView f19482a;
    public final TextView f19483b;
    public final TextView f19484c;
    public final org.telegram.ui.Components.w9 d;

    public l5(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        float f12;
        int i15;
        float f13;
        float f14;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(8.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(w9Var, w7.a6.d(100, 100.0f, i10, 10.0f, 10.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f19482a = textView;
        int i16 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 48);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i17 = i12 | 48;
        if (z10) {
            f7 = 10.0f;
        } else {
            f7 = 123.0f;
        }
        if (z10) {
            f10 = 123.0f;
        } else {
            f10 = 10.0f;
        }
        addView(textView, w7.a6.d(-1, -2.0f, i17, f7, 9.0f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.f19483b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13 | 48);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i18 = i14 | 48;
        if (z11) {
            f11 = 10.0f;
        } else {
            f11 = 123.0f;
        }
        if (z11) {
            f12 = 123.0f;
        } else {
            f12 = 10.0f;
        }
        addView(textView2, w7.a6.d(-1, -2.0f, i18, f11, 33.0f, f12, 0.0f));
        TextView textView3 = new TextView(context);
        this.f19484c = textView3;
        em.r(textView3, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18325z6, false), 1, 14.0f, 1);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView3.setGravity(i15 | 48);
        boolean z12 = LocaleController.isRTL;
        int i19 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f13 = 10.0f;
        } else {
            f13 = 123.0f;
        }
        if (z12) {
            f14 = 123.0f;
        } else {
            f14 = 10.0f;
        }
        addView(textView3, w7.a6.d(-1, -2.0f, i19, f13, 90.0f, f14, 9.0f));
    }

    public final void a(String str, String str2, TLRPC.WebDocument webDocument, String str3, Object obj) {
        int min;
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        float f12;
        float f13;
        float f14;
        TextView textView = this.f19482a;
        textView.setText(str);
        TextView textView2 = this.f19483b;
        textView2.setText(str2);
        TextView textView3 = this.f19484c;
        textView3.setText(str3);
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
        }
        float f15 = 640;
        float dp = f15 / (((int) (min * 0.7f)) - AndroidUtilities.dp(2.0f));
        int i14 = (int) (f15 / dp);
        int i15 = (int) (360 / dp);
        org.telegram.ui.Components.w9 w9Var = this.d;
        int i16 = 3;
        if (webDocument != null && webDocument.mime_type.startsWith("image/")) {
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i17 = i12 | 48;
            if (z10) {
                f7 = 10.0f;
            } else {
                f7 = 123.0f;
            }
            if (z10) {
                f10 = 123.0f;
            } else {
                f10 = 10.0f;
            }
            textView.setLayoutParams(w7.a6.d(-1, -2.0f, i17, f7, 9.0f, f10, 0.0f));
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i18 = i13 | 48;
            if (z11) {
                f11 = 10.0f;
            } else {
                f11 = 123.0f;
            }
            if (z11) {
                f12 = 123.0f;
            } else {
                f12 = 10.0f;
            }
            textView2.setLayoutParams(w7.a6.d(-1, -2.0f, i18, f11, 33.0f, f12, 0.0f));
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i16 = 5;
            }
            int i19 = i16 | 48;
            if (z12) {
                f13 = 10.0f;
            } else {
                f13 = 123.0f;
            }
            if (z12) {
                f14 = 123.0f;
            } else {
                f14 = 10.0f;
            }
            textView3.setLayoutParams(w7.a6.d(-1, -2.0f, i19, f13, 90.0f, f14, 0.0f));
            w9Var.setVisibility(0);
            Locale locale = Locale.US;
            w9Var.getImageReceiver().setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), a4.a.k(i14, i15, "_"), null, null, -1L, null, obj, 1);
            return;
        }
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setLayoutParams(w7.a6.d(-1, -2.0f, i10 | 48, 17.0f, 9.0f, 17.0f, 0.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setLayoutParams(w7.a6.d(-1, -2.0f, i11 | 48, 17.0f, 33.0f, 17.0f, 0.0f));
        if (LocaleController.isRTL) {
            i16 = 5;
        }
        textView3.setLayoutParams(w7.a6.d(-1, -2.0f, i16 | 48, 17.0f, 90.0f, 17.0f, 9.0f));
        w9Var.setVisibility(8);
    }

    public final void b(TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, String str) {
        a(tL_messageMediaInvoice.title, tL_messageMediaInvoice.description, tL_messageMediaInvoice.webPhoto, str, tL_messageMediaInvoice);
    }

    public final void c(TLRPC.PaymentReceipt paymentReceipt, String str) {
        a(paymentReceipt.title, paymentReceipt.description, paymentReceipt.photo, str, paymentReceipt);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.d.getVisibility() != 8) {
            i13 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824);
            i12 = i10;
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            TextView textView = this.f19483b;
            i12 = i10;
            measureChildWithMargins(textView, i12, 0, i11, 0);
            ((FrameLayout.LayoutParams) this.f19484c.getLayoutParams()).topMargin = AndroidUtilities.dp(3.0f) + textView.getMeasuredHeight() + AndroidUtilities.dp(33.0f);
            i13 = makeMeasureSpec;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12), 1073741824), i13);
    }
}
