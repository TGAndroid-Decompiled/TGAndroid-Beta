package org.telegram.ui.Components;

import android.app.Activity;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public abstract class ud0 extends FrameLayout {
    public TLRPC.WebPage E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public jb0 M;
    public int f38719a;
    public PhotoViewer f38720b;
    public LinearLayout f38721c;
    public TextView d;
    public TextView f38722e;
    public pt f38723f;
    public ai.x2 h;
    public RadialProgressView f38724n;
    public View f38725r;
    public String f38726s;
    public ArrayList f38727w;
    public String f38728x;
    public boolean f38729y;

    public static void a(org.telegram.ui.tp0 tp0Var, String str) {
        String str2;
        double ceil;
        int videoDuration = tp0Var.getVideoDuration() / 1000;
        ArrayList arrayList = tp0Var.f38727w;
        arrayList.clear();
        if (videoDuration > 15) {
            String[] split = str.split("\\|");
            String s6 = a1.g.s(new StringBuilder(), split[0].split("\\$")[0], "2/");
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
            int i3 = (int) ceil;
            for (int i10 = 0; i10 < i3; i10++) {
                Locale locale = Locale.ROOT;
                arrayList.add(s6 + "M" + i10 + str3 + "&sigh=" + str2);
            }
        }
    }

    public final void b(boolean z10) {
        jb0 jb0Var = this.M;
        if (!z10 && this.H) {
            org.telegram.messenger.g0.i3(jb0Var, 500L);
        } else if (z10 && !this.H) {
            org.telegram.messenger.g0.r(jb0Var);
        }
    }

    public final java.lang.String c(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ud0.c(int):java.lang.String");
    }

    public final boolean d() {
        return this.f38729y;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.L) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        boolean z10;
        if (this.f38729y && "inapp".equals(org.telegram.messenger.hp.s1(this.f38719a).B3)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !Settings.canDrawOverlays(getContext())) {
            t4.A((Activity) getContext(), null, false);
            return false;
        } else if (this.f38724n.getVisibility() == 0) {
            return false;
        } else {
            if (ie0.f34683q0.Q) {
                ie0.b(false);
                org.telegram.messenger.g0.i3(new qd0(this, 0), 300L);
                return true;
            }
            this.h.setVisibility(0);
            Activity activity = (Activity) getContext();
            pt ptVar = this.f38723f;
            TLRPC.WebPage webPage = this.E;
            if (ie0.x(z10, activity, this, ptVar, webPage.embed_width, webPage.embed_height, false)) {
                ie0.w(PhotoViewer.v1());
            }
            return true;
        }
    }

    public final void f() {
        if (this.H && this.f38729y) {
            h("pauseVideo();");
            this.H = false;
            b(true);
        }
    }

    public final void g() {
        if (!this.H && this.f38729y) {
            h("playVideo();");
            this.H = true;
            b(false);
        }
    }

    public float getBufferedPosition() {
        return this.K;
    }

    public int getCurrentPosition() {
        return this.J;
    }

    public int getVideoDuration() {
        return this.I;
    }

    public WebView getWebView() {
        return this.f38723f;
    }

    public final void h(String str) {
        this.f38723f.evaluateJavascript(str, null);
    }

    public final void i(long j10) {
        boolean z10 = this.H;
        this.J = (int) j10;
        if (z10) {
            f();
        }
        if (z10) {
            org.telegram.messenger.g0.i3(new ci.e3(this, j10, 23), 100L);
            return;
        }
        h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        pt ptVar = this.f38723f;
        if (ptVar.getParent() == this) {
            TLRPC.WebPage webPage = this.E;
            int i11 = webPage.embed_width;
            int i12 = 100;
            if (i11 == 0) {
                i11 = 100;
            }
            int i13 = webPage.embed_height;
            if (i13 != 0) {
                i12 = i13;
            }
            int size = View.MeasureSpec.getSize(i3);
            int size2 = View.MeasureSpec.getSize(i10);
            float f10 = i11;
            float f11 = i12;
            float min = Math.min(size / f10, size2 / f11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ptVar.getLayoutParams();
            int i14 = (int) (f10 * min);
            layoutParams.width = i14;
            int i15 = (int) (f11 * min);
            layoutParams.height = i15;
            layoutParams.topMargin = (size2 - i15) / 2;
            layoutParams.leftMargin = (size - i14) / 2;
        }
        super.onMeasure(i3, i10);
    }

    public void setPlaybackSpeed(float f10) {
        this.F = f10;
        if (this.f38724n.getVisibility() != 0) {
            if (this.f38729y) {
                h("setPlaybackSpeed(" + f10 + ");");
                return;
            }
            return;
        }
        this.G = true;
    }

    public void setTouchDisabled(boolean z10) {
        this.L = z10;
    }
}
