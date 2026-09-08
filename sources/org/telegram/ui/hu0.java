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
public final class hu0 extends org.telegram.ui.Components.qf0 {
    public final Rect M;
    public final PhotoViewer N;

    public hu0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.f1 f1Var) {
        super(context);
        this.N = photoViewer;
        this.f29734a = UserConfig.selectedAccount;
        this.v = new ArrayList();
        this.L = new org.telegram.ui.Components.cc0(this, 10);
        this.f29735b = photoViewer2;
        this.f29740r = f1Var;
        org.telegram.ui.Components.nu nuVar = new org.telegram.ui.Components.nu(this, context, context, 1);
        this.f29738f = nuVar;
        nuVar.getSettings().setJavaScriptEnabled(true);
        nuVar.getSettings().setDomStorageEnabled(true);
        nuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        nuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(nuVar, true);
        nuVar.setWebViewClient(new fg.i(this, 1));
        addView(nuVar, w7.x5.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f29736c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, w7.x5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f21069y6, null, false, textView, 17);
        linearLayout.addView(textView, w7.x5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f29737e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f20873n6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i11 = org.telegram.ui.ActionBar.y5.f21570a;
        textView2.setBackground(org.telegram.ui.ActionBar.y5.d(new float[]{12.0f}, 0, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.j6.w0(null, i10, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 1, 0, 8, 0, 0));
        di.eb ebVar = new di.eb(this, context, 20);
        this.h = ebVar;
        ebVar.setBackgroundColor(-16777216);
        ebVar.setVisibility(4);
        addView(ebVar, w7.x5.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f29739n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, w7.x5.e(-2, -2, 17));
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
