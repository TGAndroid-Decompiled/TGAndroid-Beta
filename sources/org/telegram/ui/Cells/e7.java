package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.ps;
import org.telegram.ui.i10;

public class e7 extends FrameLayout implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.p5 A;
    public float B;
    public float C;
    public StaticLayout D;
    public int E;
    public org.telegram.ui.Components.p5 F;
    public float G;
    public float H;
    public StaticLayout I;
    public MessageObject J;
    public boolean K;
    public final int L;
    public final int M;
    public int N;
    public int O;
    public final RadialProgress2 P;
    public final int Q;
    public StaticLayout R;
    public int S;
    public final TextPaint T;
    public final TextPaint U;
    public final org.telegram.ui.ActionBar.c6 V;
    public boolean W;

    public final SpannableStringBuilder f24300a;

    public float f24301a0;

    public final bp f24302b;

    public boolean f24303b0;

    public boolean f24304c;

    public float f24305c0;
    public boolean d;

    public final TextPaint f24306d0;

    public boolean f24307e;

    public Utilities.CallbackReturn f24308e0;

    public int f24309f;

    public float f24310f0;

    public h00 f24311g0;
    public int h;

    public int f24312n;

    public final int f24313r;

    public StaticLayout f24314s;
    public float v;

    public float f24315w;

    public org.telegram.ui.Components.p5 f24316x;

    public int f24317y;

    public e7(Context context) {
        this(context, 0, null);
    }

    private int getIconForCurrentState() {
        int i10 = this.N;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i10 = this.O;
        if (i10 < 0) {
            return 4;
        }
        return i10 == 0 ? 2 : 3;
    }

    public void a() {
        int i10 = this.N;
        int i11 = this.L;
        RadialProgress2 radialProgress2 = this.P;
        if (i10 == 0) {
            if (this.O == 0) {
                this.J.putInDownloadsStore = true;
                FileLoader.getInstance(i11).loadFile(this.J.getDocument(), this.J, 1, 0);
            }
            if (d(this.J)) {
                if (this.f24309f == 2 && this.O != 1) {
                    this.O = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.N = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.J)) {
                this.N = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 2) {
            radialProgress2.o(0.0f, false);
            this.J.putInDownloadsStore = true;
            FileLoader.getInstance(i11).loadFile(this.J.getDocument(), this.J, 1, 0);
            this.N = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (i10 == 4) {
            FileLoader.getInstance(i11).cancelLoadFile(this.J.getDocument());
            this.N = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        StaticLayout staticLayout;
        org.telegram.ui.ActionBar.c6 c6Var = this.V;
        if (this.Q == 1) {
            this.T.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
        }
        StaticLayout staticLayout2 = this.R;
        int i10 = this.f24313r;
        int width = 0;
        if (staticLayout2 != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? 0 : this.S), i10);
            this.R.draw(canvas);
            canvas.restore();
        }
        if (this.f24314s != null) {
            int alpha = org.telegram.ui.ActionBar.g6.f23087f3.getAlpha();
            float f10 = this.f24305c0;
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23087f3.setAlpha((int) (alpha * f10));
            }
            canvas.save();
            int iDp = AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL && (staticLayout = this.R) != null) {
                width = staticLayout.getWidth() + AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 4.0f);
            }
            canvas.translate(((iDp + width) + (LocaleController.isRTL ? this.f24314s.getWidth() - this.f24315w : 0.0f)) - this.v, i10);
            this.f24314s.draw(canvas);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f24314s, this.f24316x, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f24305c0 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23087f3.setAlpha(alpha);
            }
        }
        if (this.I != null) {
            this.U.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            canvas.save();
            canvas.translate((AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? this.I.getWidth() - this.H : 0.0f)) - this.G, this.E);
            this.I.draw(canvas);
            canvas.restore();
        }
        if (this.D != null) {
            org.telegram.ui.ActionBar.g6.f23105g3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6Var));
            int alpha2 = org.telegram.ui.ActionBar.g6.f23105g3.getAlpha();
            float f11 = this.f24305c0;
            if (f11 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23105g3.setAlpha((int) (alpha2 * f11));
            }
            canvas.save();
            canvas.translate((AndroidUtilities.dp(LocaleController.isRTL ? 24.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? this.D.getWidth() - this.C : 0.0f)) - this.B, this.f24317y);
            this.D.draw(canvas);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.D, this.A, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f24305c0 != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23105g3.setAlpha(alpha2);
            }
        }
        int iV0 = org.telegram.ui.ActionBar.g6.v0(this.d ? org.telegram.ui.ActionBar.g6.f23169jd : org.telegram.ui.ActionBar.g6.f23151id, c6Var);
        RadialProgress2 radialProgress2 = this.P;
        radialProgress2.d = iV0;
        radialProgress2.H = this.f24305c0;
        radialProgress2.draw(canvas);
        if (this.f24304c) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - AndroidUtilities.dp(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
            } else {
                canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        float f10;
        boolean z10 = this.W;
        if (z10 || this.f24301a0 != 0.0f) {
            if (z10) {
                float f11 = this.f24301a0;
                if (f11 != 1.0f) {
                    this.f24301a0 = f11 + 0.10666667f;
                    invalidate();
                } else if (!z10) {
                    f10 = this.f24301a0;
                    if (f10 != 0.0f) {
                        this.f24301a0 = f10 - 0.10666667f;
                        invalidate();
                    }
                }
            } else if (!z10) {
                f10 = this.f24301a0;
                if (f10 != 0.0f) {
                    this.f24301a0 = f10 - 0.10666667f;
                    invalidate();
                }
            }
            this.f24301a0 = Utilities.clamp(this.f24301a0, 1.0f, 0.0f);
            int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth();
            int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f12 = this.f24301a0;
            canvas.scale(f12, f12, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
            Drawable drawable = org.telegram.ui.ActionBar.g6.Z0;
            drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() + measuredHeight);
            org.telegram.ui.ActionBar.g6.Z0.draw(canvas);
            canvas.restore();
        }
    }

    public boolean d(MessageObject messageObject) {
        Utilities.CallbackReturn callbackReturn = this.f24308e0;
        return callbackReturn != null && ((Boolean) callbackReturn.run(messageObject)).booleanValue();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g(false, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        boolean z10 = this.f24303b0;
        if (z10) {
            float f11 = this.f24305c0;
            if (f11 != 1.0f) {
                this.f24305c0 = f11 + 0.10666667f;
                invalidate();
            } else if (!z10) {
                f10 = this.f24305c0;
                if (f10 != 0.0f) {
                    this.f24305c0 = f10 - 0.10666667f;
                    invalidate();
                }
            }
        } else if (!z10) {
            f10 = this.f24305c0;
            if (f10 != 0.0f) {
                this.f24305c0 = f10 - 0.10666667f;
                invalidate();
            }
        }
        this.f24305c0 = Utilities.clamp(this.f24305c0, 1.0f, 0.0f);
        if (this.f24310f0 == 1.0f || this.f24311g0 == null) {
            b(canvas);
            c(canvas);
            super.dispatchDraw(canvas);
            return;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.f24310f0) * 255.0f), 31);
        this.f24311g0.setViewType(4);
        this.f24311g0.d();
        this.f24311g0.h();
        this.f24311g0.draw(canvas);
        canvas.restore();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.f24310f0 * 255.0f), 31);
        b(canvas);
        super.dispatchDraw(canvas);
        c(canvas);
        canvas.restore();
    }

    public final void e(boolean z10, boolean z11) {
        bp bpVar = this.f24302b;
        if (bpVar.getVisibility() != 0) {
            bpVar.setVisibility(0);
        }
        bpVar.a(z10, z11);
    }

    public final void f(MessageObject messageObject, boolean z10) {
        this.f24304c = z10;
        this.J = messageObject;
        TLRPC.Document document = messageObject.getDocument();
        TLRPC.PhotoSize closestPhotoSizeWithSize = document != null ? FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 360) : null;
        boolean z11 = closestPhotoSizeWithSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.P;
        if (z11 || (closestPhotoSizeWithSize instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(closestPhotoSizeWithSize, document, messageObject);
        } else {
            Bitmap bitmap = messageObject.audioCover;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.f26483w.setImageBitmap(bitmap);
            } else {
                String artworkUrl = messageObject.getArtworkUrl(true);
                if (TextUtils.isEmpty(artworkUrl)) {
                    radialProgress2.i(null, null, null);
                } else {
                    radialProgress2.h(artworkUrl);
                }
            }
        }
        g(false, false);
        requestLayout();
    }

    public final void g(boolean z10, boolean z11) {
        String fileName = this.J.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        MessageObject messageObject = this.J;
        boolean z12 = messageObject.attachPathExists || messageObject.mediaExists;
        if (SharedConfig.streamMedia && messageObject.isMusic() && ((int) this.J.getDialogId()) != 0) {
            this.f24309f = z12 ? 1 : 2;
            z12 = true;
        } else {
            this.f24309f = 0;
            this.O = -1;
        }
        int i10 = this.f24309f;
        int i11 = this.L;
        RadialProgress2 radialProgress2 = this.P;
        if (i10 == 0) {
            if (z12) {
                DownloadController.getInstance(i11).removeLoadingFileObserver(this);
                boolean zIsPlayingMessage = MediaController.getInstance().isPlayingMessage(this.J);
                if (!zIsPlayingMessage || (zIsPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.N = 0;
                } else {
                    this.N = 1;
                }
                radialProgress2.o(1.0f, z11);
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
                invalidate();
                return;
            }
            DownloadController.getInstance(i11).addLoadingFileObserver(fileName, this.J, this);
            if (FileLoader.getInstance(i11).isLoadingFile(fileName)) {
                this.N = 4;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress != null) {
                    radialProgress2.o(fileProgress.floatValue(), z11);
                } else {
                    radialProgress2.o(0.0f, z11);
                }
            } else {
                this.N = 2;
                radialProgress2.o(0.0f, z11);
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
            return;
        }
        radialProgress2.f26467e.setColor(org.telegram.ui.ActionBar.g6.v0(this.J.isOutOwner() ? org.telegram.ui.ActionBar.g6.Nb : org.telegram.ui.ActionBar.g6.f23152ie, this.V));
        boolean zIsPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.J);
        if (!zIsPlayingMessage2 || (zIsPlayingMessage2 && MediaController.getInstance().isMessagePaused())) {
            this.N = 0;
        } else {
            this.N = 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
        if (this.f24309f == 1) {
            DownloadController.getInstance(i11).removeLoadingFileObserver(this);
            this.O = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        DownloadController.getInstance(i11).addLoadingFileObserver(fileName, this.J, this);
        if (!FileLoader.getInstance(i11).isLoadingFile(fileName)) {
            this.O = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        this.O = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
        Float fileProgress2 = ImageLoader.getInstance().getFileProgress(fileName);
        if (fileProgress2 != null) {
            radialProgress2.o(fileProgress2.floatValue(), z11);
        } else {
            radialProgress2.o(0.0f, z11);
        }
    }

    public MessageObject getMessage() {
        return this.J;
    }

    @Override
    public int getObserverTag() {
        return this.M;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P.e();
        g(false, false);
        int i10 = this.L;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        this.f24316x = org.telegram.ui.Components.t5.update(0, this, this.f24316x, this.f24314s);
        this.A = org.telegram.ui.Components.t5.update(0, this, this.A, this.D);
        this.F = org.telegram.ui.Components.t5.update(0, this, this.F, this.I);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.L;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.P.f();
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        org.telegram.ui.Components.t5.release(this, this.f24316x);
        org.telegram.ui.Components.t5.release(this, this.A);
        org.telegram.ui.Components.t5.release(this, this.F);
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
        if (this.J.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.J.getMusicAuthor(), this.J.getMusicTitle()));
        } else if (this.f24314s != null && this.D != null) {
            accessibilityNodeInfo.setText(((Object) this.f24314s.getText()) + ", " + ((Object) this.D.getText()));
        }
        if (this.f24302b.f27188a.f26309q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState == 1) {
            string = LocaleController.getString("AccActionPause", R.string.AccActionPause);
        } else if (iconForCurrentState != 2) {
            string = iconForCurrentState != 3 ? LocaleController.getString("AccActionPlay", R.string.AccActionPlay) : LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload);
        } else {
            string = LocaleController.getString("AccActionDownload", R.string.AccActionDownload);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        float f10;
        CharSequence charSequenceD;
        String str;
        int iDp2;
        int iDp3;
        float lineLeft;
        float lineWidth;
        CharSequence charSequenceReplace;
        CharSequence charSequenceHighlightText;
        CharSequence charSequenceReplaceEmoji;
        CharSequence charSequenceHighlightText2;
        StaticLayout staticLayout;
        float lineLeft2;
        float lineWidth2;
        this.D = null;
        this.f24314s = null;
        this.I = null;
        int size = (View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(28.0f);
        TextPaint textPaint = this.T;
        int i12 = this.Q;
        if (i12 == 1) {
            String strStringForMessageListDate = LocaleController.stringForMessageListDate(this.J.messageOwner.date);
            int iCeil = (int) Math.ceil(textPaint.measureText(strStringForMessageListDate));
            this.R = s1.t2(strStringForMessageListDate, textPaint, iCeil, iCeil, 0, 1);
            this.S = AndroidUtilities.dp(20.0f) + ((size - iCeil) - AndroidUtilities.dp(8.0f));
            iDp = AndroidUtilities.dp(12.0f) + iCeil;
        } else {
            iDp = 0;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.V;
        if (i12 == 1) {
            try {
                if (this.J.isVoice() || this.J.isRoundVideo()) {
                    charSequenceD = i10.d(this.J, true, 1, null);
                } else {
                    charSequenceD = this.J.getMusicTitle().replace('\n', ' ');
                }
            } catch (Exception e9) {
                e = e9;
                f10 = 4.0f;
                FileLog.e(e);
                str = "";
                if (this.J.hasHighlightedWords()) {
                    if (TextUtils.isEmpty(this.J.messageOwner.message)) {
                        charSequenceReplaceEmoji = "";
                    } else {
                        charSequenceReplaceEmoji = Emoji.replaceEmoji(this.J.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.g6.f23247o2.getFontMetricsInt(), false);
                    }
                    charSequenceHighlightText2 = AndroidUtilities.highlightText(charSequenceReplaceEmoji, this.J.highlightedWords, c6Var);
                    if (charSequenceHighlightText2 != null) {
                        String str2 = this.J.highlightedWords.get(0);
                        TextPaint textPaint2 = this.U;
                        staticLayout = new StaticLayout(TextUtils.ellipsize(AndroidUtilities.ellipsizeCenterEnd(charSequenceHighlightText2, str2, size, textPaint2, 130), textPaint2, size, TextUtils.TruncateAt.END), textPaint2, AndroidUtilities.dp(f10) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.I = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            lineLeft2 = this.I.getLineLeft(0);
                        } else {
                            lineLeft2 = 0.0f;
                        }
                        this.G = lineLeft2;
                        if (this.I.getLineCount() > 0) {
                            lineWidth2 = this.I.getLineWidth(0);
                        } else {
                            lineWidth2 = 0.0f;
                        }
                        this.H = lineWidth2;
                    }
                    this.F = org.telegram.ui.Components.t5.update(0, this, this.F, this.I);
                }
                if (i12 == 1) {
                    try {
                        if (this.J.isVoice()) {
                        }
                        String duration = AndroidUtilities.formatDuration((int) this.J.getDuration(), false);
                        if (i12 == 1) {
                            textPaint = org.telegram.ui.ActionBar.g6.f23105g3;
                        }
                        this.D = new StaticLayout(TextUtils.ellipsize(duration, textPaint, size, TextUtils.TruncateAt.END), textPaint, size + AndroidUtilities.dp(f10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        if (this.D.getLineCount() > 0) {
                            lineLeft = this.D.getLineLeft(0);
                        } else {
                            lineLeft = 0.0f;
                        }
                        this.B = lineLeft;
                        if (this.D.getLineCount() > 0) {
                            lineWidth = this.D.getLineWidth(0);
                        } else {
                            lineWidth = 0.0f;
                        }
                        this.C = lineWidth;
                        this.A = org.telegram.ui.Components.t5.update(0, this, this.A, this.D);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } else {
                    charSequenceReplace = this.J.getMusicAuthor().replace('\n', ' ');
                    charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceReplace, this.J.highlightedWords, c6Var);
                    if (charSequenceHighlightText != null) {
                        charSequenceReplace = charSequenceHighlightText;
                    }
                    if (i12 == 1) {
                        charSequenceReplace = new SpannableStringBuilder(charSequenceReplace).append(' ').append((CharSequence) this.f24300a).append(' ').append(i10.d(this.J, true, 1, null));
                    }
                    if (i12 != 1) {
                        textPaint = org.telegram.ui.ActionBar.g6.f23105g3;
                    }
                    if (this.J.getDuration() > 0.0d) {
                        str = " • " + LocaleController.formatShortDuration((int) Math.ceil(this.J.getDuration()));
                    }
                    this.D = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(charSequenceReplace, textPaint, size - textPaint.measureText(str), TextUtils.TruncateAt.END)).append((CharSequence) str), textPaint, size + AndroidUtilities.dp(f10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    if (this.D.getLineCount() > 0) {
                        lineLeft = this.D.getLineLeft(0);
                    } else {
                        lineLeft = 0.0f;
                    }
                    this.B = lineLeft;
                    if (this.D.getLineCount() > 0) {
                        lineWidth = this.D.getLineWidth(0);
                    } else {
                        lineWidth = 0.0f;
                    }
                    this.C = lineWidth;
                    this.A = org.telegram.ui.Components.t5.update(0, this, this.A, this.D);
                }
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f) + (this.I != null ? AndroidUtilities.dp(18.0f) : 0) + (this.f24304c ? 1 : 0));
                iDp2 = AndroidUtilities.dp(52.0f);
                if (LocaleController.isRTL) {
                    iDp3 = org.telegram.messenger.y1.B(8.0f, View.MeasureSpec.getSize(i10), iDp2);
                } else {
                    iDp3 = AndroidUtilities.dp(8.0f);
                }
                int iDp4 = AndroidUtilities.dp(f10) + iDp3;
                this.h = iDp4;
                int iDp5 = AndroidUtilities.dp(6.0f);
                this.f24312n = iDp5;
                this.P.q(iDp4, iDp5, AndroidUtilities.dp(48.0f) + iDp3, AndroidUtilities.dp(50.0f));
                measureChildWithMargins(this.f24302b, i10, 0, i11, 0);
                if (this.I != null) {
                    this.f24317y = AndroidUtilities.dp(29.0f);
                } else {
                    this.E = AndroidUtilities.dp(29.0f);
                    this.f24317y = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(29.0f);
                }
            }
        } else {
            charSequenceD = this.J.getMusicTitle().replace('\n', ' ');
        }
        f10 = 4.0f;
        try {
            CharSequence charSequenceHighlightText3 = AndroidUtilities.highlightText(charSequenceD, this.J.highlightedWords, c6Var);
            if (charSequenceHighlightText3 != null) {
                charSequenceD = charSequenceHighlightText3;
            }
            TextPaint textPaint3 = this.f24306d0;
            if (textPaint3 == null) {
                textPaint3 = org.telegram.ui.ActionBar.g6.f23087f3;
            }
            StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(charSequenceD, textPaint3, size - iDp, TextUtils.TruncateAt.END), textPaint3, (AndroidUtilities.dp(4.0f) + size) - iDp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f24314s = staticLayout2;
            this.v = staticLayout2.getLineCount() > 0 ? this.f24314s.getLineLeft(0) : 0.0f;
            this.f24315w = this.f24314s.getLineCount() > 0 ? this.f24314s.getLineWidth(0) : 0.0f;
            this.f24316x = org.telegram.ui.Components.t5.update(0, this, this.f24316x, this.f24314s);
        } catch (Exception e11) {
            e = e11;
            FileLog.e(e);
        }
        str = "";
        if (this.J.hasHighlightedWords()) {
            if (TextUtils.isEmpty(this.J.messageOwner.message)) {
                charSequenceReplaceEmoji = "";
            } else {
                charSequenceReplaceEmoji = Emoji.replaceEmoji(this.J.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.g6.f23247o2.getFontMetricsInt(), false);
            }
            charSequenceHighlightText2 = AndroidUtilities.highlightText(charSequenceReplaceEmoji, this.J.highlightedWords, c6Var);
            if (charSequenceHighlightText2 != null) {
                String str3 = this.J.highlightedWords.get(0);
                TextPaint textPaint4 = this.U;
                staticLayout = new StaticLayout(TextUtils.ellipsize(AndroidUtilities.ellipsizeCenterEnd(charSequenceHighlightText2, str3, size, textPaint4, 130), textPaint4, size, TextUtils.TruncateAt.END), textPaint4, AndroidUtilities.dp(f10) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.I = staticLayout;
                if (staticLayout.getLineCount() > 0) {
                    lineLeft2 = this.I.getLineLeft(0);
                } else {
                    lineLeft2 = 0.0f;
                }
                this.G = lineLeft2;
                if (this.I.getLineCount() > 0) {
                    lineWidth2 = this.I.getLineWidth(0);
                } else {
                    lineWidth2 = 0.0f;
                }
                this.H = lineWidth2;
            }
            this.F = org.telegram.ui.Components.t5.update(0, this, this.F, this.I);
        }
        if (i12 == 1) {
            if (!this.J.isVoice() || this.J.isRoundVideo()) {
                String duration2 = AndroidUtilities.formatDuration((int) this.J.getDuration(), false);
                if (i12 == 1) {
                    textPaint = org.telegram.ui.ActionBar.g6.f23105g3;
                }
                this.D = new StaticLayout(TextUtils.ellipsize(duration2, textPaint, size, TextUtils.TruncateAt.END), textPaint, size + AndroidUtilities.dp(f10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                charSequenceReplace = this.J.getMusicAuthor().replace('\n', ' ');
                charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceReplace, this.J.highlightedWords, c6Var);
                if (charSequenceHighlightText != null) {
                    charSequenceReplace = charSequenceHighlightText;
                }
                if (i12 == 1) {
                    charSequenceReplace = new SpannableStringBuilder(charSequenceReplace).append(' ').append((CharSequence) this.f24300a).append(' ').append(i10.d(this.J, true, 1, null));
                }
                if (i12 != 1) {
                    textPaint = org.telegram.ui.ActionBar.g6.f23105g3;
                }
                if (this.J.getDuration() > 0.0d) {
                    str = " • " + LocaleController.formatShortDuration((int) Math.ceil(this.J.getDuration()));
                }
                this.D = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(charSequenceReplace, textPaint, size - textPaint.measureText(str), TextUtils.TruncateAt.END)).append((CharSequence) str), textPaint, size + AndroidUtilities.dp(f10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            if (this.D.getLineCount() > 0) {
                lineLeft = this.D.getLineLeft(0);
            } else {
                lineLeft = 0.0f;
            }
            this.B = lineLeft;
            if (this.D.getLineCount() > 0) {
                lineWidth = this.D.getLineWidth(0);
            } else {
                lineWidth = 0.0f;
            }
            this.C = lineWidth;
            this.A = org.telegram.ui.Components.t5.update(0, this, this.A, this.D);
        } else {
            charSequenceReplace = this.J.getMusicAuthor().replace('\n', ' ');
            charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceReplace, this.J.highlightedWords, c6Var);
            if (charSequenceHighlightText != null) {
                charSequenceReplace = charSequenceHighlightText;
            }
            if (i12 == 1) {
                charSequenceReplace = new SpannableStringBuilder(charSequenceReplace).append(' ').append((CharSequence) this.f24300a).append(' ').append(i10.d(this.J, true, 1, null));
            }
            if (i12 != 1) {
                textPaint = org.telegram.ui.ActionBar.g6.f23105g3;
            }
            if (this.J.getDuration() > 0.0d) {
                str = " • " + LocaleController.formatShortDuration((int) Math.ceil(this.J.getDuration()));
            }
            this.D = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(charSequenceReplace, textPaint, size - textPaint.measureText(str), TextUtils.TruncateAt.END)).append((CharSequence) str), textPaint, size + AndroidUtilities.dp(f10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (this.D.getLineCount() > 0) {
                lineLeft = this.D.getLineLeft(0);
            } else {
                lineLeft = 0.0f;
            }
            this.B = lineLeft;
            if (this.D.getLineCount() > 0) {
                lineWidth = this.D.getLineWidth(0);
            } else {
                lineWidth = 0.0f;
            }
            this.C = lineWidth;
            this.A = org.telegram.ui.Components.t5.update(0, this, this.A, this.D);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(56.0f) + (this.I != null ? AndroidUtilities.dp(18.0f) : 0) + (this.f24304c ? 1 : 0));
        iDp2 = AndroidUtilities.dp(52.0f);
        if (LocaleController.isRTL) {
            iDp3 = org.telegram.messenger.y1.B(8.0f, View.MeasureSpec.getSize(i10), iDp2);
        } else {
            iDp3 = AndroidUtilities.dp(8.0f);
        }
        int iDp6 = AndroidUtilities.dp(f10) + iDp3;
        this.h = iDp6;
        int iDp7 = AndroidUtilities.dp(6.0f);
        this.f24312n = iDp7;
        this.P.q(iDp6, iDp7, AndroidUtilities.dp(48.0f) + iDp3, AndroidUtilities.dp(50.0f));
        measureChildWithMargins(this.f24302b, i10, 0, i11, 0);
        if (this.I != null) {
            this.f24317y = AndroidUtilities.dp(29.0f);
        } else {
            this.E = AndroidUtilities.dp(29.0f);
            this.f24317y = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(29.0f);
        }
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.P.o(Math.min(1.0f, j10 / j11), true);
        if (this.f24309f != 0) {
            if (this.O != 1) {
                g(false, true);
            }
        } else if (this.N != 4) {
            g(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.P.o(1.0f, true);
        g(false, true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int iDp;
        int iDp2;
        int i10;
        if (this.J == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x8 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int iDp3 = AndroidUtilities.dp(36.0f);
        boolean z12 = this.O >= 0 && x8 >= (iDp2 = this.h + (iDp = AndroidUtilities.dp(27.0f))) && x8 <= iDp2 + iDp3 && y10 >= (i10 = this.f24312n + iDp) && y10 <= i10 + iDp3;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.P;
        if (action == 0) {
            if (!z12) {
                if (this.K && radialProgress2.f26464a.contains(x8, y10)) {
                    requestDisallowInterceptTouchEvent(true);
                    this.d = true;
                    radialProgress2.n(true, false);
                    invalidate();
                }
                radialProgress2.n(this.f24307e, true);
                if (!z10 || this.d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (motionEvent.getAction() != 3) {
                    return z11;
                }
                this.f24307e = false;
                this.d = false;
                radialProgress2.n(false, false);
                radialProgress2.n(this.f24307e, true);
                return false;
            }
            this.f24307e = true;
            radialProgress2.n(true, true);
            invalidate();
            z10 = true;
            radialProgress2.n(this.f24307e, true);
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (motionEvent.getAction() != 3) {
                return z11;
            }
            this.f24307e = false;
            this.d = false;
            radialProgress2.n(false, false);
            radialProgress2.n(this.f24307e, true);
            return false;
        }
        if (motionEvent.getAction() == 1) {
            if (this.f24307e) {
                this.f24307e = false;
                playSoundEffect(0);
                int i11 = this.O;
                int i12 = this.L;
                if (i11 == 0) {
                    this.O = 1;
                    radialProgress2.o(0.0f, false);
                    FileLoader.getInstance(i12).loadFile(this.J.getDocument(), this.J, 1, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i11 == 1) {
                    if (MediaController.getInstance().isPlayingMessage(this.J)) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                    }
                    this.O = 0;
                    FileLoader.getInstance(i12).cancelLoadFile(this.J.getDocument());
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            } else if (this.d) {
                this.d = false;
                playSoundEffect(0);
                a();
                invalidate();
            }
            requestDisallowInterceptTouchEvent(false);
        } else if (motionEvent.getAction() == 3) {
            requestDisallowInterceptTouchEvent(false);
            this.f24307e = false;
            this.d = false;
            invalidate();
        } else if (motionEvent.getAction() == 2 && !z12 && this.f24307e) {
            this.f24307e = false;
            invalidate();
        }
        z10 = false;
        radialProgress2.n(this.f24307e, true);
        if (z10) {
            z11 = true;
        } else {
            z11 = true;
        }
        if (motionEvent.getAction() != 3) {
            return z11;
        }
        this.f24307e = false;
        this.d = false;
        radialProgress2.n(false, false);
        radialProgress2.n(this.f24307e, true);
        return false;
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.performAccessibilityAction(i10, bundle);
        }
        a();
        return true;
    }

    public void setCheckForButtonPress(boolean z10) {
        this.K = z10;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.f24310f0 != f10) {
            this.f24310f0 = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(h00 h00Var) {
        this.f24311g0 = h00Var;
    }

    public void setNeedPlayMessageListener(Utilities.CallbackReturn<MessageObject, Boolean> callbackReturn) {
        this.f24308e0 = callbackReturn;
    }

    public e7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24313r = AndroidUtilities.dp(9.0f);
        this.f24317y = AndroidUtilities.dp(29.0f);
        this.E = AndroidUtilities.dp(29.0f);
        int i11 = UserConfig.selectedAccount;
        this.L = i11;
        this.f24303b0 = true;
        this.f24305c0 = 0.0f;
        this.f24310f0 = 1.0f;
        this.V = c6Var;
        this.Q = i10;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, c6Var);
        this.P = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.g6.f23152ie, org.telegram.ui.ActionBar.g6.f23170je, org.telegram.ui.ActionBar.g6.f23363uc, org.telegram.ui.ActionBar.g6.f23379vc);
        this.M = DownloadController.getInstance(i11).generateObserverTag();
        setWillNotDraw(false);
        bp bpVar = new bp(context, 22, c6Var);
        this.f24302b = bpVar;
        bpVar.setVisibility(4);
        bpVar.b(-1, org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(3);
        boolean z10 = LocaleController.isRTL;
        addView(bpVar, h7.z5.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.T = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.f24300a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new ps(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.U = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        if (c6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f24306d0 = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint3.setColor(c6Var.N0(org.telegram.ui.ActionBar.g6.G6));
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
