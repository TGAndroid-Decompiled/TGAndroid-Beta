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
public final class l50 extends FrameLayout {
    public int A;
    public int B;
    public float C;
    public long D;
    public final float[] E;
    public boolean F;
    public final o50 G;
    public final org.telegram.ui.Components.pi0 f40042a;
    public final TextView f40043b;
    public final TLRPC.GroupCallParticipant f40044c;
    public final org.telegram.ui.Components.mi0 d;
    public boolean f40045e;
    public float f40046f;
    public float h;
    public int f40047n;
    public double f40048r;
    public final Paint f40049s;
    public final Paint v;
    public final Path f40050w;
    public final float[] f40051x;
    public final RectF f40052y;

    public l50(o50 o50Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        Integer num;
        int i9;
        int i10;
        int dp;
        int i11;
        int i12;
        this.G = o50Var;
        this.f40049s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f40050w = new Path();
        this.f40051x = new float[8];
        this.f40052y = new RectF();
        this.E = new float[3];
        setWillNotDraw(false);
        this.f40044c = groupCallParticipant;
        this.f40048r = ChatObject.getParticipantVolume(groupCallParticipant) / 20000.0f;
        this.C = 1.0f;
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(R.raw.speaker, "" + R.raw.speaker, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.d = mi0Var;
        ?? imageView = new ImageView(context);
        this.f40042a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(mi0Var);
        if (this.f40048r == 0.0d) {
            num = 1;
        } else {
            num = null;
        }
        imageView.setTag(num);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        addView((View) imageView, g7.e6.d(-2, 40.0f, i9 | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        if (this.f40048r == 0.0d) {
            i10 = 17;
        } else {
            i10 = 34;
        }
        mi0Var.N(i10);
        mi0Var.L(mi0Var.f30849f - 1, false, true);
        TextView textView = new TextView(context);
        this.f40043b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23083hg, false));
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
            i11 = AndroidUtilities.dp(43.0f);
        } else {
            i11 = 0;
        }
        textView.setPadding(dp, 0, i11, 0);
        addView(textView, g7.e6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int participantVolume2 = (int) (ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d);
        int i13 = 0;
        while (true) {
            float[] fArr = this.E;
            if (i13 < fArr.length) {
                if (i13 == 0) {
                    i12 = 0;
                } else if (i13 == 1) {
                    i12 = 50;
                } else {
                    i12 = 150;
                }
                if (participantVolume2 > i12) {
                    fArr[i13] = 1.0f;
                } else {
                    fArr[i13] = 0.0f;
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void a(double d, boolean z10) {
        double d9;
        int i9;
        TLObject chat;
        int i10;
        o50 o50Var = this.G;
        AccountInstance accountInstance = o50Var.d;
        if (VoIPService.getSharedInstance() != null) {
            this.f40048r = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.f40044c;
            groupCallParticipant.volume = (int) (d * 20000.0d);
            int i11 = 0;
            groupCallParticipant.volume_by_admin = false;
            groupCallParticipant.flags |= 128;
            double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
            Locale locale = Locale.US;
            if (participantVolume > 0.0d) {
                d9 = Math.max(participantVolume, 1.0d);
            } else {
                d9 = 0.0d;
            }
            this.f40043b.setText(((int) d9) + "%");
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
                    o40 o40Var = o50Var.f40887b3;
                    if (o40Var != null) {
                        o40Var.dismiss();
                        o50Var.f40887b3 = null;
                    }
                    o50Var.d1(true);
                    if (o50Var.Q0()) {
                        i10 = 0;
                    } else {
                        i10 = 5;
                    }
                    o50Var.x1(groupCallParticipant, peerId, i10);
                } else {
                    VoIPService.getSharedInstance().editCallMember(tLObject, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
                }
            }
            if (this.f40048r == 0.0d) {
                num = 1;
            }
            org.telegram.ui.Components.pi0 pi0Var = this.f40042a;
            if ((pi0Var.getTag() == null && num != null) || (pi0Var.getTag() != null && num == null)) {
                if (this.f40048r == 0.0d) {
                    i9 = 17;
                } else {
                    i9 = 34;
                }
                org.telegram.ui.Components.mi0 mi0Var = this.d;
                mi0Var.N(i9);
                if (this.f40048r != 0.0d) {
                    i11 = 17;
                }
                mi0Var.K(i11);
                mi0Var.start();
                pi0Var.setTag(num);
            }
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f40046f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.f40045e) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f40046f) > viewConfiguration.getScaledTouchSlop()) {
                        this.f40045e = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            int x10 = (int) motionEvent.getX();
                            this.f40047n = x10;
                            if (x10 < 0) {
                                this.f40047n = 0;
                            } else if (x10 > getMeasuredWidth()) {
                                this.f40047n = getMeasuredWidth();
                            }
                            this.F = true;
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.F) {
                    int x11 = (int) motionEvent.getX();
                    this.f40047n = x11;
                    if (x11 < 0) {
                        this.f40047n = 0;
                    } else if (x11 > getMeasuredWidth()) {
                        this.f40047n = getMeasuredWidth();
                    }
                    a(this.f40047n / getMeasuredWidth(), false);
                    invalidate();
                    return true;
                }
            }
        } else {
            this.f40045e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x12 = (int) motionEvent.getX();
                    this.f40047n = x12;
                    if (x12 < 0) {
                        this.f40047n = 0;
                    } else if (x12 > getMeasuredWidth()) {
                        this.f40047n = getMeasuredWidth();
                    }
                    this.F = true;
                }
            }
            if (this.F) {
                if (motionEvent.getAction() == 1) {
                    a(this.f40047n / getMeasuredWidth(), true);
                }
                this.F = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        float f10;
        float dp;
        int i10;
        l50 l50Var = this;
        int i11 = l50Var.A;
        double d = l50Var.f40048r;
        if (d < 0.25d) {
            l50Var.A = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            l50Var.A = -3562181;
        } else if (d >= 0.5d && d <= 0.75d) {
            l50Var.A = -11027349;
        } else {
            l50Var.A = -11688225;
        }
        if (i11 == 0) {
            i9 = l50Var.A;
            l50Var.C = 1.0f;
        } else {
            int offsetColor = AndroidUtilities.getOffsetColor(l50Var.B, i11, l50Var.C, 1.0f);
            if (i11 != l50Var.A) {
                l50Var.C = 0.0f;
                l50Var.B = offsetColor;
            }
            i9 = offsetColor;
        }
        Paint paint = l50Var.f40049s;
        paint.setColor(i9);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - l50Var.D;
        if (j10 > 17) {
            j10 = 17;
        }
        l50Var.D = elapsedRealtime;
        float f11 = l50Var.C;
        if (f11 < 1.0f) {
            float f12 = (((float) j10) / 200.0f) + f11;
            l50Var.C = f12;
            if (f12 > 1.0f) {
                l50Var.C = 1.0f;
            } else {
                l50Var.invalidate();
            }
        }
        Path path = l50Var.f40050w;
        path.reset();
        float f13 = 6.0f;
        float dp2 = AndroidUtilities.dp(6.0f);
        float[] fArr = l50Var.f40051x;
        fArr[7] = dp2;
        fArr[6] = dp2;
        int i12 = 1;
        fArr[1] = dp2;
        fArr[0] = dp2;
        if (l50Var.f40047n < AndroidUtilities.dp(12.0f)) {
            f10 = Math.max(0.0f, (l50Var.f40047n - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f));
        } else {
            f10 = 1.0f;
        }
        float dp3 = AndroidUtilities.dp(6.0f) * f10;
        fArr[5] = dp3;
        fArr[4] = dp3;
        fArr[3] = dp3;
        fArr[2] = dp3;
        RectF rectF = l50Var.f40052y;
        rectF.set(0.0f, 0.0f, l50Var.f40047n, l50Var.getMeasuredHeight());
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int participantVolume = (int) (ChatObject.getParticipantVolume(l50Var.f40044c) / 100.0d);
        org.telegram.ui.Components.pi0 pi0Var = l50Var.f40042a;
        int dp4 = AndroidUtilities.dp(5.0f) + (pi0Var.getMeasuredWidth() / 2) + pi0Var.getLeft();
        int measuredHeight = (pi0Var.getMeasuredHeight() / 2) + pi0Var.getTop();
        int i13 = 0;
        while (true) {
            float[] fArr2 = l50Var.E;
            if (i13 < fArr2.length) {
                if (i13 == 0) {
                    dp = AndroidUtilities.dp(f13);
                    i10 = 0;
                } else if (i13 == i12) {
                    dp = AndroidUtilities.dp(10.0f);
                    i10 = 50;
                } else {
                    dp = AndroidUtilities.dp(14.0f);
                    i10 = 150;
                }
                float f14 = fArr2[i13];
                float dp5 = (1.0f - f14) * AndroidUtilities.dp(2.0f);
                Paint paint2 = l50Var.v;
                paint2.setAlpha((int) (255.0f * f14));
                float f15 = dp4;
                float f16 = measuredHeight;
                rectF.set((f15 - dp) + dp5, (f16 - dp) + dp5, (f15 + dp) - dp5, (f16 + dp) - dp5);
                canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
                if (participantVolume > i10) {
                    float f17 = fArr2[i13];
                    if (f17 < 1.0f) {
                        float f18 = (((float) j10) / 180.0f) + f17;
                        fArr2[i13] = f18;
                        if (f18 > 1.0f) {
                            fArr2[i13] = 1.0f;
                        }
                        invalidate();
                    }
                } else {
                    float f19 = fArr2[i13];
                    if (f19 > 0.0f) {
                        float f20 = f19 - (((float) j10) / 180.0f);
                        fArr2[i13] = f20;
                        if (f20 < 0.0f) {
                            fArr2[i13] = 0.0f;
                        }
                        invalidate();
                    }
                }
                i13++;
                canvas2 = canvas;
                f13 = 6.0f;
                i12 = 1;
                l50Var = this;
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        this.f40047n = (int) (View.MeasureSpec.getSize(i9) * this.f40048r);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
