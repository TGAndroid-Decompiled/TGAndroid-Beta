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
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.u70;
import org.telegram.ui.PhotoViewer;
public final class e2 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
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
    public final dp T;
    public d2 U;
    public pc V;
    public boolean W;
    public final ImageReceiver f24270a;
    public String f24271a0;
    public boolean f24272b;
    public boolean f24273b0;
    public final u70 f24274c;
    public float f24275c0;
    public final int d;
    public final c2 f24276d0;
    public Object f24277e;
    public final org.telegram.ui.ActionBar.b6 f24278f;
    public boolean h;
    public boolean f24279n;
    public boolean f24280r;
    public boolean f24281s;
    public boolean v;
    public boolean f24282w;
    public int f24283x;
    public StaticLayout f24284y;

    static {
        new AccelerateInterpolator(0.5f);
    }

    public e2(Context context) {
        this(context, null, false);
    }

    private int getIconForCurrentState() {
        int i9 = this.K;
        RadialProgress2 radialProgress2 = this.R;
        if (i9 != 3 && i9 != 5) {
            radialProgress2.g(org.telegram.ui.ActionBar.f6.f23152le, org.telegram.ui.ActionBar.f6.f23169me, org.telegram.ui.ActionBar.f6.f23186ne, org.telegram.ui.ActionBar.f6.oe);
            if (this.Q != 1) {
                return 4;
            }
            return 10;
        }
        radialProgress2.g(org.telegram.ui.ActionBar.f6.f23099ie, org.telegram.ui.ActionBar.f6.f23116je, org.telegram.ui.ActionBar.f6.f23309uc, org.telegram.ui.ActionBar.f6.f23323vc);
        int i10 = this.Q;
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

    public final void a() {
        int i9 = this.K;
        if (i9 == 3 || i9 == 5) {
            int i10 = this.Q;
            RadialProgress2 radialProgress2 = this.R;
            if (i10 == 0) {
                if (MediaController.getInstance().playMessage(this.M)) {
                    this.Q = 1;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else if (i10 == 1) {
                if (MediaController.getInstance().lambda$startAudioAgain$7(this.M)) {
                    this.Q = 0;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            } else {
                int i11 = this.d;
                if (i10 == 2) {
                    radialProgress2.o(0.0f, false);
                    if (this.G != null) {
                        FileLoader.getInstance(i11).loadFile(this.G, this.E, 1, 0);
                    } else if (this.E.content instanceof TLRPC.TL_webDocument) {
                        FileLoader.getInstance(i11).loadFile(WebFile.createWithWebDocument(this.E.content), 3, 1);
                    }
                    this.Q = 4;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                } else if (i10 == 4) {
                    if (this.G != null) {
                        FileLoader.getInstance(i11).cancelLoadFile(this.G);
                    } else if (this.E.content instanceof TLRPC.TL_webDocument) {
                        FileLoader.getInstance(i11).cancelLoadFile(WebFile.createWithWebDocument(this.E.content));
                    }
                    this.Q = 2;
                    radialProgress2.setIcon(getIconForCurrentState(), false, true);
                    invalidate();
                }
            }
        }
    }

    public final void b() {
        String str;
        String str2;
        this.M = null;
        this.K = 0;
        TLRPC.Document document = this.G;
        if (document != null) {
            if (MessageObject.isGifDocument(document)) {
                this.K = 2;
            } else if (!MessageObject.isStickerDocument(this.G) && !MessageObject.isAnimatedStickerDocument(this.G, true)) {
                if (MessageObject.isMusicDocument(this.G)) {
                    this.K = 5;
                } else if (MessageObject.isVoiceDocument(this.G)) {
                    this.K = 3;
                }
            } else {
                this.K = 6;
            }
        } else {
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
        }
        int i9 = this.K;
        if (i9 != 3 && i9 != 5) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = true;
        tL_message.f22401id = -Utilities.random.nextInt();
        tL_message.peer_id = new TLRPC.TL_peerUser();
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.from_id = tL_peerUser;
        TLRPC.Peer peer = tL_message.peer_id;
        int i10 = this.d;
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
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
        TLRPC.Document document2 = this.G;
        if (document2 != null) {
            messageMedia.document = document2;
            tL_message.attachPath = "";
        } else {
            String str4 = this.E.content.url;
            String str5 = "ogg";
            if (this.K != 5) {
                str = "ogg";
            } else {
                str = "mp3";
            }
            String httpUrlExtension = ImageLoader.getHttpUrlExtension(str4, str);
            TLRPC.Document document3 = tL_message.media.document;
            document3.f22386id = 0L;
            document3.access_hash = 0L;
            document3.date = tL_message.date;
            document3.mime_type = ta.b.d("audio/", httpUrlExtension);
            TLRPC.Document document4 = tL_message.media.document;
            document4.size = 0L;
            document4.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(this.E);
            TLRPC.BotInlineResult botInlineResult2 = this.E;
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
            if (this.K == 3) {
                tL_documentAttributeAudio.voice = true;
            }
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Utilities.MD5(this.E.content.url));
            sb2.append(".");
            String str8 = this.E.content.url;
            if (this.K != 5) {
                str2 = "ogg";
            } else {
                str2 = "mp3";
            }
            sb2.append(ImageLoader.getHttpUrlExtension(str8, str2));
            tL_documentAttributeFilename.file_name = sb2.toString();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            File directory = FileLoader.getDirectory(4);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Utilities.MD5(this.E.content.url));
            sb3.append(".");
            String str9 = this.E.content.url;
            if (this.K == 5) {
                str5 = "mp3";
            }
            sb3.append(ImageLoader.getHttpUrlExtension(str9, str5));
            tL_message.attachPath = new File(directory, sb3.toString()).getAbsolutePath();
        }
        this.M = new MessageObject(i10, tL_message, false, true);
    }

    public final void c(boolean z10, boolean z11) {
        dp dpVar = this.T;
        if (dpVar == null) {
            return;
        }
        if (dpVar.getVisibility() != 0) {
            dpVar.setVisibility(0);
        }
        dpVar.a(z10, z11);
        AnimatorSet animatorSet = this.N;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.N = null;
        }
        float f10 = 1.0f;
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.N = animatorSet2;
            if (z10) {
                f10 = 0.81f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.f24276d0, f10));
            this.N.setDuration(200L);
            this.N.addListener(new hg.b0(22, this, z10));
            this.N.start();
            return;
        }
        if (z10) {
            f10 = 0.85f;
        }
        this.f24275c0 = f10;
        invalidate();
    }

    public final void d(int i9, TLRPC.Document document, Object obj) {
        this.h = false;
        this.f24280r = false;
        this.H = i9;
        this.E = null;
        this.f24277e = obj;
        this.G = document;
        this.I = null;
        this.L = true;
        this.f24282w = true;
        b();
        this.K = 2;
        requestLayout();
        this.f24271a0 = null;
        this.f24273b0 = false;
        this.W = false;
        f(false, false);
    }

    public final void e(TLRPC.BotInlineResult botInlineResult, TLRPC.User user, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.h = z11;
        this.f24280r = z12;
        this.F = user;
        this.E = botInlineResult;
        this.f24277e = botInlineResult;
        if (botInlineResult != null) {
            this.G = botInlineResult.document;
            this.I = botInlineResult.photo;
        } else {
            this.G = null;
            this.I = null;
        }
        this.L = z10;
        this.f24282w = z13;
        b();
        if (z13) {
            this.K = 2;
        }
        requestLayout();
        this.f24271a0 = null;
        this.f24273b0 = false;
        this.W = false;
        f(false, false);
    }

    public final void f(boolean z10, boolean z11) {
        boolean isLoadingHttpFile;
        String str = this.f24271a0;
        if (str == null && !this.W) {
            this.W = true;
            Utilities.searchQueue.postRunnable(new b2(this, z10));
            this.R.setIcon(4, z10, false);
        } else if (TextUtils.isEmpty(str)) {
            this.Q = -1;
            this.R.setIcon(4, z10, false);
        } else {
            if (this.G != null) {
                isLoadingHttpFile = FileLoader.getInstance(this.d).isLoadingFile(this.f24271a0);
            } else {
                isLoadingHttpFile = ImageLoader.getInstance().isLoadingHttpFile(this.f24271a0);
            }
            if (!isLoadingHttpFile && this.f24273b0) {
                DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
                int i9 = this.K;
                if (i9 != 5 && i9 != 3) {
                    this.Q = -1;
                } else {
                    boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.M);
                    if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                        this.Q = 1;
                    } else {
                        this.Q = 0;
                    }
                    this.R.o(1.0f, z11);
                }
            } else {
                DownloadController.getInstance(this.d).addLoadingFileObserver(this.f24271a0, this);
                int i10 = this.K;
                float f10 = 0.0f;
                if (i10 != 5 && i10 != 3) {
                    this.Q = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(this.f24271a0);
                    if (fileProgress != null) {
                        f10 = fileProgress.floatValue();
                    }
                    this.R.o(f10, false);
                } else if (!isLoadingHttpFile) {
                    this.Q = 2;
                } else {
                    this.Q = 4;
                    Float fileProgress2 = ImageLoader.getInstance().getFileProgress(this.f24271a0);
                    if (fileProgress2 != null) {
                        this.R.o(fileProgress2.floatValue(), z11);
                    } else {
                        this.R.o(0.0f, z11);
                    }
                }
            }
            this.R.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        }
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
        return this.f24277e;
    }

    public ImageReceiver getPhotoImage() {
        return this.f24270a;
    }

    public TLRPC.BotInlineResult getResult() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24270a.onAttachedToWindow()) {
            f(false, false);
        }
        this.R.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24270a.onDetachedFromWindow();
        this.R.f();
        DownloadController.getInstance(this.d).removeLoadingFileObserver(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        TLRPC.BotInlineResult botInlineResult;
        int i10;
        float f10;
        float f11;
        ImageReceiver imageReceiver = this.f24270a;
        dp dpVar = this.T;
        if (dpVar != null && (dpVar.f27781a.f26313q || !imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f || PhotoViewer.M1((MessageObject) this.f24277e))) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.O);
        }
        float f12 = 8.0f;
        if (this.B != null) {
            canvas.save();
            if (LocaleController.isRTL) {
                f11 = 8.0f;
            } else {
                f11 = AndroidUtilities.leftBaseline;
            }
            canvas.translate(AndroidUtilities.dp(f11), this.A);
            this.B.draw(canvas);
            canvas.restore();
        }
        StaticLayout staticLayout = this.D;
        org.telegram.ui.ActionBar.b6 b6Var = this.f24278f;
        if (staticLayout != null) {
            org.telegram.ui.ActionBar.f6.f23052g3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
            canvas.save();
            if (LocaleController.isRTL) {
                f10 = 8.0f;
            } else {
                f10 = AndroidUtilities.leftBaseline;
            }
            canvas.translate(AndroidUtilities.dp(f10), this.C);
            this.D.draw(canvas);
            canvas.restore();
        }
        if (this.f24284y != null) {
            org.telegram.ui.ActionBar.f6.f23052g3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J6, b6Var));
            canvas.save();
            if (!LocaleController.isRTL) {
                f12 = AndroidUtilities.leftBaseline;
            }
            canvas.translate(AndroidUtilities.dp(f12), this.f24283x);
            this.f24284y.draw(canvas);
            canvas.restore();
        }
        boolean z10 = this.L;
        RadialProgress2 radialProgress2 = this.R;
        if (!z10) {
            boolean z11 = this.f24272b;
            u70 u70Var = this.f24274c;
            if (z11 && !PhotoViewer.N1(this.E)) {
                u70Var.setAlpha((int) ((1.0f - imageReceiver.getCurrentAlpha()) * 255.0f));
            } else {
                u70Var.setAlpha(255);
            }
            int i11 = this.K;
            if (i11 != 3 && i11 != 5) {
                TLRPC.BotInlineResult botInlineResult2 = this.E;
                if (botInlineResult2 != null && botInlineResult2.type.equals("file")) {
                    int intrinsicWidth = org.telegram.ui.ActionBar.f6.f23160m4.getIntrinsicWidth();
                    int intrinsicHeight = org.telegram.ui.ActionBar.f6.f23160m4.getIntrinsicHeight();
                    int imageX = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth) / 2));
                    int imageY = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight) / 2));
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), u70.f32937j);
                    org.telegram.ui.ActionBar.f6.f23160m4.setBounds(imageX, imageY, intrinsicWidth + imageX, intrinsicHeight + imageY);
                    org.telegram.ui.ActionBar.f6.f23160m4.draw(canvas);
                } else {
                    TLRPC.BotInlineResult botInlineResult3 = this.E;
                    if (botInlineResult3 != null && (botInlineResult3.type.equals("audio") || this.E.type.equals("voice"))) {
                        int intrinsicWidth2 = org.telegram.ui.ActionBar.f6.f23177n4.getIntrinsicWidth();
                        int intrinsicHeight2 = org.telegram.ui.ActionBar.f6.f23177n4.getIntrinsicHeight();
                        int imageX2 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth2) / 2));
                        int imageY2 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight2) / 2));
                        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), u70.f32937j);
                        org.telegram.ui.ActionBar.f6.f23177n4.setBounds(imageX2, imageY2, intrinsicWidth2 + imageX2, intrinsicHeight2 + imageY2);
                        org.telegram.ui.ActionBar.f6.f23177n4.draw(canvas);
                    } else {
                        TLRPC.BotInlineResult botInlineResult4 = this.E;
                        if (botInlineResult4 != null && (botInlineResult4.type.equals("venue") || this.E.type.equals("geo"))) {
                            int intrinsicWidth3 = org.telegram.ui.ActionBar.f6.f23195o4.getIntrinsicWidth();
                            int intrinsicHeight3 = org.telegram.ui.ActionBar.f6.f23195o4.getIntrinsicHeight();
                            int imageX3 = (int) (imageReceiver.getImageX() + ((AndroidUtilities.dp(52.0f) - intrinsicWidth3) / 2));
                            int imageY3 = (int) (imageReceiver.getImageY() + ((AndroidUtilities.dp(52.0f) - intrinsicHeight3) / 2));
                            canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + AndroidUtilities.dp(52.0f), imageReceiver.getImageY() + AndroidUtilities.dp(52.0f), u70.f32937j);
                            org.telegram.ui.ActionBar.f6.f23195o4.setBounds(imageX3, imageY3, intrinsicWidth3 + imageX3, intrinsicHeight3 + imageY3);
                            org.telegram.ui.ActionBar.f6.f23195o4.draw(canvas);
                        } else {
                            u70Var.draw(canvas);
                        }
                    }
                }
            } else {
                if (this.f24279n) {
                    i10 = org.telegram.ui.ActionBar.f6.f23115jd;
                } else {
                    i10 = org.telegram.ui.ActionBar.f6.f23098id;
                }
                radialProgress2.d = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
                radialProgress2.draw(canvas);
            }
        } else {
            TLRPC.BotInlineResult botInlineResult5 = this.E;
            if (botInlineResult5 != null) {
                TLRPC.BotInlineMessage botInlineMessage = botInlineResult5.send_message;
                if ((botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) || (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue)) {
                    int intrinsicWidth4 = org.telegram.ui.ActionBar.f6.f23195o4.getIntrinsicWidth();
                    int intrinsicHeight4 = org.telegram.ui.ActionBar.f6.f23195o4.getIntrinsicHeight();
                    int A = (int) e2.c.A(imageReceiver.getImageWidth(), intrinsicWidth4, 2.0f, imageReceiver.getImageX());
                    int A2 = (int) e2.c.A(imageReceiver.getImageHeight(), intrinsicHeight4, 2.0f, imageReceiver.getImageY());
                    canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX() + imageReceiver.getImageWidth(), imageReceiver.getImageY() + imageReceiver.getImageHeight(), u70.f32937j);
                    org.telegram.ui.ActionBar.f6.f23195o4.setBounds(A, A2, intrinsicWidth4 + A, intrinsicHeight4 + A2);
                    org.telegram.ui.ActionBar.f6.f23195o4.draw(canvas);
                }
            }
        }
        if (this.f24272b) {
            if (this.E != null) {
                imageReceiver.setVisible(!PhotoViewer.N1(botInlineResult), false);
            }
            canvas.save();
            float f13 = this.f24275c0;
            pc pcVar = this.V;
            if (pcVar != null) {
                f13 *= pcVar.a(0.1f);
            }
            canvas.scale(f13, f13, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (this.L && ((i9 = this.K) == 7 || i9 == 2)) {
            radialProgress2.draw(canvas);
        }
        if (this.h && !this.L) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
            }
        }
        if (this.f24280r) {
            org.telegram.ui.ActionBar.f6.f23210p4.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(3.0f));
            org.telegram.ui.ActionBar.f6.f23210p4.draw(canvas);
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
        if (staticLayout != null && !TextUtils.isEmpty(staticLayout.getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        StaticLayout staticLayout2 = this.D;
        if (staticLayout2 != null && !TextUtils.isEmpty(staticLayout2.getText())) {
            z11 = true;
        } else {
            z11 = false;
        }
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
        dp dpVar = this.T;
        if (dpVar != null && dpVar.f27781a.f26313q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int i9 = this.K;
        if (i9 != 3 && i9 != 5) {
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
    public final void onProgressDownload(String str, long j10, long j11) {
        this.R.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        int i9 = this.K;
        if (i9 != 3 && i9 != 5) {
            if (this.Q != 1) {
                f(false, true);
            }
        } else if (this.Q != 4) {
            f(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.f24273b0 = true;
        this.R.o(1.0f, true);
        f(false, true);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.WebDocument webDocument;
        if (!this.L && this.U != null && this.E != null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            AndroidUtilities.dp(48.0f);
            int i9 = this.K;
            u70 u70Var = this.f24274c;
            boolean z10 = true;
            if (i9 != 3 && i9 != 5) {
                TLRPC.BotInlineResult botInlineResult = this.E;
                if (botInlineResult != null && (webDocument = botInlineResult.content) != null && !TextUtils.isEmpty(webDocument.url)) {
                    if (motionEvent.getAction() == 0) {
                        if (u70Var.getBounds().contains(x10, y10)) {
                            this.f24279n = true;
                        }
                    } else if (this.f24279n) {
                        if (motionEvent.getAction() == 1) {
                            this.f24279n = false;
                            playSoundEffect(0);
                            ((of.s0) this.U).f19499a.R.f32119b.k(getResult());
                        } else if (motionEvent.getAction() == 3) {
                            this.f24279n = false;
                        } else if (motionEvent.getAction() == 2 && !u70Var.getBounds().contains(x10, y10)) {
                            this.f24279n = false;
                        }
                    }
                }
                z10 = false;
            } else {
                boolean contains = u70Var.getBounds().contains(x10, y10);
                int action = motionEvent.getAction();
                RadialProgress2 radialProgress2 = this.R;
                if (action == 0) {
                    if (contains) {
                        this.f24279n = true;
                        radialProgress2.n(true, false);
                        invalidate();
                    }
                } else if (this.f24279n) {
                    if (motionEvent.getAction() == 1) {
                        this.f24279n = false;
                        playSoundEffect(0);
                        a();
                        invalidate();
                    } else if (motionEvent.getAction() == 3) {
                        this.f24279n = false;
                        invalidate();
                    } else if (motionEvent.getAction() == 2 && !contains) {
                        this.f24279n = false;
                        invalidate();
                    }
                    radialProgress2.n(this.f24279n, false);
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
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        int i10;
        if (i9 == 16 && ((i10 = this.K) == 3 || i10 == 5)) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i9, bundle);
    }

    public void setCanPreviewGif(boolean z10) {
        this.f24281s = z10;
    }

    public void setDelegate(d2 d2Var) {
        this.U = d2Var;
    }

    public void setIsKeyboard(boolean z10) {
        this.v = z10;
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        super.setPressed(z10);
        pc pcVar = this.V;
        if (pcVar != null) {
            if (!z10 && !this.S) {
                z11 = false;
            } else {
                z11 = true;
            }
            pcVar.c(z11);
        }
    }

    public void setScaled(boolean z10) {
        boolean z11;
        this.S = z10;
        pc pcVar = this.V;
        if (pcVar != null) {
            if (!isPressed() && !this.S) {
                z11 = false;
            } else {
                z11 = true;
            }
            pcVar.c(z11);
        }
    }

    public e2(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        int i9 = UserConfig.selectedAccount;
        this.d = i9;
        this.A = AndroidUtilities.dp(7.0f);
        this.C = AndroidUtilities.dp(27.0f);
        this.f24275c0 = 1.0f;
        this.f24276d0 = new c2(0, this);
        this.f24278f = b6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f24270a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setLayerNum(1);
        imageReceiver.setUseSharedAnimationQueue(true);
        this.f24274c = new u70(0, b6Var);
        this.R = new RadialProgress2(this, null);
        this.P = DownloadController.getInstance(i9).generateObserverTag();
        setFocusable(true);
        if (z10) {
            Paint paint = new Paint();
            this.O = paint;
            int i10 = org.telegram.ui.ActionBar.f6.Lh;
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
            dp dpVar = new dp(context, 21, b6Var);
            this.T = dpVar;
            dpVar.setVisibility(4);
            dpVar.b(-1, i10, org.telegram.ui.ActionBar.f6.f23128k7);
            dpVar.setDrawUnchecked(false);
            dpVar.setDrawBackgroundAsArc(1);
            addView(dpVar, g7.e6.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
