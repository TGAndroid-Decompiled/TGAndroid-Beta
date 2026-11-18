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
public final class dq0 extends org.telegram.ui.Components.ke0 {
    public final Rect N;
    public final PhotoViewer O;

    public dq0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.z0 z0Var) {
        super(context);
        this.O = photoViewer;
        this.f36743a = org.telegram.messenger.j10.f24770t0;
        this.f36751w = new ArrayList();
        this.M = new org.telegram.ui.Components.gb0(this, 9);
        this.f36744b = photoViewer2;
        this.f36749r = z0Var;
        org.telegram.ui.Components.cu cuVar = new org.telegram.ui.Components.cu(this, context, context, 1);
        this.f36747f = cuVar;
        cuVar.getSettings().setJavaScriptEnabled(true);
        cuVar.getSettings().setDomStorageEnabled(true);
        cuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        cuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(cuVar, true);
        cuVar.setWebViewClient(new n1(this, 2));
        addView(cuVar, c8.ma.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36745c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, c8.ma.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29786y6, null);
        textView.setGravity(17);
        linearLayout.addView(textView, c8.ma.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f36746e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29576n6;
        org.telegram.ui.ActionBar.u6.U(textView2, i7, null);
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        int i10 = org.telegram.ui.ActionBar.b6.f28810a;
        textView2.setBackground(org.telegram.ui.ActionBar.b6.d(0, org.telegram.ui.ActionBar.b6.b(org.telegram.ui.ActionBar.n6.x0(null, i7, false)), 12.0f));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, c8.ma.t(-2, -2, 1, 0, 8, 0, 0));
        bi.i3 i3Var = new bi.i3(22, context, this);
        this.h = i3Var;
        i3Var.setBackgroundColor(-16777216);
        i3Var.setVisibility(4);
        addView(i3Var, c8.ma.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f36748n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, c8.ma.e(-2, -2, 17));
        this.N = new Rect();
    }

    public final void j(Canvas canvas, int i7, int i10) {
        Bitmap n10 = this.O.C4.n();
        if (n10 != null) {
            float min = Math.min(i7 / n10.getWidth(), i10 / n10.getHeight());
            int width = (int) (n10.getWidth() * min);
            int height = (int) (n10.getHeight() * min);
            int i11 = (i10 - height) / 2;
            int i12 = (i7 - width) / 2;
            Rect rect = this.N;
            rect.set(i12, i11, width + i12, height + i11);
            canvas.drawBitmap(n10, (Rect) null, rect, (Paint) null);
        }
    }
}
