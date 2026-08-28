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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
public final class l5 extends FrameLayout {
    public final TextView f24649a;
    public final TextView f24650b;
    public final TextView f24651c;
    public final org.telegram.ui.Components.o9 d;

    public l5(Context context) {
        super(context);
        int i9;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        int i14;
        float f14;
        float f15;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.d = o9Var;
        o9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(8.0f));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        addView(o9Var, g7.e6.d(100, 100.0f, i9, 10.0f, 10.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f24649a = textView;
        int i15 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i16 = i11 | 48;
        if (z10) {
            f10 = 10.0f;
        } else {
            f10 = 123.0f;
        }
        if (z10) {
            f11 = 123.0f;
        } else {
            f11 = 10.0f;
        }
        addView(textView, g7.e6.d(-1, -2.0f, i16, f10, 9.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24650b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12 | 48);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i17 = i13 | 48;
        if (z11) {
            f12 = 10.0f;
        } else {
            f12 = 123.0f;
        }
        if (z11) {
            f13 = 123.0f;
        } else {
            f13 = 10.0f;
        }
        addView(textView2, g7.e6.d(-1, -2.0f, i17, f12, 33.0f, f13, 0.0f));
        TextView textView3 = new TextView(context);
        this.f24651c = textView3;
        ll.s(textView3, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23386z6, false), 1, 14.0f, 1);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView3.setGravity(i14 | 48);
        boolean z12 = LocaleController.isRTL;
        int i18 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f14 = 10.0f;
        } else {
            f14 = 123.0f;
        }
        if (z12) {
            f15 = 123.0f;
        } else {
            f15 = 10.0f;
        }
        addView(textView3, g7.e6.d(-1, -2.0f, i18, f14, 90.0f, f15, 9.0f));
    }

    public final void a(String str, String str2, TLRPC.WebDocument webDocument, String str3, Object obj) {
        int min;
        int i9;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        TextView textView = this.f24649a;
        textView.setText(str);
        TextView textView2 = this.f24650b;
        textView2.setText(str2);
        TextView textView3 = this.f24651c;
        textView3.setText(str3);
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
        }
        float f16 = 640;
        float dp = f16 / (((int) (min * 0.7f)) - AndroidUtilities.dp(2.0f));
        int i13 = (int) (f16 / dp);
        int i14 = (int) (360 / dp);
        org.telegram.ui.Components.o9 o9Var = this.d;
        int i15 = 3;
        if (webDocument != null && webDocument.mime_type.startsWith("image/")) {
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i16 = i11 | 48;
            if (z10) {
                f10 = 10.0f;
            } else {
                f10 = 123.0f;
            }
            if (z10) {
                f11 = 123.0f;
            } else {
                f11 = 10.0f;
            }
            textView.setLayoutParams(g7.e6.d(-1, -2.0f, i16, f10, 9.0f, f11, 0.0f));
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i17 = i12 | 48;
            if (z11) {
                f12 = 10.0f;
            } else {
                f12 = 123.0f;
            }
            if (z11) {
                f13 = 123.0f;
            } else {
                f13 = 10.0f;
            }
            textView2.setLayoutParams(g7.e6.d(-1, -2.0f, i17, f12, 33.0f, f13, 0.0f));
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i15 = 5;
            }
            int i18 = i15 | 48;
            if (z12) {
                f14 = 10.0f;
            } else {
                f14 = 123.0f;
            }
            if (z12) {
                f15 = 123.0f;
            } else {
                f15 = 10.0f;
            }
            textView3.setLayoutParams(g7.e6.d(-1, -2.0f, i18, f14, 90.0f, f15, 0.0f));
            o9Var.setVisibility(0);
            Locale locale = Locale.US;
            o9Var.getImageReceiver().setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), e2.c.l(i13, "_", i14), null, null, -1L, null, obj, 1);
            return;
        }
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setLayoutParams(g7.e6.d(-1, -2.0f, i9 | 48, 17.0f, 9.0f, 17.0f, 0.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView2.setLayoutParams(g7.e6.d(-1, -2.0f, i10 | 48, 17.0f, 33.0f, 17.0f, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        }
        textView3.setLayoutParams(g7.e6.d(-1, -2.0f, i15 | 48, 17.0f, 90.0f, 17.0f, 9.0f));
        o9Var.setVisibility(8);
    }

    public final void b(TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, String str) {
        a(tL_messageMediaInvoice.title, tL_messageMediaInvoice.description, tL_messageMediaInvoice.webPhoto, str, tL_messageMediaInvoice);
    }

    public final void c(TLRPC.PaymentReceipt paymentReceipt, String str) {
        a(paymentReceipt.title, paymentReceipt.description, paymentReceipt.photo, str, paymentReceipt);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        if (this.d.getVisibility() != 8) {
            i12 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824);
            i11 = i9;
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            TextView textView = this.f24650b;
            i11 = i9;
            measureChildWithMargins(textView, i11, 0, i10, 0);
            ((FrameLayout.LayoutParams) this.f24651c.getLayoutParams()).topMargin = AndroidUtilities.dp(3.0f) + textView.getMeasuredHeight() + AndroidUtilities.dp(33.0f);
            i12 = makeMeasureSpec;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824), i12);
    }
}
