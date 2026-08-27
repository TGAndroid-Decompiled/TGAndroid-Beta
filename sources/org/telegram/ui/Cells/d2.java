package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.y70;
import org.telegram.ui.PhotoViewer;

public final class d2 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public final int A;
    public StaticLayout B;
    public final int C;
    public StaticLayout D;
    public TLRPC.BotInlineResult E;
    public TLRPC.User F;
    public TLRPC.Document G;
    public int H;
    public TLRPC.Photo I;
    public TLRPC.PhotoSize J;
    public int K;
    public boolean L;
    public MessageObject M;
    public AnimatorSet N;
    public final Paint O;
    public final int P;
    public int Q;
    public final RadialProgress2 R;
    public boolean S;
    public final bp T;
    public c2 U;
    public nc V;
    public boolean W;

    public final ImageReceiver f24180a;

    public String f24181a0;

    public boolean f24182b;

    public boolean f24183b0;

    public final y70 f24184c;

    public float f24185c0;
    public final int d;

    public final b2 f24186d0;

    public Object f24187e;

    public final org.telegram.ui.ActionBar.c6 f24188f;
    public boolean h;

    public boolean f24189n;

    public boolean f24190r;

    public boolean f24191s;
    public boolean v;

    public boolean f24192w;

    public int f24193x;

    public StaticLayout f24194y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public d2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i10 = this.K;
        RadialProgress2 radialProgress2 = this.R;
        if (i10 != 3 && i10 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.g6.f23205le, org.telegram.ui.ActionBar.g6.f23223me, org.telegram.ui.ActionBar.g6.f23241ne, org.telegram.ui.ActionBar.g6.f23258oe);
            return this.Q == 1 ? 10 : 4;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.g6.f23152ie, org.telegram.ui.ActionBar.g6.f23170je, org.telegram.ui.ActionBar.g6.f23363uc, org.telegram.ui.ActionBar.g6.f23379vc);
        int i11 = this.Q;
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        return i11 == 4 ? 3 : 0;
    }

    public final void a() {
        int i10 = this.K;
        if (i10 == 3 || i10 == 5) {
            int i11 = this.Q;
            RadialProgress2 radialProgress2 = this.R;
            if (i11 == 0) {
                if (MediaController.getInstance().playMessage(this.M)) {
                    this.Q = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            if (i11 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.M)) {
                    this.Q = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                    return;
                }
                return;
            }
            int i12 = this.d;
            if (i11 == 2) {
                radialProgress2.o(0.0f, false);
                if (this.G != null) {
                    FileLoader.getInstance(i12).loadFile(this.G, this.E, 1, 0);
                } else if (this.E.content instanceof TLRPC.TL_webDocument) {
                    FileLoader.getInstance(i12).loadFile(WebFile.createWithWebDocument(this.E.content), 3, 1);
                }
                this.Q = 4;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            if (i11 == 4) {
                if (this.G != null) {
                    FileLoader.getInstance(i12).cancelLoadFile(this.G);
                } else if (this.E.content instanceof TLRPC.TL_webDocument) {
                    FileLoader.getInstance(i12).cancelLoadFile(WebFile.createWithWebDocument(this.E.content));
                }
                this.Q = 2;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        }
    }

    public final void b() {
        this.M = null;
        this.K = 0;
        TLRPC.Document document = this.G;
        if (document == null) {
            TLRPC.BotInlineResult botInlineResult = this.E;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.K = 7;
                } else if (botInlineResult.type.equals("audio")) {
                    this.K = 5;
                } else if (this.E.type.equals("voice")) {
                    this.K = 3;
                }
            }
        } else if (MessageObject.isGifDocument(document)) {
            this.K = 2;
        } else if (MessageObject.isStickerDocument(this.G) || MessageObject.isAnimatedStickerDocument(this.G, true)) {
            this.K = 6;
        } else if (MessageObject.isMusicDocument(this.G)) {
            this.K = 5;
        } else if (MessageObject.isVoiceDocument(this.G)) {
            this.K = 3;
        }
        int i10 = this.K;
        if (i10 == 3 || i10 == 5) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f22401id = -Utilities.random.nextInt();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i11 = this.d;
            long clientUserId = UserConfig.getInstance(i11).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            TLRPC.MessageMedia messageMedia = tL_message.media;
            messageMedia.document.file_reference = new byte[0];
            tL_message.flags |= 768;
            TLRPC.Document document2 = this.G;
            if (document2 != null) {
                messageMedia.document = document2;
                tL_message.attachPath = "";
            } else {
                String httpUrlExtension = ImageLoader.getHttpUrlExtension(this.E.content.url, this.K == 5 ? "mp3" : "ogg");
                TLRPC.Document document3 = tL_message.media.document;
                document3.f22386id = 0L;
                document3.access_hash = 0L;
                document3.date = tL_message.date;
                document3.mime_type = s3.c.e("audio/", httpUrlExtension);
                TLRPC.Document document4 = tL_message.media.document;
                document4.size = 0L;
                document4.dc_id = 0;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(this.E);
                TLRPC.BotInlineResult botInlineResult2 = this.E;
                String str = botInlineResult2.title;
                if (str == null) {
                    str = "";
                }
                tL_documentAttributeAudio.title = str;
                String str2 = botInlineResult2.description;
                tL_documentAttributeAudio.performer = str2 != null ? str2 : "";
                tL_documentAttributeAudio.flags |= 3;
                if (this.K == 3) {
                    tL_documentAttributeAudio.voice = true;
                }
                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Utilities.MD5(this.E.content.url));
                sb2.append(".");
                sb2.append(ImageLoader.getHttpUrlExtension(this.E.content.url, this.K == 5 ? "mp3" : "ogg"));
                tL_documentAttributeFilename.file_name = sb2.toString();
                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                File directory = FileLoader.getDirectory(4);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Utilities.MD5(this.E.content.url));
                sb3.append(".");
                sb3.append(ImageLoader.getHttpUrlExtension(this.E.content.url, this.K == 5 ? "mp3" : "ogg"));
                tL_message.attachPath = new File(directory, sb3.toString()).getAbsolutePath();
            }
            this.M = new MessageObject(i11, tL_message, false, true);
        }
    }

    public final void c(boolean z10, boolean z11) {
        bp bpVar = this.T;
        if (bpVar == null) {
            return;
        }
        if (bpVar.getVisibility() != 0) {
            bpVar.setVisibility(0);
        }
        bpVar.a(z10, z11);
        AnimatorSet animatorSet = this.N;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N = null;
        }
        if (!z11) {
            this.f24185c0 = z10 ? 0.85f : 1.0f;
            invalidate();
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.N = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f24186d0, z10 ? 0.81f : 1.0f));
        this.N.setDuration(200L);
        this.N.addListener(new ag.x(23, this, z10));
        this.N.start();
    }

    public final void d(int i10, TLRPC.Document document, Object obj) {
        this.h = false;
        this.f24190r = false;
        this.H = i10;
        this.E = null;
        this.f24187e = obj;
        this.G = document;
        this.I = null;
        this.L = true;
        this.f24192w = true;
        b();
        this.K = 2;
        requestLayout();
        this.f24181a0 = null;
        this.f24183b0 = false;
        this.W = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.h = z11;
        this.f24190r = z12;
        this.F = user;
        this.E = botInlineResult;
        this.f24187e = botInlineResult;
        if (botInlineResult != null) {
            this.G = botInlineResult.document;
            this.I = botInlineResult.photo;
        } else {
            this.G = null;
            this.I = null;
        }
        this.L = z10;
        this.f24192w = z13;
        b();
        if (z13) {
            this.K = 2;
        }
        requestLayout();
        this.f24181a0 = null;
        this.f24183b0 = false;
        this.W = false;
        f(false, false);
    }

    public final void f(boolean z10, boolean z11) {
        String str = this.f24181a0;
        if (str == null && !this.W) {
            this.W = true;
            Utilities.searchQueue.postRunnable(new a2(this, z10));
            this.R.setIcon(4, z10, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.Q = -1;
            this.R.setIcon(4, z10, false);
            return;
        }
        boolean zIsLoadingFile = this.G != null ? FileLoader.getInstance(this.d).isLoadingFile(this.f24181a0) : ImageLoader.getInstance().isLoadingHttpFile(this.f24181a0);
        if (zIsLoadingFile || !this.f24183b0) {
            DownloadController.getInstance(this.d).addLoadingFileObserver(this.f24181a0, this);
            int i10 = this.K;
            if (i10 != 5 && i10 != 3) {
                this.Q = 1;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(this.f24181a0);
                this.R.o(fileProgress != null ? fileProgress.floatValue() : 0.0f, false);
            } else if (zIsLoadingFile) {
                this.Q = 4;
                Float fileProgress2 = ImageLoader.getInstance().getFileProgress(this.f24181a0);
                if (fileProgress2 != null) {
                    this.R.o(fileProgress2.floatValue(), z11);
                } else {
                    this.R.o(0.0f, z11);
                }
            } else {
                this.Q = 2;
            }
        } else {
            DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
            int i11 = this.K;
            if (i11 == 5 || i11 == 3) {
                boolean zIsPlayingMessage = MediaController.getInstance().isPlayingMessage(this.M);
                if (!zIsPlayingMessage || (zIsPlayingMessage && MediaController.getInstance().isMessagePaused())) {
                    this.Q = 0;
                } else {
                    this.Q = 1;
                }
                this.R.o(1.0f, z11);
            } else {
                this.Q = -1;
            }
        }
        this.R.setIcon(getIconForCurrentState(), z10, z11);
        invalidate();
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.E;
    }

    public int getDate() {
        return this.H;
    }

    public TLRPC.Document getDocument() {
        return this.G;
    }

    public TLRPC.User getInlineBot() {
        return this.F;
    }

    public MessageObject getMessageObject() {
        return this.M;
    }

    @Override
    public int getObserverTag() {
        return this.P;
    }

    public Object getParentObject() {
        return this.f24187e;
    }

    public ImageReceiver getPhotoImage() {
        return this.f24180a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24180a.onAttachedToWindow()) {
            f(false, false);
        }
        this.R.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24180a.onDetachedFromWindow();
        this.R.f();
        DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        ImageReceiver imageReceiver = this.f24180a;
        bp bpVar = this.T;
        if (bpVar != null && (bpVar.f27188a.f26309q || !imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f || PhotoViewer.M1((MessageObject) this.f24187e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.O);
        }
        if (this.B != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.A);
            this.B.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.D;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24188f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.g6.f23105g3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6Var));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.C);
            this.D.draw(canvas);
            canvas.restore();
        }
        if (this.f24194y != null) {
            org.telegram.ui.ActionBar.g6.f23105g3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J6, c6Var));
            canvas.save();
            canvas.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.f24193x);
            this.f24194y.draw(canvas);
            canvas.restore();
        }
        boolean z10 = this.L;
        RadialProgress2 radialProgress2 = this.R;
        if (z10) {
            TLRPC.BotInlineResult botInlineResult = this.E;
            if (botInlineResult != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.g6.f23249o4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.g6.f23249o4.getIntrinsicHeight();
                    int iA = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int iA2 = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageHeight(), intrinsicHeight, 2.0f, imageReceiver.getImageY());
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + imageReceiver.getImageWidth(), imageReceiver.getImageY() + imageReceiver.getImageHeight(), y70.f34833j);
                    org.telegram.ui.ActionBar.g6.f23249o4.setBounds(iA, iA2, intrinsicWidth + iA, intrinsicHeight + iA2);
                    org.telegram.ui.ActionBar.g6.f23249o4.draw(canvas);
                }
            }
        } else {
            boolean z11 = this.f24182b;
            y70 y70Var = this.f24184c;
            if (!z11 || PhotoViewer.N1(this.E)) {
                y70Var.setAlpha(255);
            } else {
                y70Var.setAlpha((int) ((1.0f - imageReceiver.getCurrentAlpha()) * 255.0f));
            }
            int i11 = this.K;
            if (i11 == 3 || i11 == 5) {
                radialProgress2.d = org.telegram.ui.ActionBar.g6.v0(this.f24189n ? org.telegram.ui.ActionBar.g6.f23169jd : org.telegram.ui.ActionBar.g6.f23151id, c6Var);
                radialProgress2.draw(canvas);
            } else {
                TLRPC.BotInlineResult botInlineResult2 = this.E;
                if (botInlineResult2 == null || !botInlineResult2.type.equals("file")) {
                    TLRPC.BotInlineResult botInlineResult3 = this.E;
                    if (botInlineResult3 == null || !(botInlineResult3.type.equals("audio") || this.E.type.equals("voice"))) {
                        TLRPC.BotInlineResult botInlineResult4 = this.E;
                        if (botInlineResult4 == null || !(botInlineResult4.type.equals("venue") || this.E.type.equals("geo"))) {
                            y70Var.draw(canvas);
                        } else {
                            int intrinsicWidth2 = org.telegram.ui.ActionBar.g6.f23249o4.getIntrinsicWidth();
                            int intrinsicHeight2 = org.telegram.ui.ActionBar.g6.f23249o4.getIntrinsicHeight();
                            int imageX = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth2) / 2));
                            int imageY = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight2) / 2));
                            canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), y70.f34833j);
                            org.telegram.ui.ActionBar.g6.f23249o4.setBounds(imageX, imageY, intrinsicWidth2 + imageX, intrinsicHeight2 + imageY);
                            org.telegram.ui.ActionBar.g6.f23249o4.draw(canvas);
                        }
                    } else {
                        int intrinsicWidth3 = org.telegram.ui.ActionBar.g6.f23232n4.getIntrinsicWidth();
                        int intrinsicHeight3 = org.telegram.ui.ActionBar.g6.f23232n4.getIntrinsicHeight();
                        int imageX2 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth3) / 2));
                        int imageY2 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight3) / 2));
                        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), y70.f34833j);
                        org.telegram.ui.ActionBar.g6.f23232n4.setBounds(imageX2, imageY2, intrinsicWidth3 + imageX2, intrinsicHeight3 + imageY2);
                        org.telegram.ui.ActionBar.g6.f23232n4.draw(canvas);
                    }
                } else {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.g6.f23213m4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.g6.f23213m4.getIntrinsicHeight();
                    int imageX3 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth4) / 2));
                    int imageY3 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight4) / 2));
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), y70.f34833j);
                    org.telegram.ui.ActionBar.g6.f23213m4.setBounds(imageX3, imageY3, intrinsicWidth4 + imageX3, intrinsicHeight4 + imageY3);
                    org.telegram.ui.ActionBar.g6.f23213m4.draw(canvas);
                }
            }
        }
        if (this.f24182b) {
            TLRPC.BotInlineResult botInlineResult5 = this.E;
            if (botInlineResult5 != null) {
                imageReceiver.setVisible(!PhotoViewer.N1(botInlineResult5), false);
            }
            canvas.save();
            float fA = this.f24185c0;
            nc ncVar = this.V;
            if (ncVar != null) {
                fA *= ncVar.a(0.1f);
            }
            canvas.scale(fA, fA, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (this.L && ((i10 = this.K) == 7 || i10 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.h && !this.L) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
            }
        }
        if (this.f24190r) {
            org.telegram.ui.ActionBar.g6.f23267p4.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.g6.f23267p4.draw(canvas);
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        f(true, z10);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String string;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        switch (this.K) {
            case 1:
                sb2.append(LocaleController.getString(R.string.AttachDocument));
                break;
            case 2:
                sb2.append(LocaleController.getString(R.string.AttachGif));
                break;
            case 3:
                sb2.append(LocaleController.getString(R.string.AttachAudio));
                break;
            case 4:
                sb2.append(LocaleController.getString(R.string.AttachVideo));
                break;
            case 5:
                sb2.append(LocaleController.getString(R.string.AttachMusic));
                break;
            case 6:
                sb2.append(LocaleController.getString(R.string.AttachSticker));
                break;
            case 7:
                sb2.append(LocaleController.getString(R.string.AttachPhoto));
                break;
        }
        StaticLayout staticLayout = this.B;
        boolean z10 = (staticLayout == null || TextUtils.isEmpty(staticLayout.getText())) ? false : true;
        StaticLayout staticLayout2 = this.D;
        boolean z11 = (staticLayout2 == null || TextUtils.isEmpty(staticLayout2.getText())) ? false : true;
        if (this.K == 5 && z10 && z11) {
            sb2.append(", ");
            sb2.append(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.D.getText(), this.B.getText()));
        } else {
            if (z10) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.B.getText());
            }
            if (z11) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.D.getText());
            }
        }
        accessibilityNodeInfo.setText(sb2);
        bp bpVar = this.T;
        if (bpVar != null && bpVar.f27188a.f26309q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i10 = this.K;
        if (i10 == 3 || i10 == 5) {
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
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        y70 y70Var;
        y70 y70Var2;
        ?? r10;
        float f10;
        float f11;
        TLRPC.Document document;
        TLRPC.BotInlineResult botInlineResult;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        String str;
        TLRPC.BotInlineResult botInlineResult2;
        WebFile webFileCreateWithWebDocument;
        String strFormapMapUrl;
        int iDp;
        int i12;
        TLRPC.PhotoSize photoSize;
        TLRPC.BotInlineResult botInlineResult3;
        TLRPC.Document document2;
        ImageReceiver imageReceiver;
        String str2;
        String str3;
        boolean z11;
        TLRPC.TL_photoStrippedSize strippedPhotoSize;
        ImageLocation imageLocation;
        ImageReceiver imageReceiver2;
        Drawable svgThumb;
        TLRPC.Document document3;
        ImageReceiver imageReceiver3;
        TLRPC.Document document4;
        TLRPC.VideoSize documentVideoThumb;
        ImageLocation forDocument;
        TLRPC.Document document5;
        TLRPC.Photo photo;
        ImageLocation forPhoto;
        int iMin;
        String strD;
        String strConcat;
        String strD2;
        ImageReceiver imageReceiver4;
        boolean z12;
        RadialProgress2 radialProgress2;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout staticLayout3;
        int iDp2;
        float f12;
        int iDp3;
        int i13;
        bp bpVar;
        int size;
        int i14;
        TLRPC.DocumentAttribute documentAttribute;
        TLRPC.TL_webDocument tL_webDocument;
        TLRPC.WebDocument webDocument;
        String str4;
        TLRPC.BotInlineResult botInlineResult4;
        boolean z13;
        char c10;
        char c11;
        boolean z14;
        int lineBottom = 0;
        this.f24182b = false;
        this.D = null;
        this.B = null;
        this.f24194y = null;
        this.J = null;
        this.f24193x = AndroidUtilities.dp(27.0f);
        if (this.E == null && this.G == null) {
            setMeasuredDimension(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
            return;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int iDp4 = (size2 - AndroidUtilities.dp(AndroidUtilities.leftBaseline)) - AndroidUtilities.dp(8.0f);
        if (this.G == null) {
            TLRPC.BotInlineResult botInlineResult5 = this.E;
            if (botInlineResult5 == null || botInlineResult5.photo == null) {
                arrayList = null;
            } else {
                arrayList2 = new ArrayList(this.E.photo.sizes);
            }
            z10 = this.L;
            y70Var = this.f24184c;
            if (!z10 || (botInlineResult4 = this.E) == null) {
                y70Var2 = y70Var;
                r10 = 1;
                f10 = 1.0f;
                f11 = 100.0f;
            } else {
                String str5 = botInlineResult4.title;
                if (str5 != null) {
                    try {
                        f11 = 100.0f;
                        try {
                            this.B = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(this.E.title.replace('\n', ' '), org.telegram.ui.ActionBar.g6.f23087f3.getFontMetricsInt(), false), org.telegram.ui.ActionBar.g6.f23087f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.g6.f23087f3.measureText(str5)), iDp4), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.g6.f23087f3, iDp4 + AndroidUtilities.dp(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } catch (Exception e9) {
                            e = e9;
                            FileLog.e(e);
                        }
                    } catch (Exception e10) {
                        e = e10;
                        f11 = 100.0f;
                    }
                    y70Var.a(this.E.title);
                } else {
                    f11 = 100.0f;
                }
                String str6 = this.E.description;
                if (str6 != null) {
                    try {
                        z13 = true;
                        z14 = true;
                        z14 = true;
                        c10 = '\n';
                        c11 = ' ';
                        try {
                            StaticLayout staticLayoutT2 = s1.t2(Emoji.replaceEmoji(str6, org.telegram.ui.ActionBar.g6.f23105g3.getFontMetricsInt(), false), org.telegram.ui.ActionBar.g6.f23105g3, iDp4, iDp4, 0, 3);
                            this.D = staticLayoutT2;
                            if (staticLayoutT2.getLineCount() > 0) {
                                int i15 = this.C;
                                StaticLayout staticLayout4 = this.D;
                                this.f24193x = i15 + staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(1.0f);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            FileLog.e(e);
                            z14 = z13;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        z13 = true;
                        c10 = '\n';
                        c11 = ' ';
                    }
                } else {
                    z14 = true;
                    c10 = '\n';
                    c11 = ' ';
                }
                String str7 = this.E.url;
                if (str7 != null) {
                    try {
                        CharSequence charSequenceEllipsize = TextUtils.ellipsize(this.E.url.replace(c10, c11), org.telegram.ui.ActionBar.g6.f23105g3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.g6.f23105g3.measureText(str7)), iDp4), TextUtils.TruncateAt.MIDDLE);
                        y70Var2 = y70Var;
                        f10 = 1.0f;
                        try {
                            this.f24194y = new StaticLayout(charSequenceEllipsize, org.telegram.ui.ActionBar.g6.f23105g3, iDp4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            r10 = z14;
                        } catch (Exception e13) {
                            e = e13;
                            FileLog.e(e);
                            r10 = z14;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        y70Var2 = y70Var;
                        f10 = 1.0f;
                    }
                } else {
                    y70Var2 = y70Var;
                    f10 = 1.0f;
                    r10 = z14;
                }
            }
            document = this.G;
            if (document == null) {
                if (!this.f24192w || MessageObject.isGifDocument(document)) {
                    this.J = FileLoader.getClosestPhotoSizeWithSize(this.G.thumbs, 90, false, null, r10);
                } else if (MessageObject.isStickerDocument(this.G) || MessageObject.isAnimatedStickerDocument(this.G, r10)) {
                    this.J = FileLoader.getClosestPhotoSizeWithSize(this.G.thumbs, 90, false, null, r10);
                    str = "webp";
                    closestPhotoSizeWithSize = null;
                } else {
                    int i16 = this.K;
                    if (i16 != 5 && i16 != 3) {
                        this.J = FileLoader.getClosestPhotoSizeWithSize(this.G.thumbs, 90, false, null, r10);
                    }
                }
                closestPhotoSizeWithSize = null;
                str = null;
            } else {
                botInlineResult = this.E;
                if (botInlineResult != null || botInlineResult.photo == null) {
                    closestPhotoSizeWithSize = null;
                    str = null;
                } else {
                    this.J = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), r10, null, r10);
                    closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 80, false, null, r10);
                    if (closestPhotoSizeWithSize == this.J) {
                        closestPhotoSizeWithSize = null;
                        str = null;
                    } else {
                        str = null;
                    }
                }
            }
            botInlineResult2 = this.E;
            if (botInlineResult2 != null) {
                if ((botInlineResult2.content instanceof TLRPC.TL_webDocument) || (str4 = botInlineResult2.type) == null) {
                    tL_webDocument = null;
                } else if (str4.startsWith("gif")) {
                    TLRPC.WebDocument webDocument2 = this.E.thumb;
                    tL_webDocument = ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) ? (TLRPC.TL_webDocument) this.E.thumb : (TLRPC.TL_webDocument) this.E.content;
                    this.K = 2;
                } else if (this.E.type.equals("photo")) {
                    TLRPC.BotInlineResult botInlineResult6 = this.E;
                    TLRPC.WebDocument webDocument3 = botInlineResult6.thumb;
                    tL_webDocument = webDocument3 instanceof TLRPC.TL_webDocument ? (TLRPC.TL_webDocument) webDocument3 : (TLRPC.TL_webDocument) botInlineResult6.content;
                } else {
                    tL_webDocument = null;
                }
                if (tL_webDocument == null) {
                    webDocument = this.E.thumb;
                    if (webDocument instanceof TLRPC.TL_webDocument) {
                        tL_webDocument = (TLRPC.TL_webDocument) webDocument;
                    }
                }
                if (tL_webDocument != null && this.J == null && closestPhotoSizeWithSize == null) {
                    TLRPC.BotInlineMessage botInlineMessage = this.E.send_message;
                    if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo)) {
                        TLRPC.GeoPoint geoPoint = botInlineMessage.geo;
                        double d = geoPoint.lat;
                        double d10 = geoPoint._long;
                        if (MessagesController.getInstance(this.d).mapProvider == 2) {
                            webFileCreateWithWebDocument = WebFile.createWithGeoPoint(this.E.send_message.geo, 72, 72, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)));
                            strFormapMapUrl = null;
                        } else {
                            strFormapMapUrl = AndroidUtilities.formapMapUrl(this.d, d, d10, 72, 72, true, 15, -1);
                            webFileCreateWithWebDocument = null;
                        }
                    } else {
                        webFileCreateWithWebDocument = null;
                        strFormapMapUrl = null;
                    }
                } else {
                    webFileCreateWithWebDocument = null;
                    strFormapMapUrl = null;
                }
                if (tL_webDocument != null) {
                    webFileCreateWithWebDocument = WebFile.createWithWebDocument(tL_webDocument);
                }
            } else {
                webFileCreateWithWebDocument = null;
                strFormapMapUrl = null;
            }
            if (this.G != null) {
                i14 = 0;
                while (true) {
                    if (i14 < this.G.attributes.size()) {
                        documentAttribute = this.G.attributes.get(i14);
                        if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                            iDp = documentAttribute.f22387w;
                            i12 = documentAttribute.h;
                        } else {
                            i14++;
                        }
                    } else {
                        iDp = 0;
                        i12 = 0;
                    }
                }
            } else {
                iDp = 0;
                i12 = 0;
            }
            if (iDp != 0 || i12 == 0) {
                photoSize = this.J;
                if (photoSize != null) {
                    if (closestPhotoSizeWithSize != null) {
                        closestPhotoSizeWithSize.size = -1;
                    }
                    iDp = photoSize.f22405w;
                    i12 = photoSize.h;
                } else {
                    botInlineResult3 = this.E;
                    if (botInlineResult3 != null) {
                        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult3);
                        int i17 = inlineResultWidthAndHeight[0];
                        i12 = inlineResultWidthAndHeight[r10];
                        iDp = i17;
                    }
                }
            }
            if (iDp != 0 || i12 == 0) {
                iDp = AndroidUtilities.dp(80.0f);
                i12 = iDp;
            }
            document2 = this.G;
            imageReceiver = this.f24180a;
            if (document2 != null && this.J == null && webFileCreateWithWebDocument == null && strFormapMapUrl == null) {
                imageReceiver4 = imageReceiver;
            } else {
                if (this.L) {
                    iMin = Math.min(iDp, i12) / 3;
                    if (this.K == 2) {
                        Locale locale = Locale.US;
                        strD2 = s3.c.d((int) (iMin / AndroidUtilities.density), "_80_b");
                        if (!SharedConfig.isAutoplayGifs() || this.v) {
                            str3 = strD2;
                            str2 = str3;
                        } else {
                            strConcat = strD2.concat("_firstframe");
                            strD = strD2.concat("_firstframe");
                        }
                    } else {
                        Locale locale2 = Locale.US;
                        strD = s3.c.d((int) (iMin / AndroidUtilities.density), "_80");
                        strConcat = strD.concat("_b");
                    }
                    str3 = strD;
                    str2 = strConcat;
                } else {
                    str2 = "52_52_b";
                    str3 = "52_52";
                }
                if (this.K == 6) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                imageReceiver.setAspectFit(z11);
                strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
                if (strippedPhotoSize == null) {
                    imageLocation = null;
                } else {
                    document5 = this.G;
                    if (document5 != null) {
                        forPhoto = ImageLocation.getForDocument(strippedPhotoSize, document5);
                    } else {
                        photo = this.I;
                        if (photo != null) {
                            forPhoto = ImageLocation.getForPhoto(strippedPhotoSize, photo);
                        } else {
                            imageLocation = null;
                        }
                    }
                    imageLocation = forPhoto;
                }
                if (this.K == 2) {
                    document4 = this.G;
                    if (document4 != null) {
                        documentVideoThumb = MessageObject.getDocumentVideoThumb(document4);
                        if (documentVideoThumb != null) {
                            ImageLocation forDocument2 = ImageLocation.getForDocument(documentVideoThumb, this.G);
                            StringBuilder sb2 = new StringBuilder("100_100");
                            sb2.append((!SharedConfig.isAutoplayGifs() || this.v) ? "" : "_firstframe");
                            imageReceiver2 = imageReceiver;
                            imageReceiver2.setImage(forDocument2, sb2.toString(), ImageLocation.getForDocument(this.J, this.G), str3, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                        } else {
                            imageReceiver2 = imageReceiver;
                            forDocument = ImageLocation.getForDocument(this.G);
                            if (this.f24192w) {
                                forDocument.imageType = 2;
                            }
                            StringBuilder sb3 = new StringBuilder("100_100");
                            sb3.append((!SharedConfig.isAutoplayGifs() || this.v) ? "" : "_firstframe");
                            imageReceiver2.setImage(forDocument, sb3.toString(), ImageLocation.getForDocument(this.J, this.G), str3, imageLocation, str2, null, this.G.size, str, this.f24187e, 0);
                        }
                    } else {
                        imageReceiver2 = imageReceiver;
                        if (webFileCreateWithWebDocument != null) {
                            imageReceiver2.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), "100_100", ImageLocation.getForPhoto(this.J, this.I), str3, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                        } else {
                            imageReceiver2.setImage(ImageLocation.getForPath(strFormapMapUrl), "100_100", ImageLocation.getForPhoto(this.J, this.I), str3, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                        }
                    }
                } else {
                    imageReceiver2 = imageReceiver;
                    if (this.J != null) {
                        svgThumb = DocumentObject.getSvgThumb(this.G, org.telegram.ui.ActionBar.g6.f22999a7, f10);
                        if (!MessageObject.canAutoplayAnimatedSticker(this.G)) {
                            document3 = this.G;
                            if (document3 == null) {
                                imageReceiver2.setImage(ImageLocation.getForPhoto(this.J, this.I), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str2, imageLocation, str2, null, this.J.size, str, this.f24187e, 0);
                            } else if (svgThumb != null) {
                                imageReceiver2.setImage(ImageLocation.getForDocument(this.J, document3), str3, null, null, imageLocation, str2, svgThumb, this.J.size, str, this.f24187e, 0);
                            } else {
                                imageReceiver2.setImage(ImageLocation.getForDocument(this.J, document3), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str2, imageLocation, str2, null, this.J.size, str, this.f24187e, 0);
                            }
                        } else if (svgThumb != null) {
                            imageReceiver2.setImage(ImageLocation.getForDocument(this.G), "80_80", null, null, imageLocation, str2, svgThumb, this.J.size, str, this.f24187e, 0);
                        } else {
                            imageReceiver2.setImage(ImageLocation.getForDocument(this.G), "80_80", ImageLocation.getForDocument(this.J, this.G), str2, imageLocation, str2, null, this.J.size, str, this.f24187e, 0);
                        }
                    } else if (webFileCreateWithWebDocument != null) {
                        imageReceiver2.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str2, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                    } else {
                        imageReceiver2.setImage(ImageLocation.getForPath(strFormapMapUrl), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str2, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                    }
                }
                imageReceiver3 = imageReceiver2;
                if (!SharedConfig.isAutoplayGifs() || this.v) {
                    imageReceiver3.setAllowStartAnimation(r10);
                    imageReceiver3.startAnimation();
                } else {
                    imageReceiver3.setAllowStartAnimation(false);
                    imageReceiver3.stopAnimation();
                }
                this.f24182b = r10;
                imageReceiver4 = imageReceiver3;
            }
            z12 = this.L;
            radialProgress2 = this.R;
            if (z12) {
                size = View.MeasureSpec.getSize(i11);
                if (size == 0) {
                    size = AndroidUtilities.dp(f11);
                }
                setMeasuredDimension(size2, size);
                int iX = rl.x(24.0f, size2, 2);
                int iX2 = rl.x(24.0f, size, 2);
                radialProgress2.q(iX, iX2, AndroidUtilities.dp(24.0f) + iX, AndroidUtilities.dp(24.0f) + iX2);
                radialProgress2.setCircleRadius(AndroidUtilities.dp(12.0f));
                imageReceiver4.setImageCoords(0.0f, 0.0f, size2, size);
            } else {
                staticLayout = this.B;
                if (staticLayout != null && staticLayout.getLineCount() != 0) {
                    StaticLayout staticLayout5 = this.B;
                    lineBottom = staticLayout5.getLineBottom(staticLayout5.getLineCount() - r10);
                }
                staticLayout2 = this.D;
                if (staticLayout2 != null && staticLayout2.getLineCount() != 0) {
                    StaticLayout staticLayout6 = this.D;
                    lineBottom += staticLayout6.getLineBottom(staticLayout6.getLineCount() - r10);
                }
                staticLayout3 = this.f24194y;
                if (staticLayout3 != null && staticLayout3.getLineCount() > 0) {
                    StaticLayout staticLayout7 = this.f24194y;
                    lineBottom += staticLayout7.getLineBottom(staticLayout7.getLineCount() - r10);
                }
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.y1.b(16.0f, Math.max(AndroidUtilities.dp(52.0f), lineBottom), AndroidUtilities.dp(68.0f)) + (this.h ? 1 : 0));
                iDp2 = AndroidUtilities.dp(52.0f);
                if (LocaleController.isRTL) {
                    f12 = 8.0f;
                    iDp3 = org.telegram.messenger.y1.B(8.0f, View.MeasureSpec.getSize(i10), iDp2);
                } else {
                    f12 = 8.0f;
                    iDp3 = AndroidUtilities.dp(8.0f);
                }
                y70Var2.setBounds(iDp3, AndroidUtilities.dp(f12), iDp3 + iDp2, AndroidUtilities.dp(60.0f));
                float f13 = iDp2;
                imageReceiver4.setImageCoords(iDp3, AndroidUtilities.dp(f12), f13, f13);
                i13 = this.K;
                if (i13 != 3 || i13 == 5) {
                    radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
                    radialProgress2.q(AndroidUtilities.dp(4.0f) + iDp3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(48.0f) + iDp3, AndroidUtilities.dp(56.0f));
                }
            }
            bpVar = this.T;
            if (bpVar != null) {
                measureChildWithMargins(bpVar, i10, 0, i11, 0);
            }
        }
        arrayList2 = new ArrayList(this.G.thumbs);
        arrayList = arrayList2;
        z10 = this.L;
        y70Var = this.f24184c;
        if (z10) {
            y70Var2 = y70Var;
            r10 = 1;
            f10 = 1.0f;
            f11 = 100.0f;
        } else {
            y70Var2 = y70Var;
            r10 = 1;
            f10 = 1.0f;
            f11 = 100.0f;
        }
        document = this.G;
        if (document == null) {
            botInlineResult = this.E;
            if (botInlineResult != null) {
                closestPhotoSizeWithSize = null;
                str = null;
            } else {
                closestPhotoSizeWithSize = null;
                str = null;
            }
        } else if (this.f24192w) {
            this.J = FileLoader.getClosestPhotoSizeWithSize(this.G.thumbs, 90, false, null, r10);
            closestPhotoSizeWithSize = null;
            str = null;
        } else {
            this.J = FileLoader.getClosestPhotoSizeWithSize(this.G.thumbs, 90, false, null, r10);
            closestPhotoSizeWithSize = null;
            str = null;
        }
        botInlineResult2 = this.E;
        if (botInlineResult2 != null) {
            if (botInlineResult2.content instanceof TLRPC.TL_webDocument) {
                tL_webDocument = null;
            } else {
                tL_webDocument = null;
            }
            if (tL_webDocument == null) {
                webDocument = this.E.thumb;
                if (webDocument instanceof TLRPC.TL_webDocument) {
                    tL_webDocument = (TLRPC.TL_webDocument) webDocument;
                }
            }
            if (tL_webDocument != null) {
                webFileCreateWithWebDocument = null;
                strFormapMapUrl = null;
            } else {
                webFileCreateWithWebDocument = null;
                strFormapMapUrl = null;
            }
            if (tL_webDocument != null) {
                webFileCreateWithWebDocument = WebFile.createWithWebDocument(tL_webDocument);
            }
        } else {
            webFileCreateWithWebDocument = null;
            strFormapMapUrl = null;
        }
        if (this.G != null) {
            i14 = 0;
            while (true) {
                if (i14 < this.G.attributes.size()) {
                    documentAttribute = this.G.attributes.get(i14);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                    }
                    iDp = documentAttribute.f22387w;
                    i12 = documentAttribute.h;
                } else {
                    iDp = 0;
                    i12 = 0;
                }
                i14++;
            }
        } else {
            iDp = 0;
            i12 = 0;
        }
        if (iDp != 0) {
            photoSize = this.J;
            if (photoSize != null) {
                if (closestPhotoSizeWithSize != null) {
                    closestPhotoSizeWithSize.size = -1;
                }
                iDp = photoSize.f22405w;
                i12 = photoSize.h;
            } else {
                botInlineResult3 = this.E;
                if (botInlineResult3 != null) {
                    int[] inlineResultWidthAndHeight2 = MessageObject.getInlineResultWidthAndHeight(botInlineResult3);
                    int i18 = inlineResultWidthAndHeight2[0];
                    i12 = inlineResultWidthAndHeight2[r10];
                    iDp = i18;
                }
            }
        } else {
            photoSize = this.J;
            if (photoSize != null) {
                if (closestPhotoSizeWithSize != null) {
                    closestPhotoSizeWithSize.size = -1;
                }
                iDp = photoSize.f22405w;
                i12 = photoSize.h;
            } else {
                botInlineResult3 = this.E;
                if (botInlineResult3 != null) {
                    int[] inlineResultWidthAndHeight3 = MessageObject.getInlineResultWidthAndHeight(botInlineResult3);
                    int i19 = inlineResultWidthAndHeight3[0];
                    i12 = inlineResultWidthAndHeight3[r10];
                    iDp = i19;
                }
            }
        }
        if (iDp != 0) {
            iDp = AndroidUtilities.dp(80.0f);
            i12 = iDp;
        } else {
            iDp = AndroidUtilities.dp(80.0f);
            i12 = iDp;
        }
        document2 = this.G;
        imageReceiver = this.f24180a;
        if (document2 != null) {
            if (this.L) {
                iMin = Math.min(iDp, i12) / 3;
                if (this.K == 2) {
                    Locale locale3 = Locale.US;
                    strD2 = s3.c.d((int) (iMin / AndroidUtilities.density), "_80_b");
                    if (SharedConfig.isAutoplayGifs()) {
                    }
                    str3 = strD2;
                    str2 = str3;
                } else {
                    Locale locale4 = Locale.US;
                    strD = s3.c.d((int) (iMin / AndroidUtilities.density), "_80");
                    strConcat = strD.concat("_b");
                }
                str3 = strD;
                str2 = strConcat;
            } else {
                str2 = "52_52_b";
                str3 = "52_52";
            }
            if (this.K == 6) {
                z11 = true;
            } else {
                z11 = false;
            }
            imageReceiver.setAspectFit(z11);
            strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
            if (strippedPhotoSize == null) {
                imageLocation = null;
            } else {
                document5 = this.G;
                if (document5 != null) {
                    forPhoto = ImageLocation.getForDocument(strippedPhotoSize, document5);
                } else {
                    photo = this.I;
                    if (photo != null) {
                        forPhoto = ImageLocation.getForPhoto(strippedPhotoSize, photo);
                    } else {
                        imageLocation = null;
                    }
                }
                imageLocation = forPhoto;
            }
            if (this.K == 2) {
                document4 = this.G;
                if (document4 != null) {
                    documentVideoThumb = MessageObject.getDocumentVideoThumb(document4);
                    if (documentVideoThumb != null) {
                        ImageLocation forDocument3 = ImageLocation.getForDocument(documentVideoThumb, this.G);
                        StringBuilder sb4 = new StringBuilder("100_100");
                        sb4.append((!SharedConfig.isAutoplayGifs() || this.v) ? "" : "_firstframe");
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.setImage(forDocument3, sb4.toString(), ImageLocation.getForDocument(this.J, this.G), str3, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                    } else {
                        imageReceiver2 = imageReceiver;
                        forDocument = ImageLocation.getForDocument(this.G);
                        if (this.f24192w) {
                            forDocument.imageType = 2;
                        }
                        StringBuilder sb5 = new StringBuilder("100_100");
                        sb5.append((!SharedConfig.isAutoplayGifs() || this.v) ? "" : "_firstframe");
                        imageReceiver2.setImage(forDocument, sb5.toString(), ImageLocation.getForDocument(this.J, this.G), str3, imageLocation, str2, null, this.G.size, str, this.f24187e, 0);
                    }
                } else {
                    imageReceiver2 = imageReceiver;
                    if (webFileCreateWithWebDocument != null) {
                        imageReceiver2.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), "100_100", ImageLocation.getForPhoto(this.J, this.I), str3, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                    } else {
                        imageReceiver2.setImage(ImageLocation.getForPath(strFormapMapUrl), "100_100", ImageLocation.getForPhoto(this.J, this.I), str3, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                    }
                }
            } else {
                imageReceiver2 = imageReceiver;
                if (this.J != null) {
                    svgThumb = DocumentObject.getSvgThumb(this.G, org.telegram.ui.ActionBar.g6.f22999a7, f10);
                    if (!MessageObject.canAutoplayAnimatedSticker(this.G)) {
                        document3 = this.G;
                        if (document3 == null) {
                            imageReceiver2.setImage(ImageLocation.getForPhoto(this.J, this.I), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str2, imageLocation, str2, null, this.J.size, str, this.f24187e, 0);
                        } else if (svgThumb != null) {
                            imageReceiver2.setImage(ImageLocation.getForDocument(this.J, document3), str3, null, null, imageLocation, str2, svgThumb, this.J.size, str, this.f24187e, 0);
                        } else {
                            imageReceiver2.setImage(ImageLocation.getForDocument(this.J, document3), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str2, imageLocation, str2, null, this.J.size, str, this.f24187e, 0);
                        }
                    } else if (svgThumb != null) {
                        imageReceiver2.setImage(ImageLocation.getForDocument(this.G), "80_80", null, null, imageLocation, str2, svgThumb, this.J.size, str, this.f24187e, 0);
                    } else {
                        imageReceiver2.setImage(ImageLocation.getForDocument(this.G), "80_80", ImageLocation.getForDocument(this.J, this.G), str2, imageLocation, str2, null, this.J.size, str, this.f24187e, 0);
                    }
                } else if (webFileCreateWithWebDocument != null) {
                    imageReceiver2.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str2, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                } else {
                    imageReceiver2.setImage(ImageLocation.getForPath(strFormapMapUrl), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str2, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                }
            }
            imageReceiver3 = imageReceiver2;
            if (SharedConfig.isAutoplayGifs()) {
                imageReceiver3.setAllowStartAnimation(r10);
                imageReceiver3.startAnimation();
            } else {
                imageReceiver3.setAllowStartAnimation(r10);
                imageReceiver3.startAnimation();
            }
            this.f24182b = r10;
            imageReceiver4 = imageReceiver3;
        } else {
            if (this.L) {
                iMin = Math.min(iDp, i12) / 3;
                if (this.K == 2) {
                    Locale locale5 = Locale.US;
                    strD2 = s3.c.d((int) (iMin / AndroidUtilities.density), "_80_b");
                    if (SharedConfig.isAutoplayGifs()) {
                    }
                    str3 = strD2;
                    str2 = str3;
                } else {
                    Locale locale6 = Locale.US;
                    strD = s3.c.d((int) (iMin / AndroidUtilities.density), "_80");
                    strConcat = strD.concat("_b");
                }
                str3 = strD;
                str2 = strConcat;
            } else {
                str2 = "52_52_b";
                str3 = "52_52";
            }
            if (this.K == 6) {
                z11 = true;
            } else {
                z11 = false;
            }
            imageReceiver.setAspectFit(z11);
            strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
            if (strippedPhotoSize == null) {
                imageLocation = null;
            } else {
                document5 = this.G;
                if (document5 != null) {
                    forPhoto = ImageLocation.getForDocument(strippedPhotoSize, document5);
                } else {
                    photo = this.I;
                    if (photo != null) {
                        forPhoto = ImageLocation.getForPhoto(strippedPhotoSize, photo);
                    } else {
                        imageLocation = null;
                    }
                }
                imageLocation = forPhoto;
            }
            if (this.K == 2) {
                document4 = this.G;
                if (document4 != null) {
                    documentVideoThumb = MessageObject.getDocumentVideoThumb(document4);
                    if (documentVideoThumb != null) {
                        ImageLocation forDocument4 = ImageLocation.getForDocument(documentVideoThumb, this.G);
                        StringBuilder sb6 = new StringBuilder("100_100");
                        sb6.append((!SharedConfig.isAutoplayGifs() || this.v) ? "" : "_firstframe");
                        imageReceiver2 = imageReceiver;
                        imageReceiver2.setImage(forDocument4, sb6.toString(), ImageLocation.getForDocument(this.J, this.G), str3, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                    } else {
                        imageReceiver2 = imageReceiver;
                        forDocument = ImageLocation.getForDocument(this.G);
                        if (this.f24192w) {
                            forDocument.imageType = 2;
                        }
                        StringBuilder sb7 = new StringBuilder("100_100");
                        sb7.append((!SharedConfig.isAutoplayGifs() || this.v) ? "" : "_firstframe");
                        imageReceiver2.setImage(forDocument, sb7.toString(), ImageLocation.getForDocument(this.J, this.G), str3, imageLocation, str2, null, this.G.size, str, this.f24187e, 0);
                    }
                } else {
                    imageReceiver2 = imageReceiver;
                    if (webFileCreateWithWebDocument != null) {
                        imageReceiver2.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), "100_100", ImageLocation.getForPhoto(this.J, this.I), str3, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                    } else {
                        imageReceiver2.setImage(ImageLocation.getForPath(strFormapMapUrl), "100_100", ImageLocation.getForPhoto(this.J, this.I), str3, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                    }
                }
            } else {
                imageReceiver2 = imageReceiver;
                if (this.J != null) {
                    svgThumb = DocumentObject.getSvgThumb(this.G, org.telegram.ui.ActionBar.g6.f22999a7, f10);
                    if (!MessageObject.canAutoplayAnimatedSticker(this.G)) {
                        document3 = this.G;
                        if (document3 == null) {
                            imageReceiver2.setImage(ImageLocation.getForPhoto(this.J, this.I), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str2, imageLocation, str2, null, this.J.size, str, this.f24187e, 0);
                        } else if (svgThumb != null) {
                            imageReceiver2.setImage(ImageLocation.getForDocument(this.J, document3), str3, null, null, imageLocation, str2, svgThumb, this.J.size, str, this.f24187e, 0);
                        } else {
                            imageReceiver2.setImage(ImageLocation.getForDocument(this.J, document3), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str2, imageLocation, str2, null, this.J.size, str, this.f24187e, 0);
                        }
                    } else if (svgThumb != null) {
                        imageReceiver2.setImage(ImageLocation.getForDocument(this.G), "80_80", null, null, imageLocation, str2, svgThumb, this.J.size, str, this.f24187e, 0);
                    } else {
                        imageReceiver2.setImage(ImageLocation.getForDocument(this.G), "80_80", ImageLocation.getForDocument(this.J, this.G), str2, imageLocation, str2, null, this.J.size, str, this.f24187e, 0);
                    }
                } else if (webFileCreateWithWebDocument != null) {
                    imageReceiver2.setImage(ImageLocation.getForWebFile(webFileCreateWithWebDocument), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str2, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                } else {
                    imageReceiver2.setImage(ImageLocation.getForPath(strFormapMapUrl), str3, ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.I), str2, imageLocation, str2, null, -1L, str, this.f24187e, 1);
                }
            }
            imageReceiver3 = imageReceiver2;
            if (SharedConfig.isAutoplayGifs()) {
                imageReceiver3.setAllowStartAnimation(r10);
                imageReceiver3.startAnimation();
            } else {
                imageReceiver3.setAllowStartAnimation(r10);
                imageReceiver3.startAnimation();
            }
            this.f24182b = r10;
            imageReceiver4 = imageReceiver3;
        }
        z12 = this.L;
        radialProgress2 = this.R;
        if (z12) {
            size = View.MeasureSpec.getSize(i11);
            if (size == 0) {
                size = AndroidUtilities.dp(f11);
            }
            setMeasuredDimension(size2, size);
            int iX3 = rl.x(24.0f, size2, 2);
            int iX4 = rl.x(24.0f, size, 2);
            radialProgress2.q(iX3, iX4, AndroidUtilities.dp(24.0f) + iX3, AndroidUtilities.dp(24.0f) + iX4);
            radialProgress2.setCircleRadius(AndroidUtilities.dp(12.0f));
            imageReceiver4.setImageCoords(0.0f, 0.0f, size2, size);
        } else {
            staticLayout = this.B;
            if (staticLayout != null) {
                StaticLayout staticLayout8 = this.B;
                lineBottom = staticLayout8.getLineBottom(staticLayout8.getLineCount() - r10);
            }
            staticLayout2 = this.D;
            if (staticLayout2 != null) {
                StaticLayout staticLayout9 = this.D;
                lineBottom += staticLayout9.getLineBottom(staticLayout9.getLineCount() - r10);
            }
            staticLayout3 = this.f24194y;
            if (staticLayout3 != null) {
                StaticLayout staticLayout10 = this.f24194y;
                lineBottom += staticLayout10.getLineBottom(staticLayout10.getLineCount() - r10);
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.y1.b(16.0f, Math.max(AndroidUtilities.dp(52.0f), lineBottom), AndroidUtilities.dp(68.0f)) + (this.h ? 1 : 0));
            iDp2 = AndroidUtilities.dp(52.0f);
            if (LocaleController.isRTL) {
                f12 = 8.0f;
                iDp3 = org.telegram.messenger.y1.B(8.0f, View.MeasureSpec.getSize(i10), iDp2);
            } else {
                f12 = 8.0f;
                iDp3 = AndroidUtilities.dp(8.0f);
            }
            y70Var2.setBounds(iDp3, AndroidUtilities.dp(f12), iDp3 + iDp2, AndroidUtilities.dp(60.0f));
            float f14 = iDp2;
            imageReceiver4.setImageCoords(iDp3, AndroidUtilities.dp(f12), f14, f14);
            i13 = this.K;
            if (i13 != 3) {
                radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
                radialProgress2.q(AndroidUtilities.dp(4.0f) + iDp3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(48.0f) + iDp3, AndroidUtilities.dp(56.0f));
            } else {
                radialProgress2.setCircleRadius(AndroidUtilities.dp(24.0f));
                radialProgress2.q(AndroidUtilities.dp(4.0f) + iDp3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(48.0f) + iDp3, AndroidUtilities.dp(56.0f));
            }
        }
        bpVar = this.T;
        if (bpVar != null) {
            measureChildWithMargins(bpVar, i10, 0, i11, 0);
        }
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.R.o(Math.min(1.0f, j10 / j11), true);
        int i10 = this.K;
        if (i10 == 3 || i10 == 5) {
            if (this.Q != 4) {
                f(false, true);
            }
        } else if (this.Q != 1) {
            f(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f24183b0 = true;
        this.R.o(1.0f, true);
        f(false, true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (this.L || this.U == null || this.E == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x8 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        AndroidUtilities.dp(48.0f);
        int i10 = this.K;
        y70 y70Var = this.f24184c;
        boolean z10 = true;
        if (i10 == 3 || i10 == 5) {
            boolean zContains = y70Var.getBounds().contains(x8, y10);
            int action = motionEvent.getAction();
            RadialProgress2 radialProgress2 = this.R;
            if (action == 0) {
                if (zContains) {
                    this.f24189n = true;
                    radialProgress2.n(true, false);
                    invalidate();
                }
            } else if (this.f24189n) {
                if (motionEvent.getAction() == 1) {
                    this.f24189n = false;
                    playSoundEffect(0);
                    a();
                    invalidate();
                } else if (motionEvent.getAction() == 3) {
                    this.f24189n = false;
                    invalidate();
                } else if (motionEvent.getAction() == 2 && !zContains) {
                    this.f24189n = false;
                    invalidate();
                }
                radialProgress2.n(this.f24189n, false);
            }
            z10 = false;
        } else {
            TLRPC.BotInlineResult botInlineResult = this.E;
            if (botInlineResult == null || (webDocument = botInlineResult.content) == null || TextUtils.isEmpty(webDocument.url)) {
                z10 = false;
            } else {
                if (motionEvent.getAction() == 0) {
                    if (y70Var.getBounds().contains(x8, y10)) {
                        this.f24189n = true;
                    }
                } else if (this.f24189n) {
                    if (motionEvent.getAction() == 1) {
                        this.f24189n = false;
                        playSoundEffect(0);
                        ((pf.j0) this.U).f45835a.R.f33337b.k(getResult());
                    } else if (motionEvent.getAction() == 3) {
                        this.f24189n = false;
                    } else if (motionEvent.getAction() == 2 && !y70Var.getBounds().contains(x8, y10)) {
                        this.f24189n = false;
                    }
                }
                z10 = false;
            }
        }
        return !z10 ? super.onTouchEvent(motionEvent) : z10;
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        int i11;
        if (i10 != 16 || ((i11 = this.K) != 3 && i11 != 5)) {
            return super.performAccessibilityAction(i10, bundle);
        }
        a();
        return true;
    }

    public void setCanPreviewGif(boolean z10) {
        this.f24191s = z10;
    }

    public void setDelegate(c2 c2Var) {
        this.U = c2Var;
    }

    public void setIsKeyboard(boolean z10) {
        this.v = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        nc ncVar = this.V;
        if (ncVar != null) {
            ncVar.c(z10 || this.S);
        }
    }

    public void setScaled(boolean z10) {
        this.S = z10;
        nc ncVar = this.V;
        if (ncVar != null) {
            ncVar.c(isPressed() || this.S);
        }
    }

    public d2(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.d = i10;
        this.A = AndroidUtilities.dp(7.0f);
        this.C = AndroidUtilities.dp(27.0f);
        this.f24185c0 = 1.0f;
        this.f24186d0 = new b2(0, this);
        this.f24188f = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f24180a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setLayerNum(1);
        imageReceiver.setUseSharedAnimationQueue(true);
        this.f24184c = new y70(0, c6Var);
        this.R = new RadialProgress2(this, null);
        this.P = DownloadController.getInstance(i10).generateObserverTag();
        setFocusable(true);
        if (z10) {
            Paint paint = new Paint();
            this.O = paint;
            int i11 = org.telegram.ui.ActionBar.g6.Lh;
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            bp bpVar = new bp(context, 21, c6Var);
            this.T = bpVar;
            bpVar.setVisibility(4);
            bpVar.b(-1, i11, org.telegram.ui.ActionBar.g6.f23182k7);
            bpVar.setDrawUnchecked(false);
            bpVar.setDrawBackgroundAsArc(1);
            addView(bpVar, h7.z5.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
