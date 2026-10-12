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
public final class f60 extends FrameLayout {
    public int E;
    public int F;
    public float G;
    public long H;
    public final float[] I;
    public boolean J;
    public final i60 K;
    public final org.telegram.ui.Components.ik0 f37644a;
    public final TextView f37645b;
    public final TLRPC.GroupCallParticipant f37646c;
    public final org.telegram.ui.Components.fk0 d;
    public boolean f37647e;
    public float f37648f;
    public float h;
    public int f37649n;
    public double f37650r;
    public final Paint f37651s;
    public final Paint v;
    public final Path f37652w;
    public final float[] f37653x;
    public final RectF f37654y;

    public f60(i60 i60Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        Integer num;
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        this.K = i60Var;
        this.f37651s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f37652w = new Path();
        this.f37653x = new float[8];
        this.f37654y = new RectF();
        this.I = new float[3];
        setWillNotDraw(false);
        this.f37646c = groupCallParticipant;
        this.f37650r = ChatObject.getParticipantVolume(groupCallParticipant) / 20000.0f;
        this.G = 1.0f;
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(R.raw.speaker, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.d = fk0Var;
        ?? imageView = new ImageView(context);
        this.f37644a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(fk0Var);
        if (this.f37650r == 0.0d) {
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
        addView((View) imageView, w7.w5.a(40.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, i10 | 16));
        if (this.f37650r == 0.0d) {
            i11 = 17;
        } else {
            i11 = 34;
        }
        fk0Var.P(i11);
        fk0Var.N(fk0Var.f26111f - 1, false, true);
        TextView textView = new TextView(context);
        this.f37645b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20641hg, false));
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
        addView(textView, w7.w5.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
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
        i60 i60Var = this.K;
        AccountInstance accountInstance = i60Var.d;
        if (VoIPService.getSharedInstance() != null) {
            this.f37650r = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.f37646c;
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
            this.f37645b.setText(((int) d10) + "%");
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
                    i50 i50Var = i60Var.f38706f3;
                    if (i50Var != null) {
                        i50Var.dismiss();
                        i60Var.f38706f3 = null;
                    }
                    i60Var.e1(true);
                    if (i60Var.R0()) {
                        i11 = 0;
                    } else {
                        i11 = 5;
                    }
                    i60Var.y1(groupCallParticipant, peerId, i11);
                } else {
                    VoIPService.getSharedInstance().editCallMember(tLObject, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
                }
            }
            if (this.f37650r == 0.0d) {
                num = 1;
            }
            org.telegram.ui.Components.ik0 ik0Var = this.f37644a;
            if ((ik0Var.getTag() == null && num != null) || (ik0Var.getTag() != null && num == null)) {
                if (this.f37650r == 0.0d) {
                    i10 = 17;
                } else {
                    i10 = 34;
                }
                org.telegram.ui.Components.fk0 fk0Var = this.d;
                fk0Var.P(i10);
                if (this.f37650r != 0.0d) {
                    i12 = 17;
                }
                fk0Var.M(i12);
                fk0Var.start();
                ik0Var.setTag(num);
            }
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f37648f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.f37647e) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f37648f) > viewConfiguration.getScaledTouchSlop()) {
                        this.f37647e = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            int x10 = (int) motionEvent.getX();
                            this.f37649n = x10;
                            if (x10 < 0) {
                                this.f37649n = 0;
                            } else if (x10 > getMeasuredWidth()) {
                                this.f37649n = getMeasuredWidth();
                            }
                            this.J = true;
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.J) {
                    int x11 = (int) motionEvent.getX();
                    this.f37649n = x11;
                    if (x11 < 0) {
                        this.f37649n = 0;
                    } else if (x11 > getMeasuredWidth()) {
                        this.f37649n = getMeasuredWidth();
                    }
                    a(this.f37649n / getMeasuredWidth(), false);
                    invalidate();
                    return true;
                }
            }
        } else {
            this.f37647e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x12 = (int) motionEvent.getX();
                    this.f37649n = x12;
                    if (x12 < 0) {
                        this.f37649n = 0;
                    } else if (x12 > getMeasuredWidth()) {
                        this.f37649n = getMeasuredWidth();
                    }
                    this.J = true;
                }
            }
            if (this.J) {
                if (motionEvent.getAction() == 1) {
                    a(this.f37649n / getMeasuredWidth(), true);
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
        f60 f60Var = this;
        int i13 = f60Var.E;
        double d = f60Var.f37650r;
        if (d < 0.25d) {
            f60Var.E = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            f60Var.E = -3562181;
        } else if (d >= 0.5d && d <= 0.75d) {
            f60Var.E = -11027349;
        } else {
            f60Var.E = -11688225;
        }
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (i13 == 0) {
            i10 = f60Var.E;
            f60Var.G = 1.0f;
        } else {
            int offsetColor = AndroidUtilities.getOffsetColor(f60Var.F, i13, f60Var.G, 1.0f);
            if (i13 != f60Var.E) {
                f60Var.G = 0.0f;
                f60Var.F = offsetColor;
            }
            i10 = offsetColor;
        }
        Paint paint = f60Var.f37651s;
        paint.setColor(i10);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - f60Var.H;
        if (j3 > 17) {
            j3 = 17;
        }
        f60Var.H = elapsedRealtime;
        float f13 = f60Var.G;
        if (f13 < 1.0f) {
            float f14 = (((float) j3) / 200.0f) + f13;
            f60Var.G = f14;
            if (f14 > 1.0f) {
                f60Var.G = 1.0f;
            } else {
                f60Var.invalidate();
            }
        }
        Path path = f60Var.f37652w;
        path.reset();
        float f15 = 6.0f;
        float dp2 = AndroidUtilities.dp(6.0f);
        float[] fArr = f60Var.f37653x;
        fArr[7] = dp2;
        fArr[6] = dp2;
        int i14 = 1;
        fArr[1] = dp2;
        int i15 = 0;
        fArr[0] = dp2;
        if (f60Var.f37649n < AndroidUtilities.dp(12.0f)) {
            f7 = Math.max(0.0f, (f60Var.f37649n - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f));
        } else {
            f7 = 1.0f;
        }
        float dp3 = AndroidUtilities.dp(6.0f) * f7;
        fArr[5] = dp3;
        fArr[4] = dp3;
        fArr[3] = dp3;
        fArr[2] = dp3;
        RectF rectF = f60Var.f37654y;
        rectF.set(0.0f, 0.0f, f60Var.f37649n, f60Var.getMeasuredHeight());
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int participantVolume = (int) (ChatObject.getParticipantVolume(f60Var.f37646c) / 100.0d);
        org.telegram.ui.Components.ik0 ik0Var = f60Var.f37644a;
        int dp4 = AndroidUtilities.dp(5.0f) + (ik0Var.getMeasuredWidth() / 2) + ik0Var.getLeft();
        int measuredHeight = (ik0Var.getMeasuredHeight() / 2) + ik0Var.getTop();
        int i16 = 0;
        while (true) {
            float[] fArr2 = f60Var.I;
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
                Paint paint2 = f60Var.v;
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
                f60Var = this;
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
        this.f37649n = (int) (View.MeasureSpec.getSize(i10) * this.f37650r);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
