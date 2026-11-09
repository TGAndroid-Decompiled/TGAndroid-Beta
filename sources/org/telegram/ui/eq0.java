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
import org.telegram.ui.Components.RadialProgressView;
public final class eq0 extends org.telegram.ui.Components.be0 {
    public final Rect M;
    public final PhotoViewer N;

    public eq0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.z0 z0Var) {
        super(context);
        this.N = photoViewer;
        this.f32238a = org.telegram.messenger.p10.f24470s0;
        this.f32246w = new ArrayList();
        this.L = new org.telegram.ui.Components.pb0(this, 7);
        this.f32239b = photoViewer2;
        this.f32244r = z0Var;
        org.telegram.ui.Components.st stVar = new org.telegram.ui.Components.st(this, context, context, 1);
        this.f32242f = stVar;
        stVar.getSettings().setJavaScriptEnabled(true);
        stVar.getSettings().setDomStorageEnabled(true);
        stVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        stVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(stVar, true);
        stVar.setWebViewClient(new n1(this, 2));
        addView(stVar, c8.ha.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f32240c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, c8.ha.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28257y6, null);
        textView.setGravity(17);
        linearLayout.addView(textView, c8.ha.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f32241e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.l6.f28047n6;
        org.telegram.ui.ActionBar.s6.U(textView2, i7, null);
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        int i10 = org.telegram.ui.ActionBar.a6.f27334a;
        textView2.setBackground(org.telegram.ui.ActionBar.a6.d(0, org.telegram.ui.ActionBar.a6.b(org.telegram.ui.ActionBar.l6.x0(null, i7, false)), 12.0f));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 1, 0, 8, 0, 0));
        bi.ec ecVar = new bi.ec(21, context, this);
        this.h = ecVar;
        ecVar.setBackgroundColor(-16777216);
        ecVar.setVisibility(4);
        addView(ecVar, c8.ha.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f32243n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, c8.ha.e(-2, -2, 17));
        this.M = new Rect();
    }

    public final void j(Canvas canvas, int i7, int i10) {
        Bitmap n10 = this.N.B4.n();
        if (n10 != null) {
            float min = Math.min(i7 / n10.getWidth(), i10 / n10.getHeight());
            int width = (int) (n10.getWidth() * min);
            int height = (int) (n10.getHeight() * min);
            int i11 = (i10 - height) / 2;
            int i12 = (i7 - width) / 2;
            Rect rect = this.M;
            rect.set(i12, i11, width + i12, height + i11);
            canvas.drawBitmap(n10, (Rect) null, rect, (Paint) null);
        }
    }
}
