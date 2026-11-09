package org.telegram.ui.Components;

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
public abstract class be0 extends FrameLayout {
    public TLRPC.WebPage D;
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public pb0 L;
    public int f32238a;
    public PhotoViewer f32239b;
    public LinearLayout f32240c;
    public TextView d;
    public TextView f32241e;
    public st f32242f;
    public bi.ec h;
    public RadialProgressView f32243n;
    public View f32244r;
    public String f32245s;
    public ArrayList f32246w;
    public String f32247x;
    public boolean f32248y;

    public static void a(org.telegram.ui.eq0 eq0Var, String str) {
        String str2;
        double ceil;
        int videoDuration = eq0Var.getVideoDuration() / 1000;
        ArrayList arrayList = eq0Var.f32246w;
        arrayList.clear();
        if (videoDuration > 15) {
            String[] split = str.split("\\|");
            String s5 = a8.p0.s(new StringBuilder(), split[0].split("\\$")[0], "2/");
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
            int i7 = (int) ceil;
            for (int i10 = 0; i10 < i7; i10++) {
                Locale locale = Locale.ROOT;
                arrayList.add(s5 + "M" + i10 + str3 + "&sigh=" + str2);
            }
        }
    }

    public final void b(boolean z9) {
        pb0 pb0Var = this.L;
        if (!z9 && this.G) {
            org.telegram.messenger.g0.i3(pb0Var, 500L);
        } else if (z9 && !this.G) {
            org.telegram.messenger.g0.r(pb0Var);
        }
    }

    public final java.lang.String c(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.be0.c(int):java.lang.String");
    }

    public final boolean d() {
        return this.f32248y;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        if (this.f32243n.getVisibility() != 0) {
            ti.o c10 = l2.i.d().c();
            if (c10 != null) {
                c10.b();
                org.telegram.messenger.g0.i3(new xd0(this, 0), 300L);
                return true;
            }
            this.h.setVisibility(0);
            PhotoViewer photoViewer = this.f32239b;
            if (photoViewer.D != null && photoViewer.f41401f0 != null) {
                photoViewer.T0();
                photoViewer.O8.g(photoViewer.D, null, true);
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.G && this.f32248y) {
            h("pauseVideo();");
            this.G = false;
            b(true);
        }
    }

    public final void g() {
        if (!this.G && this.f32248y) {
            h("playVideo();");
            this.G = true;
            b(false);
        }
    }

    public float getBufferedPosition() {
        return this.J;
    }

    public int getCurrentPosition() {
        return this.I;
    }

    public int getEmbedHeight() {
        TLRPC.WebPage webPage = this.D;
        if (webPage != null) {
            return webPage.embed_height;
        }
        return 0;
    }

    public int getEmbedWidth() {
        TLRPC.WebPage webPage = this.D;
        if (webPage != null) {
            return webPage.embed_width;
        }
        return 0;
    }

    public int getVideoDuration() {
        return this.H;
    }

    public WebView getWebView() {
        return this.f32242f;
    }

    public final void h(String str) {
        this.f32242f.evaluateJavascript(str, null);
    }

    public final void i(long j3) {
        boolean z9 = this.G;
        this.I = (int) j3;
        if (z9) {
            f();
        }
        if (z9) {
            org.telegram.messenger.g0.i3(new bi.r3(this, j3, 23), 100L);
            return;
        }
        h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        st stVar = this.f32242f;
        if (stVar.getParent() == this) {
            TLRPC.WebPage webPage = this.D;
            int i11 = webPage.embed_width;
            int i12 = 100;
            if (i11 == 0) {
                i11 = 100;
            }
            int i13 = webPage.embed_height;
            if (i13 != 0) {
                i12 = i13;
            }
            int size = View.MeasureSpec.getSize(i7);
            int size2 = View.MeasureSpec.getSize(i10);
            float f10 = i11;
            float f11 = i12;
            float min = Math.min(size / f10, size2 / f11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) stVar.getLayoutParams();
            int i14 = (int) (f10 * min);
            layoutParams.width = i14;
            int i15 = (int) (f11 * min);
            layoutParams.height = i15;
            layoutParams.topMargin = (size2 - i15) / 2;
            layoutParams.leftMargin = (size - i14) / 2;
        }
        super.onMeasure(i7, i10);
    }

    public void setPlaybackSpeed(float f10) {
        this.E = f10;
        if (this.f32243n.getVisibility() != 0) {
            if (this.f32248y) {
                h("setPlaybackSpeed(" + f10 + ");");
                return;
            }
            return;
        }
        this.F = true;
    }

    public void setTouchDisabled(boolean z9) {
        this.K = z9;
    }
}
