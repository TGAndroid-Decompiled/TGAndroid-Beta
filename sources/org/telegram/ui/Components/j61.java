package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.PhotoViewer;
public final class j61 {
    public final org.telegram.ui.fo0 f36308a;
    public hi.r7 f36309b;
    public String f36310c;
    public boolean d;
    public m.o3 f36311e;
    public ac0 f36312f;
    public ArrayList f36313g;
    public hi.o7 h;
    public boolean f36314i;
    public final rc f36315j = new rc(this, 22);

    public j61(org.telegram.ui.fo0 fo0Var) {
        this.f36308a = fo0Var;
    }

    public final void a(int i7, hi.p7 p7Var) {
        hi.p7 p7Var2;
        String l10;
        hi.r7 r7Var;
        android.support.v4.media.session.a0 a0Var;
        if (p7Var != null && !DictationAsr.E(i7)) {
            p7Var2 = null;
        } else {
            p7Var2 = p7Var;
        }
        if (p7Var2 == null) {
            l10 = null;
        } else {
            l10 = p7Var2.l();
        }
        if (TextUtils.equals(l10, this.f36310c)) {
            return;
        }
        c();
        hi.r7 r7Var2 = this.f36309b;
        if (r7Var2 != null) {
            r7Var2.c();
            this.f36309b = null;
        }
        this.f36310c = l10;
        if (p7Var2 != null) {
            hi.r7 r7Var3 = new hi.r7(p7Var2, 0L, 0L, new sh0(26, this, r9));
            this.f36309b = r7Var3;
            hi.r7[] r7VarArr = {r7Var3};
            if (r7Var3.f15304f != null && org.telegram.messenger.mp.g1().getBoolean("asr_video_captions", false) && (a0Var = (r7Var = this.f36309b).f15304f) != null && (DictationAsr.C((ai.q) a0Var.f1676b) || DictationAsr.A((ai.q) r7Var.f15304f.f1676b))) {
                b();
            }
        }
        this.f36308a.i();
    }

    public final void b() {
        hi.r7 r7Var;
        int i7;
        String o4;
        org.telegram.ui.fo0 fo0Var = this.f36308a;
        PhotoViewer photoViewer = fo0Var.f47939a;
        if (!this.d && (r7Var = this.f36309b) != null && r7Var.f15304f != null) {
            this.d = true;
            ac0 ac0Var = this.f36312f;
            int i10 = -1;
            if (ac0Var != null) {
                if (ac0Var.getParent() == null) {
                    org.telegram.ui.qq0 qq0Var = photoViewer.f43334f0;
                    ac0 ac0Var2 = this.f36312f;
                    org.telegram.ui.cr0 cr0Var = photoViewer.f43363i3;
                    if (cr0Var != null) {
                        i10 = qq0Var.indexOfChild(cr0Var);
                    }
                    qq0Var.addView(ac0Var2, i10, c8.na.d(-2, -2.0f, 49, 16.0f, 0.0f, 16.0f, 0.0f));
                }
            } else {
                ac0 ac0Var3 = new ac0(photoViewer.f43334f0.getContext(), 1);
                this.f36312f = ac0Var3;
                ac0Var3.setEnabled(false);
                this.f36312f.setFocusable(false);
                this.f36312f.setClickable(false);
                this.f36312f.setBackgroundColor(0);
                this.f36312f.setTextSize(1, 16.0f);
                this.f36312f.setTypeface(org.telegram.messenger.g0.o());
                this.f36312f.setGravity(17);
                this.f36312f.setTextAlignment(4);
                this.f36312f.setHorizontallyScrolling(false);
                this.f36312f.setMaxLines(3);
                this.f36312f.setBreakStrategy(0);
                this.f36312f.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
                this.f36312f.setFrameColor(2130706432);
                this.f36312f.setTextColor(-1);
                this.f36312f.setTallFrame(true);
                this.f36312f.setAlpha(0.0f);
                this.f36312f.setImportantForAccessibility(2);
                org.telegram.ui.qq0 qq0Var2 = photoViewer.f43334f0;
                ac0 ac0Var4 = this.f36312f;
                org.telegram.ui.cr0 cr0Var2 = photoViewer.f43363i3;
                if (cr0Var2 != null) {
                    i10 = qq0Var2.indexOfChild(cr0Var2);
                }
                qq0Var2.addView(ac0Var4, i10, c8.na.d(-2, -2.0f, 49, 16.0f, 0.0f, 16.0f, 0.0f));
            }
            hi.r7 r7Var2 = this.f36309b;
            r7Var2.f15311n = new hy(fo0Var, 26);
            r7Var2.d = 1;
            TextPaint textPaint = new TextPaint(this.f36312f.getPaint());
            if (photoViewer.f43334f0.getWidth() > 0) {
                i7 = photoViewer.f43334f0.getWidth();
            } else {
                i7 = org.telegram.messenger.g0.f24226q.x;
            }
            r7Var2.f15318u = new hy(textPaint, 27);
            r7Var2.v = (((i7 - org.telegram.messenger.g0.L(32.0f)) - this.f36312f.getPaddingLeft()) - this.f36312f.getPaddingRight()) * 0.96f;
            Context context = this.f36312f.getContext();
            org.telegram.ui.qq0 qq0Var3 = photoViewer.f43334f0;
            org.telegram.ui.ActionBar.i6 i6Var = photoViewer.f43484w2;
            android.support.v4.media.session.a0 a0Var = r7Var2.f15304f;
            if (a0Var == null) {
                o4 = "";
            } else {
                o4 = ai.l0.o(a0Var.i());
            }
            m.o3 o3Var = new m.o3(context, qq0Var3, i6Var, o4, new sh0(27, this, r7Var2));
            this.f36311e = o3Var;
            r7Var2.h(0L, 0L, new i61(this, o3Var, r7Var2));
            ac0 ac0Var5 = this.f36312f;
            rc rcVar = this.f36315j;
            ac0Var5.removeCallbacks(rcVar);
            this.f36312f.postOnAnimation(rcVar);
        }
    }

    public final void c() {
        hi.r7 r7Var = this.f36309b;
        if (r7Var != null) {
            r7Var.i();
        }
        m.o3 o3Var = this.f36311e;
        if (o3Var != null) {
            o3Var.f20256f = null;
            fc fcVar = (fc) o3Var.h;
            if (fcVar != null) {
                fcVar.b();
                o3Var.h = null;
            }
            this.f36311e = null;
        }
        this.d = false;
        this.f36313g = null;
        this.h = null;
        ac0 ac0Var = this.f36312f;
        if (ac0Var != null) {
            ac0Var.removeCallbacks(this.f36315j);
            this.f36312f.animate().cancel();
            this.f36312f.setAlpha(0.0f);
            this.f36314i = false;
        }
    }

    public final void d() {
        hi.r7 r7Var = this.f36309b;
        if (r7Var != null && r7Var.f15304f != null) {
            if (this.d) {
                org.telegram.messenger.mp.g1().edit().putBoolean("asr_video_captions", false).apply();
                c();
            } else {
                org.telegram.messenger.mp.g1().edit().putBoolean("asr_video_captions", true).apply();
                b();
            }
            this.f36308a.i();
        }
    }
}
