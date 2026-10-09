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
public final class d60 extends FrameLayout {
    public int E;
    public int F;
    public float G;
    public long H;
    public final float[] I;
    public boolean J;
    public final g60 K;
    public final org.telegram.ui.Components.fk0 f36860a;
    public final TextView f36861b;
    public final TLRPC.GroupCallParticipant f36862c;
    public final org.telegram.ui.Components.ck0 d;
    public boolean f36863e;
    public float f36864f;
    public float h;
    public int f36865n;
    public double f36866r;
    public final Paint f36867s;
    public final Paint v;
    public final Path f36868w;
    public final float[] f36869x;
    public final RectF f36870y;

    public d60(g60 g60Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        Integer num;
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        this.K = g60Var;
        this.f36867s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f36868w = new Path();
        this.f36869x = new float[8];
        this.f36870y = new RectF();
        this.I = new float[3];
        setWillNotDraw(false);
        this.f36862c = groupCallParticipant;
        this.f36866r = ChatObject.getParticipantVolume(groupCallParticipant) / 20000.0f;
        this.G = 1.0f;
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(R.raw.speaker, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.d = ck0Var;
        ?? imageView = new ImageView(context);
        this.f36860a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(ck0Var);
        if (this.f36866r == 0.0d) {
            num = 1;
        } else {
            num = null;
        }
        imageView.setTag(num);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView((View) imageView, w7.x5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, i10 | 16));
        if (this.f36866r == 0.0d) {
            i11 = 17;
        } else {
            i11 = 34;
        }
        ck0Var.P(i11);
        ck0Var.N(ck0Var.f25403f - 1, false, true);
        TextView textView = new TextView(context);
        this.f36861b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20878hg, false));
        textView.setTextSize(1, 16.0f);
        double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        double max = participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d;
        textView.setText(((int) max) + "%");
        if (LocaleController.isRTL) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(43.0f);
        }
        if (LocaleController.isRTL) {
            i12 = AndroidUtilities.dp(43.0f);
        } else {
            i12 = 0;
        }
        textView.setPadding(dp, 0, i12, 0);
        addView(textView, w7.x5.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int participantVolume2 = (int) (ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d);
        int i14 = 0;
        while (true) {
            float[] fArr = this.I;
            if (i14 < fArr.length) {
                if (i14 == 0) {
                    i13 = 0;
                } else if (i14 == 1) {
                    i13 = 50;
                } else {
                    i13 = 150;
                }
                if (participantVolume2 > i13) {
                    fArr[i14] = 1.0f;
                } else {
                    fArr[i14] = 0.0f;
                }
                i14++;
            } else {
                return;
            }
        }
    }

    public final void a(double d, boolean z10) {
        double d10;
        int i10;
        TLObject chat;
        int i11;
        g60 g60Var = this.K;
        AccountInstance accountInstance = g60Var.d;
        if (VoIPService.getSharedInstance() != null) {
            this.f36866r = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.f36862c;
            groupCallParticipant.volume = (int) (d * 20000.0d);
            int i12 = 0;
            groupCallParticipant.volume_by_admin = false;
            groupCallParticipant.flags |= 128;
            double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
            Locale locale = Locale.US;
            if (participantVolume > 0.0d) {
                d10 = Math.max(participantVolume, 1.0d);
            } else {
                d10 = 0.0d;
            }
            this.f36861b.setText(((int) d10) + "%");
            VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
            Integer num = null;
            if (z10) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                if (peerId > 0) {
                    chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                } else {
                    chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                }
                TLObject tLObject = chat;
                if (groupCallParticipant.volume == 0) {
                    g50 g50Var = g60Var.f37814f3;
                    if (g50Var != null) {
                        g50Var.dismiss();
                        g60Var.f37814f3 = null;
                    }
                    g60Var.e1(true);
                    if (g60Var.R0()) {
                        i11 = 0;
                    } else {
                        i11 = 5;
                    }
                    g60Var.y1(groupCallParticipant, peerId, i11);
                } else {
                    VoIPService.getSharedInstance().editCallMember(tLObject, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
                }
            }
            if (this.f36866r == 0.0d) {
                num = 1;
            }
            org.telegram.ui.Components.fk0 fk0Var = this.f36860a;
            if ((fk0Var.getTag() == null && num != null) || (fk0Var.getTag() != null && num == null)) {
                if (this.f36866r == 0.0d) {
                    i10 = 17;
                } else {
                    i10 = 34;
                }
                org.telegram.ui.Components.ck0 ck0Var = this.d;
                ck0Var.P(i10);
                if (this.f36866r != 0.0d) {
                    i12 = 17;
                }
                ck0Var.M(i12);
                ck0Var.start();
                fk0Var.setTag(num);
            }
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f36864f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.f36863e) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f36864f) > viewConfiguration.getScaledTouchSlop()) {
                        this.f36863e = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            int x10 = (int) motionEvent.getX();
                            this.f36865n = x10;
                            if (x10 < 0) {
                                this.f36865n = 0;
                            } else if (x10 > getMeasuredWidth()) {
                                this.f36865n = getMeasuredWidth();
                            }
                            this.J = true;
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.J) {
                    int x11 = (int) motionEvent.getX();
                    this.f36865n = x11;
                    if (x11 < 0) {
                        this.f36865n = 0;
                    } else if (x11 > getMeasuredWidth()) {
                        this.f36865n = getMeasuredWidth();
                    }
                    a(this.f36865n / getMeasuredWidth(), false);
                    invalidate();
                    return true;
                }
            }
        } else {
            this.f36863e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x12 = (int) motionEvent.getX();
                    this.f36865n = x12;
                    if (x12 < 0) {
                        this.f36865n = 0;
                    } else if (x12 > getMeasuredWidth()) {
                        this.f36865n = getMeasuredWidth();
                    }
                    this.J = true;
                }
            }
            if (this.J) {
                if (motionEvent.getAction() == 1) {
                    a(this.f36865n / getMeasuredWidth(), true);
                }
                this.J = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        float dp;
        int i11;
        float f10;
        int i12;
        d60 d60Var = this;
        int i13 = d60Var.E;
        double d = d60Var.f36866r;
        if (d < 0.25d) {
            d60Var.E = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            d60Var.E = -3562181;
        } else if (d >= 0.5d && d <= 0.75d) {
            d60Var.E = -11027349;
        } else {
            d60Var.E = -11688225;
        }
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (i13 == 0) {
            i10 = d60Var.E;
            d60Var.G = 1.0f;
        } else {
            int offsetColor = AndroidUtilities.getOffsetColor(d60Var.F, i13, d60Var.G, 1.0f);
            if (i13 != d60Var.E) {
                d60Var.G = 0.0f;
                d60Var.F = offsetColor;
            }
            i10 = offsetColor;
        }
        Paint paint = d60Var.f36867s;
        paint.setColor(i10);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - d60Var.H;
        if (j3 > 17) {
            j3 = 17;
        }
        d60Var.H = elapsedRealtime;
        float f13 = d60Var.G;
        if (f13 < 1.0f) {
            float f14 = (((float) j3) / 200.0f) + f13;
            d60Var.G = f14;
            if (f14 > 1.0f) {
                d60Var.G = 1.0f;
            } else {
                d60Var.invalidate();
            }
        }
        Path path = d60Var.f36868w;
        path.reset();
        float f15 = 6.0f;
        float dp2 = AndroidUtilities.dp(6.0f);
        float[] fArr = d60Var.f36869x;
        fArr[7] = dp2;
        fArr[6] = dp2;
        int i14 = 1;
        fArr[1] = dp2;
        int i15 = 0;
        fArr[0] = dp2;
        if (d60Var.f36865n < AndroidUtilities.dp(12.0f)) {
            f7 = Math.max(0.0f, (d60Var.f36865n - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f));
        } else {
            f7 = 1.0f;
        }
        float dp3 = AndroidUtilities.dp(6.0f) * f7;
        fArr[5] = dp3;
        fArr[4] = dp3;
        fArr[3] = dp3;
        fArr[2] = dp3;
        RectF rectF = d60Var.f36870y;
        rectF.set(0.0f, 0.0f, d60Var.f36865n, d60Var.getMeasuredHeight());
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int participantVolume = (int) (ChatObject.getParticipantVolume(d60Var.f36862c) / 100.0d);
        org.telegram.ui.Components.fk0 fk0Var = d60Var.f36860a;
        int dp4 = AndroidUtilities.dp(5.0f) + (fk0Var.getMeasuredWidth() / 2) + fk0Var.getLeft();
        int measuredHeight = (fk0Var.getMeasuredHeight() / 2) + fk0Var.getTop();
        int i16 = 0;
        while (true) {
            float[] fArr2 = d60Var.I;
            if (i16 < fArr2.length) {
                if (i16 == 0) {
                    dp = AndroidUtilities.dp(f15);
                    f10 = f11;
                    i12 = i15;
                } else {
                    if (i16 == i14) {
                        dp = AndroidUtilities.dp(10.0f);
                        i11 = 50;
                    } else {
                        dp = AndroidUtilities.dp(14.0f);
                        i11 = 150;
                    }
                    f10 = f11;
                    i12 = i11;
                }
                float f16 = f12;
                float f17 = fArr2[i16];
                float dp5 = (f16 - f17) * AndroidUtilities.dp(2.0f);
                Paint paint2 = d60Var.v;
                paint2.setAlpha((int) (255.0f * f17));
                float f18 = dp4;
                float f19 = measuredHeight;
                rectF.set((f18 - dp) + dp5, (f19 - dp) + dp5, (f18 + dp) - dp5, (f19 + dp) - dp5);
                canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
                if (participantVolume > i12) {
                    float f20 = fArr2[i16];
                    if (f20 < f16) {
                        float f21 = (((float) j3) / 180.0f) + f20;
                        fArr2[i16] = f21;
                        if (f21 > f16) {
                            fArr2[i16] = f16;
                        }
                        invalidate();
                    }
                } else {
                    float f22 = fArr2[i16];
                    if (f22 > f10) {
                        float f23 = f22 - (((float) j3) / 180.0f);
                        fArr2[i16] = f23;
                        if (f23 < f10) {
                            fArr2[i16] = f10;
                        }
                        invalidate();
                    }
                }
                i16++;
                d60Var = this;
                canvas2 = canvas;
                f11 = f10;
                f12 = f16;
                f15 = 6.0f;
                i14 = 1;
                i15 = 0;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        this.f36865n = (int) (View.MeasureSpec.getSize(i10) * this.f36866r);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
