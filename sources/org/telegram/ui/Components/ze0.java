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
public abstract class ze0 extends FrameLayout {
    public float A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public float F;
    public boolean G;
    public ib0 H;
    public int f35286a;
    public PhotoViewer f35287b;
    public LinearLayout f35288c;
    public TextView d;
    public TextView f35289e;
    public au f35290f;
    public fh.l2 h;
    public RadialProgressView f35291n;
    public View f35292r;
    public String f35293s;
    public ArrayList v;
    public String f35294w;
    public boolean f35295x;
    public TLRPC.WebPage f35296y;

    public static void a(org.telegram.ui.gt0 gt0Var, String str) {
        String str2;
        double ceil;
        int videoDuration = gt0Var.getVideoDuration() / 1000;
        ArrayList arrayList = gt0Var.v;
        arrayList.clear();
        if (videoDuration > 15) {
            String[] split = str.split("\\|");
            String r10 = aa.d.r(new StringBuilder(), split[0].split("\\$")[0], "2/");
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
            int i9 = (int) ceil;
            for (int i10 = 0; i10 < i9; i10++) {
                Locale locale = Locale.ROOT;
                arrayList.add(r10 + "M" + i10 + str3 + "&sigh=" + str2);
            }
        }
    }

    public final void b(boolean z10) {
        ib0 ib0Var = this.H;
        if (!z10 && this.C) {
            AndroidUtilities.runOnUIThread(ib0Var, 500L);
        } else if (z10 && !this.C) {
            AndroidUtilities.cancelRunOnUIThread(ib0Var);
        }
    }

    public final java.lang.String c(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ze0.c(int):java.lang.String");
    }

    public final boolean d() {
        return this.f35295x;
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
        if (this.f35295x && "inapp".equals(MessagesController.getInstance(this.f35286a).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(getContext())) {
            y4.B((Activity) getContext(), null, false);
            return false;
        } else if (this.f35291n.getVisibility() == 0) {
            return false;
        } else {
            if (pf0.f31622l0.L) {
                pf0.j(false);
                AndroidUtilities.runOnUIThread(new te0(this, 0), 300L);
                return true;
            }
            this.h.setVisibility(0);
            Activity activity = (Activity) getContext();
            au auVar = this.f35290f;
            TLRPC.WebPage webPage = this.f35296y;
            if (pf0.x(z10, activity, this, auVar, webPage.embed_width, webPage.embed_height, false)) {
                pf0.w(PhotoViewer.t1());
            }
            return true;
        }
    }

    public final void f() {
        if (this.C && this.f35295x) {
            h("pauseVideo();");
            this.C = false;
            b(true);
        }
    }

    public final void g() {
        if (!this.C && this.f35295x) {
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
        return this.f35290f;
    }

    public final void h(String str) {
        this.f35290f.evaluateJavascript(str, null);
    }

    public final void i(long j10) {
        boolean z10 = this.C;
        this.E = (int) j10;
        if (z10) {
            f();
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new bg.i2(this, j10, 23), 100L);
            return;
        }
        h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        au auVar = this.f35290f;
        if (auVar.getParent() == this) {
            TLRPC.WebPage webPage = this.f35296y;
            int i11 = webPage.embed_width;
            int i12 = 100;
            if (i11 == 0) {
                i11 = 100;
            }
            int i13 = webPage.embed_height;
            if (i13 != 0) {
                i12 = i13;
            }
            int size = View.MeasureSpec.getSize(i9);
            int size2 = View.MeasureSpec.getSize(i10);
            float f10 = i11;
            float f11 = i12;
            float min = Math.min(size / f10, size2 / f11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) auVar.getLayoutParams();
            int i14 = (int) (f10 * min);
            layoutParams.width = i14;
            int i15 = (int) (f11 * min);
            layoutParams.height = i15;
            layoutParams.topMargin = (size2 - i15) / 2;
            layoutParams.leftMargin = (size - i14) / 2;
        }
        super.onMeasure(i9, i10);
    }

    public void setPlaybackSpeed(float f10) {
        this.A = f10;
        if (this.f35291n.getVisibility() != 0) {
            if (this.f35295x) {
                h("setPlaybackSpeed(" + f10 + ");");
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
