package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class p50 extends FrameLayout {
    public int A;
    public int B;
    public float C;
    public long D;
    public final float[] E;
    public boolean F;
    public final s50 G;

    public final org.telegram.ui.Components.ri0 f41261a;

    public final TextView f41262b;

    public final TLRPC.GroupCallParticipant f41263c;
    public final org.telegram.ui.Components.oi0 d;

    public boolean f41264e;

    public float f41265f;
    public float h;

    public int f41266n;

    public double f41267r;

    public final Paint f41268s;
    public final Paint v;

    public final Path f41269w;

    public final float[] f41270x;

    public final RectF f41271y;

    public p50(s50 s50Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        this.G = s50Var;
        this.f41268s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f41269w = new Path();
        this.f41270x = new float[8];
        this.f41271y = new RectF();
        this.E = new float[3];
        setWillNotDraw(false);
        this.f41263c = groupCallParticipant;
        this.f41267r = ChatObject.getParticipantVolume(groupCallParticipant) / 20000.0f;
        this.C = 1.0f;
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(R.raw.speaker, "" + R.raw.speaker, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.d = oi0Var;
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.f41261a = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var.setAnimation(oi0Var);
        ri0Var.setTag(this.f41267r == 0.0d ? 1 : null);
        addView(ri0Var, h7.z5.d(-2, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        oi0Var.N(this.f41267r == 0.0d ? 17 : 34);
        oi0Var.L(oi0Var.f31314f - 1, false, true);
        TextView textView = new TextView(context);
        this.f41262b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23135hg, false));
        textView.setTextSize(1, 16.0f);
        double participantVolume = ((double) ChatObject.getParticipantVolume(groupCallParticipant)) / 100.0d;
        Locale locale = Locale.US;
        textView.setText(((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d)) + "%");
        textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
        addView(textView, h7.z5.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int participantVolume2 = (int) (((double) ChatObject.getParticipantVolume(groupCallParticipant)) / 100.0d);
        int i10 = 0;
        while (true) {
            float[] fArr = this.E;
            if (i10 >= fArr.length) {
                return;
            }
            if (participantVolume2 > (i10 == 0 ? 0 : i10 == 1 ? 50 : 150)) {
                fArr[i10] = 1.0f;
            } else {
                fArr[i10] = 0.0f;
            }
            i10++;
        }
    }

    public final void a(double d, boolean z10) {
        s50 s50Var = this.G;
        AccountInstance accountInstance = s50Var.d;
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        this.f41267r = d;
        TLRPC.GroupCallParticipant groupCallParticipant = this.f41263c;
        groupCallParticipant.volume = (int) (d * 20000.0d);
        groupCallParticipant.volume_by_admin = false;
        groupCallParticipant.flags |= 128;
        double participantVolume = ((double) ChatObject.getParticipantVolume(groupCallParticipant)) / 100.0d;
        Locale locale = Locale.US;
        this.f41262b.setText(((int) (participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d)) + "%");
        VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
        if (z10) {
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            TLObject user = peerId > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            if (groupCallParticipant.volume == 0) {
                s40 s40Var = s50Var.f42416b3;
                if (s40Var != null) {
                    s40Var.dismiss();
                    s50Var.f42416b3 = null;
                }
                s50Var.d1(true);
                s50Var.x1(groupCallParticipant, peerId, s50Var.Q0() ? 0 : 5);
            } else {
                VoIPService.getSharedInstance().editCallMember(user, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
            }
        }
        Integer num = this.f41267r == 0.0d ? 1 : null;
        org.telegram.ui.Components.ri0 ri0Var = this.f41261a;
        if ((ri0Var.getTag() != null || num == null) && (ri0Var.getTag() == null || num != null)) {
            return;
        }
        int i10 = this.f41267r == 0.0d ? 17 : 34;
        org.telegram.ui.Components.oi0 oi0Var = this.d;
        oi0Var.N(i10);
        oi0Var.K(this.f41267r != 0.0d ? 17 : 0);
        oi0Var.start();
        ri0Var.setTag(num);
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f41265f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f41264e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x8 = (int) motionEvent.getX();
                    this.f41266n = x8;
                    if (x8 < 0) {
                        this.f41266n = 0;
                    } else if (x8 > getMeasuredWidth()) {
                        this.f41266n = getMeasuredWidth();
                    }
                    this.F = true;
                }
            }
            if (this.F) {
                if (motionEvent.getAction() == 1) {
                    a(((double) this.f41266n) / ((double) getMeasuredWidth()), true);
                }
                this.F = false;
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.f41264e) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f41265f) > viewConfiguration.getScaledTouchSlop()) {
                    this.f41264e = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                        int x10 = (int) motionEvent.getX();
                        this.f41266n = x10;
                        if (x10 < 0) {
                            this.f41266n = 0;
                        } else if (x10 > getMeasuredWidth()) {
                            this.f41266n = getMeasuredWidth();
                        }
                        this.F = true;
                        invalidate();
                        return true;
                    }
                }
            } else if (this.F) {
                int x11 = (int) motionEvent.getX();
                this.f41266n = x11;
                if (x11 < 0) {
                    this.f41266n = 0;
                } else if (x11 > getMeasuredWidth()) {
                    this.f41266n = getMeasuredWidth();
                }
                a(((double) this.f41266n) / ((double) getMeasuredWidth()), false);
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float fDp;
        int i11;
        p50 p50Var = this;
        int i12 = p50Var.A;
        double d = p50Var.f41267r;
        if (d < 0.25d) {
            p50Var.A = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            p50Var.A = -3562181;
        } else if (d < 0.5d || d > 0.75d) {
            p50Var.A = -11688225;
        } else {
            p50Var.A = -11027349;
        }
        if (i12 == 0) {
            i10 = p50Var.A;
            p50Var.C = 1.0f;
        } else {
            int offsetColor = AndroidUtilities.getOffsetColor(p50Var.B, i12, p50Var.C, 1.0f);
            if (i12 != p50Var.A) {
                p50Var.C = 0.0f;
                p50Var.B = offsetColor;
            }
            i10 = offsetColor;
        }
        Paint paint = p50Var.f41268s;
        paint.setColor(i10);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - p50Var.D;
        if (j10 > 17) {
            j10 = 17;
        }
        p50Var.D = jElapsedRealtime;
        float f10 = p50Var.C;
        if (f10 < 1.0f) {
            float f11 = (j10 / 200.0f) + f10;
            p50Var.C = f11;
            if (f11 > 1.0f) {
                p50Var.C = 1.0f;
            } else {
                p50Var.invalidate();
            }
        }
        Path path = p50Var.f41269w;
        path.reset();
        float f12 = 6.0f;
        float fDp2 = AndroidUtilities.dp(6.0f);
        float[] fArr = p50Var.f41270x;
        fArr[7] = fDp2;
        fArr[6] = fDp2;
        int i13 = 1;
        fArr[1] = fDp2;
        fArr[0] = fDp2;
        float fDp3 = AndroidUtilities.dp(6.0f) * (p50Var.f41266n < AndroidUtilities.dp(12.0f) ? Math.max(0.0f, (p50Var.f41266n - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f)) : 1.0f);
        fArr[5] = fDp3;
        fArr[4] = fDp3;
        fArr[3] = fDp3;
        fArr[2] = fDp3;
        float f13 = p50Var.f41266n;
        float measuredHeight = p50Var.getMeasuredHeight();
        RectF rectF = p50Var.f41271y;
        rectF.set(0.0f, 0.0f, f13, measuredHeight);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int participantVolume = (int) (((double) ChatObject.getParticipantVolume(p50Var.f41263c)) / 100.0d);
        org.telegram.ui.Components.ri0 ri0Var = p50Var.f41261a;
        int iDp = AndroidUtilities.dp(5.0f) + (ri0Var.getMeasuredWidth() / 2) + ri0Var.getLeft();
        int measuredHeight2 = (ri0Var.getMeasuredHeight() / 2) + ri0Var.getTop();
        int i14 = 0;
        while (true) {
            float[] fArr2 = p50Var.E;
            if (i14 >= fArr2.length) {
                return;
            }
            if (i14 == 0) {
                fDp = AndroidUtilities.dp(f12);
                i11 = 0;
            } else if (i14 == i13) {
                fDp = AndroidUtilities.dp(10.0f);
                i11 = 50;
            } else {
                fDp = AndroidUtilities.dp(14.0f);
                i11 = 150;
            }
            float fDp4 = AndroidUtilities.dp(2.0f);
            float f14 = fArr2[i14];
            float f15 = (1.0f - f14) * fDp4;
            Paint paint2 = p50Var.v;
            paint2.setAlpha((int) (255.0f * f14));
            float f16 = iDp;
            float f17 = measuredHeight2;
            rectF.set((f16 - fDp) + f15, (f17 - fDp) + f15, (f16 + fDp) - f15, (f17 + fDp) - f15);
            canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
            if (participantVolume > i11) {
                float f18 = fArr2[i14];
                if (f18 < 1.0f) {
                    float f19 = (j10 / 180.0f) + f18;
                    fArr2[i14] = f19;
                    if (f19 > 1.0f) {
                        fArr2[i14] = 1.0f;
                    }
                    invalidate();
                }
            } else {
                float f20 = fArr2[i14];
                if (f20 > 0.0f) {
                    float f21 = f20 - (j10 / 180.0f);
                    fArr2[i14] = f21;
                    if (f21 < 0.0f) {
                        fArr2[i14] = 0.0f;
                    }
                    invalidate();
                }
            }
            i14++;
            canvas2 = canvas;
            f12 = 6.0f;
            i13 = 1;
            p50Var = this;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        this.f41266n = (int) (((double) View.MeasureSpec.getSize(i10)) * this.f41267r);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
