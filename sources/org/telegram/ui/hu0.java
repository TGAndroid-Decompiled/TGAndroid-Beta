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
public final class hu0 extends org.telegram.ui.Components.zf0 {
    public final Rect M;
    public final PhotoViewer N;

    public hu0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.g1 g1Var) {
        super(context);
        this.N = photoViewer;
        this.f29658a = UserConfig.selectedAccount;
        this.v = new ArrayList();
        this.L = new org.telegram.ui.Components.kc0(this, 10);
        this.f29659b = photoViewer2;
        this.f29663r = g1Var;
        org.telegram.ui.Components.tu tuVar = new org.telegram.ui.Components.tu(this, context, context, 1);
        this.f29661f = tuVar;
        tuVar.getSettings().setJavaScriptEnabled(true);
        tuVar.getSettings().setDomStorageEnabled(true);
        tuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        tuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(tuVar, true);
        tuVar.setWebViewClient(new ki.i(this, 1));
        addView(tuVar, w7.a6.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f29660c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, w7.a6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.f18306y6, null, false, textView, 17);
        linearLayout.addView(textView, w7.a6.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f18110n6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i11 = org.telegram.ui.ActionBar.z5.f18836a;
        textView2.setBackground(org.telegram.ui.ActionBar.z5.d(new float[]{12.0f}, 0, org.telegram.ui.ActionBar.z5.b(org.telegram.ui.ActionBar.j6.w0(null, i10, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, w7.a6.t(-2, -2, 1, 0, 8, 0, 0));
        bi.nc ncVar = new bi.nc(this, context, 20);
        this.h = ncVar;
        ncVar.setBackgroundColor(-16777216);
        ncVar.setVisibility(4);
        addView(ncVar, w7.a6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f29662n = radialProgressView;
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
