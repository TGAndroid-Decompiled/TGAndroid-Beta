package org.telegram.p009ui.Components.Paint;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.SystemFonts;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;

public class PaintTypeface {
    private static final List<PaintTypeface> BUILT_IN_FONTS;
    public static final PaintTypeface COURIER_NEW_BOLD;
    public static final PaintTypeface MW_BOLD;
    public static final PaintTypeface ROBOTO_ITALIC;
    public static final PaintTypeface ROBOTO_MEDIUM;
    public static final PaintTypeface ROBOTO_MONO;
    public static final PaintTypeface ROBOTO_SERIF;
    private static final List<String> preferable;
    private static List<PaintTypeface> typefaces;
    private final String key;
    private final String name;
    private final String nameKey;
    private final Typeface typeface;

    static {
        PaintTypeface paintTypeface = new PaintTypeface("roboto", "PhotoEditorTypefaceRoboto", AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        ROBOTO_MEDIUM = paintTypeface;
        PaintTypeface paintTypeface2 = new PaintTypeface("italic", "PhotoEditorTypefaceItalic", AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC));
        ROBOTO_ITALIC = paintTypeface2;
        PaintTypeface paintTypeface3 = new PaintTypeface("serif", "PhotoEditorTypefaceSerif", Typeface.create("serif", 1));
        ROBOTO_SERIF = paintTypeface3;
        PaintTypeface paintTypeface4 = new PaintTypeface("mono", "PhotoEditorTypefaceMono", AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        ROBOTO_MONO = paintTypeface4;
        PaintTypeface paintTypeface5 = new PaintTypeface("mw_bold", "PhotoEditorTypefaceMerriweather", AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        MW_BOLD = paintTypeface5;
        PaintTypeface paintTypeface6 = new PaintTypeface("courier_new_bold", "PhotoEditorTypefaceCourierNew", AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_COURIER_NEW_BOLD));
        COURIER_NEW_BOLD = paintTypeface6;
        BUILT_IN_FONTS = Arrays.asList(paintTypeface, paintTypeface2, paintTypeface3, paintTypeface4, paintTypeface5, paintTypeface6);
        preferable = Arrays.asList("Google Sans", "Dancing Script", "Carrois Gothic SC", "Cutive Mono", "Droid Sans Mono", "Coming Soon");
    }

    PaintTypeface(String str, String str2, Typeface typeface) {
        this.key = str;
        this.nameKey = str2;
        this.name = null;
        this.typeface = typeface;
    }

    PaintTypeface(Font font, String str) {
        this.key = str;
        this.name = str;
        this.nameKey = null;
        this.typeface = Typeface.createFromFile(font.getFile());
    }

    public String getKey() {
        return this.key;
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public String getName() {
        String str = this.name;
        return str != null ? str : LocaleController.getString(this.nameKey);
    }

    public static List<PaintTypeface> get() {
        FontData parseFont;
        if (typefaces == null) {
            typefaces = new ArrayList(BUILT_IN_FONTS);
            if (Build.VERSION.SDK_INT >= 29) {
                HashMap hashMap = new HashMap();
                for (Font font : SystemFonts.getAvailableFonts()) {
                    if (!font.getFile().getName().contains("Noto") && (parseFont = parseFont(font)) != null) {
                        Family family = (Family) hashMap.get(parseFont.family);
                        if (family == null) {
                            family = new Family();
                            hashMap.put(parseFont.family, family);
                        }
                        family.fonts.add(parseFont);
                    }
                }
                for (String str : preferable) {
                    Family family2 = (Family) hashMap.get(str);
                    if (family2 != null) {
                        FontData regular = family2.getRegular();
                        typefaces.add(new PaintTypeface(regular.font, regular.getName()));
                    }
                }
            }
        }
        return typefaces;
    }

    public static boolean fetched(final Runnable runnable) {
        if (typefaces != null || runnable == null) {
            return true;
        }
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                PaintTypeface.lambda$fetched$0(runnable);
            }
        });
        return false;
    }

    public static void lambda$fetched$0(Runnable runnable) {
        get();
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static class Family {
        ArrayList<FontData> fonts = new ArrayList<>();

        Family() {
        }

        public FontData getRegular() {
            FontData fontData;
            int i = 0;
            while (true) {
                if (i >= this.fonts.size()) {
                    fontData = null;
                    break;
                } else if ("Regular".equalsIgnoreCase(this.fonts.get(i).subfamily)) {
                    fontData = this.fonts.get(i);
                    break;
                } else {
                    i++;
                }
            }
            return (fontData != null || this.fonts.isEmpty()) ? fontData : this.fonts.get(0);
        }
    }

    public static class FontData {
        String family;
        Font font;
        String subfamily;

        FontData() {
        }

        public String getName() {
            if ("Regular".equals(this.subfamily) || TextUtils.isEmpty(this.subfamily)) {
                return this.family;
            }
            return this.family + " " + this.subfamily;
        }
    }

    public static class NameRecord {
        final int encodingID;
        final int nameID;
        final int nameLength;
        final int stringOffset;

        public NameRecord(RandomAccessFile randomAccessFile) throws IOException {
            randomAccessFile.readUnsignedShort();
            this.encodingID = randomAccessFile.readUnsignedShort();
            randomAccessFile.readUnsignedShort();
            this.nameID = randomAccessFile.readUnsignedShort();
            this.nameLength = randomAccessFile.readUnsignedShort();
            this.stringOffset = randomAccessFile.readUnsignedShort();
        }

        public String read(RandomAccessFile randomAccessFile, int i) throws IOException {
            Charset charset;
            randomAccessFile.seek(i + this.stringOffset);
            byte[] bArr = new byte[this.nameLength];
            randomAccessFile.read(bArr);
            if (this.encodingID == 1) {
                charset = StandardCharsets.UTF_16BE;
            } else {
                charset = StandardCharsets.UTF_8;
            }
            return new String(bArr, charset);
        }
    }

    private static String parseString(RandomAccessFile randomAccessFile, int i, NameRecord nameRecord) throws IOException {
        if (nameRecord == null) {
            return null;
        }
        return nameRecord.read(randomAccessFile, i);
    }

    public static org.telegram.p009ui.Components.Paint.PaintTypeface.FontData parseFont(android.graphics.fonts.Font r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.Paint.PaintTypeface.parseFont(android.graphics.fonts.Font):org.telegram.ui.Components.Paint.PaintTypeface$FontData");
    }
}
