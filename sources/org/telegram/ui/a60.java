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
public final class a60 extends FrameLayout {
    public int B;
    public int C;
    public float D;
    public long E;
    public final float[] F;
    public boolean G;
    public final d60 H;
    public final org.telegram.ui.Components.kj0 f35034a;
    public final TextView f35035b;
    public final TLRPC.GroupCallParticipant f35036c;
    public final org.telegram.ui.Components.hj0 d;
    public boolean f35037e;
    public float f35038f;
    public float h;
    public int f35039n;
    public double f35040r;
    public final Paint f35041s;
    public final Paint v;
    public final Path f35042w;
    public final float[] f35043x;
    public final RectF f35044y;

    public a60(d60 d60Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        Integer num;
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        this.H = d60Var;
        this.f35041s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f35042w = new Path();
        this.f35043x = new float[8];
        this.f35044y = new RectF();
        this.F = new float[3];
        setWillNotDraw(false);
        this.f35036c = groupCallParticipant;
        this.f35040r = ChatObject.getParticipantVolume(groupCallParticipant) / 20000.0f;
        this.D = 1.0f;
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.speaker, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.d = hj0Var;
        ?? imageView = new ImageView(context);
        this.f35034a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(hj0Var);
        if (this.f35040r == 0.0d) {
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
        addView((View) imageView, k7.c6.d(-2, 40.0f, i10 | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        if (this.f35040r == 0.0d) {
            i11 = 17;
        } else {
            i11 = 34;
        }
        hj0Var.N(i11);
        hj0Var.L(hj0Var.f27526f - 1, false, true);
        TextView textView = new TextView(context);
        this.f35035b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21743hg, false));
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
        addView(textView, k7.c6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int participantVolume2 = (int) (ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d);
        int i14 = 0;
        while (true) {
            float[] fArr = this.F;
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

    public final void a(double d, boolean z4) {
        double d10;
        int i10;
        TLObject chat;
        int i11;
        d60 d60Var = this.H;
        AccountInstance accountInstance = d60Var.d;
        if (VoIPService.getSharedInstance() != null) {
            this.f35040r = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.f35036c;
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
            this.f35035b.setText(((int) d10) + "%");
            VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
            Integer num = null;
            if (z4) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                if (peerId > 0) {
                    chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                } else {
                    chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                }
                TLObject tLObject = chat;
                if (groupCallParticipant.volume == 0) {
                    e50 e50Var = d60Var.c3;
                    if (e50Var != null) {
                        e50Var.dismiss();
                        d60Var.c3 = null;
                    }
                    d60Var.d1(true);
                    if (d60Var.Q0()) {
                        i11 = 0;
                    } else {
                        i11 = 5;
                    }
                    d60Var.x1(groupCallParticipant, peerId, i11);
                } else {
                    VoIPService.getSharedInstance().editCallMember(tLObject, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
                }
            }
            if (this.f35040r == 0.0d) {
                num = 1;
            }
            org.telegram.ui.Components.kj0 kj0Var = this.f35034a;
            if ((kj0Var.getTag() == null && num != null) || (kj0Var.getTag() != null && num == null)) {
                if (this.f35040r == 0.0d) {
                    i10 = 17;
                } else {
                    i10 = 34;
                }
                org.telegram.ui.Components.hj0 hj0Var = this.d;
                hj0Var.N(i10);
                if (this.f35040r != 0.0d) {
                    i12 = 17;
                }
                hj0Var.K(i12);
                hj0Var.start();
                kj0Var.setTag(num);
            }
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f35038f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.f35037e) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f35038f) > viewConfiguration.getScaledTouchSlop()) {
                        this.f35037e = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            int x10 = (int) motionEvent.getX();
                            this.f35039n = x10;
                            if (x10 < 0) {
                                this.f35039n = 0;
                            } else if (x10 > getMeasuredWidth()) {
                                this.f35039n = getMeasuredWidth();
                            }
                            this.G = true;
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.G) {
                    int x11 = (int) motionEvent.getX();
                    this.f35039n = x11;
                    if (x11 < 0) {
                        this.f35039n = 0;
                    } else if (x11 > getMeasuredWidth()) {
                        this.f35039n = getMeasuredWidth();
                    }
                    a(this.f35039n / getMeasuredWidth(), false);
                    invalidate();
                    return true;
                }
            }
        } else {
            this.f35037e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x12 = (int) motionEvent.getX();
                    this.f35039n = x12;
                    if (x12 < 0) {
                        this.f35039n = 0;
                    } else if (x12 > getMeasuredWidth()) {
                        this.f35039n = getMeasuredWidth();
                    }
                    this.G = true;
                }
            }
            if (this.G) {
                if (motionEvent.getAction() == 1) {
                    a(this.f35039n / getMeasuredWidth(), true);
                }
                this.G = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        float dp;
        int i11;
        a60 a60Var = this;
        int i12 = a60Var.B;
        double d = a60Var.f35040r;
        if (d < 0.25d) {
            a60Var.B = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            a60Var.B = -3562181;
        } else if (d >= 0.5d && d <= 0.75d) {
            a60Var.B = -11027349;
        } else {
            a60Var.B = -11688225;
        }
        if (i12 == 0) {
            i10 = a60Var.B;
            a60Var.D = 1.0f;
        } else {
            int offsetColor = AndroidUtilities.getOffsetColor(a60Var.C, i12, a60Var.D, 1.0f);
            if (i12 != a60Var.B) {
                a60Var.D = 0.0f;
                a60Var.C = offsetColor;
            }
            i10 = offsetColor;
        }
        Paint paint = a60Var.f35041s;
        paint.setColor(i10);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - a60Var.E;
        if (j10 > 17) {
            j10 = 17;
        }
        a60Var.E = elapsedRealtime;
        float f11 = a60Var.D;
        if (f11 < 1.0f) {
            float f12 = (((float) j10) / 200.0f) + f11;
            a60Var.D = f12;
            if (f12 > 1.0f) {
                a60Var.D = 1.0f;
            } else {
                a60Var.invalidate();
            }
        }
        Path path = a60Var.f35042w;
        path.reset();
        float f13 = 6.0f;
        float dp2 = AndroidUtilities.dp(6.0f);
        float[] fArr = a60Var.f35043x;
        fArr[7] = dp2;
        fArr[6] = dp2;
        int i13 = 1;
        fArr[1] = dp2;
        fArr[0] = dp2;
        if (a60Var.f35039n < AndroidUtilities.dp(12.0f)) {
            f10 = Math.max(0.0f, (a60Var.f35039n - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f));
        } else {
            f10 = 1.0f;
        }
        float dp3 = AndroidUtilities.dp(6.0f) * f10;
        fArr[5] = dp3;
        fArr[4] = dp3;
        fArr[3] = dp3;
        fArr[2] = dp3;
        RectF rectF = a60Var.f35044y;
        rectF.set(0.0f, 0.0f, a60Var.f35039n, a60Var.getMeasuredHeight());
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int participantVolume = (int) (ChatObject.getParticipantVolume(a60Var.f35036c) / 100.0d);
        org.telegram.ui.Components.kj0 kj0Var = a60Var.f35034a;
        int dp4 = AndroidUtilities.dp(5.0f) + (kj0Var.getMeasuredWidth() / 2) + kj0Var.getLeft();
        int measuredHeight = (kj0Var.getMeasuredHeight() / 2) + kj0Var.getTop();
        int i14 = 0;
        while (true) {
            float[] fArr2 = a60Var.F;
            if (i14 < fArr2.length) {
                if (i14 == 0) {
                    dp = AndroidUtilities.dp(f13);
                    i11 = 0;
                } else if (i14 == i13) {
                    dp = AndroidUtilities.dp(10.0f);
                    i11 = 50;
                } else {
                    dp = AndroidUtilities.dp(14.0f);
                    i11 = 150;
                }
                float f14 = fArr2[i14];
                float dp5 = (1.0f - f14) * AndroidUtilities.dp(2.0f);
                Paint paint2 = a60Var.v;
                paint2.setAlpha((int) (255.0f * f14));
                float f15 = dp4;
                float f16 = measuredHeight;
                rectF.set((f15 - dp) + dp5, (f16 - dp) + dp5, (f15 + dp) - dp5, (f16 + dp) - dp5);
                canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
                if (participantVolume > i11) {
                    float f17 = fArr2[i14];
                    if (f17 < 1.0f) {
                        float f18 = (((float) j10) / 180.0f) + f17;
                        fArr2[i14] = f18;
                        if (f18 > 1.0f) {
                            fArr2[i14] = 1.0f;
                        }
                        invalidate();
                    }
                } else {
                    float f19 = fArr2[i14];
                    if (f19 > 0.0f) {
                        float f20 = f19 - (((float) j10) / 180.0f);
                        fArr2[i14] = f20;
                        if (f20 < 0.0f) {
                            fArr2[i14] = 0.0f;
                        }
                        invalidate();
                    }
                }
                i14++;
                canvas2 = canvas;
                f13 = 6.0f;
                i13 = 1;
                a60Var = this;
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
        this.f35039n = (int) (View.MeasureSpec.getSize(i10) * this.f35040r);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
