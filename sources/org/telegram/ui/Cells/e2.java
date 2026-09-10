package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.PhotoViewer;
public final class e2 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public final int E;
    public StaticLayout F;
    public final int G;
    public StaticLayout H;
    public TLRPC.BotInlineResult I;
    public TLRPC.User J;
    public TLRPC.Document K;
    public int L;
    public TLRPC.Photo M;
    public TLRPC.PhotoSize N;
    public int O;
    public boolean P;
    public MessageObject Q;
    public AnimatorSet R;
    public final Paint S;
    public final int T;
    public int U;
    public final RadialProgress2 V;
    public boolean W;
    public final ImageReceiver f19047a;
    public final tp f19048a0;
    public boolean f19049b;
    public d2 f19050b0;
    public final v80 f19051c;
    public xc f19052c0;
    public final int d;
    public boolean f19053d0;
    public Object e;
    public String f19054e0;
    public final org.telegram.ui.ActionBar.f6 f19055f;
    public boolean f19056f0;
    public float f19057g0;
    public boolean h;
    public final c2 f19058h0;
    public boolean f19059n;
    public boolean f19060r;
    public boolean f19061s;
    public boolean v;
    public boolean f19062w;
    public int f19063x;
    public StaticLayout f19064y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public e2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i10 = this.O;
        RadialProgress2 radialProgress2 = this.V;
        if (i10 != 3 && i10 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.j6.f18081le, org.telegram.ui.ActionBar.j6.f18099me, org.telegram.ui.ActionBar.j6.ne, org.telegram.ui.ActionBar.j6.f18133oe);
            if (this.U != 1) {
                return 4;
            }
            return 10;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.j6.f18025ie, org.telegram.ui.ActionBar.j6.f18043je, org.telegram.ui.ActionBar.j6.f18242uc, org.telegram.ui.ActionBar.j6.f18259vc);
        int i11 = this.U;
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        return 0;
    }

    public final void a() {
        int i10 = this.O;
        if (i10 == 3 || i10 == 5) {
            int i11 = this.U;
            RadialProgress2 radialProgress2 = this.V;
            if (i11 == 0) {
                if (MediaController.getInstance().playMessage(this.Q)) {
                    this.U = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else if (i11 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.Q)) {
                    this.U = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else {
                int i12 = this.d;
                if (i11 == 2) {
                    radialProgress2.o(0.0f, false);
                    if (this.K != null) {
                        FileLoader.getInstance(i12).loadFile(this.K, this.I, 1, 0);
                    } else if (this.I.content instanceof TLRPC.TL_webDocument) {
                        FileLoader.getInstance(i12).loadFile(WebFile.createWithWebDocument(this.I.content), 3, 1);
                    }
                    this.U = 4;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                } else if (i11 == 4) {
                    if (this.K != null) {
                        FileLoader.getInstance(i12).cancelLoadFile(this.K);
                    } else if (this.I.content instanceof TLRPC.TL_webDocument) {
                        FileLoader.getInstance(i12).cancelLoadFile(WebFile.createWithWebDocument(this.I.content));
                    }
                    this.U = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        }
    }

    public final void b() {
        String str;
        String str2;
        this.Q = null;
        this.O = 0;
        TLRPC.Document document = this.K;
        if (document != null) {
            if (MessageObject.isGifDocument(document)) {
                this.O = 2;
            } else if (!MessageObject.isStickerDocument(this.K) && !MessageObject.isAnimatedStickerDocument(this.K, true)) {
                if (MessageObject.isMusicDocument(this.K)) {
                    this.O = 5;
                } else if (MessageObject.isVoiceDocument(this.K)) {
                    this.O = 3;
                }
            } else {
                this.O = 6;
            }
        } else {
            TLRPC.BotInlineResult botInlineResult = this.I;
            if (botInlineResult != null) {
                if (botInlineResult.photo != null) {
                    this.O = 7;
                } else if (botInlineResult.type.equals("audio")) {
                    this.O = 5;
                } else if (this.I.type.equals("voice")) {
                    this.O = 3;
                }
            }
        }
        int i10 = this.O;
        if (i10 != 3 && i10 != 5) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.f17216id = -Utilities.random.nextInt();
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        int i11 = this.d;
        long clientUserId = UserConfig.getInstance(i11).getClientUserId();
        tL_peerUser.user_id = clientUserId;
        peer.user_id = clientUserId;
        tL_message.date = (int) (System.currentTimeMillis() / 1000);
        String str3 = "";
        tL_message.message = "";
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
        tL_message.media = tL_messageMediaDocument;
        tL_messageMediaDocument.flags |= 3;
        tL_messageMediaDocument.document = new TLRPC.TL_document();
        TLRPC.MessageMedia messageMedia = tL_message.media;
        messageMedia.document.file_reference = new byte[0];
        tL_message.flags |= 768;
        TLRPC.Document document2 = this.K;
        if (document2 != null) {
            messageMedia.document = document2;
            tL_message.attachPath = "";
        } else {
            String str4 = this.I.content.url;
            String str5 = "ogg";
            if (this.O != 5) {
                str = "ogg";
            } else {
                str = "mp3";
            }
            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str4, str);
            TLRPC.Document document3 = tL_message.media.document;
            document3.f17201id = 0L;
            document3.access_hash = 0L;
            document3.date = tL_message.date;
            document3.mime_type = r6.i("audio/", httpUrlExtension);
            TLRPC.Document document4 = tL_message.media.document;
            document4.size = 0L;
            document4.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(this.I);
            TLRPC.BotInlineResult botInlineResult2 = this.I;
            String str6 = botInlineResult2.title;
            if (str6 == null) {
                str6 = "";
            }
            tL_documentAttributeAudio.title = str6;
            String str7 = botInlineResult2.description;
            if (str7 != null) {
                str3 = str7;
            }
            tL_documentAttributeAudio.performer = str3;
            tL_documentAttributeAudio.flags |= 3;
            if (this.O == 3) {
                tL_documentAttributeAudio.voice = true;
            }
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Utilities.MD5(this.I.content.url));
            sb2.append(".");
            String str8 = this.I.content.url;
            if (this.O != 5) {
                str2 = "ogg";
            } else {
                str2 = "mp3";
            }
            sb2.append(ImageLoader.getHttpUrlExtension(str8, str2));
            tL_documentAttributeFilename.file_name = sb2.toString();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            File directory = FileLoader.getDirectory(4);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Utilities.MD5(this.I.content.url));
            sb3.append(".");
            String str9 = this.I.content.url;
            if (this.O == 5) {
                str5 = "mp3";
            }
            sb3.append(ImageLoader.getHttpUrlExtension(str9, str5));
            tL_message.attachPath = new File(directory, sb3.toString()).getAbsolutePath();
        }
        this.Q = new MessageObject(i11, tL_message, false, true);
    }

    public final void c(boolean z10, boolean z11) {
        tp tpVar = this.f19048a0;
        if (tpVar == null) {
            return;
        }
        if (tpVar.getVisibility() != 0) {
            tpVar.setVisibility(0);
        }
        tpVar.a(z10, z11);
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.R = null;
        }
        float f7 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.R = animatorSet2;
            if (z10) {
                f7 = 0.81f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f19058h0, f7));
            this.R.setDuration(200L);
            this.R.addListener(new ai.e(18, this, z10));
            this.R.start();
            return;
        }
        if (z10) {
            f7 = 0.85f;
        }
        this.f19057g0 = f7;
        invalidate();
    }

    public final void d(int i10, TLRPC.Document document, Object obj) {
        this.h = false;
        this.f19060r = false;
        this.L = i10;
        this.I = null;
        this.e = obj;
        this.K = document;
        this.M = null;
        this.P = true;
        this.f19062w = true;
        b();
        this.O = 2;
        requestLayout();
        this.f19054e0 = null;
        this.f19056f0 = false;
        this.f19053d0 = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.h = z11;
        this.f19060r = z12;
        this.J = user;
        this.I = botInlineResult;
        this.e = botInlineResult;
        if (botInlineResult != null) {
            this.K = botInlineResult.document;
            this.M = botInlineResult.photo;
        } else {
            this.K = null;
            this.M = null;
        }
        this.P = z10;
        this.f19062w = z13;
        b();
        if (z13) {
            this.O = 2;
        }
        requestLayout();
        this.f19054e0 = null;
        this.f19056f0 = false;
        this.f19053d0 = false;
        f(false, false);
    }

    public final void f(boolean z10, boolean z11) {
        boolean isLoadingHttpFile;
        String str = this.f19054e0;
        if (str == null && !this.f19053d0) {
            this.f19053d0 = true;
            Utilities.searchQueue.postRunnable(new b2(this, z10));
            this.V.setIcon(4, z10, false);
        } else if (TextUtils.isEmpty(str)) {
            this.U = -1;
            this.V.setIcon(4, z10, false);
        } else {
            if (this.K != null) {
                isLoadingHttpFile = FileLoader.getInstance(this.d).isLoadingFile(this.f19054e0);
            } else {
                isLoadingHttpFile = ImageLoader.getInstance().isLoadingHttpFile(this.f19054e0);
            }
            if (!isLoadingHttpFile && this.f19056f0) {
                DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
                int i10 = this.O;
                if (i10 != 5 && i10 != 3) {
                    this.U = -1;
                } else {
                    boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.Q);
                    if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                        this.U = 1;
                    } else {
                        this.U = 0;
                    }
                    this.V.o(1.0f, z11);
                }
            } else {
                DownloadController.getInstance(this.d).addLoadingFileObserver(this.f19054e0, this);
                int i11 = this.O;
                float f7 = 0.0f;
                if (i11 != 5 && i11 != 3) {
                    this.U = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(this.f19054e0);
                    if (fileProgress != null) {
                        f7 = fileProgress.floatValue();
                    }
                    this.V.o(f7, false);
                } else if (!isLoadingHttpFile) {
                    this.U = 2;
                } else {
                    this.U = 4;
                    Float fileProgress2 = ImageLoader.getInstance().getFileProgress(this.f19054e0);
                    if (fileProgress2 != null) {
                        this.V.o(fileProgress2.floatValue(), z11);
                    } else {
                        this.V.o(0.0f, z11);
                    }
                }
            }
            this.V.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        }
    }

    public TLRPC.BotInlineResult getBotInlineResult() {
        return this.I;
    }

    public int getDate() {
        return this.L;
    }

    public TLRPC.Document getDocument() {
        return this.K;
    }

    public TLRPC.User getInlineBot() {
        return this.J;
    }

    public MessageObject getMessageObject() {
        return this.Q;
    }

    @Override
    public int getObserverTag() {
        return this.T;
    }

    public Object getParentObject() {
        return this.e;
    }

    public ImageReceiver getPhotoImage() {
        return this.f19047a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19047a.onAttachedToWindow()) {
            f(false, false);
        }
        this.V.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19047a.onDetachedFromWindow();
        this.V.f();
        DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        TLRPC.BotInlineResult botInlineResult;
        int i11;
        float f7;
        float f10;
        ImageReceiver imageReceiver = this.f19047a;
        tp tpVar = this.f19048a0;
        if (tpVar != null && (tpVar.f27462a.f21057q || !imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f || PhotoViewer.M1((MessageObject) this.e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.S);
        }
        float f11 = 8.0f;
        if (this.F != null) {
            canvas.save();
            if (LocaleController.isRTL) {
                f10 = 8.0f;
            } else {
                f10 = AndroidUtilities.leftBaseline;
            }
            canvas.translate(AndroidUtilities.dp(f10), this.E);
            this.F.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.H;
        org.telegram.ui.ActionBar.f6 f6Var = this.f19055f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.j6.f17979g3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18325z6, f6Var));
            canvas.save();
            if (LocaleController.isRTL) {
                f7 = 8.0f;
            } else {
                f7 = AndroidUtilities.leftBaseline;
            }
            canvas.translate(AndroidUtilities.dp(f7), this.G);
            this.H.draw(canvas);
            canvas.restore();
        }
        if (this.f19064y != null) {
            org.telegram.ui.ActionBar.j6.f17979g3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, f6Var));
            canvas.save();
            if (!LocaleController.isRTL) {
                f11 = AndroidUtilities.leftBaseline;
            }
            canvas.translate(AndroidUtilities.dp(f11), this.f19063x);
            this.f19064y.draw(canvas);
            canvas.restore();
        }
        boolean z10 = this.P;
        RadialProgress2 radialProgress2 = this.V;
        if (!z10) {
            boolean z11 = this.f19049b;
            v80 v80Var = this.f19051c;
            if (z11 && !PhotoViewer.N1(this.I)) {
                v80Var.setAlpha((int) ((1.0f - imageReceiver.getCurrentAlpha()) * 255.0f));
            } else {
                v80Var.setAlpha(255);
            }
            int i12 = this.O;
            if (i12 != 3 && i12 != 5) {
                TLRPC.BotInlineResult botInlineResult2 = this.I;
                if (botInlineResult2 != null && botInlineResult2.type.equals("file")) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.j6.f18089m4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.j6.f18089m4.getIntrinsicHeight();
                    int imageX = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth) / 2));
                    int imageY = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight) / 2));
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), v80.f27875j);
                    org.telegram.ui.ActionBar.j6.f18089m4.setBounds(imageX, imageY, intrinsicWidth + imageX, intrinsicHeight + imageY);
                    org.telegram.ui.ActionBar.j6.f18089m4.draw(canvas);
                } else {
                    TLRPC.BotInlineResult botInlineResult3 = this.I;
                    if (botInlineResult3 != null && (botInlineResult3.type.equals("audio") || this.I.type.equals("voice"))) {
                        int intrinsicWidth2 = org.telegram.ui.ActionBar.j6.f18108n4.getIntrinsicWidth();
                        int intrinsicHeight2 = org.telegram.ui.ActionBar.j6.f18108n4.getIntrinsicHeight();
                        int imageX2 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth2) / 2));
                        int imageY2 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight2) / 2));
                        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), v80.f27875j);
                        org.telegram.ui.ActionBar.j6.f18108n4.setBounds(imageX2, imageY2, intrinsicWidth2 + imageX2, intrinsicHeight2 + imageY2);
                        org.telegram.ui.ActionBar.j6.f18108n4.draw(canvas);
                    } else {
                        TLRPC.BotInlineResult botInlineResult4 = this.I;
                        if (botInlineResult4 != null && (botInlineResult4.type.equals("venue") || this.I.type.equals("geo"))) {
                            int intrinsicWidth3 = org.telegram.ui.ActionBar.j6.f18124o4.getIntrinsicWidth();
                            int intrinsicHeight3 = org.telegram.ui.ActionBar.j6.f18124o4.getIntrinsicHeight();
                            int imageX3 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth3) / 2));
                            int imageY3 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight3) / 2));
                            canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), v80.f27875j);
                            org.telegram.ui.ActionBar.j6.f18124o4.setBounds(imageX3, imageY3, intrinsicWidth3 + imageX3, intrinsicHeight3 + imageY3);
                            org.telegram.ui.ActionBar.j6.f18124o4.draw(canvas);
                        } else {
                            v80Var.draw(canvas);
                        }
                    }
                }
            } else {
                if (this.f19059n) {
                    i11 = org.telegram.ui.ActionBar.j6.f18042jd;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.f18024id;
                }
                radialProgress2.d = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
                radialProgress2.draw(canvas);
            }
        } else {
            TLRPC.BotInlineResult botInlineResult5 = this.I;
            if (botInlineResult5 != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult5.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.j6.f18124o4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.j6.f18124o4.getIntrinsicHeight();
                    int A = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.getImageWidth(), intrinsicWidth4, 2.0f, imageReceiver.getImageX());
                    int A2 = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.getImageHeight(), intrinsicHeight4, 2.0f, imageReceiver.getImageY());
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + imageReceiver.getImageWidth(), imageReceiver.getImageY() + imageReceiver.getImageHeight(), v80.f27875j);
                    org.telegram.ui.ActionBar.j6.f18124o4.setBounds(A, A2, intrinsicWidth4 + A, intrinsicHeight4 + A2);
                    org.telegram.ui.ActionBar.j6.f18124o4.draw(canvas);
                }
            }
        }
        if (this.f19049b) {
            if (this.I != null) {
                imageReceiver.setVisible(!PhotoViewer.N1(botInlineResult), false);
            }
            canvas.save();
            float f12 = this.f19057g0;
            xc xcVar = this.f19052c0;
            if (xcVar != null) {
                f12 *= xcVar.a(0.1f);
            }
            canvas.scale(f12, f12, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (this.P && ((i10 = this.O) == 7 || i10 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.h && !this.P) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
            }
        }
        if (this.f19060r) {
            org.telegram.ui.ActionBar.j6.f18142p4.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.j6.f18142p4.draw(canvas);
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        f(true, z10);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        boolean z11;
        String string;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        switch (this.O) {
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
        StaticLayout staticLayout = this.F;
        if (staticLayout != null && !TextUtils.isEmpty(staticLayout.getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        StaticLayout staticLayout2 = this.H;
        if (staticLayout2 != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.O == 5 && z10 && z11) {
            sb2.append(", ");
            sb2.append(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.H.getText(), this.F.getText()));
        } else {
            if (z10) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.F.getText());
            }
            if (z11) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.H.getText());
            }
        }
        accessibilityNodeInfo.setText(sb2);
        tp tpVar = this.f19048a0;
        if (tpVar != null && tpVar.f27462a.f21057q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i10 = this.O;
        if (i10 != 3 && i10 != 5) {
            return;
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
    public final void onMeasure(int r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e2.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.V.o(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
        int i10 = this.O;
        if (i10 != 3 && i10 != 5) {
            if (this.U != 1) {
                f(false, true);
            }
        } else if (this.U != 4) {
            f(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f19056f0 = true;
        this.V.o(1.0f, true);
        f(false, true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (!this.P && this.f19050b0 != null && this.I != null) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            AndroidUtilities.dp(48.0f);
            int i10 = this.O;
            v80 v80Var = this.f19051c;
            boolean z10 = true;
            if (i10 != 3 && i10 != 5) {
                TLRPC.BotInlineResult botInlineResult = this.I;
                if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                    if (motionEvent.getAction() == 0) {
                        if (v80Var.getBounds().contains(x10, y3)) {
                            this.f19059n = true;
                        }
                    } else if (this.f19059n) {
                        if (motionEvent.getAction() == 1) {
                            this.f19059n = false;
                            playSoundEffect(0);
                            ((fg.w0) this.f19050b0).f8244a.V.f26994b.k(getResult());
                        } else if (motionEvent.getAction() == 3) {
                            this.f19059n = false;
                        } else if (motionEvent.getAction() == 2 && !v80Var.getBounds().contains(x10, y3)) {
                            this.f19059n = false;
                        }
                    }
                }
                z10 = false;
            } else {
                boolean contains = v80Var.getBounds().contains(x10, y3);
                int action = motionEvent.getAction();
                RadialProgress2 radialProgress2 = this.V;
                if (action == 0) {
                    if (contains) {
                        this.f19059n = true;
                        radialProgress2.n(true, false);
                        invalidate();
                    }
                } else if (this.f19059n) {
                    if (motionEvent.getAction() == 1) {
                        this.f19059n = false;
                        playSoundEffect(0);
                        a();
                        invalidate();
                    } else if (motionEvent.getAction() == 3) {
                        this.f19059n = false;
                        invalidate();
                    } else if (motionEvent.getAction() == 2 && !contains) {
                        this.f19059n = false;
                        invalidate();
                    }
                    radialProgress2.n(this.f19059n, false);
                }
                z10 = false;
            }
            if (!z10) {
                return super.onTouchEvent(motionEvent);
            }
            return z10;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        int i11;
        if (i10 == 16 && ((i11 = this.O) == 3 || i11 == 5)) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setCanPreviewGif(boolean z10) {
        this.f19061s = z10;
    }

    public void setDelegate(d2 d2Var) {
        this.f19050b0 = d2Var;
    }

    public void setIsKeyboard(boolean z10) {
        this.v = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        xc xcVar = this.f19052c0;
        if (xcVar != null) {
            if (!z10 && !this.W) {
                z11 = false;
            } else {
                z11 = true;
            }
            xcVar.c(z11);
        }
    }

    public void setScaled(boolean z10) {
        boolean z11;
        this.W = z10;
        xc xcVar = this.f19052c0;
        if (xcVar != null) {
            if (!isPressed() && !this.W) {
                z11 = false;
            } else {
                z11 = true;
            }
            xcVar.c(z11);
        }
    }

    public e2(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.d = i10;
        this.E = AndroidUtilities.dp(7.0f);
        this.G = AndroidUtilities.dp(27.0f);
        this.f19057g0 = 1.0f;
        this.f19058h0 = new c2(0, this);
        this.f19055f = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f19047a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setLayerNum(1);
        imageReceiver.setUseSharedAnimationQueue(true);
        this.f19051c = new v80(0, f6Var);
        this.V = new RadialProgress2(this, null);
        this.T = DownloadController.getInstance(i10).generateObserverTag();
        setFocusable(true);
        if (z10) {
            Paint paint = new Paint();
            this.S = paint;
            int i11 = org.telegram.ui.ActionBar.j6.Lh;
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
            tp tpVar = new tp(context, 21, f6Var);
            this.f19048a0 = tpVar;
            tpVar.setVisibility(4);
            tpVar.b(-1, i11, org.telegram.ui.ActionBar.j6.f18056k7);
            tpVar.setDrawUnchecked(false);
            tpVar.setDrawBackgroundAsArc(1);
            addView(tpVar, w7.a6.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
