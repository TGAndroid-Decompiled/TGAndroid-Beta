package org.telegram.ui.ActionBar;

import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.Utilities;
public class OKLCH {
    public static final double[] XYZtoLMS_M = {0.819022437996703d, 0.3619062600528904d, -0.1288737815209879d, 0.0329836539323885d, 0.9292868615863434d, 0.0361446663506424d, 0.0481771893596242d, 0.2642395317527308d, 0.6335478284694309d};
    public static final double[] LMStoXYZ_M = {1.2268798758459243d, -0.5578149944602171d, 0.2813910456659647d, -0.0405757452148008d, 1.112286803280317d, -0.0717110580655164d, -0.0763729366746601d, -0.4214933324022432d, 1.5869240198367816d};
    public static final double[] LMStoLab_M = {0.210454268309314d, 0.7936177747023054d, -0.0040720430116193d, 1.9779985324311684d, -2.42859224204858d, 0.450593709617411d, 0.0259040424655478d, 0.7827717124575296d, -0.8086757549230774d};
    public static final double[] LabtoLMS_M = {1.0d, 0.3963377773761749d, 0.2158037573099136d, 1.0d, -0.1055613458156586d, -0.0638541728258133d, 1.0d, -0.0894841775298119d, -1.2914855480194092d};
    public static final double[] toXYZ_M = {0.41239079926595934d, 0.357584339383878d, 0.1804807884018343d, 0.21263900587151027d, 0.715168678767756d, 0.07219231536073371d, 0.01933081871559182d, 0.11919477979462598d, 0.9505321522496607d};
    public static final double[] fromXYZ_M = {3.2409699419045226d, -1.537383177570094d, -0.4986107602930034d, -0.9692436362808796d, 1.8759675015077202d, 0.04155505740717559d, 0.05563007969699366d, -0.20397695888897652d, 1.0569715142428786d};

    public static double[] oklch2oklab(double[] dArr) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double[] dArr2 = new double[3];
        dArr2[0] = d;
        dArr2[1] = Double.isNaN(d3) ? 0.0d : Math.cos((d3 * 3.141592653589793d) / 180.0d) * d2;
        dArr2[2] = Double.isNaN(d3) ? 0.0d : d2 * Math.sin((d3 * 3.141592653589793d) / 180.0d);
        return dArr2;
    }

    public static double[] oklab2oklch(double[] dArr) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double[] dArr2 = new double[3];
        dArr2[0] = d;
        dArr2[1] = Math.sqrt(Math.pow(d2, 2.0d) + Math.pow(d3, 2.0d));
        dArr2[2] = (Math.abs(d2) >= 2.0E-4d || Math.abs(d3) >= 2.0E-4d) ? ((((Math.atan2(d3, d2) * 180.0d) / 3.141592653589793d) % 360.0d) + 360.0d) % 360.0d : Double.NaN;
        return dArr2;
    }

    public static double[] rgb2srgbLinear(double[] dArr) {
        double d;
        double[] dArr2 = new double[3];
        for (int i = 0; i < dArr.length; i++) {
            if (Math.abs(dArr[i]) <= 0.04045d) {
                d = dArr[i] / 12.92d;
            } else {
                double d2 = dArr[i] < 0.0d ? -1 : 1;
                double pow = Math.pow((Math.abs(dArr[i]) + 0.055d) / 1.055d, 2.4d);
                Double.isNaN(d2);
                d = d2 * pow;
            }
            dArr2[i] = d;
        }
        return dArr2;
    }

    public static double[] srgbLinear2rgb(double[] dArr) {
        double d;
        double[] dArr2 = new double[3];
        for (int i = 0; i < dArr.length; i++) {
            if (Math.abs(dArr[i]) > 0.0031308d) {
                double d2 = dArr[i] < 0.0d ? -1 : 1;
                Double.isNaN(d2);
                d = d2 * ((Math.pow(Math.abs(dArr[i]), 0.4166666666666667d) * 1.055d) - 0.055d);
            } else {
                d = 12.92d * dArr[i];
            }
            dArr2[i] = d;
        }
        return dArr2;
    }

    public static double[] oklab2xyz(double[] dArr) {
        double[] multiply = multiply(LabtoLMS_M, dArr);
        for (int i = 0; i < multiply.length; i++) {
            multiply[i] = Math.pow(multiply[i], 3.0d);
        }
        return multiply(LMStoXYZ_M, multiply);
    }

    public static double[] xyz2oklab(double[] dArr) {
        double[] multiply = multiply(XYZtoLMS_M, dArr);
        for (int i = 0; i < multiply.length; i++) {
            multiply[i] = Math.cbrt(multiply[i]);
        }
        return multiply(LMStoLab_M, multiply);
    }

    public static double[] xyz2rgbLinear(double[] dArr) {
        return multiply(fromXYZ_M, dArr);
    }

    public static double[] rgbLinear2xyz(double[] dArr) {
        return multiply(toXYZ_M, dArr);
    }

    public static double[] oklch2rgb(double[] dArr) {
        return srgbLinear2rgb(xyz2rgbLinear(oklab2xyz(oklch2oklab(dArr))));
    }

    public static double[] rgb2oklch(double[] dArr) {
        return oklab2oklch(xyz2oklab(rgbLinear2xyz(rgb2srgbLinear(dArr))));
    }

    public static double[] rgb(int i) {
        double red = Color.red(i);
        Double.isNaN(red);
        double green = Color.green(i);
        Double.isNaN(green);
        double blue = Color.blue(i);
        Double.isNaN(blue);
        return new double[]{red / 255.0d, green / 255.0d, blue / 255.0d};
    }

    public static int rgb(double[] dArr) {
        return Color.rgb((int) Math.round(Utilities.clamp(dArr[0], 1.0d, 0.0d) * 255.0d), (int) Math.round(Utilities.clamp(dArr[1], 1.0d, 0.0d) * 255.0d), (int) Math.round(Utilities.clamp(dArr[2], 1.0d, 0.0d) * 255.0d));
    }

    public static int adapt(int i, int i2) {
        double[] rgb2oklch = rgb2oklch(rgb(i2));
        double[] rgb2oklch2 = rgb2oklch(rgb(i));
        rgb2oklch2[2] = rgb2oklch[2];
        if (Double.isNaN(rgb2oklch[2]) || rgb2oklch[1] < 0.07999999821186066d) {
            rgb2oklch2[1] = rgb2oklch[1];
            if (!Theme.isCurrentThemeDark() && rgb2oklch2[0] < 0.800000011920929d) {
                rgb2oklch2[0] = Utilities.clamp(rgb2oklch2[0] - 0.1d, 1.0d, 0.0d);
            }
        }
        return ColorUtils.setAlphaComponent(rgb(oklch2rgb(rgb2oklch2)), Color.alpha(i));
    }

    private static double[] multiply(double[] dArr, double[] dArr2) {
        return new double[]{(dArr[0] * dArr2[0]) + (dArr[1] * dArr2[1]) + (dArr[2] * dArr2[2]), (dArr[3] * dArr2[0]) + (dArr[4] * dArr2[1]) + (dArr[5] * dArr2[2]), (dArr[6] * dArr2[0]) + (dArr[7] * dArr2[1]) + (dArr[8] * dArr2[2])};
    }
}
