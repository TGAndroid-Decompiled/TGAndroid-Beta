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
public final class f1 extends FrameLayout implements org.telegram.ui.Cells.m9 {
    public TL_iv.pageBlockChannel A;
    public final a70 f38073a;
    public final j4 f38074b;
    public final org.telegram.ui.Components.jq f38075c;
    public final TextView d;
    public final ImageView f38076e;
    public int f38077f;
    public e3 h;
    public int f38078n;
    public final int f38079r;
    public final int f38080s;
    public int v;
    public final Paint f38081w;
    public AnimatorSet f38082x;
    public final int f38083y;

    public f1(Context context, a70 a70Var, j4 j4Var, int i9) {
        super(context);
        this.f38079r = AndroidUtilities.dp(18.0f);
        this.f38080s = AndroidUtilities.dp(11.0f);
        this.f38073a = a70Var;
        this.f38074b = j4Var;
        setWillNotDraw(false);
        this.f38081w = new Paint();
        this.f38083y = i9;
        TextView textView = new TextView(context);
        this.d = textView;
        j3.r0.u(14.0f, 1, textView);
        org.telegram.messenger.ll.l(R.string.ChannelJoin, textView, 19);
        addView(textView, g7.e6.e(-2, 39, 53));
        textView.setOnClickListener(new mh.k3(10, this, a70Var));
        ImageView imageView = new ImageView(context);
        this.f38076e = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, g7.e6.e(39, 39, 53));
        org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(context, 0);
        this.f38075c = jqVar;
        addView(jqVar, g7.e6.e(39, 39, 53));
    }

    public final void a(int i9, boolean z10) {
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
        AnimatorSet animatorSet = this.f38082x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f38077f = i9;
        ImageView imageView = this.f38076e;
        org.telegram.ui.Components.jq jqVar = this.f38075c;
        TextView textView = this.d;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f38082x = animatorSet2;
            if (i9 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            float[] fArr = {f19};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, fArr);
            if (i9 == 0) {
                f20 = 1.0f;
            } else {
                f20 = 0.1f;
            }
            float[] fArr2 = {f20};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, fArr2);
            if (i9 == 0) {
                f21 = 1.0f;
            } else {
                f21 = 0.1f;
            }
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, property3, f21);
            if (i9 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(jqVar, property, f22);
            if (i9 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.1f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(jqVar, property2, f23);
            if (i9 == 1) {
                f24 = 1.0f;
            } else {
                f24 = 0.1f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(jqVar, property3, f24);
            if (i9 == 2) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(imageView, property, f25);
            if (i9 == 2) {
                f26 = 1.0f;
            } else {
                f26 = 0.1f;
            }
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(imageView, property2, f26);
            if (i9 == 2) {
                f27 = 1.0f;
            } else {
                f27 = 0.1f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(imageView, property3, f27));
            this.f38082x.setDuration(150L);
            this.f38082x.start();
            return;
        }
        if (i9 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        textView.setAlpha(f10);
        if (i9 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        textView.setScaleX(f11);
        if (i9 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.1f;
        }
        textView.setScaleY(f12);
        if (i9 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        jqVar.setAlpha(f13);
        if (i9 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        jqVar.setScaleX(f14);
        if (i9 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        jqVar.setScaleY(f15);
        if (i9 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        imageView.setAlpha(f16);
        if (i9 == 2) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        imageView.setScaleX(f17);
        if (i9 == 2) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        imageView.setScaleY(f18);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.h;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.h;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.h;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.A != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(39.0f), this.f38081w);
            e3 e3Var = this.h;
            if (e3Var != null && e3Var.d.getLineCount() > 0) {
                canvas.save();
                int i9 = this.f38080s;
                int i10 = this.f38079r;
                j4 j4Var = this.f38074b;
                if (j4Var != null && j4Var.C) {
                    canvas.translate((getMeasuredWidth() - this.h.d.getLineWidth(0)) - i10, i9);
                } else {
                    canvas.translate(i10, i9);
                }
                if (this.f38083y == 0) {
                    l4.v(this.f38073a, canvas, this, 0);
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
        e3 e3Var = this.h;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrChannel, l4.j(this.f38073a, this.f38074b, e3Var)));
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int dp = ((this.f38078n / 2) + this.v) - AndroidUtilities.dp(19.0f);
        int i13 = this.v;
        int dp2 = AndroidUtilities.dp(20.0f);
        int dp3 = AndroidUtilities.dp(39.0f);
        this.f38076e.layout(dp, 0, dp2 + (this.f38078n / 2) + i13, dp3);
        this.f38075c.layout(((this.f38078n / 2) + this.v) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.f38078n / 2) + this.v, AndroidUtilities.dp(39.0f));
        int i14 = this.v;
        TextView textView = this.d;
        textView.layout(i14, 0, textView.getMeasuredWidth() + i14, textView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i9);
        setMeasuredDimension(size, AndroidUtilities.dp(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824);
        TextView textView = this.d;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f38078n = textView.getMeasuredWidth();
        this.f38075c.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        this.f38076e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        TL_iv.pageBlockChannel pageblockchannel = this.A;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int dp = (size - AndroidUtilities.dp(52.0f)) - this.f38078n;
            TL_iv.pageBlockChannel pageblockchannel2 = this.A;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.rv0.f32294a;
            if (alignmentArr.length >= 5) {
                alignment = alignmentArr[3];
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            this.h = l4.p(this.f38073a, this, str, null, dp, this.f38080s, pageblockchannel2, alignment2, 1, this.f38074b);
            int i11 = this.f38079r;
            j4 j4Var = this.f38074b;
            if (j4Var != null && j4Var.C) {
                this.v = i11;
            } else {
                this.v = (getMeasuredWidth() - i11) - this.f38078n;
            }
            e3 e3Var = this.h;
            if (e3Var != null) {
                e3Var.f37805s = i11;
                e3Var.v = this.f38080s;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f38083y != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!l4.l(this.f38073a, this.f38074b, motionEvent, this, this.h, this.f38079r, this.f38080s) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.A = pageblockchannel;
        int i9 = this.f38083y;
        ImageView imageView = this.f38076e;
        Paint paint = this.f38081w;
        TextView textView = this.d;
        a70 a70Var = this.f38073a;
        if (i9 == 0) {
            int i10 = org.telegram.ui.ActionBar.f6.M6;
            l4 l4Var = (l4) a70Var;
            l4Var.getClass();
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
            int red = Color.red(w02);
            int green = Color.green(w02);
            int blue = Color.blue(w02);
            l4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            imageView.setColorFilter(new PorterDuffColorFilter(a70Var.a(), PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat chat = MessagesController.getInstance(((l4) a70Var).T).getChat(Long.valueOf(pageblockchannel.channel.f22380id));
        if (chat != null && !chat.min) {
            a70Var.f36378n = chat;
            if (chat.left && !chat.kicked) {
                a(0, false);
            } else {
                a(4, false);
            }
        } else {
            TLRPC.Chat chat2 = pageblockchannel.channel;
            if (!a70Var.f36379r && ChatObject.isPublic(chat2)) {
                a70Var.f36379r = true;
                int i11 = ((l4) a70Var).T;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat2.username;
                ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new ih.f8(a70Var, this.f38074b, i11, this, 2));
            }
            a(1, false);
        }
        requestLayout();
    }
}
