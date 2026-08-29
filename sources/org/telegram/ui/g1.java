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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g1 extends FrameLayout implements org.telegram.ui.Cells.j9 {
    public TL_iv.pageBlockChannel A;
    public final d70 f38419a;
    public final k4 f38420b;
    public final org.telegram.ui.Components.nq f38421c;
    public final TextView d;
    public final ImageView f38422e;
    public int f38423f;
    public f3 h;
    public int f38424n;
    public final int f38425r;
    public final int f38426s;
    public int v;
    public final Paint f38427w;
    public AnimatorSet f38428x;
    public final int f38429y;

    public g1(Context context, d70 d70Var, k4 k4Var, int i10) {
        super(context);
        this.f38425r = AndroidUtilities.dp(18.0f);
        this.f38426s = AndroidUtilities.dp(11.0f);
        this.f38419a = d70Var;
        this.f38420b = k4Var;
        setWillNotDraw(false);
        this.f38427w = new Paint();
        this.f38429y = i10;
        TextView textView = new TextView(context);
        this.d = textView;
        th.n(14.0f, 1, textView);
        b.i(R.string.ChannelJoin, textView, 19);
        addView(textView, i7.f6.e(-2, 39, 53));
        textView.setOnClickListener(new nh.r7(11, this, d70Var));
        ImageView imageView = new ImageView(context);
        this.f38422e = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, i7.f6.e(39, 39, 53));
        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(context, 0);
        this.f38421c = nqVar;
        addView(nqVar, i7.f6.e(39, 39, 53));
    }

    public final void a(int i10, boolean z10) {
        float f9;
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
        AnimatorSet animatorSet = this.f38428x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f38423f = i10;
        ImageView imageView = this.f38422e;
        org.telegram.ui.Components.nq nqVar = this.f38421c;
        TextView textView = this.d;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f38428x = animatorSet2;
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
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(nqVar, property, f21);
            if (i10 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.1f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(nqVar, property2, f22);
            if (i10 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.1f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(nqVar, property3, f23);
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
            this.f38428x.setDuration(150L);
            this.f38428x.start();
            return;
        }
        if (i10 == 0) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        textView.setAlpha(f9);
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
        nqVar.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.1f;
        }
        nqVar.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        nqVar.setScaleY(f14);
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
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.h;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.A != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(39.0f), this.f38427w);
            f3 f3Var = this.h;
            if (f3Var != null && f3Var.d.getLineCount() > 0) {
                canvas.save();
                int i10 = this.f38426s;
                int i11 = this.f38425r;
                k4 k4Var = this.f38420b;
                if (k4Var != null && k4Var.C) {
                    canvas.translate((getMeasuredWidth() - this.h.d.getLineWidth(0)) - i11, i10);
                } else {
                    canvas.translate(i11, i10);
                }
                if (this.f38429y == 0) {
                    m4.v(this.f38419a, canvas, this, 0);
                }
                this.h.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.h;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrChannel, m4.j(this.f38419a, this.f38420b, f3Var)));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = ((this.f38424n / 2) + this.v) - AndroidUtilities.dp(19.0f);
        int i14 = this.v;
        int dp2 = AndroidUtilities.dp(20.0f);
        int dp3 = AndroidUtilities.dp(39.0f);
        this.f38422e.layout(dp, 0, dp2 + (this.f38424n / 2) + i14, dp3);
        this.f38421c.layout(((this.f38424n / 2) + this.v) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.f38424n / 2) + this.v, AndroidUtilities.dp(39.0f));
        int i15 = this.v;
        TextView textView = this.d;
        textView.layout(i15, 0, textView.getMeasuredWidth() + i15, textView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, AndroidUtilities.dp(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824);
        TextView textView = this.d;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f38424n = textView.getMeasuredWidth();
        this.f38421c.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        this.f38422e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        TL_iv.pageBlockChannel pageblockchannel = this.A;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int dp = (size - AndroidUtilities.dp(52.0f)) - this.f38424n;
            TL_iv.pageBlockChannel pageblockchannel2 = this.A;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.bw0.f27242a;
            if (alignmentArr.length >= 5) {
                alignment = alignmentArr[3];
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            this.h = m4.p(this.f38419a, this, str, null, dp, this.f38426s, pageblockchannel2, alignment2, 1, this.f38420b);
            int i12 = this.f38425r;
            k4 k4Var = this.f38420b;
            if (k4Var != null && k4Var.C) {
                this.v = i12;
            } else {
                this.v = (getMeasuredWidth() - i12) - this.f38424n;
            }
            f3 f3Var = this.h;
            if (f3Var != null) {
                f3Var.f37974s = i12;
                f3Var.v = this.f38426s;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f38429y != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!m4.l(this.f38419a, this.f38420b, motionEvent, this, this.h, this.f38425r, this.f38426s) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.A = pageblockchannel;
        int i10 = this.f38429y;
        ImageView imageView = this.f38422e;
        Paint paint = this.f38427w;
        TextView textView = this.d;
        d70 d70Var = this.f38419a;
        if (i10 == 0) {
            int i11 = org.telegram.ui.ActionBar.g6.M6;
            m4 m4Var = (m4) d70Var;
            m4Var.getClass();
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
            int red = Color.red(w02);
            int green = Color.green(w02);
            int blue = Color.blue(w02);
            m4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            imageView.setColorFilter(new PorterDuffColorFilter(d70Var.a(), PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat chat = MessagesController.getInstance(((m4) d70Var).T).getChat(Long.valueOf(pageblockchannel.channel.f22392id));
        if (chat != null && !chat.min) {
            d70Var.f37384n = chat;
            if (chat.left && !chat.kicked) {
                a(0, false);
            } else {
                a(4, false);
            }
        } else {
            TLRPC.Chat chat2 = pageblockchannel.channel;
            if (!d70Var.f37385r && ChatObject.isPublic(chat2)) {
                d70Var.f37385r = true;
                int i12 = ((m4) d70Var).T;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat2.username;
                ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new lh.b8(d70Var, this.f38420b, i12, this, 1));
            }
            a(1, false);
        }
        requestLayout();
    }
}
