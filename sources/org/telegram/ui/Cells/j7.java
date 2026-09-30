package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.w00;
public class j7 extends FrameLayout implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.v5 E;
    public float F;
    public float G;
    public StaticLayout H;
    public int I;
    public org.telegram.ui.Components.v5 J;
    public float K;
    public float L;
    public StaticLayout M;
    public MessageObject N;
    public boolean O;
    public final int P;
    public final int Q;
    public int R;
    public int S;
    public final RadialProgress2 T;
    public final int U;
    public StaticLayout V;
    public int W;
    public final SpannableStringBuilder f20535a;
    public final TextPaint f20536a0;
    public final qp f20537b;
    public final TextPaint f20538b0;
    public boolean f20539c;
    public final org.telegram.ui.ActionBar.d6 f20540c0;
    public boolean d;
    public boolean f20541d0;
    public boolean e;
    public float f20542e0;
    public int f20543f;
    public boolean f20544f0;
    public float f20545g0;
    public int h;
    public final TextPaint f20546h0;
    public Utilities.CallbackReturn f20547i0;
    public float f20548j0;
    public w00 f20549k0;
    public int f20550n;
    public final int f20551r;
    public StaticLayout f20552s;
    public float v;
    public float f20553w;
    public org.telegram.ui.Components.v5 f20554x;
    public int f20555y;

    public j7(Context context) {
        this(context, 0, null);
    }

    private int getIconForCurrentState() {
        int i10 = this.R;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i10 = this.S;
        if (i10 < 0) {
            return 4;
        }
        if (i10 == 0) {
            return 2;
        }
        return 3;
    }

    public void a() {
        int i10 = this.R;
        int i11 = this.P;
        RadialProgress2 radialProgress2 = this.T;
        if (i10 == 0) {
            if (this.S == 0) {
                this.N.putInDownloadsStore = true;
                FileLoader.getInstance(i11).loadFile(this.N.getDocument(), this.N, 1, 0);
            }
            if (d(this.N)) {
                if (this.f20543f == 2 && this.S != 1) {
                    this.S = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.R = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.N)) {
                this.R = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 2) {
            radialProgress2.o(0.0f, false);
            this.N.putInDownloadsStore = true;
            FileLoader.getInstance(i11).loadFile(this.N.getDocument(), this.N, 1, 0);
            this.R = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i10 == 4) {
            FileLoader.getInstance(i11).cancelLoadFile(this.N.getDocument());
            this.R = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        float f13;
        float f14;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var = this.f20540c0;
        if (this.U == 1) {
            this.f20536a0.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, d6Var));
        }
        StaticLayout staticLayout2 = this.V;
        int i12 = this.f20551r;
        int i13 = 0;
        float f15 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (LocaleController.isRTL) {
                f14 = 24.0f;
            } else {
                f14 = AndroidUtilities.leftBaseline;
            }
            int dp = AndroidUtilities.dp(f14);
            if (LocaleController.isRTL) {
                i11 = 0;
            } else {
                i11 = this.W;
            }
            canvas.translate(dp + i11, i12);
            this.V.draw(canvas);
            canvas.restore();
        }
        float f16 = 0.0f;
        if (this.f20552s != null) {
            int alpha = org.telegram.ui.ActionBar.h6.f19109f3.getAlpha();
            float f17 = this.f20545g0;
            if (f17 != 1.0f) {
                org.telegram.ui.ActionBar.h6.f19109f3.setAlpha((int) (alpha * f17));
            }
            canvas.save();
            if (LocaleController.isRTL) {
                f11 = 24.0f;
            } else {
                f11 = AndroidUtilities.leftBaseline;
            }
            int dp2 = AndroidUtilities.dp(f11);
            if (LocaleController.isRTL && (staticLayout = this.V) != null) {
                int width = staticLayout.getWidth();
                if (LocaleController.isRTL) {
                    f13 = 12.0f;
                } else {
                    f13 = 4.0f;
                }
                i13 = width + AndroidUtilities.dp(f13);
            }
            float f18 = dp2 + i13;
            if (LocaleController.isRTL) {
                f12 = this.f20552s.getWidth() - this.f20553w;
            } else {
                f12 = 0.0f;
            }
            canvas.translate((f18 + f12) - this.v, i12);
            this.f20552s.draw(canvas);
            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.f20552s, this.f20554x, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f20545g0 != 1.0f) {
                org.telegram.ui.ActionBar.h6.f19109f3.setAlpha(alpha);
            }
        }
        if (this.M != null) {
            this.f20538b0.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            canvas.save();
            if (LocaleController.isRTL) {
                f7 = 24.0f;
            } else {
                f7 = AndroidUtilities.leftBaseline;
            }
            float dp3 = AndroidUtilities.dp(f7);
            if (LocaleController.isRTL) {
                f10 = this.M.getWidth() - this.L;
            } else {
                f10 = 0.0f;
            }
            canvas.translate((dp3 + f10) - this.K, this.I);
            this.M.draw(canvas);
            canvas.restore();
        }
        if (this.H != null) {
            org.telegram.ui.ActionBar.h6.f19127g3.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19478z6, d6Var));
            int alpha2 = org.telegram.ui.ActionBar.h6.f19127g3.getAlpha();
            float f19 = this.f20545g0;
            if (f19 != 1.0f) {
                org.telegram.ui.ActionBar.h6.f19127g3.setAlpha((int) (alpha2 * f19));
            }
            canvas.save();
            if (!LocaleController.isRTL) {
                f15 = AndroidUtilities.leftBaseline;
            }
            float dp4 = AndroidUtilities.dp(f15);
            if (LocaleController.isRTL) {
                f16 = this.H.getWidth() - this.G;
            }
            canvas.translate((dp4 + f16) - this.F, this.f20555y);
            this.H.draw(canvas);
            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.H, this.E, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f20545g0 != 1.0f) {
                org.telegram.ui.ActionBar.h6.f19127g3.setAlpha(alpha2);
            }
        }
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.h6.f19190jd;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f19172id;
        }
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        RadialProgress2 radialProgress2 = this.T;
        radialProgress2.d = v02;
        radialProgress2.H = this.f20545g0;
        radialProgress2.draw(canvas);
        if (this.f20539c) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - AndroidUtilities.dp(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.T0("paintDivider", d6Var));
            } else {
                canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.T0("paintDivider", d6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z10 = this.f20541d0;
        if (!z10 && this.f20542e0 == 0.0f) {
            return;
        }
        if (z10) {
            float f7 = this.f20542e0;
            if (f7 != 1.0f) {
                this.f20542e0 = f7 + 0.10666667f;
                invalidate();
                this.f20542e0 = Utilities.clamp(this.f20542e0, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.h6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.h6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f10 = this.f20542e0;
                canvas.scale(f10, f10, (org.telegram.ui.ActionBar.h6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.h6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.h6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.h6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.h6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f11 = this.f20542e0;
            if (f11 != 0.0f) {
                this.f20542e0 = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.f20542e0 = Utilities.clamp(this.f20542e0, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.h6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.h6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f102 = this.f20542e0;
        canvas.scale(f102, f102, (org.telegram.ui.ActionBar.h6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.h6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.h6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.h6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.h6.Z0.draw(canvas);
        canvas.restore();
    }

    public boolean d(MessageObject messageObject) {
        Utilities.CallbackReturn callbackReturn = this.f20547i0;
        if (callbackReturn != null && ((Boolean) callbackReturn.run(messageObject)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g(false, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.f20544f0;
        if (z10) {
            float f7 = this.f20545g0;
            if (f7 != 1.0f) {
                this.f20545g0 = f7 + 0.10666667f;
                invalidate();
                this.f20545g0 = Utilities.clamp(this.f20545g0, 1.0f, 0.0f);
                if (this.f20548j0 == 1.0f && this.f20549k0 != null) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.f20548j0) * 255.0f), 31);
                    this.f20549k0.setViewType(4);
                    this.f20549k0.e();
                    this.f20549k0.h();
                    this.f20549k0.draw(canvas);
                    canvas.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.f20548j0 * 255.0f), 31);
                    b(canvas);
                    super.dispatchDraw(canvas);
                    c(canvas);
                    canvas.restore();
                    return;
                }
                b(canvas);
                c(canvas);
                super.dispatchDraw(canvas);
            }
        }
        if (!z10) {
            float f10 = this.f20545g0;
            if (f10 != 0.0f) {
                this.f20545g0 = f10 - 0.10666667f;
                invalidate();
            }
        }
        this.f20545g0 = Utilities.clamp(this.f20545g0, 1.0f, 0.0f);
        if (this.f20548j0 == 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        qp qpVar = this.f20537b;
        if (qpVar.getVisibility() != 0) {
            qpVar.setVisibility(0);
        }
        qpVar.a(z10, z11);
    }

    public final void f(MessageObject messageObject, boolean z10) {
        TLRPC.PhotoSize photoSize;
        this.f20539c = z10;
        this.N = messageObject;
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            photoSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 360);
        } else {
            photoSize = null;
        }
        boolean z11 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.T;
        if (!z11 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = messageObject.audioCover;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.f22387w.setImageBitmap(bitmap);
            } else {
                String artworkUrl = messageObject.getArtworkUrl(true);
                if (!TextUtils.isEmpty(artworkUrl)) {
                    radialProgress2.h(artworkUrl);
                } else {
                    radialProgress2.i(null, null, null);
                }
            }
        } else {
            radialProgress2.i(photoSize, document, messageObject);
        }
        g(false, false);
        requestLayout();
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        String fileName = this.N.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        MessageObject messageObject = this.N;
        if (!messageObject.attachPathExists && !messageObject.mediaExists) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (SharedConfig.streamMedia && messageObject.isMusic() && ((int) this.N.getDialogId()) != 0) {
            if (z12) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f20543f = i11;
            z12 = true;
        } else {
            this.f20543f = 0;
            this.S = -1;
        }
        int i12 = this.f20543f;
        int i13 = this.P;
        RadialProgress2 radialProgress2 = this.T;
        if (i12 != 0) {
            if (this.N.isOutOwner()) {
                i10 = org.telegram.ui.ActionBar.h6.Nb;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.f19173ie;
            }
            radialProgress2.e.setColor(org.telegram.ui.ActionBar.h6.v0(i10, this.f20540c0));
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.N);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.R = 1;
            } else {
                this.R = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            if (this.f20543f == 1) {
                DownloadController.getInstance(i13).removeLoadingFileObserver(this);
                this.S = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            DownloadController.getInstance(i13).addLoadingFileObserver(fileName, this.N, this);
            if (!FileLoader.getInstance(i13).isLoadingFile(fileName)) {
                this.S = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            this.S = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            if (fileProgress != null) {
                radialProgress2.o(fileProgress.floatValue(), z11);
            } else {
                radialProgress2.o(0.0f, z11);
            }
        } else if (z12) {
            DownloadController.getInstance(i13).removeLoadingFileObserver(this);
            boolean isPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.N);
            if (isPlayingMessage2 && (!isPlayingMessage2 || !MediaController.getInstance().isMessagePaused())) {
                this.R = 1;
            } else {
                this.R = 0;
            }
            radialProgress2.o(1.0f, z11);
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        } else {
            DownloadController.getInstance(i13).addLoadingFileObserver(fileName, this.N, this);
            if (!FileLoader.getInstance(i13).isLoadingFile(fileName)) {
                this.R = 2;
                radialProgress2.o(0.0f, z11);
            } else {
                this.R = 4;
                Float fileProgress2 = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress2 != null) {
                    radialProgress2.o(fileProgress2.floatValue(), z11);
                } else {
                    radialProgress2.o(0.0f, z11);
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        }
    }

    public MessageObject getMessage() {
        return this.N;
    }

    @Override
    public int getObserverTag() {
        return this.Q;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T.e();
        g(false, false);
        int i10 = this.P;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        this.f20554x = org.telegram.ui.Components.z5.update(0, this, this.f20554x, this.f20552s);
        this.E = org.telegram.ui.Components.z5.update(0, this, this.E, this.H);
        this.J = org.telegram.ui.Components.z5.update(0, this, this.J, this.M);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.P;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.T.f();
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        org.telegram.ui.Components.z5.release(this, this.f20554x);
        org.telegram.ui.Components.z5.release(this, this.E);
        org.telegram.ui.Components.z5.release(this, this.J);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        g(true, z10);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String string;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.N.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.N.getMusicAuthor(), this.N.getMusicTitle()));
        } else if (this.f20552s != null && this.H != null) {
            accessibilityNodeInfo.setText(((Object) this.f20552s.getText()) + ", " + ((Object) this.H.getText()));
        }
        if (this.f20537b.f27697a.f22216q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    string = LocaleController.getString("AccActionPlay", R.string.AccActionPlay);
                } else {
                    string = LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload);
                }
            } else {
                string = LocaleController.getString("AccActionDownload", R.string.AccActionDownload);
            }
        } else {
            string = LocaleController.getString("AccActionPause", R.string.AccActionPause);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j7.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.T.o(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
        if (this.f20543f != 0) {
            if (this.S != 1) {
                g(false, true);
            }
        } else if (this.R != 4) {
            g(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.T.o(1.0f, true);
        g(false, true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.j7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 == 16) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setCheckForButtonPress(boolean z10) {
        this.O = z10;
    }

    public void setEnterAnimationAlpha(float f7) {
        if (this.f20548j0 != f7) {
            this.f20548j0 = f7;
            invalidate();
        }
    }

    public void setGlobalGradientView(w00 w00Var) {
        this.f20549k0 = w00Var;
    }

    public void setNeedPlayMessageListener(Utilities.CallbackReturn<MessageObject, Boolean> callbackReturn) {
        this.f20547i0 = callbackReturn;
    }

    public j7(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f20551r = AndroidUtilities.dp(9.0f);
        this.f20555y = AndroidUtilities.dp(29.0f);
        this.I = AndroidUtilities.dp(29.0f);
        int i11 = UserConfig.selectedAccount;
        this.P = i11;
        this.f20544f0 = true;
        this.f20545g0 = 0.0f;
        this.f20548j0 = 1.0f;
        this.f20540c0 = d6Var;
        this.U = i10;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, d6Var);
        this.T = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.h6.f19173ie, org.telegram.ui.ActionBar.h6.f19191je, org.telegram.ui.ActionBar.h6.f19395uc, org.telegram.ui.ActionBar.h6.f19412vc);
        this.Q = DownloadController.getInstance(i11).generateObserverTag();
        setWillNotDraw(false);
        qp qpVar = new qp(context, 22, d6Var);
        this.f20537b = qpVar;
        qpVar.setVisibility(4);
        qpVar.b(-1, org.telegram.ui.ActionBar.h6.f19076d6, org.telegram.ui.ActionBar.h6.f19204k7);
        qpVar.setDrawUnchecked(false);
        qpVar.setDrawBackgroundAsArc(3);
        boolean z10 = LocaleController.isRTL;
        addView(qpVar, w7.y5.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.f20536a0 = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.f20535a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new et(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.f20538b0 = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        if (d6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f20546h0 = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint3.setColor(d6Var.G0(org.telegram.ui.ActionBar.h6.G6));
        }
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
