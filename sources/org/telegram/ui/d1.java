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
public final class d1 extends FrameLayout implements org.telegram.ui.Cells.p9 {
    public TL_iv.pageBlockChannel E;
    public final v70 f35589a;
    public final g4 f35590b;
    public final org.telegram.ui.Components.sq f35591c;
    public final TextView d;
    public final ImageView f35592e;
    public int f35593f;
    public b3 h;
    public int f35594n;
    public final int f35595r;
    public final int f35596s;
    public int v;
    public final Paint f35597w;
    public AnimatorSet f35598x;
    public final int f35599y;

    public d1(Context context, v70 v70Var, g4 g4Var, int i10) {
        super(context);
        this.f35595r = AndroidUtilities.dp(18.0f);
        this.f35596s = AndroidUtilities.dp(11.0f);
        this.f35589a = v70Var;
        this.f35590b = g4Var;
        setWillNotDraw(false);
        this.f35597w = new Paint();
        this.f35599y = i10;
        TextView textView = new TextView(context);
        this.d = textView;
        com.google.android.gms.internal.vision.e2.m(14.0f, 1, textView);
        org.telegram.messenger.wl.k(R.string.ChannelJoin, textView, 19);
        addView(textView, w7.x5.e(-2, 39, 53));
        textView.setOnClickListener(new bi.u1(23, this, v70Var));
        ImageView imageView = new ImageView(context);
        this.f35592e = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.e(39, 39, 53));
        org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(context, 0);
        this.f35591c = sqVar;
        addView(sqVar, w7.x5.e(39, 39, 53));
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
        AnimatorSet animatorSet = this.f35598x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f35593f = i10;
        ImageView imageView = this.f35592e;
        org.telegram.ui.Components.sq sqVar = this.f35591c;
        TextView textView = this.d;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f35598x = animatorSet2;
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
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(sqVar, property, f21);
            if (i10 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.1f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(sqVar, property2, f22);
            if (i10 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.1f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(sqVar, property3, f23);
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
            this.f35598x.setDuration(150L);
            this.f35598x.start();
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
        sqVar.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.1f;
        }
        sqVar.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        sqVar.setScaleY(f14);
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
        b3 b3Var = this.h;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.h;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.h;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.E != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(39.0f), this.f35597w);
            b3 b3Var = this.h;
            if (b3Var != null && b3Var.d.getLineCount() > 0) {
                canvas.save();
                int i10 = this.f35596s;
                int i11 = this.f35595r;
                g4 g4Var = this.f35590b;
                if (g4Var != null && g4Var.G) {
                    canvas.translate((getMeasuredWidth() - this.h.d.getLineWidth(0)) - i11, i10);
                } else {
                    canvas.translate(i11, i10);
                }
                if (this.f35599y == 0) {
                    i4.v(this.f35589a, canvas, this, 0);
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
        b3 b3Var = this.h;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrChannel, i4.j(this.f35589a, this.f35590b, b3Var)));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = ((this.f35594n / 2) + this.v) - AndroidUtilities.dp(19.0f);
        int i14 = this.v;
        int dp2 = AndroidUtilities.dp(20.0f);
        int dp3 = AndroidUtilities.dp(39.0f);
        this.f35592e.layout(dp, 0, dp2 + (this.f35594n / 2) + i14, dp3);
        this.f35591c.layout(((this.f35594n / 2) + this.v) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.f35594n / 2) + this.v, AndroidUtilities.dp(39.0f));
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
        this.f35594n = textView.getMeasuredWidth();
        this.f35591c.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        this.f35592e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        TL_iv.pageBlockChannel pageblockchannel = this.E;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int dp = (size - AndroidUtilities.dp(52.0f)) - this.f35594n;
            TL_iv.pageBlockChannel pageblockchannel2 = this.E;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.iw0.f27279a;
            if (alignmentArr.length >= 5) {
                alignment = alignmentArr[3];
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            this.h = i4.p(this.f35589a, this, str, null, dp, this.f35596s, pageblockchannel2, alignment2, 1, this.f35590b);
            int i12 = this.f35595r;
            g4 g4Var = this.f35590b;
            if (g4Var != null && g4Var.G) {
                this.v = i12;
            } else {
                this.v = (getMeasuredWidth() - i12) - this.f35594n;
            }
            b3 b3Var = this.h;
            if (b3Var != null) {
                b3Var.f34617s = i12;
                b3Var.v = this.f35596s;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f35599y != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!i4.l(this.f35589a, this.f35590b, motionEvent, this, this.h, this.f35595r, this.f35596s) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.E = pageblockchannel;
        int i10 = this.f35599y;
        ImageView imageView = this.f35592e;
        Paint paint = this.f35597w;
        TextView textView = this.d;
        v70 v70Var = this.f35589a;
        if (i10 == 0) {
            int i11 = org.telegram.ui.ActionBar.j6.M6;
            i4 i4Var = (i4) v70Var;
            i4Var.getClass();
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            int red = Color.red(w02);
            int green = Color.green(w02);
            int blue = Color.blue(w02);
            i4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            imageView.setColorFilter(new PorterDuffColorFilter(v70Var.a(), PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat chat = MessagesController.getInstance(((i4) v70Var).X).getChat(Long.valueOf(pageblockchannel.channel.f19869id));
        if (chat != null && !chat.min) {
            v70Var.f41438n = chat;
            if (chat.left && !chat.kicked) {
                a(0, false);
            } else {
                a(4, false);
            }
        } else {
            TLRPC.Chat chat2 = pageblockchannel.channel;
            if (!v70Var.f41439r && ChatObject.isPublic(chat2)) {
                v70Var.f41439r = true;
                int i12 = ((i4) v70Var).X;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat2.username;
                ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new bi.ga(v70Var, this.f35590b, i12, this, 2));
            }
            a(1, false);
        }
        requestLayout();
    }
}
