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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.i10;

public final class f7 extends FrameLayout implements DownloadController.FileDownloadProgressListener {
    public MessageObject A;
    public boolean B;
    public boolean C;
    public final int D;
    public final SpannableStringBuilder E;
    public CharSequence F;
    public final oi0 G;
    public final org.telegram.ui.ActionBar.c6 H;
    public h00 I;
    public long J;
    public boolean K;
    public float L;
    public boolean M;
    public float N;

    public final ImageView f24342a;

    public final jh.z3 f24343b;

    public final TextView f24344c;
    public final TextView d;

    public final org.telegram.ui.Components.s5 f24345e;

    public final ri0 f24346f;
    public final z70 h;

    public final bp f24347n;

    public final TextView f24348r;

    public final TextView f24349s;
    public boolean v;

    public boolean f24350w;

    public final int f24351x;

    public final int f24352y;

    public f7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        float f10;
        super(context);
        this.v = true;
        int i11 = UserConfig.selectedAccount;
        this.f24351x = i11;
        this.N = 1.0f;
        this.H = c6Var;
        this.D = i10;
        this.f24352y = DownloadController.getInstance(i11).generateObserverTag();
        ImageView imageView = new ImageView(context);
        this.f24342a = imageView;
        if (i10 == 1) {
            boolean z10 = LocaleController.isRTL;
            addView(imageView, h7.z5.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 12.0f, z10 ? 15.0f : 0.0f, 0.0f));
        } else {
            boolean z11 = LocaleController.isRTL;
            addView(imageView, h7.z5.d(40, 40.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 12.0f, 8.0f, z11 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        rl.w(org.telegram.ui.ActionBar.g6.Bi, c6Var, textView, 1, 14.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setImportantForAccessibility(2);
        if (i10 == 1) {
            boolean z12 = LocaleController.isRTL;
            addView(textView, h7.z5.d(32, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 20.0f, 28.0f, z12 ? 20.0f : 0.0f, 0.0f));
        } else {
            boolean z13 = LocaleController.isRTL;
            addView(textView, h7.z5.d(32, -2.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 22.0f, z13 ? 16.0f : 0.0f, 0.0f));
        }
        jh.z3 z3Var = new jh.z3(this, context, 1);
        this.f24343b = z3Var;
        z3Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        if (i10 == 1) {
            boolean z14 = LocaleController.isRTL;
            addView(z3Var, h7.z5.d(42, 42.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 0.0f));
        } else {
            boolean z15 = LocaleController.isRTL;
            addView(z3Var, h7.z5.d(40, 40.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 12.0f, 8.0f, z15 ? 12.0f : 0.0f, 0.0f));
        }
        TextView textView2 = new TextView(context);
        this.f24344c = textView2;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        rl.w(i12, c6Var, textView2, 1, 16.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        if (i10 == 1) {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            boolean z16 = LocaleController.isRTL;
            addView(textView2, h7.z5.d(-1, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 8.0f : 72.0f, 9.0f, z16 ? 72.0f : 8.0f, 0.0f));
            f10 = 14.0f;
        } else if (i10 == 2) {
            LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
            boolean z17 = LocaleController.isRTL;
            addView(linearLayoutG, h7.z5.d(-1, -2.0f, (z17 ? 5 : 3) | 48, z17 ? 16.0f : 72.0f, 5.0f, z17 ? 72.0f : 16.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.f24348r = textView3;
            rl.l(org.telegram.ui.ActionBar.g6.A6, c6Var, textView3, 1, 14.0f);
            f10 = 14.0f;
            if (LocaleController.isRTL) {
                linearLayoutG.addView(textView3, h7.z5.l(0.0f, -2, -2));
                linearLayoutG.addView(textView2, h7.z5.m(1.0f, -2, -2, 0, 4, 0));
            } else {
                linearLayoutG.addView(textView2, h7.z5.l(1.0f, -2, -2));
                linearLayoutG.addView(textView3, h7.z5.m(0.0f, -2, -2, 4, 0, 0));
            }
            textView2.setMaxLines(2);
            TextView textView4 = new TextView(context);
            this.f24349s = textView4;
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
            textView4.setLines(1);
            textView4.setMaxLines(1);
            textView4.setSingleLine(true);
            textView4.setEllipsize(truncateAt);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView4.setTextSize(1, 13.0f);
            boolean z18 = LocaleController.isRTL;
            addView(textView4, h7.z5.d(-1, -2.0f, (z18 ? 5 : 3) | 48, z18 ? 8.0f : 72.0f, 30.0f, z18 ? 72.0f : 8.0f, 0.0f));
            textView4.setVisibility(8);
        } else {
            f10 = 14.0f;
            textView2.setMaxLines(1);
            boolean z19 = LocaleController.isRTL;
            addView(textView2, h7.z5.d(-1, -2.0f, (z19 ? 5 : 3) | 48, z19 ? 8.0f : 72.0f, 5.0f, z19 ? 72.0f : 8.0f, 0.0f));
        }
        oi0 oi0Var = new oi0(R.raw.download_arrow, "download_arrow", AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), true, null);
        this.G = oi0Var;
        ri0 ri0Var = new ri0(context);
        this.f24346f = ri0Var;
        ri0Var.setAnimation(oi0Var);
        ri0Var.setVisibility(4);
        int i13 = org.telegram.ui.ActionBar.g6.Ih;
        ri0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i13, c6Var), PorterDuff.Mode.SRC_IN));
        if (i10 == 1) {
            boolean z20 = LocaleController.isRTL;
            addView(ri0Var, h7.z5.d(14, 14.0f, (z20 ? 5 : 3) | 48, z20 ? 8.0f : 70.0f, 37.0f, z20 ? 72.0f : 8.0f, 0.0f));
        } else {
            boolean z21 = LocaleController.isRTL;
            addView(ri0Var, h7.z5.d(14, 14.0f, (z21 ? 5 : 3) | 48, z21 ? 8.0f : 70.0f, 33.0f, z21 ? 72.0f : 8.0f, 0.0f));
        }
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.f24345e = s5Var;
        s5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
        s5Var.setLines(1);
        s5Var.setMaxLines(1);
        s5Var.setSingleLine(true);
        s5Var.setEllipsize(truncateAt);
        s5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        NotificationCenter.listenEmojiLoading(s5Var);
        if (i10 == 1) {
            s5Var.setTextSize(1, 13.0f);
            boolean z22 = LocaleController.isRTL;
            addView(s5Var, h7.z5.d(-1, -2.0f, (z22 ? 5 : 3) | 48, z22 ? 8.0f : 72.0f, 34.0f, z22 ? 72.0f : 8.0f, 0.0f));
        } else {
            s5Var.setTextSize(1, 13.0f);
            boolean z23 = LocaleController.isRTL;
            addView(s5Var, h7.z5.d(-1, -2.0f, (z23 ? 5 : 3) | 48, z23 ? 8.0f : 72.0f, 30.0f, z23 ? 72.0f : 8.0f, 0.0f));
        }
        z70 z70Var = new z70(context);
        this.h = z70Var;
        z70Var.setProgressColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        boolean z24 = LocaleController.isRTL;
        addView(z70Var, h7.z5.d(-1, 2.0f, (z24 ? 5 : 3) | 48, z24 ? 0.0f : 72.0f, 54.0f, z24 ? 72.0f : 0.0f, 0.0f));
        bp bpVar = new bp(context, 21, c6Var);
        this.f24347n = bpVar;
        bpVar.setVisibility(4);
        bpVar.b(-1, org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(2);
        if (i10 == 1) {
            boolean z25 = LocaleController.isRTL;
            addView(bpVar, h7.z5.d(24, 24.0f, (z25 ? 5 : 3) | 48, z25 ? 0.0f : 38.0f, 36.0f, z25 ? 38.0f : 0.0f, 0.0f));
        } else {
            boolean z26 = LocaleController.isRTL;
            addView(bpVar, h7.z5.d(24, 24.0f, (z26 ? 5 : 3) | 48, z26 ? 0.0f : 33.0f, 28.0f, z26 ? 33.0f : 0.0f, 0.0f));
        }
        if (i10 == 2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.E = spannableStringBuilder;
            spannableStringBuilder.setSpan(new ps(), 0, 1, 0);
        }
    }

    public final void a(Canvas canvas) {
        if (this.f24350w) {
            canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.g6.T0("paintDivider", this.H));
        }
    }

    public final void b(boolean z10, boolean z11) {
        bp bpVar = this.f24347n;
        if (bpVar.getVisibility() != 0) {
            bpVar.setVisibility(0);
        }
        bpVar.a(z10, z11);
    }

    public final void c(MessageObject messageObject, boolean z10) {
        String str;
        org.telegram.ui.ActionBar.c6 c6Var;
        String str2;
        String str3;
        String str4;
        MessageObject messageObject2 = this.A;
        boolean z11 = (messageObject2 == null || messageObject == null || messageObject2.getId() == messageObject.getId()) ? false : true;
        this.f24350w = z10;
        this.A = messageObject;
        this.C = false;
        this.B = false;
        if (!z11) {
            this.J = 0L;
        }
        TLRPC.Document document = messageObject.getDocument();
        TextView textView = this.f24349s;
        TextView textView2 = this.f24344c;
        ImageView imageView = this.f24342a;
        TextView textView3 = this.d;
        jh.z3 z3Var = this.f24343b;
        if (document != null) {
            if (messageObject.isMusic()) {
                str = null;
                for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && (((str3 = documentAttribute.performer) != null && str3.length() != 0) || ((str4 = documentAttribute.title) != null && str4.length() != 0))) {
                        str = messageObject.getMusicAuthor() + " - " + messageObject.getMusicTitle();
                    }
                }
            } else {
                str = null;
            }
            String documentFileName = (messageObject.isVideo() || (messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) || MessageObject.isGifDocument(document)) ? null : FileLoader.getDocumentFileName(document);
            if (TextUtils.isEmpty(documentFileName) && (str2 = document.mime_type) != null) {
                if (str2.startsWith("video")) {
                    documentFileName = MessageObject.isGifDocument(document) ? LocaleController.getString(R.string.AttachGif) : LocaleController.getString(R.string.AttachVideo);
                } else if (document.mime_type.startsWith("image")) {
                    documentFileName = MessageObject.isGifDocument(document) ? LocaleController.getString(R.string.AttachGif) : LocaleController.getString(R.string.AttachPhoto);
                } else {
                    documentFileName = document.mime_type.startsWith("audio") ? LocaleController.getString(R.string.AttachAudio) : LocaleController.getString(R.string.AttachDocument);
                }
            }
            String str5 = str == null ? documentFileName : str;
            ArrayList<String> arrayList = messageObject.highlightedWords;
            org.telegram.ui.ActionBar.c6 c6Var2 = this.H;
            CharSequence charSequenceHighlightText = AndroidUtilities.highlightText(str5, arrayList, c6Var2);
            if (charSequenceHighlightText != null) {
                textView2.setText(charSequenceHighlightText);
            } else {
                textView2.setText(str5);
            }
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(documentFileName, document.mime_type, false));
            int iLastIndexOf = documentFileName.lastIndexOf(46);
            textView3.setText(iLastIndexOf == -1 ? "" : documentFileName.substring(iLastIndexOf + 1).toLowerCase());
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40);
            if (closestPhotoSizeWithSize2 == closestPhotoSizeWithSize) {
                closestPhotoSizeWithSize = null;
            }
            if ((closestPhotoSizeWithSize2 instanceof TLRPC.TL_photoSizeEmpty) || closestPhotoSizeWithSize2 == null) {
                c6Var = c6Var2;
                z3Var.setVisibility(4);
                z3Var.setImageBitmap(null);
                textView3.setAlpha(1.0f);
                imageView.setAlpha(1.0f);
            } else {
                z3Var.getImageReceiver().setNeedsQualityThumb(closestPhotoSizeWithSize == null);
                z3Var.getImageReceiver().setShouldGenerateQualityThumb(closestPhotoSizeWithSize == null);
                z3Var.setVisibility(0);
                if (messageObject.strippedThumb != null) {
                    c6Var = c6Var2;
                    z3Var.m(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", null, null, messageObject.strippedThumb, null, 1, messageObject);
                } else {
                    c6Var = c6Var2;
                    z3Var.k(ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "40_40", ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "40_40_b", 0L, null, messageObject, 1);
                }
            }
            e();
            if (messageObject.hasHighlightedWords() && !TextUtils.isEmpty(this.A.messageOwner.message)) {
                CharSequence charSequenceHighlightText2 = AndroidUtilities.highlightText(this.A.messageOwner.message.replace("\n", " ").replaceAll(" +", " ").trim(), this.A.highlightedWords, c6Var);
                this.F = charSequenceHighlightText2;
                if (textView != null) {
                    textView.setVisibility(charSequenceHighlightText2 == null ? 8 : 0);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            textView2.setText("");
            textView3.setText("");
            this.f24345e.setText("");
            imageView.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            z3Var.setVisibility(4);
            z3Var.setImageBitmap(null);
            this.F = null;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        setWillNotDraw(!this.f24350w);
        this.h.a(0.0f, false);
        f(z11);
    }

    public final void d(boolean z10, String str, int i10, String str2, String str3, String str4) {
        int i11;
        int i12;
        this.f24344c.setText(str);
        this.f24345e.setText(str2);
        TextView textView = this.d;
        if (str3 != null) {
            textView.setVisibility(0);
            textView.setText(str3.toLowerCase());
        } else {
            textView.setVisibility(4);
        }
        this.f24350w = z10;
        ImageView imageView = this.f24342a;
        if (i10 == 0) {
            imageView.setImageResource(AndroidUtilities.getThumbForNameOrMime(str, str3, false));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        int i13 = this.D;
        jh.z3 z3Var = this.f24343b;
        if (str4 == null && i10 == 0) {
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            if (i13 != 3) {
                z3Var.setImageBitmap(null);
                z3Var.setVisibility(4);
            }
        } else {
            if (str4 == null) {
                dq dqVarL = org.telegram.ui.ActionBar.g6.L(AndroidUtilities.dp(42.0f), i10);
                if (i10 == R.drawable.files_storage) {
                    i11 = org.telegram.ui.ActionBar.g6.f23238na;
                    i12 = org.telegram.ui.ActionBar.g6.f23148ia;
                } else if (i10 == R.drawable.files_gallery) {
                    i11 = org.telegram.ui.ActionBar.g6.la;
                    i12 = org.telegram.ui.ActionBar.g6.f23148ia;
                } else if (i10 == R.drawable.files_music) {
                    i11 = org.telegram.ui.ActionBar.g6.f23185ka;
                    i12 = org.telegram.ui.ActionBar.g6.f23148ia;
                } else if (i10 == R.drawable.files_internal) {
                    i11 = org.telegram.ui.ActionBar.g6.f23166ja;
                    i12 = org.telegram.ui.ActionBar.g6.f23148ia;
                } else {
                    i11 = org.telegram.ui.ActionBar.g6.Ai;
                    i12 = org.telegram.ui.ActionBar.g6.zi;
                }
                org.telegram.ui.ActionBar.c6 c6Var = this.H;
                org.telegram.ui.ActionBar.g6.v1(dqVarL, org.telegram.ui.ActionBar.g6.v0(i11, c6Var), false);
                org.telegram.ui.ActionBar.g6.v1(dqVarL, org.telegram.ui.ActionBar.g6.v0(i12, c6Var), true);
                z3Var.setImageDrawable(dqVarL);
            } else if (i13 != 3) {
                z3Var.f(str4, "42_42", null);
            }
            z3Var.setVisibility(0);
        }
        setWillNotDraw(!this.f24350w);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        if (this.N == 1.0f || this.I == null) {
            super.dispatchDraw(canvas);
            a(canvas);
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.N) * 255.0f), 31);
            this.I.setViewType(3);
            this.I.d();
            this.I.h();
            this.I.draw(canvas);
            canvas.restore();
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.N * 255.0f), 31);
            super.dispatchDraw(canvas);
            a(canvas);
            canvas.restore();
        }
        boolean z10 = this.K;
        if (z10 || this.L != 0.0f) {
            if (z10) {
                float f11 = this.L;
                if (f11 != 1.0f) {
                    this.L = f11 + 0.10666667f;
                    invalidate();
                } else if (!z10) {
                    f10 = this.L;
                    if (f10 != 0.0f) {
                        this.L = f10 - 0.10666667f;
                        invalidate();
                    }
                }
            } else if (!z10) {
                f10 = this.L;
                if (f10 != 0.0f) {
                    this.L = f10 - 0.10666667f;
                    invalidate();
                }
            }
            this.L = Utilities.clamp(this.L, 1.0f, 0.0f);
            int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth();
            int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f12 = this.L;
            canvas.scale(f12, f12, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
            Drawable drawable = org.telegram.ui.ActionBar.g6.Z0;
            drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.g6.Z0.getIntrinsicHeight() + measuredHeight);
            org.telegram.ui.ActionBar.g6.Z0.draw(canvas);
            canvas.restore();
        }
    }

    public final void e() {
        String strW;
        MessageObject messageObject = this.A;
        if (messageObject == null || messageObject.getDocument() == null) {
            return;
        }
        MessageObject messageObject2 = this.A;
        long j10 = ((long) messageObject2.messageOwner.date) * 1000;
        long j11 = this.J;
        if (j11 == 0) {
            strW = AndroidUtilities.formatFileSize(messageObject2.getDocument().size);
        } else {
            Locale locale = Locale.ENGLISH;
            strW = a9.p.w(AndroidUtilities.formatFileSize(j11), " / ", AndroidUtilities.formatFileSize(this.A.getDocument().size));
        }
        int i10 = this.D;
        org.telegram.ui.Components.s5 s5Var = this.f24345e;
        if (i10 == 2) {
            s5Var.setText(new SpannableStringBuilder().append((CharSequence) strW).append(' ').append((CharSequence) this.E).append(' ').append(i10.d(this.A, true, 2, s5Var.getPaint())));
            this.f24348r.setText(LocaleController.stringForMessageListDate(this.A.messageOwner.date));
            return;
        }
        s5Var.setText(strW + ", " + LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterYear().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10))));
    }

    public final void f(boolean z10) {
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new Fade().setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) er.f28122f);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        MessageObject messageObject = this.A;
        int i10 = this.f24351x;
        ri0 ri0Var = this.f24346f;
        z70 z70Var = this.h;
        org.telegram.ui.Components.s5 s5Var = this.f24345e;
        if (messageObject == null || messageObject.messageOwner.media == null) {
            this.B = false;
            this.C = true;
            z70Var.setVisibility(4);
            z70Var.a(0.0f, false);
            ri0Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) s5Var.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 72.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 8.0f);
                s5Var.requestLayout();
            }
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            return;
        }
        this.C = false;
        if (messageObject.attachPathExists || messageObject.mediaExists || !this.v) {
            ri0Var.setVisibility(4);
            z70Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) s5Var.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 72.0f);
                layoutParams2.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 8.0f);
                s5Var.requestLayout();
            }
            this.B = false;
            this.C = true;
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            return;
        }
        String attachFileName = FileLoader.getAttachFileName(messageObject.getDocument());
        DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.A, this);
        this.B = FileLoader.getInstance(i10).isLoadingFile(attachFileName);
        ri0Var.setVisibility(0);
        int i11 = this.B ? 15 : 0;
        oi0 oi0Var = this.G;
        oi0Var.N(i11);
        oi0Var.h = true;
        if (z10) {
            ri0Var.d();
        } else {
            oi0Var.K(this.B ? 15 : 0);
            ri0Var.invalidate();
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) s5Var.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 86.0f);
            layoutParams3.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 86.0f : 8.0f);
            s5Var.requestLayout();
        }
        if (!this.B) {
            z70Var.setVisibility(4);
            return;
        }
        z70Var.setVisibility(0);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
        if (fileProgress == null) {
            fileProgress = Float.valueOf(0.0f);
        }
        z70Var.a(fileProgress.floatValue(), false);
    }

    public org.telegram.ui.Components.n9 getImageView() {
        return this.f24343b;
    }

    public MessageObject getMessage() {
        return this.A;
    }

    @Override
    public int getObserverTag() {
        return this.f24352y;
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
        DownloadController.getInstance(this.f24351x).removeLoadingFileObserver(this);
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
        bp bpVar = this.f24347n;
        if (bpVar.f27188a.f26309q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(bpVar.f27188a.f26309q);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.D != 1) {
            TextView textView = this.f24344c;
            int lineCount = textView.getLineCount();
            TextView textView2 = this.f24349s;
            if (lineCount > 1 || (textView2 != null && textView2.getVisibility() == 0)) {
                int measuredHeight = textView.getMeasuredHeight() - AndroidUtilities.dp(22.0f);
                if (textView2 != null && textView2.getVisibility() == 0) {
                    textView2.layout(textView2.getLeft(), textView2.getTop() + measuredHeight, textView2.getRight(), textView2.getBottom() + measuredHeight);
                    measuredHeight = org.telegram.messenger.y1.C(3.0f, textView2.getMeasuredHeight(), measuredHeight);
                }
                org.telegram.ui.Components.s5 s5Var = this.f24345e;
                s5Var.layout(s5Var.getLeft(), s5Var.getTop() + measuredHeight, s5Var.getRight(), s5Var.getBottom() + measuredHeight);
                ri0 ri0Var = this.f24346f;
                ri0Var.layout(ri0Var.getLeft(), ri0Var.getTop() + measuredHeight, ri0Var.getRight(), ri0Var.getBottom() + measuredHeight);
                z70 z70Var = this.h;
                z70Var.layout(z70Var.getLeft(), (getMeasuredHeight() - z70Var.getMeasuredHeight()) - (this.f24350w ? 1 : 0), z70Var.getRight(), getMeasuredHeight() - (this.f24350w ? 1 : 0));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12 = this.D;
        if (i12 == 1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.f24350w ? 1 : 0), 1073741824));
            return;
        }
        if (i12 == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        int measuredHeight = this.f24344c.getMeasuredHeight() + AndroidUtilities.dp(34.0f) + (this.f24350w ? 1 : 0);
        if (this.F != null && (textView = this.f24349s) != null && this.A.hasHighlightedWords()) {
            this.M = true;
            textView.setText(AndroidUtilities.ellipsizeCenterEnd(this.F, this.A.highlightedWords.get(0), textView.getMeasuredWidth(), textView.getPaint(), 130));
            this.M = false;
            measuredHeight = org.telegram.messenger.y1.C(3.0f, textView.getMeasuredHeight(), measuredHeight);
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        z70 z70Var = this.h;
        if (z70Var.getVisibility() != 0) {
            f(true);
        }
        this.J = j10;
        e();
        z70Var.a(Math.min(1.0f, j10 / j11), true);
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

    public void setEnterAnimationAlpha(float f10) {
        if (this.N != f10) {
            this.N = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(h00 h00Var) {
        this.I = h00Var;
    }

    public void setPhoto(String str) {
        boolean zEndsWith = str.endsWith("mp4");
        jh.z3 z3Var = this.f24343b;
        if (zEndsWith) {
            z3Var.f("vthumb://0:".concat(str), null, null);
            z3Var.setVisibility(0);
        } else if (!str.endsWith(".jpg") && !str.endsWith(".jpeg") && !str.endsWith(".png") && !str.endsWith(".gif")) {
            z3Var.setVisibility(8);
        } else {
            z3Var.f("thumb://0:".concat(str), null, null);
            z3Var.setVisibility(0);
        }
    }

    public void setPhotoEntry(MediaController.PhotoEntry photoEntry) {
        String str;
        String str2 = photoEntry.thumbPath;
        jh.z3 z3Var = this.f24343b;
        if (str2 != null) {
            z3Var.f(str2, null, org.telegram.ui.ActionBar.g6.R4);
            str = photoEntry.thumbPath;
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                z3Var.q(0, true);
                z3Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
            } else {
                z3Var.p(photoEntry.orientation, photoEntry.invert, true);
                z3Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
            }
            str = photoEntry.path;
        } else {
            z3Var.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
            str = "";
        }
        File file = new File(str);
        this.f24344c.setText(file.getName());
        FileLoader.getFileExtension(file);
        this.d.setVisibility(8);
        StringBuilder sb2 = new StringBuilder();
        if (photoEntry.width != 0 && photoEntry.height != 0) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            Locale locale = Locale.US;
            sb2.append(photoEntry.width + "x" + photoEntry.height);
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
        this.f24345e.setText(sb2);
        this.f24342a.setVisibility(8);
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
