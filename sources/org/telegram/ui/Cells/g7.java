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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.h10;
public final class g7 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public MessageObject A;
    public boolean B;
    public boolean C;
    public final int D;
    public final SpannableStringBuilder E;
    public CharSequence F;
    public final xi0 G;
    public final org.telegram.ui.ActionBar.c6 H;
    public p00 I;
    public long J;
    public boolean K;
    public float L;
    public boolean M;
    public float N;
    public final ImageView f24405a;
    public final lh.y3 f24406b;
    public final TextView f24407c;
    public final TextView d;
    public final org.telegram.ui.Components.x5 f24408e;
    public final aj0 f24409f;
    public final i80 h;
    public final hp f24410n;
    public final TextView f24411r;
    public final TextView f24412s;
    public boolean v;
    public boolean f24413w;
    public final int f24414x;
    public final int f24415y;

    public g7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i11;
        float f9;
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
        this.f24414x = i31;
        this.N = 1.0f;
        this.H = c6Var;
        this.D = i10;
        this.f24415y = DownloadController.getInstance(i31).generateObserverTag();
        ImageView imageView = new ImageView(context);
        this.f24405a = imageView;
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
            addView(imageView, i7.f6.d(42, 42.0f, i32, f42, 12.0f, f43, 0.0f));
        } else {
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i33 = i11 | 48;
            if (z11) {
                f9 = 0.0f;
            } else {
                f9 = 12.0f;
            }
            if (z11) {
                f10 = 12.0f;
            } else {
                f10 = 0.0f;
            }
            addView(imageView, i7.f6.d(40, 40.0f, i33, f9, 8.0f, f10, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.Bi, c6Var, textView, 1, 14.0f);
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
            addView(textView, i7.f6.d(32, -2.0f, i34, f40, 28.0f, f41, 0.0f));
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
            addView(textView, i7.f6.d(32, -2.0f, i35, f11, 22.0f, f12, 0.0f));
        }
        lh.y3 y3Var = new lh.y3(this, context, 1);
        this.f24406b = y3Var;
        y3Var.setRoundRadius(AndroidUtilities.dp(4.0f));
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
            addView(y3Var, i7.f6.d(42, 42.0f, i36, f38, 12.0f, f39, 0.0f));
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
            addView(y3Var, i7.f6.d(40, 40.0f, i37, f13, 8.0f, f14, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.f24407c = textView2;
        int i38 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.b.w(i38, c6Var, textView2, 1, 16.0f);
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
            addView(textView2, i7.f6.d(-1, -2.0f, i39, f36, 9.0f, f37, 0.0f));
            f15 = 14.0f;
        } else if (i10 == 2) {
            LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
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
            addView(g10, i7.f6.d(-1, -2.0f, i40, f18, 5.0f, f19, 0.0f));
            TextView textView3 = new TextView(context);
            this.f24411r = textView3;
            org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.A6, c6Var, textView3, 1, 14.0f);
            f15 = 14.0f;
            if (!LocaleController.isRTL) {
                g10.addView(textView2, i7.f6.l(1.0f, -2, -2));
                g10.addView(textView3, i7.f6.m(0.0f, -2, -2, 4, 0, 0));
            } else {
                g10.addView(textView3, i7.f6.l(0.0f, -2, -2));
                g10.addView(textView2, i7.f6.m(1.0f, -2, -2, 0, 4, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.f24412s = textView4;
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i38, c6Var));
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
            addView(textView4, i7.f6.d(-1, -2.0f, i41, f20, 30.0f, f21, 0.0f));
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
            addView(textView2, i7.f6.d(-1, -2.0f, i42, f16, 5.0f, f17, 0.0f));
        }
        xi0 xi0Var = new xi0(R.raw.download_arrow, "download_arrow", AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), true, null);
        this.G = xi0Var;
        ?? imageView2 = new ImageView(context);
        this.f24409f = imageView2;
        imageView2.setAnimation(xi0Var);
        imageView2.setVisibility(4);
        int i43 = org.telegram.ui.ActionBar.g6.Ih;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i43, c6Var), PorterDuff.Mode.SRC_IN));
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
            addView((View) imageView2, i7.f6.d(14, 14.0f, i44, f34, 37.0f, f35, 0.0f));
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
            addView((View) imageView2, i7.f6.d(14, 14.0f, i45, f22, 33.0f, f23, 0.0f));
        }
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.f24408e = x5Var;
        x5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
        x5Var.setLines(1);
        x5Var.setMaxLines(1);
        x5Var.setSingleLine(true);
        x5Var.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i20 = 5;
        } else {
            i20 = 3;
        }
        x5Var.setGravity(i20 | 16);
        NotificationCenter.listenEmojiLoading(x5Var);
        if (i10 == 1) {
            x5Var.setTextSize(1, 13.0f);
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
            addView(x5Var, i7.f6.d(-1, -2.0f, i46, f32, 34.0f, f33, 0.0f));
        } else {
            x5Var.setTextSize(1, 13.0f);
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
            addView(x5Var, i7.f6.d(-1, -2.0f, i47, f24, 30.0f, f25, 0.0f));
        }
        i80 i80Var = new i80(context);
        this.h = i80Var;
        i80Var.setProgressColor(org.telegram.ui.ActionBar.g6.v0(i43, c6Var));
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
        addView(i80Var, i7.f6.d(-1, 2.0f, i48, f26, 54.0f, f27, 0.0f));
        hp hpVar = new hp(context, 21, c6Var);
        this.f24410n = hpVar;
        hpVar.setVisibility(4);
        hpVar.b(-1, org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.f23190k7);
        hpVar.setDrawUnchecked(false);
        hpVar.setDrawBackgroundAsArc(2);
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
            addView(hpVar, i7.f6.d(24, 24.0f, i49, f30, 36.0f, f31, 0.0f));
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
            addView(hpVar, i7.f6.d(24, 24.0f, i50, f28, 28.0f, f29, 0.0f));
        }
        if (i10 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.E = spannableStringBuilder;
            spannableStringBuilder.setSpan(new vs(), 0, 1, 0);
        }
    }

    public final void a(Canvas canvas) {
        if (this.f24413w) {
            canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.T0("paintDivider", this.H));
        }
    }

    public final void b(boolean z10, boolean z11) {
        hp hpVar = this.f24410n;
        if (hpVar.getVisibility() != 0) {
            hpVar.setVisibility(0);
        }
        hpVar.a(z10, z11);
    }

    public final void c(MessageObject messageObject, boolean z10) {
        boolean z11;
        String str;
        String str2;
        String str3;
        String lowerCase;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        boolean z12;
        boolean z13;
        String str4;
        String str5;
        String str6;
        MessageObject messageObject2 = this.A;
        if (messageObject2 != null && messageObject != null && messageObject2.getId() != messageObject.getId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24413w = z10;
        this.A = messageObject;
        this.C = false;
        this.B = false;
        if (!z11) {
            this.J = 0L;
        }
        TLRPC.Document document = messageObject.getDocument();
        TextView textView = this.f24412s;
        TextView textView2 = this.f24407c;
        ImageView imageView = this.f24405a;
        TextView textView3 = this.d;
        lh.y3 y3Var = this.f24406b;
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
            org.telegram.ui.ActionBar.c6 c6Var2 = this.H;
            CharSequence highlightText = AndroidUtilities.highlightText(str3, arrayList, c6Var2);
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
                c6Var = c6Var2;
                y3Var.setVisibility(4);
                y3Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                ImageReceiver imageReceiver = y3Var.getImageReceiver();
                if (closestPhotoSizeWithSize == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                imageReceiver.setNeedsQualityThumb(z12);
                ImageReceiver imageReceiver2 = y3Var.getImageReceiver();
                if (closestPhotoSizeWithSize == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                imageReceiver2.setShouldGenerateQualityThumb(z13);
                y3Var.setVisibility(0);
                if (messageObject.strippedThumb != null) {
                    c6Var = c6Var2;
                    y3Var.m(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", null, null, messageObject.strippedThumb, null, 1, messageObject);
                } else {
                    c6Var = c6Var2;
                    y3Var.k(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "40_40_b", 0L, null, messageObject, 1);
                }
            }
            e();
            if (messageObject.hasHighlightedWords() && !TextUtils.isEmpty(this.A.messageOwner.message)) {
                CharSequence highlightText2 = AndroidUtilities.highlightText(this.A.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.A.highlightedWords, c6Var);
                this.F = highlightText2;
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
            this.f24408e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            y3Var.setVisibility(4);
            y3Var.setImageBitmap(null);
            this.F = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.f24413w);
        this.h.a(0.0f, false);
        f(z11);
    }

    public final void d(boolean z10, String str, int i10, String str2, String str3, String str4) {
        int i11;
        int i12;
        this.f24407c.setText(str);
        this.f24408e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.f24413w = z10;
        ImageView imageView = this.f24405a;
        if (i10 == 0) {
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(str, str3, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i13 = this.D;
        lh.y3 y3Var = this.f24406b;
        if (str4 == null && i10 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i13 != 3) {
                y3Var.setImageBitmap(null);
                y3Var.setVisibility(4);
            }
        } else {
            if (str4 != null) {
                if (i13 != 3) {
                    y3Var.f(str4, "42_42", null);
                }
            } else {
                jq L = org.telegram.ui.ActionBar.g6.L(AndroidUtilities.dp(42.0f), i10);
                if (i10 == R.drawable.files_storage) {
                    i11 = org.telegram.ui.ActionBar.g6.f23245na;
                    i12 = org.telegram.ui.ActionBar.g6.f23156ia;
                } else if (i10 == R.drawable.files_gallery) {
                    i11 = org.telegram.ui.ActionBar.g6.f23210la;
                    i12 = org.telegram.ui.ActionBar.g6.f23156ia;
                } else if (i10 == R.drawable.files_music) {
                    i11 = org.telegram.ui.ActionBar.g6.f23192ka;
                    i12 = org.telegram.ui.ActionBar.g6.f23156ia;
                } else if (i10 == R.drawable.files_internal) {
                    i11 = org.telegram.ui.ActionBar.g6.f23174ja;
                    i12 = org.telegram.ui.ActionBar.g6.f23156ia;
                } else {
                    i11 = org.telegram.ui.ActionBar.g6.Ai;
                    i12 = org.telegram.ui.ActionBar.g6.zi;
                }
                org.telegram.ui.ActionBar.c6 c6Var = this.H;
                org.telegram.ui.ActionBar.g6.v1(L, org.telegram.ui.ActionBar.g6.v0(i11, c6Var), false);
                org.telegram.ui.ActionBar.g6.v1(L, org.telegram.ui.ActionBar.g6.v0(i12, c6Var), true);
                y3Var.setImageDrawable(L);
            }
            y3Var.setVisibility(0);
        }
        setWillNotDraw(!this.f24413w);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.N != 1.0f && this.I != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.N) * 255.0f), 31);
            this.I.setViewType(3);
            this.I.e();
            this.I.h();
            this.I.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.N * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
            a(canvas);
        }
        boolean z10 = this.K;
        if (!z10 && this.L == 0.0f) {
            return;
        }
        if (z10) {
            float f9 = this.L;
            if (f9 != 1.0f) {
                this.L = f9 + 0.10666667f;
                invalidate();
                this.L = Utilities.clamp(this.L, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f10 = this.L;
                canvas.scale(f10, f10, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.g6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.g6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f11 = this.L;
            if (f11 != 0.0f) {
                this.L = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.L = Utilities.clamp(this.L, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f102 = this.L;
        canvas.scale(f102, f102, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.g6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.g6.Z0.draw(canvas);
        canvas.restore();
    }

    public final void e() {
        String y8;
        MessageObject messageObject = this.A;
        if (messageObject != null && messageObject.getDocument() != null) {
            MessageObject messageObject2 = this.A;
            long j10 = messageObject2.messageOwner.date * 1000;
            long j11 = this.J;
            if (j11 == 0) {
                y8 = AndroidUtilities.formatFileSize(messageObject2.getDocument().size);
            } else {
                Locale locale = Locale.ENGLISH;
                y8 = a4.w.y(AndroidUtilities.formatFileSize(j11), " / ", AndroidUtilities.formatFileSize(this.A.getDocument().size));
            }
            int i10 = this.D;
            org.telegram.ui.Components.x5 x5Var = this.f24408e;
            if (i10 == 2) {
                x5Var.setText(new SpannableStringBuilder().append((CharSequence) y8).append(' ').append((CharSequence) this.E).append(' ').append(h10.d(this.A, true, 2, x5Var.getPaint())));
                this.f24411r.setText(LocaleController.stringForMessageListDate(this.A.messageOwner.date));
                return;
            }
            String formatString = LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10)));
            x5Var.setText(y8 + ", " + formatString);
        }
    }

    public final void f(boolean z10) {
        float f9;
        float f10;
        int i10;
        float f11;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) jr.f29800f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        MessageObject messageObject = this.A;
        float f12 = 72.0f;
        int i11 = this.f24414x;
        aj0 aj0Var = this.f24409f;
        i80 i80Var = this.h;
        float f13 = 8.0f;
        org.telegram.ui.Components.x5 x5Var = this.f24408e;
        if (messageObject != null && messageObject.messageOwner.media != null) {
            this.C = false;
            if (!messageObject.attachPathExists && !messageObject.mediaExists && this.v) {
                String attachFileName = FileLoader.getAttachFileName(messageObject.getDocument());
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName, this.A, this);
                this.B = FileLoader.getInstance(i11).isLoadingFile(attachFileName);
                aj0Var.setVisibility(0);
                int i12 = 15;
                if (this.B) {
                    i10 = 15;
                } else {
                    i10 = 0;
                }
                xi0 xi0Var = this.G;
                xi0Var.N(i10);
                xi0Var.h = true;
                if (z10) {
                    aj0Var.d();
                } else {
                    if (!this.B) {
                        i12 = 0;
                    }
                    xi0Var.K(i12);
                    aj0Var.invalidate();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
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
                    x5Var.requestLayout();
                }
                if (this.B) {
                    i80Var.setVisibility(0);
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress == null) {
                        fileProgress = Float.valueOf(0.0f);
                    }
                    i80Var.a(fileProgress.floatValue(), false);
                    return;
                }
                i80Var.setVisibility(4);
                return;
            }
            aj0Var.setVisibility(4);
            i80Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
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
                x5Var.requestLayout();
            }
            this.B = false;
            this.C = true;
            DownloadController.getInstance(i11).removeLoadingFileObserver(this);
            return;
        }
        this.B = false;
        this.C = true;
        i80Var.setVisibility(4);
        i80Var.a(0.0f, false);
        aj0Var.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
        if (layoutParams3 != null) {
            if (LocaleController.isRTL) {
                f9 = 8.0f;
            } else {
                f9 = 72.0f;
            }
            layoutParams3.leftMargin = AndroidUtilities.dp(f9);
            if (!LocaleController.isRTL) {
                f12 = 8.0f;
            }
            layoutParams3.rightMargin = AndroidUtilities.dp(f12);
            x5Var.requestLayout();
        }
        DownloadController.getInstance(i11).removeLoadingFileObserver(this);
    }

    public org.telegram.ui.Components.t9 getImageView() {
        return this.f24406b;
    }

    public MessageObject getMessage() {
        return this.A;
    }

    @Override
    public int getObserverTag() {
        return this.f24415y;
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
        DownloadController.getInstance(this.f24414x).removeLoadingFileObserver(this);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        f(true);
        this.J = 0L;
        e();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        hp hpVar = this.f24410n;
        if (hpVar.f29211a.f26324q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(hpVar.f29211a.f26324q);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.D != 1) {
            TextView textView = this.f24407c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.f24412s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - AndroidUtilities.dp(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.x3.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.x5 x5Var = this.f24408e;
                x5Var.layout(x5Var.getLeft(), x5Var.getTop() + measuredHeight, x5Var.getRight(), x5Var.getBottom() + measuredHeight);
                aj0 aj0Var = this.f24409f;
                aj0Var.layout(aj0Var.getLeft(), aj0Var.getTop() + measuredHeight, aj0Var.getRight(), aj0Var.getBottom() + measuredHeight);
                i80 i80Var = this.h;
                i80Var.layout(i80Var.getLeft(), (getMeasuredHeight() - i80Var.getMeasuredHeight()) - (this.f24413w ? 1 : 0), i80Var.getRight(), getMeasuredHeight() - (this.f24413w ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12 = this.D;
        if (i12 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f24413w ? 1 : 0), 1073741824));
        } else if (i12 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            int measuredHeight = this.f24407c.getMeasuredHeight() + AndroidUtilities.dp(34.0f) + (this.f24413w ? 1 : 0);
            if (this.F != null && (textView = this.f24412s) != null && this.A.hasHighlightedWords()) {
                this.M = true;
                textView.setText(AndroidUtilities.ellipsizeCenterEnd(this.F, this.A.highlightedWords.get(0), textView.getMeasuredWidth(), textView.getPaint(), 130));
                this.M = false;
                measuredHeight = org.telegram.messenger.x3.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        i80 i80Var = this.h;
        if (i80Var.getVisibility() != 0) {
            f(true);
        }
        this.J = j10;
        e();
        i80Var.a(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.h.a(1.0f, true);
        f(true);
        this.J = 0L;
        e();
    }

    @Override
    public final void requestLayout() {
        if (this.M) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawDownloadIcon(boolean z10) {
        this.v = z10;
    }

    public void setEnterAnimationAlpha(float f9) {
        if (this.N != f9) {
            this.N = f9;
            invalidate();
        }
    }

    public void setGlobalGradientView(p00 p00Var) {
        this.I = p00Var;
    }

    public void setPhoto(String str) {
        boolean endsWith = str.endsWith("mp4");
        lh.y3 y3Var = this.f24406b;
        if (endsWith) {
            y3Var.f("vthumb://0:".concat(str), null, null);
            y3Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            y3Var.setVisibility(8);
        } else {
            y3Var.f("thumb://0:".concat(str), null, null);
            y3Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(MediaController.PhotoEntry photoEntry) {
        String str;
        String str2 = photoEntry.thumbPath;
        lh.y3 y3Var = this.f24406b;
        if (str2 != null) {
            y3Var.f(str2, null, org.telegram.ui.ActionBar.g6.R4);
            str = photoEntry.thumbPath;
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                y3Var.q(0, true);
                y3Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
            } else {
                y3Var.p(photoEntry.orientation, photoEntry.invert, true);
                y3Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
            }
            str = photoEntry.path;
        } else {
            y3Var.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
            str = "";
        }
        File file = new File(str);
        this.f24407c.setText(file.getName());
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
        this.f24408e.setText(sb2);
        this.f24405a.setVisibility(8);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
