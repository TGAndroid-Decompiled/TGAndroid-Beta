package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class qu extends yk0 {

    public final cv f31981c;

    public qu(cv cvVar) {
        this.f31981c = cvVar;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 1;
    }

    public final int E(int i10) {
        cv cvVar = this.f31981c;
        mu muVar = cvVar.f27549e;
        int i11 = cvVar.E ? 2 : 1;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = muVar.f35361c;
            if (i12 >= arrayListArr.length || i12 == i10) {
                break;
            }
            int size = arrayListArr[i12].size();
            if (muVar.f35361c.length > 1) {
                size = Math.min(cvVar.f27556y.J * 2, size);
            }
            i11 += size + 2;
            i12++;
        }
        return i11;
    }

    @Override
    public final int h() {
        int size;
        ArrayList arrayList;
        cv cvVar = this.f31981c;
        mu muVar = cvVar.f27549e;
        ?? r10 = (UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) cvVar).currentAccount).isPremium() || (arrayList = muVar.f35360b) == null || arrayList.size() != 1 || !MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) muVar.f35360b.get(0))) ? 0 : 1;
        cvVar.E = r10;
        int i10 = r10 + 1;
        if (muVar.f35361c != null) {
            int i11 = 0;
            size = 0;
            while (true) {
                ArrayList[] arrayListArr = muVar.f35361c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i11];
                if (arrayList2 != null) {
                    size = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(muVar.f35363f.f27556y.J * 2, arrayList2.size())) + size + 1;
                }
                i11++;
            }
        } else {
            size = 0;
        }
        return Math.max(0, muVar.f35361c.length - 1) + i10 + size;
    }

    @Override
    public final int j(int i10) {
        cv cvVar = this.f31981c;
        mu muVar = cvVar.f27549e;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int i12 = i10 - 1;
        if (cvVar.E) {
            if (i12 == 1) {
                return 3;
            }
            if (i12 > 0) {
                i12 = i10 - 2;
            }
        }
        int i13 = 0;
        while (true) {
            ArrayList[] arrayListArr = muVar.f35361c;
            if (i11 >= arrayListArr.length) {
                return 1;
            }
            if (i12 == i13) {
                return 2;
            }
            int size = arrayListArr[i11].size();
            if (muVar.f35361c.length > 1) {
                size = Math.min(cvVar.f27556y.J * 2, size);
            }
            int i14 = size + 1 + i13;
            if (i12 == i14) {
                return 4;
            }
            i13 = i14 + 1;
            i11++;
        }
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        bx bxVar;
        TLRPC.Document document;
        boolean z10;
        TextView textView;
        boolean z11;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        cv cvVar = this.f31981c;
        f2.x xVar = cvVar.f27556y;
        mu muVar = cvVar.f27549e;
        int i11 = i10 - 1;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        ?? r10 = 0;
        r10 = 0;
        if (i12 == 1) {
            if (cvVar.E) {
                i11 = i10 - 2;
            }
            tu tuVar = (tu) view;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                ArrayList[] arrayListArr = muVar.f35361c;
                if (i14 >= arrayListArr.length) {
                    bxVar = null;
                    break;
                }
                int size = arrayListArr[i14].size();
                if (muVar.f35361c.length > 1) {
                    size = Math.min(xVar.J * 2, size);
                }
                if (i11 > i13 && i11 <= i13 + size) {
                    bxVar = (bx) muVar.f35361c[i14].get((i11 - i13) - 1);
                    break;
                } else {
                    i13 += size + 2;
                    i14++;
                }
            }
            t5 t5Var = tuVar.f32891c;
            if ((t5Var != null || bxVar == null) && ((bxVar != null || t5Var == null) && (bxVar == null || t5Var.documentId == bxVar.f27222b))) {
                return;
            }
            if (bxVar == null) {
                tuVar.f32891c = null;
                return;
            }
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = bxVar.f27221a;
            TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
            tL_inputStickerSetID.f22400id = stickerSet2.f22407id;
            tL_inputStickerSetID.short_name = stickerSet2.short_name;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            if (tL_messages_stickerSet.documents != null) {
                int i15 = 0;
                while (true) {
                    if (i15 >= bxVar.f27221a.documents.size()) {
                        document = null;
                        break;
                    }
                    document = bxVar.f27221a.documents.get(i15);
                    if (document != null && document.f22386id == bxVar.f27222b) {
                        break;
                    } else {
                        i15++;
                    }
                }
            } else {
                document = null;
                break;
            }
            if (document != null) {
                tuVar.f32891c = new t5(document, (Paint.FontMetricsInt) null);
                return;
            } else {
                tuVar.f32891c = new t5(bxVar.f27222b, (Paint.FontMetricsInt) null);
                return;
            }
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            TextView textView2 = (TextView) view;
            textView2.setTextSize(1, 13.0f);
            textView2.setTextColor(cvVar.getThemedColor(org.telegram.ui.ActionBar.g6.We));
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewEmojiPack)));
            textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(14.0f));
            return;
        }
        if (cvVar.E && i11 > 0) {
            i11 = i10 - 2;
        }
        int i16 = 0;
        int i17 = 0;
        while (true) {
            ArrayList[] arrayListArr2 = muVar.f35361c;
            if (i16 >= arrayListArr2.length) {
                break;
            }
            int size2 = arrayListArr2[i16].size();
            if (muVar.f35361c.length > 1) {
                size2 = Math.min(xVar.J * 2, size2);
            }
            if (i11 == i17) {
                break;
            }
            i17 += size2 + 2;
            i16++;
        }
        ArrayList arrayList2 = muVar.f35360b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i16 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) muVar.f35360b.get(i16);
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
            int i18 = 0;
            while (true) {
                if (i18 >= tL_messages_stickerSet2.documents.size()) {
                    z10 = false;
                    break;
                } else {
                    if (!MessageObject.isFreeEmoji(tL_messages_stickerSet2.documents.get(i18))) {
                        z10 = true;
                        break;
                    }
                    i18++;
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (i16 < muVar.f35361c.length) {
            xu xuVar = (xu) view;
            int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
            TextView textView3 = xuVar.d;
            TextView textView4 = xuVar.f34713c;
            cv cvVar2 = xuVar.f34720x;
            ag.s1 s1Var = xuVar.f34714e;
            ?? r13 = xuVar.f34711a;
            xuVar.f34717r = tL_messages_stickerSet2;
            if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                r13.setText(null);
            } else {
                try {
                    if (cv.R == null) {
                        cv.R = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                    }
                    Matcher matcher = cv.R.matcher(tL_messages_stickerSet2.set.title);
                    while (true) {
                        ?? r11 = r10;
                        if (!matcher.find()) {
                            break;
                        }
                        if (r10 == 0) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                            try {
                                r13.setMovementMethod(new av(0));
                                r11 = spannableStringBuilder;
                            } catch (Exception e9) {
                                e = e9;
                                r10 = spannableStringBuilder;
                                FileLog.e(e);
                                if (r10 == 0) {
                                    r10 = tL_messages_stickerSet2.set.title;
                                }
                                r13.setText(r10);
                                textView = xuVar.f34712b;
                                if (textView != null) {
                                    if (tL_messages_stickerSet2 != null) {
                                        textView.setText(LocaleController.formatPluralString("EmojiCount", size3, new Object[0]));
                                    } else {
                                        textView.setText(LocaleController.formatPluralString("EmojiCount", size3, new Object[0]));
                                    }
                                }
                                if (!z10) {
                                }
                                if (s1Var != null) {
                                    s1Var.setVisibility(8);
                                }
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                }
                                if (textView3 != null) {
                                    textView3.setVisibility(0);
                                }
                                if (tL_messages_stickerSet2 == null) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                xuVar.a(z11, false);
                            }
                        }
                        int iStart = matcher.start();
                        int iEnd = matcher.end();
                        if (tL_messages_stickerSet2.set.title.charAt(iStart) != '@') {
                            iStart++;
                        }
                        Matcher matcher2 = matcher;
                        r11.setSpan(new wu(xuVar, tL_messages_stickerSet2.set.title.subSequence(iStart + 1, iEnd).toString()), iStart, iEnd, 0);
                        matcher = matcher2;
                        r10 = r11;
                    }
                } catch (Exception e10) {
                    e = e10;
                    r10 = r10;
                }
                if (r10 == 0) {
                    r10 = tL_messages_stickerSet2.set.title;
                }
                r13.setText(r10);
            }
            textView = xuVar.f34712b;
            if (textView != null) {
                if (tL_messages_stickerSet2 != null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                    textView.setText(LocaleController.formatPluralString("EmojiCount", size3, new Object[0]));
                } else {
                    textView.setText(LocaleController.formatPluralString("Stickers", size3, new Object[0]));
                }
            }
            if (!z10 && s1Var != null && !UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) cvVar2).currentAccount).isPremium()) {
                s1Var.setVisibility(0);
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                if (textView3 != null) {
                    textView3.setVisibility(8);
                    return;
                }
                return;
            }
            if (s1Var != null) {
                s1Var.setVisibility(8);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (tL_messages_stickerSet2 == null && MediaDataController.getInstance(((org.telegram.ui.ActionBar.e3) cvVar2).currentAccount).isStickerPackInstalled(tL_messages_stickerSet2.set.f22407id)) {
                z11 = true;
            } else {
                z11 = false;
            }
            xuVar.a(z11, false);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View textView;
        cv cvVar = this.f31981c;
        if (i10 == 0) {
            view = cvVar.d;
        } else {
            if (i10 == 1) {
                tu tuVar = new tu(cvVar.getContext());
                tuVar.f32889a = new ImageReceiver.BackgroundThreadDrawHolder[2];
                textView = tuVar;
            } else if (i10 == 2) {
                textView = new xu(cvVar, cvVar.getContext(), cvVar.f27549e.f35361c.length <= 1);
            } else if (i10 == 3) {
                textView = new TextView(cvVar.getContext());
            } else if (i10 == 4) {
                View bvVar = new bv(cvVar.getContext());
                int i11 = org.telegram.ui.ActionBar.g6.Ke;
                Pattern pattern = cv.R;
                bvVar.setBackgroundColor(cvVar.getThemedColor(i11));
                f2.y0 y0Var = new f2.y0(-1, AndroidUtilities.getShadowHeight());
                ((ViewGroup.MarginLayoutParams) y0Var).topMargin = AndroidUtilities.dp(14.0f);
                bvVar.setLayoutParams(y0Var);
                textView = bvVar;
            } else {
                view = null;
            }
            view = textView;
        }
        return new lk0(view);
    }
}
