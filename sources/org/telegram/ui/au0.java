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
public final class au0 extends org.telegram.ui.Components.ag0 {
    public final Rect M;
    public final PhotoViewer N;

    public au0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.e1 e1Var) {
        super(context);
        this.N = photoViewer;
        this.f22657a = UserConfig.selectedAccount;
        this.v = new ArrayList();
        this.L = new org.telegram.ui.Components.ic0(this, 11);
        this.f22658b = photoViewer2;
        this.f22662r = e1Var;
        org.telegram.ui.Components.qu quVar = new org.telegram.ui.Components.qu(this, context, context, 1);
        this.f22660f = quVar;
        quVar.getSettings().setJavaScriptEnabled(true);
        quVar.getSettings().setDomStorageEnabled(true);
        quVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        quVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(quVar, true);
        quVar.setWebViewClient(new oi.i(this, 1));
        addView(quVar, w7.y5.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f22659c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, w7.y5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f19428y6, null, false, textView, 17);
        linearLayout.addView(textView, w7.y5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.h6.f19229n6;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i11 = org.telegram.ui.ActionBar.w5.f19887a;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{12.0f}, 0, org.telegram.ui.ActionBar.w5.b(org.telegram.ui.ActionBar.h6.w0(null, i10, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, w7.y5.t(-2, -2, 1, 0, 8, 0, 0));
        ci.bb bbVar = new ci.bb(this, context, 20);
        this.h = bbVar;
        bbVar.setBackgroundColor(-16777216);
        bbVar.setVisibility(4);
        addView(bbVar, w7.y5.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f22661n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, w7.y5.e(-2, -2, 17));
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
