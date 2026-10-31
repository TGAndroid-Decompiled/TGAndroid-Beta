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
public final class c1 extends FrameLayout implements org.telegram.ui.Cells.j9, org.telegram.ui.ActionBar.k6 {
    public AnimatorSet D;
    public final int E;
    public TL_iv.pageBlockChannel F;
    public int f36360a;
    public final m60 f36361b;
    public final f4 f36362c;
    public final org.telegram.ui.Components.iq d;
    public final TextView e;
    public final ImageView f36363f;
    public int h;
    public z2 f36364n;
    public int f36365r;
    public final int f36366s;
    public final int f36367w;
    public int f36368x;
    public final Paint f36369y;

    public c1(Context context, m60 m60Var, f4 f4Var, int i10) {
        super(context);
        this.f36366s = org.telegram.messenger.i0.L(18.0f);
        this.f36367w = org.telegram.messenger.i0.L(11.0f);
        this.f36361b = m60Var;
        this.f36362c = f4Var;
        setWillNotDraw(false);
        this.f36369y = new Paint();
        this.E = i10;
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(org.telegram.messenger.cd.L0(2131752397, null));
        textView.setGravity(19);
        addView(textView, w7.b6.e(-2, 39, 53));
        textView.setOnClickListener(new ag.t0(24, this, m60Var));
        ImageView imageView = new ImageView(context);
        this.f36363f = imageView;
        imageView.setImageResource(2131231623);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.b6.e(39, 39, 53));
        org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(context, 0);
        this.d = iqVar;
        addView(iqVar, w7.b6.e(39, 39, 53));
    }

    public final void a(int i10, boolean z10) {
        float f7;
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
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = i10;
        ImageView imageView = this.f36363f;
        org.telegram.ui.Components.iq iqVar = this.d;
        TextView textView = this.e;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.D = animatorSet2;
            if (i10 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            float[] fArr = {f18};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, fArr);
            if (i10 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.1f;
            }
            float[] fArr2 = {f19};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, fArr2);
            if (i10 == 0) {
                f20 = 1.0f;
            } else {
                f20 = 0.1f;
            }
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, property3, f20);
            if (i10 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(iqVar, property, f21);
            if (i10 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.1f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(iqVar, property2, f22);
            if (i10 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.1f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(iqVar, property3, f23);
            if (i10 == 2) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(imageView, property, f24);
            if (i10 == 2) {
                f25 = 1.0f;
            } else {
                f25 = 0.1f;
            }
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(imageView, property2, f25);
            if (i10 == 2) {
                f26 = 1.0f;
            } else {
                f26 = 0.1f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(imageView, property3, f26));
            this.D.setDuration(150L);
            this.D.start();
            return;
        }
        if (i10 == 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        textView.setAlpha(f7);
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        textView.setScaleX(f10);
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        textView.setScaleY(f11);
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        iqVar.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.1f;
        }
        iqVar.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        iqVar.setScaleY(f14);
        if (i10 == 2) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        imageView.setAlpha(f15);
        if (i10 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.1f;
        }
        imageView.setScaleX(f16);
        if (i10 == 2) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        imageView.setScaleY(f17);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f36364n;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f36364n;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f36364n;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.F != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(39.0f), this.f36369y);
            z2 z2Var = this.f36364n;
            if (z2Var != null && z2Var.d.getLineCount() > 0) {
                canvas.save();
                int i10 = this.f36367w;
                int i11 = this.f36366s;
                f4 f4Var = this.f36362c;
                if (f4Var != null && f4Var.G) {
                    canvas.translate((getMeasuredWidth() - this.f36364n.d.getLineWidth(0)) - i11, i10);
                } else {
                    canvas.translate(i11, i10);
                }
                if (this.E == 0) {
                    h4.t(this.f36361b, canvas, this, 0);
                }
                this.f36364n.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f36364n;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754904, h4.h(this.f36361b, this.f36362c, z2Var)));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L = ((this.f36365r / 2) + this.f36368x) - org.telegram.messenger.i0.L(19.0f);
        int i14 = this.f36368x;
        int L2 = org.telegram.messenger.i0.L(20.0f);
        int L3 = org.telegram.messenger.i0.L(39.0f);
        this.f36363f.layout(L, 0, L2 + (this.f36365r / 2) + i14, L3);
        this.d.layout(((this.f36365r / 2) + this.f36368x) - org.telegram.messenger.i0.L(19.0f), 0, org.telegram.messenger.i0.L(20.0f) + (this.f36365r / 2) + this.f36368x, org.telegram.messenger.i0.L(39.0f));
        int i15 = this.f36368x;
        TextView textView = this.e;
        textView.layout(i15, 0, textView.getMeasuredWidth() + i15, textView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, org.telegram.messenger.i0.L(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(39.0f), 1073741824);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f36365r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(39.0f), 1073741824));
        this.f36363f.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(39.0f), 1073741824));
        TL_iv.pageBlockChannel pageblockchannel = this.F;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int L = (size - org.telegram.messenger.i0.L(52.0f)) - this.f36365r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.F;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.ov0.f29202a;
            if (alignmentArr.length >= 5) {
                alignment = alignmentArr[3];
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            this.f36364n = h4.n(this.f36361b, this, str, null, L, this.f36367w, pageblockchannel2, alignment2, 1, this.f36362c);
            int i12 = this.f36366s;
            f4 f4Var = this.f36362c;
            if (f4Var != null && f4Var.G) {
                this.f36368x = i12;
            } else {
                this.f36368x = (getMeasuredWidth() - i12) - this.f36365r;
            }
            z2 z2Var = this.f36364n;
            if (z2Var != null) {
                z2Var.f43990s = i12;
                z2Var.f43991w = this.f36367w;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.E != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!h4.j(this.f36361b, this.f36362c, motionEvent, this, this.f36364n, this.f36366s, this.f36367w) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.F = pageblockchannel;
        int i10 = this.E;
        ImageView imageView = this.f36363f;
        Paint paint = this.f36369y;
        TextView textView = this.e;
        m60 m60Var = this.f36361b;
        if (i10 == 0) {
            int i11 = org.telegram.ui.ActionBar.t6.M6;
            h4 h4Var = (h4) m60Var;
            h4Var.getClass();
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            int red = Color.red(x02);
            int green = Color.green(x02);
            int blue = Color.blue(x02);
            h4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            h4Var.getClass();
            this.f36360a = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false);
            imageView.setColorFilter(new PorterDuffColorFilter(this.f36360a, PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(((h4) m60Var).X).L0(Long.valueOf(pageblockchannel.channel.f19793id));
        if (L0 != null && !L0.min) {
            m60Var.f39484n = L0;
            if (L0.left && !L0.kicked) {
                a(0, false);
            } else {
                a(4, false);
            }
        } else {
            TLRPC.Chat chat = pageblockchannel.channel;
            if (!m60Var.f39485r && org.telegram.messenger.w3.t0(chat)) {
                m60Var.f39485r = true;
                int i12 = ((h4) m60Var).X;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat.username;
                ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new b0(m60Var, this.f36362c, i12, this, 0));
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
            if (this.E == 0 && this.F != null && this.f36361b != null && (textView = this.e) != null && (imageView = this.f36363f) != null && (paint = this.f36369y) != null) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.M6, false);
                textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J6, false));
                paint.setColor(Color.argb(34, Color.red(x02), Color.green(x02), Color.blue(x02)));
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false);
                if (x03 != this.f36360a) {
                    this.f36360a = x03;
                    imageView.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.MULTIPLY));
                }
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
