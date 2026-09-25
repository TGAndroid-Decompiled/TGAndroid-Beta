package org.telegram.ui.Cells;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.x80;
import org.telegram.ui.t10;
public final class k7 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public MessageObject E;
    public boolean F;
    public boolean G;
    public final int H;
    public final SpannableStringBuilder I;
    public CharSequence J;
    public final ij0 K;
    public final org.telegram.ui.ActionBar.d6 L;
    public u00 M;
    public long N;
    public boolean O;
    public float P;
    public boolean Q;
    public float R;
    public final ImageView f20584a;
    public final ai.y5 f20585b;
    public final TextView f20586c;
    public final TextView d;
    public final org.telegram.ui.Components.y5 e;
    public final lj0 f20587f;
    public final x80 h;
    public final op f20588n;
    public final TextView f20589r;
    public final TextView f20590s;
    public boolean v;
    public boolean f20591w;
    public final int f20592x;
    public final int f20593y;

    public k7(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i11;
        float f7;
        float f10;
        int i12;
        float f11;
        float f12;
        int i13;
        float f13;
        float f14;
        int i14;
        float f15;
        int i15;
        float f16;
        float f17;
        int i16;
        float f18;
        float f19;
        int i17;
        int i18;
        float f20;
        float f21;
        int i19;
        float f22;
        float f23;
        int i20;
        int i21;
        float f24;
        float f25;
        int i22;
        float f26;
        float f27;
        int i23;
        float f28;
        float f29;
        int i24;
        float f30;
        float f31;
        int i25;
        float f32;
        float f33;
        int i26;
        float f34;
        float f35;
        int i27;
        float f36;
        float f37;
        int i28;
        float f38;
        float f39;
        int i29;
        float f40;
        float f41;
        int i30;
        float f42;
        float f43;
        this.v = true;
        int i31 = UserConfig.selectedAccount;
        this.f20592x = i31;
        this.R = 1.0f;
        this.L = d6Var;
        this.H = i10;
        this.f20593y = DownloadController.getInstance(i31).generateObserverTag();
        ImageView imageView = new ImageView(context);
        this.f20584a = imageView;
        if (i10 == 1) {
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i30 = 5;
            } else {
                i30 = 3;
            }
            int i32 = i30 | 48;
            if (z10) {
                f42 = 0.0f;
            } else {
                f42 = 15.0f;
            }
            if (z10) {
                f43 = 15.0f;
            } else {
                f43 = 0.0f;
            }
            addView(imageView, w7.y5.d(42, 42.0f, i32, f42, 12.0f, f43, 0.0f));
        } else {
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i33 = i11 | 48;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = 12.0f;
            }
            if (z11) {
                f10 = 12.0f;
            } else {
                f10 = 0.0f;
            }
            addView(imageView, w7.y5.d(40, 40.0f, i33, f7, 8.0f, f10, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        c1.p(org.telegram.ui.ActionBar.h6.Bi, d6Var, textView, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i10 == 1) {
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i29 = 5;
            } else {
                i29 = 3;
            }
            int i34 = i29 | 48;
            if (z12) {
                f40 = 0.0f;
            } else {
                f40 = 20.0f;
            }
            if (z12) {
                f41 = 20.0f;
            } else {
                f41 = 0.0f;
            }
            addView(textView, w7.y5.d(32, -2.0f, i34, f40, 28.0f, f41, 0.0f));
        } else {
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i35 = i12 | 48;
            if (z13) {
                f11 = 0.0f;
            } else {
                f11 = 16.0f;
            }
            if (z13) {
                f12 = 16.0f;
            } else {
                f12 = 0.0f;
            }
            addView(textView, w7.y5.d(32, -2.0f, i35, f11, 22.0f, f12, 0.0f));
        }
        ai.y5 y5Var = new ai.y5(this, context, 2);
        this.f20585b = y5Var;
        y5Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        if (i10 == 1) {
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i28 = 5;
            } else {
                i28 = 3;
            }
            int i36 = i28 | 48;
            if (z14) {
                f38 = 0.0f;
            } else {
                f38 = 16.0f;
            }
            if (z14) {
                f39 = 16.0f;
            } else {
                f39 = 0.0f;
            }
            addView(y5Var, w7.y5.d(42, 42.0f, i36, f38, 12.0f, f39, 0.0f));
        } else {
            boolean z15 = LocaleController.isRTL;
            if (z15) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i37 = i13 | 48;
            if (z15) {
                f13 = 0.0f;
            } else {
                f13 = 12.0f;
            }
            if (z15) {
                f14 = 12.0f;
            } else {
                f14 = 0.0f;
            }
            addView(y5Var, w7.y5.d(40, 40.0f, i37, f13, 8.0f, f14, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.f20586c = textView2;
        int i38 = org.telegram.ui.ActionBar.h6.G6;
        c1.p(i38, d6Var, textView2, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView2.setGravity(i14 | 16);
        if (i10 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z16 = LocaleController.isRTL;
            if (z16) {
                i27 = 5;
            } else {
                i27 = 3;
            }
            int i39 = i27 | 48;
            if (z16) {
                f36 = 8.0f;
            } else {
                f36 = 72.0f;
            }
            if (z16) {
                f37 = 72.0f;
            } else {
                f37 = 8.0f;
            }
            addView(textView2, w7.y5.d(-1, -2.0f, i39, f36, 9.0f, f37, 0.0f));
            f15 = 14.0f;
        } else if (i10 == 2) {
            LinearLayout f44 = ok.f(context, 0);
            boolean z17 = LocaleController.isRTL;
            if (z17) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i40 = i16 | 48;
            if (z17) {
                f18 = 16.0f;
            } else {
                f18 = 72.0f;
            }
            if (z17) {
                f19 = 72.0f;
            } else {
                f19 = 16.0f;
            }
            addView(f44, w7.y5.d(-1, -2.0f, i40, f18, 5.0f, f19, 0.0f));
            TextView textView3 = new TextView(context);
            this.f20589r = textView3;
            ok.n(org.telegram.ui.ActionBar.h6.A6, d6Var, textView3, 1, 14.0f);
            f15 = 14.0f;
            if (!LocaleController.isRTL) {
                f44.addView(textView2, w7.y5.l(1.0f, -2, -2));
                f44.addView(textView3, w7.y5.m(0.0f, -2, -2, 4, 0, 0));
            } else {
                f44.addView(textView3, w7.y5.l(0.0f, -2, -2));
                f44.addView(textView2, w7.y5.m(1.0f, -2, -2, 0, 4, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.f20590s = textView4;
            textView4.setTextColor(org.telegram.ui.ActionBar.h6.v0(i38, d6Var));
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            if (LocaleController.isRTL) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            textView4.setGravity(i17 | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z18 = LocaleController.isRTL;
            if (z18) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            int i41 = i18 | 48;
            if (z18) {
                f20 = 8.0f;
            } else {
                f20 = 72.0f;
            }
            if (z18) {
                f21 = 72.0f;
            } else {
                f21 = 8.0f;
            }
            addView(textView4, w7.y5.d(-1, -2.0f, i41, f20, 30.0f, f21, 0.0f));
            textView4.setVisibility(8);
        } else {
            f15 = 14.0f;
            textView2.setMaxLines(1);
            boolean z19 = LocaleController.isRTL;
            if (z19) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i42 = i15 | 48;
            if (z19) {
                f16 = 8.0f;
            } else {
                f16 = 72.0f;
            }
            if (z19) {
                f17 = 72.0f;
            } else {
                f17 = 8.0f;
            }
            addView(textView2, w7.y5.d(-1, -2.0f, i42, f16, 5.0f, f17, 0.0f));
        }
        ij0 ij0Var = new ij0(R.raw.download_arrow, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), true, null);
        this.K = ij0Var;
        ?? imageView2 = new ImageView(context);
        this.f20587f = imageView2;
        imageView2.setAnimation(ij0Var);
        imageView2.setVisibility(4);
        int i43 = org.telegram.ui.ActionBar.h6.Ih;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i43, d6Var), PorterDuff.Mode.SRC_IN));
        if (i10 == 1) {
            boolean z20 = LocaleController.isRTL;
            if (z20) {
                i26 = 5;
            } else {
                i26 = 3;
            }
            int i44 = i26 | 48;
            if (z20) {
                f34 = 8.0f;
            } else {
                f34 = 70.0f;
            }
            if (z20) {
                f35 = 72.0f;
            } else {
                f35 = 8.0f;
            }
            addView((View) imageView2, w7.y5.d(14, 14.0f, i44, f34, 37.0f, f35, 0.0f));
        } else {
            boolean z21 = LocaleController.isRTL;
            if (z21) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            int i45 = i19 | 48;
            if (z21) {
                f22 = 8.0f;
            } else {
                f22 = 70.0f;
            }
            if (z21) {
                f23 = 72.0f;
            } else {
                f23 = 8.0f;
            }
            addView((View) imageView2, w7.y5.d(14, 14.0f, i45, f22, 33.0f, f23, 0.0f));
        }
        org.telegram.ui.Components.y5 y5Var2 = new org.telegram.ui.Components.y5(context);
        this.e = y5Var2;
        y5Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, d6Var));
        y5Var2.setLines(1);
        y5Var2.setMaxLines(1);
        y5Var2.setSingleLine(true);
        y5Var2.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i20 = 5;
        } else {
            i20 = 3;
        }
        y5Var2.setGravity(i20 | 16);
        NotificationCenter.listenEmojiLoading(y5Var2);
        if (i10 == 1) {
            y5Var2.setTextSize(1, 13.0f);
            boolean z22 = LocaleController.isRTL;
            if (z22) {
                i25 = 5;
            } else {
                i25 = 3;
            }
            int i46 = i25 | 48;
            if (z22) {
                f32 = 8.0f;
            } else {
                f32 = 72.0f;
            }
            if (z22) {
                f33 = 72.0f;
            } else {
                f33 = 8.0f;
            }
            addView(y5Var2, w7.y5.d(-1, -2.0f, i46, f32, 34.0f, f33, 0.0f));
        } else {
            y5Var2.setTextSize(1, 13.0f);
            boolean z23 = LocaleController.isRTL;
            if (z23) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            int i47 = i21 | 48;
            if (z23) {
                f24 = 8.0f;
            } else {
                f24 = 72.0f;
            }
            if (z23) {
                f25 = 72.0f;
            } else {
                f25 = 8.0f;
            }
            addView(y5Var2, w7.y5.d(-1, -2.0f, i47, f24, 30.0f, f25, 0.0f));
        }
        x80 x80Var = new x80(context);
        this.h = x80Var;
        x80Var.setProgressColor(org.telegram.ui.ActionBar.h6.v0(i43, d6Var));
        boolean z24 = LocaleController.isRTL;
        if (z24) {
            i22 = 5;
        } else {
            i22 = 3;
        }
        int i48 = i22 | 48;
        if (z24) {
            f26 = 0.0f;
        } else {
            f26 = 72.0f;
        }
        if (z24) {
            f27 = 72.0f;
        } else {
            f27 = 0.0f;
        }
        addView(x80Var, w7.y5.d(-1, 2.0f, i48, f26, 54.0f, f27, 0.0f));
        op opVar = new op(context, 21, d6Var);
        this.f20588n = opVar;
        opVar.setVisibility(4);
        opVar.b(-1, org.telegram.ui.ActionBar.h6.f19060d6, org.telegram.ui.ActionBar.h6.f19188k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(2);
        if (i10 == 1) {
            boolean z25 = LocaleController.isRTL;
            if (z25) {
                i24 = 5;
            } else {
                i24 = 3;
            }
            int i49 = i24 | 48;
            if (z25) {
                f30 = 0.0f;
            } else {
                f30 = 38.0f;
            }
            if (z25) {
                f31 = 38.0f;
            } else {
                f31 = 0.0f;
            }
            addView(opVar, w7.y5.d(24, 24.0f, i49, f30, 36.0f, f31, 0.0f));
        } else {
            boolean z26 = LocaleController.isRTL;
            if (z26) {
                i23 = 5;
            } else {
                i23 = 3;
            }
            int i50 = i23 | 48;
            if (z26) {
                f28 = 0.0f;
            } else {
                f28 = 33.0f;
            }
            if (z26) {
                f29 = 33.0f;
            } else {
                f29 = 0.0f;
            }
            addView(opVar, w7.y5.d(24, 24.0f, i50, f28, 28.0f, f29, 0.0f));
        }
        if (i10 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.I = spannableStringBuilder;
            spannableStringBuilder.setSpan(new ct(), 0, 1, 0);
        }
    }

    public final void a(Canvas canvas) {
        if (this.f20591w) {
            canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.T0("paintDivider", this.L));
        }
    }

    public final void b(boolean z10, boolean z11) {
        op opVar = this.f20588n;
        if (opVar.getVisibility() != 0) {
            opVar.setVisibility(0);
        }
        opVar.a(z10, z11);
    }

    public final void c(MessageObject messageObject, boolean z10) {
        boolean z11;
        String str;
        String str2;
        String str3;
        String lowerCase;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        boolean z12;
        boolean z13;
        String str4;
        String str5;
        String str6;
        MessageObject messageObject2 = this.E;
        if (messageObject2 != null && messageObject != null && messageObject2.getId() != messageObject.getId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f20591w = z10;
        this.E = messageObject;
        this.G = false;
        this.F = false;
        if (!z11) {
            this.N = 0L;
        }
        TLRPC.Document document = messageObject.getDocument();
        TextView textView = this.f20590s;
        TextView textView2 = this.f20586c;
        ImageView imageView = this.f20584a;
        TextView textView3 = this.d;
        ai.y5 y5Var = this.f20585b;
        if (document != null) {
            if (messageObject.isMusic()) {
                str = null;
                for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str5 = documentAttribute.performer) != null && str5.length() != 0) || ((str6 = documentAttribute.title) != null && str6.length() != 0))) {
                        str = messageObject.getMusicAuthor() + " - " + messageObject.getMusicTitle();
                    }
                }
            } else {
                str = null;
            }
            if (!messageObject.isVideo() && !(messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) && !MessageObject.isGifDocument(document)) {
                str2 = FileLoader.getDocumentFileName(document);
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) && (str4 = document.mime_type) != null) {
                if (str4.startsWith("video")) {
                    if (MessageObject.isGifDocument(document)) {
                        str2 = LocaleController.getString(R.string.AttachGif);
                    } else {
                        str2 = LocaleController.getString(R.string.AttachVideo);
                    }
                } else if (document.mime_type.startsWith("image")) {
                    if (MessageObject.isGifDocument(document)) {
                        str2 = LocaleController.getString(R.string.AttachGif);
                    } else {
                        str2 = LocaleController.getString(R.string.AttachPhoto);
                    }
                } else if (document.mime_type.startsWith("audio")) {
                    str2 = LocaleController.getString(R.string.AttachAudio);
                } else {
                    str2 = LocaleController.getString(R.string.AttachDocument);
                }
            }
            if (str == null) {
                str3 = str2;
            } else {
                str3 = str;
            }
            ArrayList<String> arrayList = messageObject.highlightedWords;
            org.telegram.ui.ActionBar.d6 d6Var2 = this.L;
            CharSequence highlightText = AndroidUtilities.highlightText(str3, arrayList, d6Var2);
            if (highlightText != null) {
                textView2.setText(highlightText);
            } else {
                textView2.setText(str3);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(str2, document.mime_type, false));
            int lastIndexOf = str2.lastIndexOf(46);
            if (lastIndexOf == -1) {
                lowerCase = "";
            } else {
                lowerCase = str2.substring(lastIndexOf + 1).toLowerCase();
            }
            textView3.setText(lowerCase);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40);
            if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                closestPhotoSizeWithSize = null;
            }
            if ((closestPhotoSizeWithSize2 instanceof TLRPC.TL_photoSizeEmpty) || closestPhotoSizeWithSize2 == null) {
                d6Var = d6Var2;
                y5Var.setVisibility(4);
                y5Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                ImageReceiver imageReceiver = y5Var.getImageReceiver();
                if (closestPhotoSizeWithSize == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                imageReceiver.setNeedsQualityThumb(z12);
                ImageReceiver imageReceiver2 = y5Var.getImageReceiver();
                if (closestPhotoSizeWithSize == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                imageReceiver2.setShouldGenerateQualityThumb(z13);
                y5Var.setVisibility(0);
                if (messageObject.strippedThumb != null) {
                    d6Var = d6Var2;
                    y5Var.m(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", null, null, messageObject.strippedThumb, null, 1, messageObject);
                } else {
                    d6Var = d6Var2;
                    y5Var.k(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "40_40_b", 0L, null, messageObject, 1);
                }
            }
            e();
            if (messageObject.hasHighlightedWords() && !TextUtils.isEmpty(this.E.messageOwner.message)) {
                CharSequence highlightText2 = AndroidUtilities.highlightText(this.E.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.E.highlightedWords, d6Var);
                this.J = highlightText2;
                if (textView != null) {
                    if (highlightText2 == null) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    textView.setVisibility(i10);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            textView2.setText("");
            textView3.setText("");
            this.e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            y5Var.setVisibility(4);
            y5Var.setImageBitmap(null);
            this.J = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.f20591w);
        this.h.a(0.0f, false);
        f(z11);
    }

    public final void d(String str, String str2, String str3, String str4, int i10, boolean z10) {
        int i11;
        int i12;
        this.f20586c.setText(str);
        this.e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.f20591w = z10;
        ImageView imageView = this.f20584a;
        if (i10 == 0) {
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(str, str3, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i13 = this.H;
        ai.y5 y5Var = this.f20585b;
        if (str4 == null && i10 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i13 != 3) {
                y5Var.setImageBitmap(null);
                y5Var.setVisibility(4);
            }
        } else {
            if (str4 != null) {
                if (i13 != 3) {
                    y5Var.f(str4, "42_42", null);
                }
            } else {
                qq L = org.telegram.ui.ActionBar.h6.L(AndroidUtilities.dp(42.0f), i10);
                if (i10 == R.drawable.files_storage) {
                    i11 = org.telegram.ui.ActionBar.h6.f19248na;
                    i12 = org.telegram.ui.ActionBar.h6.f19153ia;
                } else if (i10 == R.drawable.files_gallery) {
                    i11 = org.telegram.ui.ActionBar.h6.f19209la;
                    i12 = org.telegram.ui.ActionBar.h6.f19153ia;
                } else if (i10 == R.drawable.files_music) {
                    i11 = org.telegram.ui.ActionBar.h6.f19191ka;
                    i12 = org.telegram.ui.ActionBar.h6.f19153ia;
                } else if (i10 == R.drawable.files_internal) {
                    i11 = org.telegram.ui.ActionBar.h6.f19171ja;
                    i12 = org.telegram.ui.ActionBar.h6.f19153ia;
                } else {
                    i11 = org.telegram.ui.ActionBar.h6.Ai;
                    i12 = org.telegram.ui.ActionBar.h6.zi;
                }
                org.telegram.ui.ActionBar.d6 d6Var = this.L;
                org.telegram.ui.ActionBar.h6.v1(L, org.telegram.ui.ActionBar.h6.v0(i11, d6Var), false);
                org.telegram.ui.ActionBar.h6.v1(L, org.telegram.ui.ActionBar.h6.v0(i12, d6Var), true);
                y5Var.setImageDrawable(L);
            }
            y5Var.setVisibility(0);
        }
        setWillNotDraw(true ^ this.f20591w);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.R != 1.0f && this.M != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.R) * 255.0f), 31);
            this.M.setViewType(3);
            this.M.e();
            this.M.h();
            this.M.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.R * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
            a(canvas);
        }
        boolean z10 = this.O;
        if (!z10 && this.P == 0.0f) {
            return;
        }
        if (z10) {
            float f7 = this.P;
            if (f7 != 1.0f) {
                this.P = f7 + 0.10666667f;
                invalidate();
                this.P = Utilities.clamp(this.P, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.h6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.h6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f10 = this.P;
                canvas.scale(f10, f10, (org.telegram.ui.ActionBar.h6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.h6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.h6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.h6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.h6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f11 = this.P;
            if (f11 != 0.0f) {
                this.P = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.P = Utilities.clamp(this.P, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.h6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.h6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f102 = this.P;
        canvas.scale(f102, f102, (org.telegram.ui.ActionBar.h6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.h6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.h6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.h6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.h6.Z0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String D;
        MessageObject messageObject = this.E;
        if (messageObject != null && messageObject.getDocument() != null) {
            MessageObject messageObject2 = this.E;
            long j3 = messageObject2.messageOwner.date * 1000;
            long j10 = this.N;
            if (j10 == 0) {
                D = AndroidUtilities.formatFileSize(messageObject2.getDocument().size);
            } else {
                Locale locale = Locale.ENGLISH;
                D = a4.a.D(AndroidUtilities.formatFileSize(j10), " / ", AndroidUtilities.formatFileSize(this.E.getDocument().size));
            }
            int i10 = this.H;
            org.telegram.ui.Components.y5 y5Var = this.e;
            if (i10 == 2) {
                y5Var.setText(new SpannableStringBuilder().append((CharSequence) D).append(' ').append((CharSequence) this.I).append(' ').append(t10.d(this.E, true, 2, y5Var.getPaint())));
                this.f20589r.setText(LocaleController.stringForMessageListDate(this.E.messageOwner.date));
                return;
            }
            String formatString = LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(new Date(j3)), LocaleController.getInstance().getFormatterDay().format(new Date(j3)));
            y5Var.setText(D + ", " + formatString);
        }
    }

    public final void f(boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) rr.f28031f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        MessageObject messageObject = this.E;
        float f12 = 72.0f;
        int i11 = this.f20592x;
        lj0 lj0Var = this.f20587f;
        x80 x80Var = this.h;
        float f13 = 8.0f;
        org.telegram.ui.Components.y5 y5Var = this.e;
        if (messageObject != null && messageObject.messageOwner.media != null) {
            this.G = false;
            if (!messageObject.attachPathExists && !messageObject.mediaExists && this.v) {
                String attachFileName = FileLoader.getAttachFileName(messageObject.getDocument());
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName, this.E, this);
                this.F = FileLoader.getInstance(i11).isLoadingFile(attachFileName);
                lj0Var.setVisibility(0);
                int i12 = 15;
                if (this.F) {
                    i10 = 15;
                } else {
                    i10 = 0;
                }
                ij0 ij0Var = this.K;
                ij0Var.P(i10);
                ij0Var.h = true;
                if (z10) {
                    lj0Var.d();
                } else {
                    if (!this.F) {
                        i12 = 0;
                    }
                    ij0Var.M(i12);
                    lj0Var.invalidate();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y5Var.getLayoutParams();
                if (layoutParams != null) {
                    if (LocaleController.isRTL) {
                        f11 = 8.0f;
                    } else {
                        f11 = 86.0f;
                    }
                    layoutParams.leftMargin = AndroidUtilities.dp(f11);
                    if (LocaleController.isRTL) {
                        f13 = 86.0f;
                    }
                    layoutParams.rightMargin = AndroidUtilities.dp(f13);
                    y5Var.requestLayout();
                }
                if (this.F) {
                    x80Var.setVisibility(0);
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress == null) {
                        fileProgress = Float.valueOf(0.0f);
                    }
                    x80Var.a(fileProgress.floatValue(), false);
                    return;
                }
                x80Var.setVisibility(4);
                return;
            }
            lj0Var.setVisibility(4);
            x80Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) y5Var.getLayoutParams();
            if (layoutParams2 != null) {
                if (LocaleController.isRTL) {
                    f10 = 8.0f;
                } else {
                    f10 = 72.0f;
                }
                layoutParams2.leftMargin = AndroidUtilities.dp(f10);
                if (!LocaleController.isRTL) {
                    f12 = 8.0f;
                }
                layoutParams2.rightMargin = AndroidUtilities.dp(f12);
                y5Var.requestLayout();
            }
            this.F = false;
            this.G = true;
            DownloadController.getInstance(i11).removeLoadingFileObserver(this);
            return;
        }
        this.F = false;
        this.G = true;
        x80Var.setVisibility(4);
        x80Var.a(0.0f, false);
        lj0Var.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) y5Var.getLayoutParams();
        if (layoutParams3 != null) {
            if (LocaleController.isRTL) {
                f7 = 8.0f;
            } else {
                f7 = 72.0f;
            }
            layoutParams3.leftMargin = AndroidUtilities.dp(f7);
            if (!LocaleController.isRTL) {
                f12 = 8.0f;
            }
            layoutParams3.rightMargin = AndroidUtilities.dp(f12);
            y5Var.requestLayout();
        }
        DownloadController.getInstance(i11).removeLoadingFileObserver(this);
    }

    public org.telegram.ui.Components.w9 getImageView() {
        return this.f20585b;
    }

    public MessageObject getMessage() {
        return this.E;
    }

    @Override
    public int getObserverTag() {
        return this.f20593y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h.getVisibility() == 0) {
            f(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DownloadController.getInstance(this.f20592x).removeLoadingFileObserver(this);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        f(true);
        this.N = 0L;
        e();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        op opVar = this.f20588n;
        if (opVar.f27168a.f22195q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(opVar.f27168a.f22195q);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.H != 1) {
            TextView textView = this.f20586c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.f20590s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - AndroidUtilities.dp(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.f0.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.y5 y5Var = this.e;
                y5Var.layout(y5Var.getLeft(), y5Var.getTop() + measuredHeight, y5Var.getRight(), y5Var.getBottom() + measuredHeight);
                lj0 lj0Var = this.f20587f;
                lj0Var.layout(lj0Var.getLeft(), lj0Var.getTop() + measuredHeight, lj0Var.getRight(), lj0Var.getBottom() + measuredHeight);
                x80 x80Var = this.h;
                x80Var.layout(x80Var.getLeft(), (getMeasuredHeight() - x80Var.getMeasuredHeight()) - (this.f20591w ? 1 : 0), x80Var.getRight(), getMeasuredHeight() - (this.f20591w ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12 = this.H;
        if (i12 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f20591w ? 1 : 0), 1073741824));
        } else if (i12 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            int measuredHeight = this.f20586c.getMeasuredHeight() + AndroidUtilities.dp(34.0f) + (this.f20591w ? 1 : 0);
            if (this.J != null && (textView = this.f20590s) != null && this.E.hasHighlightedWords()) {
                this.Q = true;
                textView.setText(AndroidUtilities.ellipsizeCenterEnd(this.J, this.E.highlightedWords.get(0), textView.getMeasuredWidth(), textView.getPaint(), 130));
                this.Q = false;
                measuredHeight = org.telegram.messenger.f0.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        x80 x80Var = this.h;
        if (x80Var.getVisibility() != 0) {
            f(true);
        }
        this.N = j3;
        e();
        x80Var.a(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.h.a(1.0f, true);
        f(true);
        this.N = 0L;
        e();
    }

    @Override
    public final void requestLayout() {
        if (this.Q) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawDownloadIcon(boolean z10) {
        this.v = z10;
    }

    public void setEnterAnimationAlpha(float f7) {
        if (this.R != f7) {
            this.R = f7;
            invalidate();
        }
    }

    public void setGlobalGradientView(u00 u00Var) {
        this.M = u00Var;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        ai.y5 y5Var = this.f20585b;
        if (endsWith) {
            y5Var.f("vthumb://0:".concat(str), null, null);
            y5Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            y5Var.setVisibility(8);
        } else {
            y5Var.f("thumb://0:".concat(str), null, null);
            y5Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(MediaController.PhotoEntry photoEntry) {
        String str;
        String str2 = photoEntry.thumbPath;
        ai.y5 y5Var = this.f20585b;
        if (str2 != null) {
            y5Var.f(str2, null, org.telegram.ui.ActionBar.h6.R4);
            str = photoEntry.thumbPath;
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                y5Var.q(0, true);
                y5Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.h6.R4);
            } else {
                y5Var.p(photoEntry.orientation, photoEntry.invert, true);
                y5Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.h6.R4);
            }
            str = photoEntry.path;
        } else {
            y5Var.setImageDrawable(org.telegram.ui.ActionBar.h6.R4);
            str = "";
        }
        File file = new File(str);
        this.f20586c.setText(file.getName());
        FileLoader.getFileExtension(file);
        this.d.setVisibility(8);
        StringBuilder sb2 = new StringBuilder();
        if (photoEntry.width != 0 && photoEntry.height != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            Locale locale = Locale.US;
            int i10 = photoEntry.width;
            int i11 = photoEntry.height;
            sb2.append(i10 + "x" + i11);
        }
        if (photoEntry.isVideo) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(AndroidUtilities.formatShortDuration(photoEntry.duration));
        }
        if (photoEntry.size != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(AndroidUtilities.formatFileSize(photoEntry.size));
        }
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        sb2.append(LocaleController.getInstance().getFormatterStats().format(photoEntry.dateTaken));
        this.e.setText(sb2);
        this.f20584a.setVisibility(8);
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
