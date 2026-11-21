package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class eo extends LinearLayout {
    public final org.telegram.ui.ActionBar.h6 f34941a;
    public final TextView f34942b;
    public final ArrayList f34943c;
    public final ArrayList d;

    public eo(Activity activity, View view, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        Paint paint;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        this.f34943c = arrayList;
        this.d = new ArrayList();
        this.f34941a = h6Var;
        int L = org.telegram.messenger.g0.L(18.0f);
        if (h6Var != null) {
            paint = h6Var.g("paintChatActionBackground");
        } else {
            paint = null;
        }
        paint = paint == null ? org.telegram.ui.ActionBar.m6.V0("paintChatActionBackground") : paint;
        int i14 = org.telegram.ui.ActionBar.m6.f29313a;
        setBackground(new org.telegram.ui.ActionBar.x5(this, view, L, paint));
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        setOrientation(1);
        if (i7 == 0) {
            TextView textView = new TextView(activity);
            this.f34942b = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Zc, h6Var);
            textView.setGravity(1);
            textView.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
            arrayList.add(textView);
            addView(textView, c8.ma.r(-2, -2, 49));
        } else if (i7 == 1) {
            TextView textView2 = new TextView(activity);
            this.f34942b = textView2;
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Zc, h6Var);
            textView2.setGravity(1);
            textView2.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
            arrayList.add(textView2);
            addView(textView2, c8.ma.r(-2, -2, 49));
        } else {
            ?? imageView = new ImageView(activity);
            imageView.setAutoRepeat(true);
            imageView.f(2131624327, 120, 120, null);
            imageView.d();
            addView((View) imageView, c8.ma.t(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i7 == 0) {
            org.telegram.messenger.n10.l(15.0f, 2131751123, 1, textView3, null);
        } else if (i7 == 1) {
            org.telegram.messenger.n10.l(15.0f, 2131749244, 1, textView3, null);
        } else {
            textView3.setText(org.telegram.messenger.gd.N0(2131752171, null));
            textView3.setTextSize(1, 16.0f);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setGravity(1);
        }
        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.Zc, h6Var);
        arrayList.add(textView3);
        float f10 = 260.0f;
        textView3.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
        if (i7 != 2) {
            if (org.telegram.messenger.gd.f24241a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
        } else {
            i10 = 1;
        }
        int i15 = i10 | 48;
        if (i7 != 2) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        addView(textView3, c8.ma.t(-2, -2, i15, 0, 8, 0, i11));
        int i16 = 0;
        while (i16 < 4) {
            LinearLayout f11 = org.telegram.messenger.f3.f(activity, 0);
            if (org.telegram.messenger.gd.f24241a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(f11, c8.ma.t(-2, -2, i12, 0, 8, 0, 0));
            ImageView imageView2 = new ImageView(activity);
            float f12 = f10;
            int i17 = org.telegram.ui.ActionBar.m6.Zc;
            org.telegram.ui.ActionBar.t6.s(imageView2, i17, h6Var, PorterDuff.Mode.MULTIPLY);
            if (i7 == 0) {
                imageView2.setImageResource(2131231311);
            } else if (i7 == 2) {
                imageView2.setImageResource(2131231624);
            } else {
                imageView2.setImageResource(2131231235);
            }
            this.d.add(imageView2);
            TextView textView4 = new TextView(activity);
            textView4.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.t6.U(textView4, i17, h6Var);
            this.f34943c.add(textView4);
            if (org.telegram.messenger.gd.f24241a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView4.setGravity(i13 | 16);
            textView4.setMaxWidth(org.telegram.messenger.g0.L(f12));
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            if (i7 == 0) {
                                textView4.setText(org.telegram.messenger.gd.N0(2131751124, null));
                            } else if (i7 == 2) {
                                textView4.setText(org.telegram.messenger.gd.N0(2131752173, null));
                            } else {
                                textView4.setText(org.telegram.messenger.gd.N0(2131749252, null));
                            }
                        }
                    } else if (i7 == 0) {
                        textView4.setText(org.telegram.messenger.gd.N0(2131751125, null));
                    } else if (i7 == 2) {
                        textView4.setText(org.telegram.messenger.gd.N0(2131752174, null));
                    } else {
                        textView4.setText(org.telegram.messenger.gd.N0(2131749253, null));
                    }
                } else if (i7 == 0) {
                    textView4.setText(org.telegram.messenger.gd.N0(2131751126, null));
                } else if (i7 == 2) {
                    textView4.setText(org.telegram.messenger.gd.N0(2131752175, null));
                } else {
                    textView4.setText(org.telegram.messenger.gd.N0(2131749254, null));
                }
            } else if (i7 == 0) {
                textView4.setText(org.telegram.messenger.gd.N0(2131751127, null));
            } else if (i7 == 2) {
                textView4.setText(org.telegram.messenger.gd.N0(2131752176, null));
            } else {
                textView4.setText(org.telegram.messenger.gd.N0(2131749255, null));
            }
            if (org.telegram.messenger.gd.f24241a0) {
                f11.addView(textView4, c8.ma.o(-2, -2));
                if (i7 == 0) {
                    f11.addView(imageView2, c8.ma.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                } else if (i7 == 2) {
                    f11.addView(imageView2, c8.ma.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f11.addView(imageView2, c8.ma.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                }
            } else {
                if (i7 == 0) {
                    f11.addView(imageView2, c8.ma.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                } else if (i7 == 2) {
                    f11.addView(imageView2, c8.ma.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                } else {
                    f11.addView(imageView2, c8.ma.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                }
                f11.addView(textView4, c8.ma.o(-2, -2));
            }
            i16++;
            f10 = f12;
        }
    }

    public void setStatusText(CharSequence charSequence) {
        this.f34942b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f34943c;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((TextView) arrayList.get(i11)).setTextColor(i7);
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 < arrayList2.size()) {
                ((ImageView) arrayList2.get(i10)).setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zc, this.f34941a), PorterDuff.Mode.MULTIPLY));
                i10++;
            } else {
                return;
            }
        }
    }
}
