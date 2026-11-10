package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class m extends FrameLayout implements org.telegram.messenger.u9, org.telegram.ui.ActionBar.c6 {
    public final int f29542a;
    public final org.telegram.ui.Components.i6 f29543b;
    public final org.telegram.ui.Components.i6 f29544c;
    public final l d;
    public ArrayList f29545e;
    public boolean f29546f;

    public m(Activity activity, int i7) {
        super(activity);
        this.f29545e = new ArrayList();
        this.f29542a = i7;
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 1);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(activity, false, false, false);
        this.f29543b = i6Var;
        i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        i6Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
        e10.addView(i6Var, c8.ha.o(-1, 18));
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(activity, false, false, false);
        this.f29544c = i6Var2;
        i6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        e10.addView(i6Var2, c8.ha.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 17));
        l lVar = new l(activity, i7);
        this.d = lVar;
        lVar.b(299L);
        addView(e10, c8.ha.d(-1, -2.0f, 16, 14.0f, 0.0f, 90.0f, 0.0f));
        addView(lVar, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        Drawable N0 = org.telegram.ui.ActionBar.m6.N0(false);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.f27982i6);
        setBackground(N0);
        org.telegram.ui.ActionBar.t6.j(this, N0, null, M, null);
        updateColors();
        setOnClickListener(new a(this, 1));
    }

    @Override
    public final void g(ArrayList arrayList) {
        org.telegram.ui.Components.i6 i6Var;
        String str;
        String a02;
        String str2;
        String a03;
        String a04;
        boolean z9;
        int i7;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f29545e = arrayList2;
        int size = arrayList2.size();
        l lVar = this.d;
        if (size == 1) {
            org.telegram.messenger.s9 s9Var = (org.telegram.messenger.s9) this.f29545e.get(0);
            s9Var.getClass();
            if (s9Var.g(ConnectionsManager.getInstance(p10.f24474s0).getCurrentTime())) {
                lVar.a(s9Var.d.auction_start_date);
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = s9Var.f25442f;
                if (tL_starGiftAuctionState != null) {
                    i7 = Math.max(0, tL_starGiftAuctionState.next_round_at);
                } else {
                    i7 = 0;
                }
                lVar.a(i7);
            }
        } else {
            lVar.f29479f = 0;
            lVar.f29477c.b();
            lVar.f29475a.t(id.M0(2131750336, null), true, true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size2 = this.f29545e.size();
        if (size2 == 0) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f29542a).getCurrentTime();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            i6Var = this.f29543b;
            if (i10 >= size2) {
                break;
            }
            org.telegram.messenger.s9 s9Var2 = (org.telegram.messenger.s9) this.f29545e.get(i10);
            boolean g10 = s9Var2.g(currentTime);
            int i11 = size2;
            long j3 = s9Var2.f25440c;
            z10 |= g10;
            if (j3 != 0) {
                spannableStringBuilder.append((CharSequence) "*");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.q5(j3, i6Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
            int d = s9Var2.d();
            if (d != 2 && d != 3) {
                z9 = false;
            } else {
                z9 = true;
            }
            z11 |= z9;
            i10++;
            size2 = i11;
        }
        int i12 = size2;
        spannableStringBuilder.append(' ');
        if (z10) {
            if (i12 == 1) {
                str = null;
                a04 = id.M0(2131750401, null);
            } else {
                str = null;
                a04 = id.a0(null, null, 2131750400, Integer.valueOf(i12));
            }
            spannableStringBuilder.append((CharSequence) a04);
        } else {
            str = null;
            if (i12 == 1) {
                a02 = id.M0(2131750419, null);
            } else {
                a02 = id.a0(null, null, 2131750418, Integer.valueOf(i12));
            }
            spannableStringBuilder.append((CharSequence) a02);
        }
        i6Var.c(spannableStringBuilder, true, true);
        this.f29546f = false;
        org.telegram.ui.Components.i6 i6Var2 = this.f29544c;
        if (z10) {
            i6Var2.setText(id.M0(2131750413, str));
        } else if (z11) {
            i6Var2.setText(id.M0(2131750412, str));
            this.f29546f = true;
        } else if (i12 > 1) {
            i6Var2.setText(id.M0(2131750408, str));
        } else {
            int i13 = ((org.telegram.messenger.s9) this.f29545e.get(0)).f25444i;
            if (i13 == 1) {
                a03 = id.M0(2131750411, str);
            } else if (i13 == 2) {
                a03 = id.M0(2131750410, str);
            } else if (i13 == 3) {
                a03 = id.M0(2131750409, str);
            } else {
                int i14 = i13 % 100;
                if (i14 >= 11 && i14 <= 13) {
                    str2 = null;
                    a03 = id.a0(null, null, 2131750402, Integer.valueOf(i13));
                } else {
                    int i15 = i13 % 10;
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                str2 = null;
                                a03 = id.a0(null, null, 2131750402, Integer.valueOf(i13));
                            } else {
                                str2 = null;
                                a03 = id.a0(null, null, 2131750404, Integer.valueOf(i13));
                            }
                        } else {
                            str2 = null;
                            a03 = id.a0(null, null, 2131750406, Integer.valueOf(i13));
                        }
                    } else {
                        str2 = null;
                        a03 = id.a0(null, null, 2131750403, Integer.valueOf(i13));
                    }
                }
                i6Var2.setText(id.a0(str2, str2, 2131750407, a03));
            }
            str2 = str;
            i6Var2.setText(id.a0(str2, str2, 2131750407, a03));
        }
        updateColors();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f29542a;
        org.telegram.messenger.w9.c(i7).f26285f.add(this);
        g(org.telegram.messenger.w9.c(i7).f26283c);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.w9.c(this.f29542a).f26285f.remove(this);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i7;
        this.f29543b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        if (this.f29546f) {
            i7 = org.telegram.ui.ActionBar.m6.f28131q7;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f28282y6;
        }
        this.f29544c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
