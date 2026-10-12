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
public final class lu0 extends org.telegram.ui.Components.vg0 {
    public final Rect M;
    public final PhotoViewer N;

    public lu0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.e1 e1Var) {
        super(context);
        this.N = photoViewer;
        this.f31503a = UserConfig.selectedAccount;
        this.v = new ArrayList();
        this.L = new org.telegram.ui.Components.cd0(this, 11);
        this.f31504b = photoViewer2;
        this.f31509r = e1Var;
        org.telegram.ui.Components.iv ivVar = new org.telegram.ui.Components.iv(this, context, context, 1);
        this.f31507f = ivVar;
        ivVar.getSettings().setJavaScriptEnabled(true);
        ivVar.getSettings().setDomStorageEnabled(true);
        ivVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        ivVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(ivVar, true);
        ivVar.setWebViewClient(new oi.i(this, 1));
        addView(ivVar, w7.w5.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31505c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, w7.w5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.f20945y6, null, false, textView, 17);
        linearLayout.addView(textView, w7.w5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f31506e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.h6.f20744n6;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i11 = org.telegram.ui.ActionBar.w5.f21428a;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{12.0f}, 0, org.telegram.ui.ActionBar.w5.b(org.telegram.ui.ActionBar.h6.x0(null, i10, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, w7.w5.t(-2, -2, 1, 0, 8, 0, 0));
        ci.bb bbVar = new ci.bb(this, context, 20);
        this.h = bbVar;
        bbVar.setBackgroundColor(-16777216);
        bbVar.setVisibility(4);
        addView(bbVar, w7.w5.d(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f31508n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, w7.w5.e(-2, -2, 17));
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
