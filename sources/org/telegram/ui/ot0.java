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
public final class ot0 extends org.telegram.ui.Components.lg0 {
    public final Rect M;
    public final PhotoViewer N;

    public ot0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.e1 e1Var) {
        super(context);
        this.N = photoViewer;
        this.f28155a = UserConfig.selectedAccount;
        this.v = new ArrayList();
        this.L = new org.telegram.ui.Components.rc0(this, 10);
        this.f28156b = photoViewer2;
        this.f28160r = e1Var;
        org.telegram.ui.Components.wu wuVar = new org.telegram.ui.Components.wu(this, context, context, 1);
        this.f28158f = wuVar;
        wuVar.getSettings().setJavaScriptEnabled(true);
        wuVar.getSettings().setDomStorageEnabled(true);
        wuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        wuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(wuVar, true);
        wuVar.setWebViewClient(new org.telegram.ui.Components.hg0(this, 0));
        addView(wuVar, w7.z5.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f28157c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, w7.z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.h6.f21382y6, null, false, textView, 17);
        linearLayout.addView(textView, w7.z5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.h6.f21177n6;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i11 = org.telegram.ui.ActionBar.x5.f21894a;
        textView2.setBackground(org.telegram.ui.ActionBar.x5.d(new float[]{12.0f}, 0, org.telegram.ui.ActionBar.x5.b(org.telegram.ui.ActionBar.h6.x0(null, i10, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 1, 0, 8, 0, 0));
        ai.ic icVar = new ai.ic(this, context, 21);
        this.h = icVar;
        icVar.setBackgroundColor(-16777216);
        icVar.setVisibility(4);
        addView(icVar, w7.z5.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f28159n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, w7.z5.e(-2, -2, 17));
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
