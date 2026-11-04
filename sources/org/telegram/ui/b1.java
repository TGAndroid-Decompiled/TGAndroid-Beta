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
public final class b1 extends FrameLayout implements org.telegram.ui.Cells.g9, org.telegram.ui.ActionBar.z5 {
    public AnimatorSet E;
    public final int F;
    public TL_iv.pageBlockChannel G;
    public int f43873a;
    public final i50 f43874b;
    public final g4 f43875c;
    public final org.telegram.ui.Components.aq d;
    public final TextView f43876e;
    public final ImageView f43877f;
    public int h;
    public a3 f43878n;
    public int f43879r;
    public final int f43880s;
    public final int f43881w;
    public int f43882x;
    public final Paint f43883y;

    public b1(Context context, i50 i50Var, g4 g4Var, int i3) {
        super(context);
        this.f43880s = org.telegram.messenger.g0.L(18.0f);
        this.f43881w = org.telegram.messenger.g0.L(11.0f);
        this.f43874b = i50Var;
        this.f43875c = g4Var;
        setWillNotDraw(false);
        this.f43883y = new Paint();
        this.F = i3;
        TextView textView = new TextView(context);
        this.f43876e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.bd.M0(2131752397, null));
        textView.setGravity(19);
        addView(textView, b8.mf.e(-2, 39, 53));
        textView.setOnClickListener(new org.telegram.messenger.video.g(8, this, i50Var));
        ImageView imageView = new ImageView(context);
        this.f43877f = imageView;
        imageView.setImageResource(2131231622);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, b8.mf.e(39, 39, 53));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 0);
        this.d = aqVar;
        addView(aqVar, b8.mf.e(39, 39, 53));
    }

    public final void a(int i3, boolean z10) {
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
        this.h = i3;
        ImageView imageView = this.f43877f;
        org.telegram.ui.Components.aq aqVar = this.d;
        TextView textView = this.f43876e;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.E = animatorSet2;
            if (i3 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            float[] fArr = {f19};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, fArr);
            if (i3 == 0) {
                f20 = 1.0f;
            } else {
                f20 = 0.1f;
            }
            float[] fArr2 = {f20};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, fArr2);
            if (i3 == 0) {
                f21 = 1.0f;
            } else {
                f21 = 0.1f;
            }
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, property3, f21);
            if (i3 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(aqVar, property, f22);
            if (i3 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.1f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(aqVar, property2, f23);
            if (i3 == 1) {
                f24 = 1.0f;
            } else {
                f24 = 0.1f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(aqVar, property3, f24);
            if (i3 == 2) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(imageView, property, f25);
            if (i3 == 2) {
                f26 = 1.0f;
            } else {
                f26 = 0.1f;
            }
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(imageView, property2, f26);
            if (i3 == 2) {
                f27 = 1.0f;
            } else {
                f27 = 0.1f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(imageView, property3, f27));
            this.E.setDuration(150L);
            this.E.start();
            return;
        }
        if (i3 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        textView.setAlpha(f10);
        if (i3 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        textView.setScaleX(f11);
        if (i3 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.1f;
        }
        textView.setScaleY(f12);
        if (i3 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        aqVar.setAlpha(f13);
        if (i3 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        aqVar.setScaleX(f14);
        if (i3 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        aqVar.setScaleY(f15);
        if (i3 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        imageView.setAlpha(f16);
        if (i3 == 2) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        imageView.setScaleX(f17);
        if (i3 == 2) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        imageView.setScaleY(f18);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f43878n;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f43878n;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f43878n;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.G != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(39.0f), this.f43883y);
            a3 a3Var = this.f43878n;
            if (a3Var != null && a3Var.d.getLineCount() > 0) {
                canvas.save();
                int i3 = this.f43881w;
                int i10 = this.f43880s;
                g4 g4Var = this.f43875c;
                if (g4Var != null && g4Var.H) {
                    canvas.translate((getMeasuredWidth() - this.f43878n.d.getLineWidth(0)) - i10, i3);
                } else {
                    canvas.translate(i10, i3);
                }
                if (this.F == 0) {
                    i4.t(this.f43874b, canvas, this, 0);
                }
                this.f43878n.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f43878n;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.g(2131754904, i4.h(this.f43874b, this.f43875c, a3Var)));
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int L = ((this.f43879r / 2) + this.f43882x) - org.telegram.messenger.g0.L(19.0f);
        int i13 = this.f43882x;
        int L2 = org.telegram.messenger.g0.L(20.0f);
        int L3 = org.telegram.messenger.g0.L(39.0f);
        this.f43877f.layout(L, 0, L2 + (this.f43879r / 2) + i13, L3);
        this.d.layout(((this.f43879r / 2) + this.f43882x) - org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(20.0f) + (this.f43879r / 2) + this.f43882x, org.telegram.messenger.g0.L(39.0f));
        int i14 = this.f43882x;
        TextView textView = this.f43876e;
        textView.layout(i14, 0, textView.getMeasuredWidth() + i14, textView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i3);
        setMeasuredDimension(size, org.telegram.messenger.g0.L(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), 1073741824);
        TextView textView = this.f43876e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f43879r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), 1073741824));
        this.f43877f.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), 1073741824));
        TL_iv.pageBlockChannel pageblockchannel = this.G;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int L = (size - org.telegram.messenger.g0.L(52.0f)) - this.f43879r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.G;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.lu0.f35891a;
            if (alignmentArr.length >= 5) {
                alignment = alignmentArr[3];
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            this.f43878n = i4.n(this.f43874b, this, str, null, L, this.f43881w, pageblockchannel2, alignment2, 1, this.f43875c);
            int i11 = this.f43880s;
            g4 g4Var = this.f43875c;
            if (g4Var != null && g4Var.H) {
                this.f43882x = i11;
            } else {
                this.f43882x = (getMeasuredWidth() - i11) - this.f43879r;
            }
            a3 a3Var = this.f43878n;
            if (a3Var != null) {
                a3Var.f43579s = i11;
                a3Var.f43580w = this.f43881w;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.F != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!i4.j(this.f43874b, this.f43875c, motionEvent, this, this.f43878n, this.f43880s, this.f43881w) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.G = pageblockchannel;
        int i3 = this.F;
        ImageView imageView = this.f43877f;
        Paint paint = this.f43883y;
        TextView textView = this.f43876e;
        i50 i50Var = this.f43874b;
        if (i3 == 0) {
            int i10 = org.telegram.ui.ActionBar.k6.M6;
            i4 i4Var = (i4) i50Var;
            i4Var.getClass();
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            int red = Color.red(x02);
            int green = Color.green(x02);
            int blue = Color.blue(x02);
            i4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            i4Var.getClass();
            this.f43873a = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false);
            imageView.setColorFilter(new PorterDuffColorFilter(this.f43873a, PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(((i4) i50Var).Y).M0(Long.valueOf(pageblockchannel.channel.f27001id));
        if (M0 != null && !M0.min) {
            i50Var.f46115n = M0;
            if (M0.left && !M0.kicked) {
                a(0, false);
            } else {
                a(4, false);
            }
        } else {
            TLRPC.Chat chat = pageblockchannel.channel;
            if (!i50Var.f46116r && org.telegram.messenger.t3.t0(chat)) {
                i50Var.f46116r = true;
                int i11 = ((i4) i50Var).Y;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat.username;
                ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new ei.i8(i50Var, this.f43875c, i11, this, 2));
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
            if (this.F == 0 && this.G != null && this.f43874b != null && (textView = this.f43876e) != null && (imageView = this.f43877f) != null && (paint = this.f43883y) != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.M6, false);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
                paint.setColor(Color.argb(34, Color.red(x02), Color.green(x02), Color.blue(x02)));
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false);
                if (x03 != this.f43873a) {
                    this.f43873a = x03;
                    imageView.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.MULTIPLY));
                }
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
