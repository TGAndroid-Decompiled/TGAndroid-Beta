package org.telegram.ui.Components.Crop;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayList;
import org.telegram.ui.Components.Paint.ShapeDetector;

public final class CropView$$ExternalSyntheticLambda1 implements DialogInterface.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public CropView$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        String string;
        switch (this.$r8$classId) {
            case 0:
                ((CropView) this.f$0).lambda$showAspectRatioDialog$3((Integer[][]) this.f$1, i);
                break;
            default:
                ShapeDetector shapeDetector = (ShapeDetector) this.f$0;
                ArrayList arrayList = shapeDetector.templates;
                if (i == 0) {
                    StringBuilder sb = new StringBuilder("[");
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ShapeDetector.Template template = (ShapeDetector.Template) arrayList.get(i2);
                        if (i2 > 0) {
                            sb.append(",\n");
                        }
                        sb.append("\t{\n\t\t\"shape\": ");
                        sb.append(template.shapeType);
                        sb.append(",\n\t\t\"points\": [");
                        for (int i3 = 0; i3 < template.points.size(); i3++) {
                            if (i3 > 0) {
                                sb.append(",");
                            }
                            ShapeDetector.Point point = (ShapeDetector.Point) template.points.get(i3);
                            sb.append("[");
                            sb.append(Math.round(point.x));
                            sb.append(",");
                            sb.append(Math.round(point.y));
                            sb.append("]");
                        }
                        sb.append("],\n\t\t\"freq\": ");
                        sb.append(Math.round(((template.score / shapeDetector.templatesUsageScore) * 100.0f) * 100.0f) / 100.0f);
                        sb.append("\n\t}");
                    }
                    sb.append("\n]");
                    Log.i("shapedetector", sb.toString());
                } else {
                    ShapeDetector.Template template2 = new ShapeDetector.Template();
                    template2.shapeType = i - 1;
                    ArrayList arrayList2 = (ArrayList) this.f$1;
                    template2.points = arrayList2;
                    arrayList.add(template2);
                    SharedPreferences sharedPreferences = shapeDetector.preferences;
                    String string2 = sharedPreferences.getString("moretemplates", null);
                    if (string2 == null) {
                        string = "" + template2.shapeType;
                    } else {
                        StringBuilder sbM = com.google.android.exoplayer2.util.Log.m(string2, "|");
                        sbM.append(template2.shapeType);
                        string = sbM.toString();
                    }
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        StringBuilder sbM2 = com.google.android.exoplayer2.util.Log.m(string, ",");
                        sbM2.append(Math.round(((ShapeDetector.Point) arrayList2.get(i4)).x));
                        sbM2.append(",");
                        sbM2.append(Math.round(((ShapeDetector.Point) arrayList2.get(i4)).y));
                        string = sbM2.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", string).apply();
                }
                break;
        }
    }
}
