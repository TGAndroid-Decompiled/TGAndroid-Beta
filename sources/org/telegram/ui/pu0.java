package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.webkit.CookieManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.RadialProgressView;
public final class pu0 extends org.telegram.ui.Components.qg0 {
    public final Rect M;
    public final PhotoViewer N;

    public pu0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.e1 e1Var) {
        super(context);
        this.N = photoViewer;
        this.f28591a = UserConfig.selectedAccount;
        this.v = new ArrayList();
        this.L = new org.telegram.ui.Components.yc0(this, 11);
        this.f28592b = photoViewer2;
        this.f28596r = e1Var;
        org.telegram.ui.Components.bv bvVar = new org.telegram.ui.Components.bv(this, context, context, 1);
        this.f28594f = bvVar;
        bvVar.getSettings().setJavaScriptEnabled(true);
        bvVar.getSettings().setDomStorageEnabled(true);
        bvVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        bvVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(bvVar, true);
        bvVar.setWebViewClient(new org.telegram.ui.Components.mg0(this, 0));
        addView(bvVar, w7.a6.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f28593c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, w7.a6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.g6.f20288y6, null, false, textView, 17);
        linearLayout.addView(textView, w7.a6.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f20084n6;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i11 = org.telegram.ui.ActionBar.w5.f20788a;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{12.0f}, 0, org.telegram.ui.ActionBar.w5.b(org.telegram.ui.ActionBar.g6.x0(null, i10, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, w7.a6.t(-2, -2, 1, 0, 8, 0, 0));
        di.ab abVar = new di.ab(this, context, 20);
        this.h = abVar;
        abVar.setBackgroundColor(-16777216);
        abVar.setVisibility(4);
        addView(abVar, w7.a6.d(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f28595n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, w7.a6.e(-2, -2, 17));
        this.M = new Rect();
    }

    public final void j(Canvas canvas, int i10, int i11) {
        Bitmap bitmap = this.N.C4.getBitmap();
        if (bitmap != null) {
            float min = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
            int width = (int) (bitmap.getWidth() * min);
            int height = (int) (bitmap.getHeight() * min);
            int i12 = (i11 - height) / 2;
            int i13 = (i10 - width) / 2;
            Rect rect = this.M;
            rect.set(i13, i12, width + i13, height + i12);
            canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
        }
    }
}
