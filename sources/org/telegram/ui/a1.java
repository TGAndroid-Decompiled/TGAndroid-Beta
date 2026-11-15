package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class a1 extends FrameLayout implements org.telegram.ui.Cells.g9, org.telegram.ui.ActionBar.z5 {
    public AnimatorSet E;
    public final int F;
    public TL_iv.pageBlockChannel G;
    public int f44897a;
    public final n50 f44898b;
    public final e4 f44899c;
    public final org.telegram.ui.Components.hq d;
    public final TextView f44900e;
    public final ImageView f44901f;
    public int h;
    public z2 f44902n;
    public int f44903r;
    public final int f44904s;
    public final int f44905w;
    public int f44906x;
    public final Paint f44907y;

    public a1(Context context, n50 n50Var, e4 e4Var, int i7) {
        super(context);
        this.f44904s = org.telegram.messenger.g0.L(18.0f);
        this.f44905w = org.telegram.messenger.g0.L(11.0f);
        this.f44898b = n50Var;
        this.f44899c = e4Var;
        setWillNotDraw(false);
        this.f44907y = new Paint();
        this.F = i7;
        TextView textView = new TextView(context);
        this.f44900e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.hd.M0(2131752397, null));
        textView.setGravity(19);
        addView(textView, c8.ja.e(-2, 39, 53));
        textView.setOnClickListener(new org.telegram.messenger.video.e(9, this, n50Var));
        ImageView imageView = new ImageView(context);
        this.f44901f = imageView;
        imageView.setImageResource(2131231622);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ja.e(39, 39, 53));
        org.telegram.ui.Components.hq hqVar = new org.telegram.ui.Components.hq(context, 0);
        this.d = hqVar;
        addView(hqVar, c8.ja.e(39, 39, 53));
    }

    public final void a(int i7, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = i7;
        ImageView imageView = this.f44901f;
        org.telegram.ui.Components.hq hqVar = this.d;
        TextView textView = this.f44900e;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.E = animatorSet2;
            if (i7 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            float[] fArr = {f19};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, fArr);
            if (i7 == 0) {
                f20 = 1.0f;
            } else {
                f20 = 0.1f;
            }
            float[] fArr2 = {f20};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, fArr2);
            if (i7 == 0) {
                f21 = 1.0f;
            } else {
                f21 = 0.1f;
            }
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, property3, f21);
            if (i7 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(hqVar, property, f22);
            if (i7 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.1f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(hqVar, property2, f23);
            if (i7 == 1) {
                f24 = 1.0f;
            } else {
                f24 = 0.1f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(hqVar, property3, f24);
            if (i7 == 2) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(imageView, property, f25);
            if (i7 == 2) {
                f26 = 1.0f;
            } else {
                f26 = 0.1f;
            }
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(imageView, property2, f26);
            if (i7 == 2) {
                f27 = 1.0f;
            } else {
                f27 = 0.1f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(imageView, property3, f27));
            this.E.setDuration(150L);
            this.E.start();
            return;
        }
        if (i7 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        textView.setAlpha(f10);
        if (i7 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        textView.setScaleX(f11);
        if (i7 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.1f;
        }
        textView.setScaleY(f12);
        if (i7 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        hqVar.setAlpha(f13);
        if (i7 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        hqVar.setScaleX(f14);
        if (i7 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        hqVar.setScaleY(f15);
        if (i7 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        imageView.setAlpha(f16);
        if (i7 == 2) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        imageView.setScaleX(f17);
        if (i7 == 2) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        imageView.setScaleY(f18);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f44902n;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f44902n;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f44902n;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.G != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(39.0f), this.f44907y);
            z2 z2Var = this.f44902n;
            if (z2Var != null && z2Var.d.getLineCount() > 0) {
                canvas.save();
                int i7 = this.f44905w;
                int i10 = this.f44904s;
                e4 e4Var = this.f44899c;
                if (e4Var != null && e4Var.H) {
                    canvas.translate((getMeasuredWidth() - this.f44902n.d.getLineWidth(0)) - i10, i7);
                } else {
                    canvas.translate(i10, i7);
                }
                if (this.F == 0) {
                    g4.t(this.f44898b, canvas, this, 0);
                }
                this.f44902n.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f44902n;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754904, g4.h(this.f44898b, this.f44899c, z2Var)));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L = ((this.f44903r / 2) + this.f44906x) - org.telegram.messenger.g0.L(19.0f);
        int i13 = this.f44906x;
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int L3 = org.telegram.messenger.g0.L(39.0f);
        this.f44901f.layout(L, 0, L2 + (this.f44903r / 2) + i13, L3);
        this.d.layout(((this.f44903r / 2) + this.f44906x) - org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(20.0f) + (this.f44903r / 2) + this.f44906x, org.telegram.messenger.g0.L(39.0f));
        int i14 = this.f44906x;
        TextView textView = this.f44900e;
        textView.layout(i14, 0, textView.getMeasuredWidth() + i14, textView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        setMeasuredDimension(size, org.telegram.messenger.g0.L(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), 1073741824);
        TextView textView = this.f44900e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f44903r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), 1073741824));
        this.f44901f.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), 1073741824));
        TL_iv.pageBlockChannel pageblockchannel = this.G;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int L = (size - org.telegram.messenger.g0.L(52.0f)) - this.f44903r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.G;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.ou0.f38088a;
            if (alignmentArr.length >= 5) {
                alignment = alignmentArr[3];
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            this.f44902n = g4.n(this.f44898b, this, str, null, L, this.f44905w, pageblockchannel2, alignment2, 1, this.f44899c);
            int i11 = this.f44904s;
            e4 e4Var = this.f44899c;
            if (e4Var != null && e4Var.H) {
                this.f44906x = i11;
            } else {
                this.f44906x = (getMeasuredWidth() - i11) - this.f44903r;
            }
            z2 z2Var = this.f44902n;
            if (z2Var != null) {
                z2Var.f53812s = i11;
                z2Var.f53813w = this.f44905w;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.F != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!g4.j(this.f44898b, this.f44899c, motionEvent, this, this.f44902n, this.f44904s, this.f44905w) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.G = pageblockchannel;
        int i7 = this.F;
        ImageView imageView = this.f44901f;
        Paint paint = this.f44907y;
        TextView textView = this.f44900e;
        n50 n50Var = this.f44898b;
        if (i7 == 0) {
            int i10 = org.telegram.ui.ActionBar.j6.M6;
            g4 g4Var = (g4) n50Var;
            g4Var.getClass();
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
            int red = Color.red(x02);
            int green = Color.green(x02);
            int blue = Color.blue(x02);
            g4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            g4Var.getClass();
            this.f44897a = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false);
            imageView.setColorFilter(new PorterDuffColorFilter(this.f44897a, PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(((g4) n50Var).Y).M0(Long.valueOf(pageblockchannel.channel.f28051id));
        if (M0 != null && !M0.min) {
            n50Var.f49453n = M0;
            if (M0.left && !M0.kicked) {
                a(0, false);
            } else {
                a(4, false);
            }
        } else {
            TLRPC.Chat chat = pageblockchannel.channel;
            if (!n50Var.f49454r && org.telegram.messenger.t3.t0(chat)) {
                n50Var.f49454r = true;
                int i11 = ((g4) n50Var).Y;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat.username;
                ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new fi.b8(n50Var, this.f44899c, i11, this, 2));
            }
            a(1, false);
        }
        requestLayout();
    }

    @Override
    public final void updateColors() {
        TextView textView;
        ImageView imageView;
        Paint paint;
        try {
            if (this.F == 0 && this.G != null && this.f44898b != null && (textView = this.f44900e) != null && (imageView = this.f44901f) != null && (paint = this.f44907y) != null) {
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.M6, false);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.J6, false));
                paint.setColor(Color.argb(34, Color.red(x02), Color.green(x02), Color.blue(x02)));
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false);
                if (x03 != this.f44897a) {
                    this.f44897a = x03;
                    imageView.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.MULTIPLY));
                }
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
