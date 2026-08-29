package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public abstract class mf0 extends FrameLayout {
    public float A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public float F;
    public boolean G;
    public xb0 H;
    public int f30671a;
    public PhotoViewer f30672b;
    public LinearLayout f30673c;
    public TextView d;
    public TextView f30674e;
    public gu f30675f;
    public cg.h0 h;
    public RadialProgressView f30676n;
    public View f30677r;
    public String f30678s;
    public ArrayList v;
    public String f30679w;
    public boolean f30680x;
    public TLRPC.WebPage f30681y;

    public static void a(org.telegram.ui.et0 et0Var, String str) {
        String str2;
        double ceil;
        int videoDuration = et0Var.getVideoDuration() / 1000;
        ArrayList arrayList = et0Var.v;
        arrayList.clear();
        if (videoDuration > 15) {
            String[] split = str.split("\\|");
            String q6 = a4.w.q(new StringBuilder(), split[0].split("\\$")[0], "2/");
            String str3 = split[0].split("\\$N")[1];
            if (split.length == 3) {
                str2 = split[2].split("M#")[1];
            } else if (split.length == 2) {
                str2 = split[1].split("t#")[1];
            } else {
                str2 = split[3].split("M#")[1];
            }
            if (videoDuration <= 100) {
                ceil = Math.ceil(videoDuration / 25.0f);
            } else if (videoDuration <= 250) {
                ceil = Math.ceil((videoDuration / 2.0f) / 25.0f);
            } else if (videoDuration <= 500) {
                ceil = Math.ceil((videoDuration / 4.0f) / 25.0f);
            } else if (videoDuration <= 1000) {
                ceil = Math.ceil((videoDuration / 5.0f) / 25.0f);
            } else {
                ceil = Math.ceil((videoDuration / 10.0f) / 25.0f);
            }
            int i10 = (int) ceil;
            for (int i11 = 0; i11 < i10; i11++) {
                Locale locale = Locale.ROOT;
                arrayList.add(q6 + "M" + i11 + str3 + "&sigh=" + str2);
            }
        }
    }

    public final void b(boolean z10) {
        xb0 xb0Var = this.H;
        if (!z10 && this.C) {
            AndroidUtilities.runOnUIThread(xb0Var, 500L);
        } else if (z10 && !this.C) {
            AndroidUtilities.cancelRunOnUIThread(xb0Var);
        }
    }

    public final java.lang.String c(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mf0.c(int):java.lang.String");
    }

    public final boolean d() {
        return this.f30680x;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.G) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        boolean z10;
        if (this.f30680x && "inapp".equals(MessagesController.getInstance(this.f30671a).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(getContext())) {
            c5.B((Activity) getContext(), null, false);
            return false;
        } else if (this.f30676n.getVisibility() == 0) {
            return false;
        } else {
            if (bg0.f27076l0.L) {
                bg0.j(false);
                AndroidUtilities.runOnUIThread(new hf0(this, 0), 300L);
                return true;
            }
            this.h.setVisibility(0);
            Activity activity = (Activity) getContext();
            gu guVar = this.f30675f;
            TLRPC.WebPage webPage = this.f30681y;
            if (bg0.x(z10, activity, this, guVar, webPage.embed_width, webPage.embed_height, false)) {
                bg0.w(PhotoViewer.t1());
            }
            return true;
        }
    }

    public final void f() {
        if (this.C && this.f30680x) {
            h("pauseVideo();");
            this.C = false;
            b(true);
        }
    }

    public final void g() {
        if (!this.C && this.f30680x) {
            h("playVideo();");
            this.C = true;
            b(false);
        }
    }

    public float getBufferedPosition() {
        return this.F;
    }

    public int getCurrentPosition() {
        return this.E;
    }

    public int getVideoDuration() {
        return this.D;
    }

    public WebView getWebView() {
        return this.f30675f;
    }

    public final void h(String str) {
        this.f30675f.evaluateJavascript(str, null);
    }

    public final void i(long j10) {
        boolean z10 = this.C;
        this.E = (int) j10;
        if (z10) {
            f();
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new eg.z1(this, j10, 21), 100L);
            return;
        }
        h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        gu guVar = this.f30675f;
        if (guVar.getParent() == this) {
            TLRPC.WebPage webPage = this.f30681y;
            int i12 = webPage.embed_width;
            int i13 = 100;
            if (i12 == 0) {
                i12 = 100;
            }
            int i14 = webPage.embed_height;
            if (i14 != 0) {
                i13 = i14;
            }
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            float f9 = i12;
            float f10 = i13;
            float min = Math.min(size / f9, size2 / f10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) guVar.getLayoutParams();
            int i15 = (int) (f9 * min);
            layoutParams.width = i15;
            int i16 = (int) (f10 * min);
            layoutParams.height = i16;
            layoutParams.topMargin = (size2 - i16) / 2;
            layoutParams.leftMargin = (size - i15) / 2;
        }
        super.onMeasure(i10, i11);
    }

    public void setPlaybackSpeed(float f9) {
        this.A = f9;
        if (this.f30676n.getVisibility() != 0) {
            if (this.f30680x) {
                h("setPlaybackSpeed(" + f9 + ");");
                return;
            }
            return;
        }
        this.B = true;
    }

    public void setTouchDisabled(boolean z10) {
        this.G = z10;
    }
}
