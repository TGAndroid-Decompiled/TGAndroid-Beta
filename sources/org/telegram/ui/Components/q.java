package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.LaunchActivity;
public final class q extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final TL_aicompose.AiComposeTone T;
    public final AiTonesController U;
    public final ImageView V;
    public final FrameLayout W;
    public final TextView X;
    public final TextView Y;
    public final FrameLayout Z;
    public final kh.d f31783a0;
    public z41 f31784b0;
    public int f31785c0;
    public final TL_aicompose.aiComposeToneExample[] f31786d0;

    public q(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, false, false, false, false, false, 2, b6Var);
        int i9;
        this.f31785c0 = 0;
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.U = tonesController;
        tonesController.load();
        this.T = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[MessagesController.getInstance(this.currentAccount).config.aicomposeToneExamplesNum.get()];
        this.f31786d0 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.containerView.addView(imageView, g7.e6.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        g7.g6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new n(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var)));
        frameLayout.addView(frameLayout2, g7.e6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        o9 o9Var = new o9(context);
        o9Var.setAnimatedEmojiDrawable(new k5(4, this.currentAccount, aiComposeTone.emoji_id));
        frameLayout2.addView(o9Var, g7.e6.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.X = textView;
        textView.setTextColor(getThemedColor(i10));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.Y = textView2;
        textView2.setTextColor(getThemedColor(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.AIEditorStyleText));
        this.f32408e.setTitle(aiComposeTone.title);
        int i11 = org.telegram.ui.ActionBar.f6.f22947a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        wk0 wk0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new j(this, 1));
        this.H = false;
        this.G = AndroidUtilities.dp(36.0f);
        this.v = 0.35f;
        this.K = true;
        p pVar = new p(this);
        pVar.f5532m = false;
        pVar.C = false;
        pVar.o(gr.h);
        pVar.n(350L);
        this.d.setItemAnimator(pVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.f6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams e10 = g7.e6.e(-1, -2, 80);
        int i13 = e10.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e10.leftMargin = i13 + i14;
        e10.rightMargin += i14;
        this.containerView.addView(frameLayout3, e10);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Z = frameLayout4;
        FrameLayout.LayoutParams d = g7.e6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(frameLayout4, d);
        kh.d i17 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        this.f31783a0 = i17;
        if (T()) {
            i9 = R.string.AIEditorStyleDone;
        } else {
            i9 = R.string.AIEditorAddStyle;
        }
        i17.setText(LocaleController.getString(i9));
        i17.setOnClickListener(new fg.f(this, aiComposeTone, b6Var, 16));
        frameLayout3.addView(i17, g7.e6.e(-1, 48, 119));
        this.f31784b0.N(false);
    }

    public static void O(q qVar, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.b6 b6Var) {
        kh.d dVar = qVar.f31783a0;
        if (dVar.S && !dVar.J) {
            if (qVar.T()) {
                qVar.dismiss();
                return;
            }
            dVar.setLoading(true);
            TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
            savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(savetone, new Object(), new fh.f0(qVar, b6Var, aiComposeTone, 6));
        }
    }

    public static void P(final q qVar) {
        TL_aicompose.AiComposeTone aiComposeTone = qVar.T;
        if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
            return;
        }
        int i9 = qVar.f31785c0 + 1;
        qVar.f31785c0 = i9;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = qVar.f31786d0;
        if (i9 >= aicomposetoneexampleArr.length) {
            qVar.f31785c0 = 0;
        }
        final int i10 = qVar.f31785c0;
        if (aicomposetoneexampleArr[i10] == null) {
            TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
            gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            gettoneexample.num = i10;
            ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(gettoneexample, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    q qVar2 = q.this;
                    if (aicomposetoneexample != null) {
                        qVar2.f31786d0[i10] = aicomposetoneexample;
                        qVar2.f31784b0.N(true);
                        return;
                    }
                    qVar2.getClass();
                }
            });
        }
        qVar.f31784b0.N(true);
    }

    public static void Q(q qVar, ArrayList arrayList, z41 z41Var) {
        CharSequence formatTextWithEntities;
        CharSequence formatTextWithEntities2;
        String str;
        String formatString;
        z41Var.A = 1;
        TLRPC.User user = null;
        arrayList.add(l41.B(null));
        FrameLayout frameLayout = qVar.W;
        l41 l41Var = new l41(-4);
        l41Var.f30332c = frameLayout;
        l41Var.f30352z = -1;
        l41Var.f30333e = true;
        arrayList.add(l41Var);
        arrayList.add(l41.B(null));
        arrayList.add(l41.l(qVar.X));
        arrayList.add(l41.C(AndroidUtilities.dp(1.0f)));
        arrayList.add(l41.l(qVar.Y));
        arrayList.add(l41.C(AndroidUtilities.dp(24.0f)));
        TL_aicompose.AiComposeTone aiComposeTone = qVar.T;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            TL_aicompose.aiComposeToneExample aicomposetoneexample = qVar.f31786d0[qVar.f31785c0];
            z41Var.U();
            arrayList.add(e31.a(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new n(qVar, 1)));
            if (aicomposetoneexample == null) {
                formatTextWithEntities = U();
            } else {
                formatTextWithEntities = MessageObject.formatTextWithEntities(aicomposetoneexample.from);
            }
            arrayList.add(i31.a(4, formatTextWithEntities, false, null, null, null));
            arrayList.add(e31.b(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
            if (aicomposetoneexample == null) {
                formatTextWithEntities2 = U();
            } else {
                formatTextWithEntities2 = MessageObject.formatTextWithEntities(aicomposetoneexample.to);
            }
            arrayList.add(i31.a(6, formatTextWithEntities2, false, null, null, null));
            z41Var.T();
            if (tL_aiComposeTone.author_id != 0) {
                user = MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (user == null) {
                int i9 = tL_aiComposeTone.installs_count;
                if (i9 > 0) {
                    arrayList.add(l41.B(LocaleController.formatPluralString("AIEditorUsedBy", i9, new Object[0])));
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (tL_aiComposeTone.installs_count > 0) {
                    str = LocaleController.formatPluralString("AIEditorUsedBy", tL_aiComposeTone.installs_count, new Object[0]) + " ";
                } else {
                    str = "";
                }
                sb2.append(str);
                if (TextUtils.isEmpty(publicUsername)) {
                    formatString = LocaleController.formatString(R.string.AIEditorCreatedBy, UserObject.getUserName(user));
                } else {
                    formatString = LocaleController.formatString(R.string.AIEditorCreatedBy, ta.b.d("@", publicUsername));
                }
                sb2.append(formatString);
                arrayList.add(l41.B(AndroidUtilities.replaceSingleLink(sb2.toString(), qVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23061gc), new org.telegram.ui.wq(2, qVar, tL_aiComposeTone))));
            }
        }
        arrayList.add(l41.C(AndroidUtilities.dp(32.0f)));
    }

    public static void R(q qVar, org.telegram.ui.ActionBar.b6 b6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = qVar.Z;
        qVar.f31783a0.setLoading(false);
        if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.n0(qVar.currentAccount, new oc(frameLayout, b6Var));
                return;
            } else {
                org.telegram.ui.Cells.j2.s(frameLayout, b6Var, tL_error, false);
                return;
            }
        }
        MessagesController.getInstance(qVar.currentAccount).getTonesController().add(aiComposeTone);
        qVar.dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            oc.a0(U).p(aiComposeTone.emoji_id, LocaleController.getString(R.string.AIEditorToneAddedTitle), LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title)).j();
        }
    }

    public static SpannableStringBuilder U() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i9 = 0; i9 < 5; i9++) {
            if (i9 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int dp = AndroidUtilities.dp((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
            q80 q80Var = new q80(null, dp, 0, null);
            q80Var.f31863f = AndroidUtilities.dp(6.0f);
            q80Var.h = 0.5f;
            q80Var.f31864n = true;
            spannableStringBuilder.setSpan(q80Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final void A(float f10) {
        pa paVar = this.f32408e;
        org.telegram.ui.ActionBar.h5 titleTextView = paVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
        float translationY = paVar.getTranslationY() + AndroidUtilities.statusBarHeight;
        int height = paVar.getHeight() - AndroidUtilities.statusBarHeight;
        ImageView imageView = this.V;
        imageView.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(28.0f)) + ((height - imageView.getHeight()) / 2.0f) + translationY);
    }

    public final boolean T() {
        TL_aicompose.AiComposeTone aiComposeTone = this.T;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i9 = 0;
            while (true) {
                AiTonesController aiTonesController = this.U;
                if (i9 >= aiTonesController.tones.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = aiTonesController.tones.get(i9);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).f22591id == tL_aiComposeTone.f22591id) {
                    return true;
                }
                i9++;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        if (i9 == NotificationCenter.loadedAiComposeTones) {
            if (T()) {
                i11 = R.string.AIEditorStyleDone;
            } else {
                i11 = R.string.AIEditorAddStyle;
            }
            this.f31783a0.setText(LocaleController.getString(i11));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, true, new d(this, 1), this.resourcesProvider);
        this.f31784b0 = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        TL_aicompose.AiComposeTone aiComposeTone = this.T;
        if (aiComposeTone == null) {
            return "";
        }
        return aiComposeTone.title;
    }
}
