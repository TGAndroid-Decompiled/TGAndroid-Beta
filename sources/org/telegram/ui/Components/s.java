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
public final class s extends xa implements NotificationCenter.NotificationCenterDelegate {
    public final TL_aicompose.AiComposeTone T;
    public final AiTonesController U;
    public final ImageView V;
    public final FrameLayout W;
    public final TextView X;
    public final TextView Y;
    public final FrameLayout Z;
    public final nh.d f32425a0;
    public k51 f32426b0;
    public int f32427c0;
    public final TL_aicompose.aiComposeToneExample[] f32428d0;

    public s(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, false, false, false, 2, c6Var);
        int i10;
        this.f32427c0 = 0;
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.U = tonesController;
        tonesController.load();
        this.T = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[MessagesController.getInstance(this.currentAccount).config.aicomposeToneExamplesNum.get()];
        this.f32428d0 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(getThemedColor(i11));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(i11)), 1, -1));
        this.containerView.addView(imageView, i7.f6.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        i7.h6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new p(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var)));
        frameLayout.addView(frameLayout2, i7.f6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        t9 t9Var = new t9(context);
        t9Var.setAnimatedEmojiDrawable(new p5(4, this.currentAccount, aiComposeTone.emoji_id));
        frameLayout2.addView(t9Var, i7.f6.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.X = textView;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.Y = textView2;
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.AIEditorStyleText));
        this.f34660e.setTitle(aiComposeTone.title);
        int i12 = org.telegram.ui.ActionBar.g6.f23009a7;
        this.behindKeyboardColorKey = i12;
        setBackgroundColor(getThemedColor(i12));
        jl0 jl0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new k(this, 1));
        this.H = false;
        this.G = AndroidUtilities.dp(36.0f);
        this.v = 0.35f;
        this.K = true;
        r rVar = new r(this);
        rVar.f6463m = false;
        rVar.C = false;
        rVar.o(jr.h);
        rVar.n(350L);
        this.d.setItemAnimator(rVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, getThemedColor(i12)), getThemedColor(i12), getThemedColor(i12)}));
        FrameLayout.LayoutParams e10 = i7.f6.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.containerView.addView(frameLayout3, e10);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Z = frameLayout4;
        FrameLayout.LayoutParams d = i7.f6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.containerView.addView(frameLayout4, d);
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        this.f32425a0 = o10;
        if (U()) {
            i10 = R.string.AIEditorStyleDone;
        } else {
            i10 = R.string.AIEditorAddStyle;
        }
        o10.setText(LocaleController.getString(i10));
        o10.setOnClickListener(new bg.q(this, aiComposeTone, c6Var, 17));
        frameLayout3.addView(o10, i7.f6.e(-1, 48, 119));
        this.f32426b0.N(false);
    }

    public static void P(s sVar, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.c6 c6Var) {
        nh.d dVar = sVar.f32425a0;
        if (dVar.S && !dVar.J) {
            if (sVar.U()) {
                sVar.dismiss();
                return;
            }
            dVar.setLoading(true);
            TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
            savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            ConnectionsManager.getInstance(sVar.currentAccount).sendRequestTyped(savetone, new Object(), new ih.b0(sVar, c6Var, aiComposeTone, 6));
        }
    }

    public static void Q(final s sVar) {
        TL_aicompose.AiComposeTone aiComposeTone = sVar.T;
        if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
            return;
        }
        int i10 = sVar.f32427c0 + 1;
        sVar.f32427c0 = i10;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = sVar.f32428d0;
        if (i10 >= aicomposetoneexampleArr.length) {
            sVar.f32427c0 = 0;
        }
        final int i11 = sVar.f32427c0;
        if (aicomposetoneexampleArr[i11] == null) {
            TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
            gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            gettoneexample.num = i11;
            ConnectionsManager.getInstance(sVar.currentAccount).sendRequestTyped(gettoneexample, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    s sVar2 = s.this;
                    if (aicomposetoneexample != null) {
                        sVar2.f32428d0[i11] = aicomposetoneexample;
                        sVar2.f32426b0.N(true);
                        return;
                    }
                    sVar2.getClass();
                }
            });
        }
        sVar.f32426b0.N(true);
    }

    public static void R(s sVar, ArrayList arrayList, k51 k51Var) {
        CharSequence formatTextWithEntities;
        CharSequence formatTextWithEntities2;
        String str;
        String formatString;
        k51Var.A = 1;
        TLRPC.User user = null;
        arrayList.add(w41.B(null));
        FrameLayout frameLayout = sVar.W;
        w41 w41Var = new w41(-4);
        w41Var.f34293c = frameLayout;
        w41Var.f34313z = -1;
        w41Var.f34294e = true;
        arrayList.add(w41Var);
        arrayList.add(w41.B(null));
        arrayList.add(w41.l(sVar.X));
        arrayList.add(w41.C(AndroidUtilities.dp(1.0f)));
        arrayList.add(w41.l(sVar.Y));
        arrayList.add(w41.C(AndroidUtilities.dp(24.0f)));
        TL_aicompose.AiComposeTone aiComposeTone = sVar.T;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            TL_aicompose.aiComposeToneExample aicomposetoneexample = sVar.f32428d0[sVar.f32427c0];
            k51Var.U();
            arrayList.add(p31.a(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new p(sVar, 1)));
            if (aicomposetoneexample == null) {
                formatTextWithEntities = V();
            } else {
                formatTextWithEntities = MessageObject.formatTextWithEntities(aicomposetoneexample.from);
            }
            arrayList.add(t31.a(4, formatTextWithEntities, false, null, null, null));
            arrayList.add(p31.b(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
            if (aicomposetoneexample == null) {
                formatTextWithEntities2 = V();
            } else {
                formatTextWithEntities2 = MessageObject.formatTextWithEntities(aicomposetoneexample.to);
            }
            arrayList.add(t31.a(6, formatTextWithEntities2, false, null, null, null));
            k51Var.T();
            if (tL_aiComposeTone.author_id != 0) {
                user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (user == null) {
                int i10 = tL_aiComposeTone.installs_count;
                if (i10 > 0) {
                    arrayList.add(w41.B(LocaleController.formatPluralString("AIEditorUsedBy", i10, new Object[0])));
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
                    formatString = LocaleController.formatString(R.string.AIEditorCreatedBy, u3.c.e("@", publicUsername));
                }
                sb2.append(formatString);
                arrayList.add(w41.B(AndroidUtilities.replaceSingleLink(sb2.toString(), sVar.getThemedColor(org.telegram.ui.ActionBar.g6.gc), new org.telegram.ui.vf(29, sVar, tL_aiComposeTone))));
            }
        }
        arrayList.add(w41.C(AndroidUtilities.dp(32.0f)));
    }

    public static void S(s sVar, org.telegram.ui.ActionBar.c6 c6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = sVar.Z;
        sVar.f32425a0.setLoading(false);
        if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                g0.o0(sVar.currentAccount, new tc(frameLayout, c6Var));
                return;
            } else {
                org.telegram.ui.th.t(frameLayout, c6Var, tL_error, false);
                return;
            }
        }
        MessagesController.getInstance(sVar.currentAccount).getTonesController().add(aiComposeTone);
        sVar.dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            tc.a0(U).p(aiComposeTone.emoji_id, LocaleController.getString(R.string.AIEditorToneAddedTitle), LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title)).j();
        }
    }

    public static SpannableStringBuilder V() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i10 = 0; i10 < 5; i10++) {
            if (i10 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int dp = AndroidUtilities.dp((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
            d90 d90Var = new d90(null, dp, 0, null);
            d90Var.f27721f = AndroidUtilities.dp(6.0f);
            d90Var.h = 0.5f;
            d90Var.f27722n = true;
            spannableStringBuilder.setSpan(d90Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final void B(float f9) {
        ua uaVar = this.f34660e;
        org.telegram.ui.ActionBar.h5 titleTextView = uaVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f9);
        }
        float translationY = uaVar.getTranslationY() + AndroidUtilities.statusBarHeight;
        int height = uaVar.getHeight() - AndroidUtilities.statusBarHeight;
        ImageView imageView = this.V;
        imageView.setTranslationY(((1.0f - f9) * AndroidUtilities.dp(28.0f)) + ((height - imageView.getHeight()) / 2.0f) + translationY);
    }

    public final boolean U() {
        TL_aicompose.AiComposeTone aiComposeTone = this.T;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i10 = 0;
            while (true) {
                AiTonesController aiTonesController = this.U;
                if (i10 >= aiTonesController.tones.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = aiTonesController.tones.get(i10);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).f22603id == tL_aiComposeTone.f22603id) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.loadedAiComposeTones) {
            if (U()) {
                i12 = R.string.AIEditorStyleDone;
            } else {
                i12 = R.string.AIEditorAddStyle;
            }
            this.f32425a0.setText(LocaleController.getString(i12));
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
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, 0, true, new d(this, 1), this.resourcesProvider);
        this.f32426b0 = k51Var;
        k51Var.f29939r = false;
        return k51Var;
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
